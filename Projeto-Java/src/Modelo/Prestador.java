package Modelo;


public class Prestador extends Pessoa {
    //Atributos
	private int codPrestador;
	private int cnpj;
	//Getters e Setters
	public int getCodPrestador() {
		return codPrestador;
	}
	public void setCodPrestador(int codPrestador) {
		this.codPrestador = codPrestador;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
        //Construtores
        public Prestador(int codCadastro, String nome, String sobrenome, String dtNascimento, char genero, String email,
			String fone, String rg, String cpf,int codPrestador,int cnpj,String experiencia) {
		super(codCadastro, nome, sobrenome, dtNascimento, genero, email, fone, rg, cpf,experiencia);
		this.codPrestador = codPrestador;
		this.cnpj = cnpj;
		// TODO Auto-generated constructor stub
	}
		
}
