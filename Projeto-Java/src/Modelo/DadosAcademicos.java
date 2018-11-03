package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariél
 */
public class DadosAcademicos {
    private int id_dados_academico;
    private String situacao;
    private String data_ingresso;
    private String data_final;

    public DadosAcademicos(int id_dados_academ, String situacao, String data_ingresso, String data_final, String curso, String instituicao) {
        this.id_dados_academico = id_dados_academ;
        this.situacao = situacao;
        this.data_ingresso = data_ingresso;
        this.data_final = data_final;
        this.curso = curso;
        this.instituicao = instituicao;
    }
    private String curso;
    private String instituicao;

    /**
     * @return the cod_dados_academ
     */
    public int getCod_dados_academ() {
        return id_dados_academico;
    }

    /**
     * @param cod_dados_academ the cod_dados_academ to set
     */
    public int setCod_dados_academ(String cod_dados_academ) {
        this.id_dados_academico = id_dados_academico;
        return 0;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the data_ingresso
     */
    public String getData_ingresso() {
        return data_ingresso;
    }

    /**
     * @param data_ingresso the data_ingresso to set
     */
    public void setData_ingresso(String data_ingresso) {
        this.data_ingresso = data_ingresso;
    }

    /**
     * @return the data_final
     */
    public String getData_final() {
        return data_final;
    }

    /**
     * @param data_final the data_final to set
     */
    public void setData_final(String data_final) {
        this.data_final = data_final;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
