/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main.heuristic;

import main.heuristic.exceptions.ParameterInvalidException;

/**
 *
 * Desenvolvido por: Alexander de Almeida Pinto
 *
 * @author alexanderdealmeidapinto
 */
public class GRASPParameters {

    public final static GRASPParameters defaultParameters = new GRASPParameters(100, 100, 0.1f);
    
    private Integer numberOfConstructions;

    private Integer numberOfRepetitions;

    private Float alfa; //Grau de aleatóriedade da fase de construção.

    /**
     * Define os parametros do GRASP
     * @param numberOfConstructions Numero de construções.
     * @param numberOfRepetitions Número de repetições.
     * @param alfa  Gráu de Aleatoriedade da solução (0.0f - 1.0f]
     */
    public GRASPParameters(Integer numberOfConstructions, Integer numberOfRepetitions, Float alfa) throws ParameterInvalidException {
        this.numberOfConstructions = numberOfConstructions;
        this.numberOfRepetitions = numberOfRepetitions;

        if(alfa <= 0.0f || alfa > 1.0f){
            throw new ParameterInvalidException("O valor de alfa deve estar no intervalo (0.0f - 1.0f]");
        }
        
        this.alfa = alfa;
    }

    public Float getAlfa() {
        return alfa;
    }

    public void setAlfa(Float alfa) {
        this.alfa = alfa;
    }

    public Integer getNumberOfConstructions() {
        return numberOfConstructions;
    }

    public void setNumberOfConstructions(Integer numberOfConstructions) {
        this.numberOfConstructions = numberOfConstructions;
    }

    public Integer getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(Integer numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }

}
