/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0341185
 */
public class DadosProfissionais {
    
    private int id_profissional;
    private String NomeEmpresa;
    private String Funcao;
    private float TempoServico;
    private boolean Situacao;

    public DadosProfissionais(int id_profissional, String NomeEmpresa, String Funcao, float TempoServico, boolean Situacao) {
        this.id_profissional = id_profissional;
        this.NomeEmpresa = NomeEmpresa;
        this.Funcao = Funcao;
        this.TempoServico = TempoServico;
        this.Situacao = Situacao;
    }
    
    

    public int getId_profissional() {
        return id_profissional;
    }

    public void setId_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public float getTempoServico() {
        return TempoServico;
    }

    public void setTempoServico(float TempoServico) {
        this.TempoServico = TempoServico;
    }

    public boolean isSituacao() {
        return Situacao;
    }

    public void setSituacao(boolean Situacao) {
        this.Situacao = Situacao;
    }   

    @Override
    public String toString() {
        return "DadosProfissionais{" + "id_profissional=" + id_profissional + ", NomeEmpresa=" + NomeEmpresa + ", Funcao=" + Funcao + ", TempoServico=" + TempoServico + ", Situacao=" + Situacao + '}';
    }
    
}
