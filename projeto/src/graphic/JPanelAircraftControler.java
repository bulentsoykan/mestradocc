/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelAircraftControler.java
 *
 * Created on 25/07/2010, 15:13:54
 */
package graphic;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import main.entities.AirlineNetwork;
import main.entities.Flight;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.entity.CategoryItemEntity;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;

/**
 *
 * @author alexanderdealmeidapinto
 */
public class JPanelAircraftControler extends javax.swing.JPanel {

    private AircraftGanttCategoryDataset slidingGanttCategoryDataset;
    private ChartPanel chartPanel;
    private AircraftDateAxis dateAxis;
    private AirlineNetwork airlineNetwork;
    private JPanelFlightInfo jPanelInfo = new JPanelFlightInfo();

    private final JPopupMenu jpm = new JPopupMenu();

    /** Creates new form JPanelAircraftControler */
    public JPanelAircraftControler() {
        initComponents();
        initKeys();
        jpm.add(jPanelInfo);

    }

    public void refreshJPanelInfo(Flight flight){
        jPanelInfo.setInfo(flight, airlineNetwork);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneAircraftChart = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelToUpChart = new javax.swing.JLabel();
        jLabelToLeftChart = new javax.swing.JLabel();
        jLabelToRightChart = new javax.swing.JLabel();
        jLabelToDownChart = new javax.swing.JLabel();
        jLabelZoomIn = new javax.swing.JLabel();
        jLabelZoomOut = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerQtdeFlights = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabelToUpChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/up.png"))); // NOI18N
        jLabelToUpChart.setToolTipText("Para cima");
        jLabelToUpChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToUpChartMouseClicked(evt);
            }
        });

        jLabelToLeftChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left.png"))); // NOI18N
        jLabelToLeftChart.setToolTipText("Para esquerda");
        jLabelToLeftChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToLeftChartMouseClicked(evt);
            }
        });

        jLabelToRightChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/right.png"))); // NOI18N
        jLabelToRightChart.setToolTipText("Para direita");
        jLabelToRightChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToRightChartMouseClicked(evt);
            }
        });

        jLabelToDownChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/down.png"))); // NOI18N
        jLabelToDownChart.setToolTipText("Para baixo");
        jLabelToDownChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToDownChartMouseClicked(evt);
            }
        });

        jLabelZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoomin.png"))); // NOI18N
        jLabelZoomIn.setToolTipText("Zoom in");
        jLabelZoomIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelZoomInMouseClicked(evt);
            }
        });

        jLabelZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoomout.png"))); // NOI18N
        jLabelZoomOut.setToolTipText("Zoom out");
        jLabelZoomOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelZoomOutMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelZoomOut)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabelToUpChart))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelToLeftChart)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabelToDownChart)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelToRightChart)
                    .add(jLabelZoomIn))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelToUpChart)
                    .add(jLabelZoomIn)
                    .add(jLabelZoomOut))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabelToLeftChart)
                    .add(jLabelToRightChart)
                    .add(jLabelToDownChart))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Qtde:");

        jSpinnerQtdeFlights.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jSpinnerQtdeFlights.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerQtdeFlightsStateChanged(evt);
            }
        });

        jButton1.setText("jButton1");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSpinnerQtdeFlights, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton1)
                    .add(jSpinnerQtdeFlights, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPaneAircraftChart, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jScrollPaneAircraftChart, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelToUpChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToUpChartMouseClicked
        decrementTask();
    }//GEN-LAST:event_jLabelToUpChartMouseClicked

    private void jLabelToDownChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToDownChartMouseClicked
        // TODO add your handling code here:
        incrementTask();
    }//GEN-LAST:event_jLabelToDownChartMouseClicked

    private void jSpinnerQtdeFlightsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerQtdeFlightsStateChanged
        slidingGanttCategoryDataset.setMaximumCategoryCount((Integer) jSpinnerQtdeFlights.getValue());
    }//GEN-LAST:event_jSpinnerQtdeFlightsStateChanged

    private void jLabelToRightChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToRightChartMouseClicked
        incrementRange();
    }//GEN-LAST:event_jLabelToRightChartMouseClicked

    private void jLabelToLeftChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToLeftChartMouseClicked
        decrementRange();
    }//GEN-LAST:event_jLabelToLeftChartMouseClicked

    private void jLabelZoomInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelZoomInMouseClicked
        zoomIn();
    }//GEN-LAST:event_jLabelZoomInMouseClicked

    private void jLabelZoomOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelZoomOutMouseClicked
        zoomOut();
    }//GEN-LAST:event_jLabelZoomOutMouseClicked

    /**
     * Acao de mostrar voos mais acima.
     */
    public void incrementTask() {

        boolean value = false;

        try {
            value = slidingGanttCategoryDataset.incrementFirstCategoryIndex();
        } catch (Exception ex) {
        }

        jLabelToDownChart.setEnabled(value);
        jLabelToUpChart.setEnabled(true);

    }

    /**
     * Acao de mostrar voos mais abaixo.
     */
    public void decrementTask() {
        boolean value = false;

        try {
            value = slidingGanttCategoryDataset.decrementFirstCategoryIndex();
        } catch (Exception ex) {
        }

        jLabelToUpChart.setEnabled(value);
        jLabelToDownChart.setEnabled(true);
    }

    /**
     * Acao para avancar no gráfico.
     */
    public void incrementRange() {

        if (dateAxis.getRange().getUpperBound() > airlineNetwork.getAirlineGraphicConfigs().getHighTime()) {

            jLabelToRightChart.setEnabled(false);
        } else {
            dateAxis.incrementRange(airlineNetwork.getAirlineGraphicConfigs().getRangeIncrement());
        }

        jLabelToLeftChart.setEnabled(true);
    }

    /**
     * Acao para retroceder no gráfico.
     */
    public void decrementRange() {

        if (dateAxis.getRange().getLowerBound() < airlineNetwork.getAirlineGraphicConfigs().getLowTime()) {
            jLabelToLeftChart.setEnabled(false);
        } else {
            dateAxis.decrementRange(airlineNetwork.getAirlineGraphicConfigs().getRangeIncrement());
        }

        jLabelToRightChart.setEnabled(true);
    }

    public void zoomIn() {
        dateAxis.zoomIn(airlineNetwork.getAirlineGraphicConfigs().getZoomIncrement());
    }

    public void zoomOut() {
        dateAxis.zoomOut(airlineNetwork.getAirlineGraphicConfigs().getZoomIncrement());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelToDownChart;
    private javax.swing.JLabel jLabelToLeftChart;
    private javax.swing.JLabel jLabelToRightChart;
    private javax.swing.JLabel jLabelToUpChart;
    private javax.swing.JLabel jLabelZoomIn;
    private javax.swing.JLabel jLabelZoomOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPaneAircraftChart;
    private javax.swing.JSpinner jSpinnerQtdeFlights;
    // End of variables declaration//GEN-END:variables

    public Flight getFlight(String railName, long flightTime){
        return airlineNetwork.getFlight(railName, flightTime);
    }

    public int getRealXPoint(Point point){
        return (int) (getLocationOnScreen().getX() + point.getX());
    }

    public int getRealYPoint(Point point){
        return (int) (getLocationOnScreen().getY() + point.getY());
    }
    /**
     * Iniciar o gráfico da solução do ARP que é passado no airlineNetwork
     * @param airlineNetwork
     */
    public void initChart(AirlineNetwork airlineNetwork) {

        this.airlineNetwork = airlineNetwork;

        CategoryAxis categoryAxis = new CategoryAxis("Aviões");

        this.dateAxis = new AircraftDateAxis("Horário");

        AirlineGraphicConfigs graphicConfigs = airlineNetwork.getAirlineGraphicConfigs();

        long baseTime = graphicConfigs.getBaseTime();

        graphicConfigs.setLowTime(baseTime + (airlineNetwork.getLowTime() - 30) * 60 * 1000l);
        graphicConfigs.setHighTime(baseTime + (airlineNetwork.getHighTime() + 60) * 60 * 1000l);
        graphicConfigs.setVisibleRange(24 * 60 * 60 * 1000l);

        dateAxis.setRange(graphicConfigs.getLowTime(), graphicConfigs.getLowTime() + graphicConfigs.getVisibleRange());

        this.slidingGanttCategoryDataset = new AircraftGanttCategoryDataset(airlineNetwork, AircraftDataSet.configure(airlineNetwork), 0, 7);

        CategoryItemRenderer aircraftRenderer = new AircraftGanttRenderer(airlineNetwork, slidingGanttCategoryDataset);

        CategoryPlot plot = new CategoryPlot(slidingGanttCategoryDataset, categoryAxis, dateAxis, aircraftRenderer);

        plot.setOrientation(PlotOrientation.HORIZONTAL);

        plot.setFixedLegendItems(createLegends());

        JFreeChart chart = new JFreeChart("Aircraft Scheduling", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        this.chartPanel = new ChartPanel(chart);

        chartPanel.addChartMouseListener(new ChartMouseListener() {

            public void chartMouseClicked(ChartMouseEvent event) {
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            public void chartMouseMoved(ChartMouseEvent event) {
                CategoryPlot categoryPlot = (CategoryPlot) event.getChart().getPlot();
                int valueX = event.getTrigger().getX();
                Rectangle2D dataArea = chartPanel.getScreenDataArea();
                DateAxis da = (DateAxis) categoryPlot.getRangeAxis();

                long flightTime = (long) da.java2DToValue(valueX, dataArea, categoryPlot.getRangeAxisEdge());

                jpm.setVisible(false);

                if (event.getEntity() instanceof CategoryItemEntity) {
                    CategoryItemEntity categoryItem = (CategoryItemEntity) event.getEntity();
                    String railName = categoryItem.getColumnKey().toString();
                    Flight flight = getFlight(railName, flightTime);
                    //jpm.removeAll();
                    //jpm.add(new SimpleDateFormat().format(new Date(flightTime)) + " " + flight.getName());

                    refreshJPanelInfo(flight);
                    Point point = event.getTrigger().getPoint();
                    jpm.setLocation(getRealXPoint(point), getRealYPoint(point) + 15);
                    jpm.setVisible(true);
                }


            }
        });

        this.chartPanel.setPreferredSize(jScrollPaneAircraftChart.getPreferredSize());

        jScrollPaneAircraftChart.getViewport().removeAll();
        jScrollPaneAircraftChart.getViewport().add(chartPanel);

        initControler();

    }

    private void initControler() {
        jLabelToUpChart.setEnabled(true);
        jLabelToDownChart.setEnabled(true);
        jLabelToLeftChart.setEnabled(true);
        jLabelToRightChart.setEnabled(true);
    }

    private void initKeys() {

        ActionListener keyUP = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                decrementTask();
            }
        };

        ActionListener keyDown = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                incrementTask();
            }
        };

        ActionListener keyRight = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                incrementRange();
            }
        };

        ActionListener keyLeft = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                decrementRange();
            }
        };

        this.registerKeyboardAction(keyUP, "UP", KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        this.registerKeyboardAction(keyDown, "DOWN", KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        this.registerKeyboardAction(keyRight, "RIGHT", KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        this.registerKeyboardAction(keyLeft, "LEFT", KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


    }

    public void initConfigures() {
        jSpinnerQtdeFlights.setValue(slidingGanttCategoryDataset.getMaximumCategoryCount());
    }

    private LegendItemCollection createLegends() {
        LegendItemCollection legendItemCollection = new LegendItemCollection();

        legendItemCollection.add(new LegendItem("Tempo de Solo", AircraftGanttRenderer.getGroundColor()));
        legendItemCollection.add(new LegendItem("Tempo no Ar", AircraftGanttRenderer.getFlightColorEnd()));

        return legendItemCollection;
    }
}
