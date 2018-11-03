package Modelo;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0341185
 */
public class BancoDeTalentos {
    private boolean disponibilidade;
    private ArrayList CBO;

    

public BancoDeTalentos(boolean disponibilidade, ArrayList CBO) {
        this.disponibilidade = disponibilidade;
        this.CBO = CBO;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }
    /**
     * @param disponibilidade the disponibilidade to set
     */
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    /**
     * @return the CBO
     */
    public ArrayList getCBO() {
        return CBO;
    }    

    /**
     * @param CBO the CBO to set
     */
    public void setCBO(ArrayList CBO) {
        this.CBO = CBO;
    }
}
