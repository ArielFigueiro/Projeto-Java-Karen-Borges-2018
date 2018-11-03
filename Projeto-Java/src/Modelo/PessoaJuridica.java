/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0341185
 */
public class PessoaJuridica {
    
    private String id_PessoaJuridica;
    private String CNPJ;
    private String Nome_Empresa;

    public PessoaJuridica(String id_PessoaJuridica, String CNPJ, String Nome_Empresa) {
        this.id_PessoaJuridica = id_PessoaJuridica;
        this.CNPJ = CNPJ;
        this.Nome_Empresa = Nome_Empresa;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "id_PessoaJuridica=" + id_PessoaJuridica + ", CNPJ=" + CNPJ + ", Nome_Empresa=" + Nome_Empresa + '}';
    }
    

    public String getId_PessoaJuridica() {
        return id_PessoaJuridica;
    }

    public void setId_PessoaJuridica(String id_PessoaJuridica) {
        this.id_PessoaJuridica = id_PessoaJuridica;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome_Empresa() {
        return Nome_Empresa;
    }

    public void setNome_Empresa(String Nome_Empresa) {
        this.Nome_Empresa = Nome_Empresa;
    }
    
    
}
