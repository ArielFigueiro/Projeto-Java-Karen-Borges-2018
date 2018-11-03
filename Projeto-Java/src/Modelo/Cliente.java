package Modelo;


public class Cliente extends Pessoa {
	private int codCliente;

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		codCliente = codCliente;
	}

	public Cliente(int codCadastro, String nome, String sobrenome, String dtNascimento, char genero, String email,
			String fone, String rg, String cpf,int codCliente, String experiencia) {
		super(codCadastro, nome, sobrenome, dtNascimento, genero, email, fone, rg, cpf,experiencia);
		this.codCliente = codCliente;
	}
	
	

}
