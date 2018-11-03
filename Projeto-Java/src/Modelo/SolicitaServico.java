package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0341185
 */
public class SolicitaServico {
    
    private String id_Servico;
    private String nome;

    public SolicitaServico(String id_Servico, String nome) {
        this.id_Servico = id_Servico;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Servico{" + "id_Servico=" + id_Servico + ", nome=" + nome + '}';
    }
    
    

    public String getId_Servico() {
        return id_Servico;
    }

    public void setId_Servico(String id_Servico) {
        this.id_Servico = id_Servico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
