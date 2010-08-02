/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFrameGraphicTest.java
 *
 * Created on 25/07/2010, 08:23:58
 */
package gui;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.entities.AirlineNetwork;
import main.heuristic.ARPParameters;
import main.heuristic.GRASPConstruct;
import main.heuristic.GRASPParameters;
import main.reader.ARPFileReader;

/**
 *
 * @author alexanderdealmeidapinto
 */
public class JFrameGraphicTest extends javax.swing.JFrame {

    public static JFrameGraphicTest instance;
    private JPanelARPControler jpac = new JPanelARPControler();

    /** Creates new form JFrameGraphicTest */
    public JFrameGraphicTest() {
        initComponents();
        jScrollPane1.getViewport().add(jpac);
        instance = this;

        new Thread() {

            @Override
            public void run() {
                initGraphics();
            }
        }.start();

    }

    public void initGraphics() {
        ArrayList<Integer> conts = new ArrayList<Integer>();
        int menorcusto = 9999999;

        jpac.setStop(false);
        for (int i = 0; i < 1; i++) {
            int cont = 0;
            
                cont++;
                AirlineNetwork airlineNetwork = new AirlineNetwork();

                try {
                    ARPFileReader.readDataFromFile("instances/01", airlineNetwork);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JFrameGraphicTest.class.getName()).log(Level.SEVERE, null, ex);
                }

                GRASPConstruct gRASPConstruct = new GRASPConstruct(airlineNetwork, GRASPParameters.defaultParameters, ARPParameters.defaultParameters);
                gRASPConstruct.GRASPResolve();

                jpac.initChart(airlineNetwork);

                jpac.initConfigures();

                if(menorcusto >  airlineNetwork.getBestNetworkCost()){
                    menorcusto = airlineNetwork.getBestNetworkCost();
                }

                if(jpac.getStop()) break;

                if (airlineNetwork.getBestNetworkCost() < 19000) {
                    break;
                }
                if(cont == 10) break;
            

            conts.add(cont);

            if(jpac.getStop()) break;
        }

        System.out.println("Conts: ");
        int media = 0;
        for (Integer integer : conts) {
            System.out.print(integer + " ");
            media += integer;
        }
        System.out.println("");

        System.out.println("Media: " + ((float)media/(float)conts.size()));
        System.out.println("Menor Custo " + menorcusto);


    }

    public static void setPercentComplete(int value) {
        instance.getJPanelAircraftControler().setPercentComplete(value);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.META_MASK));
        jMenuItem1.setText("Executar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:


        new Thread() {

            @Override
            public void run() {

                initGraphics();
            }
        }.start();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrameGraphicTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private JPanelARPControler getJPanelAircraftControler() {
        return this.jpac;
    }
}
