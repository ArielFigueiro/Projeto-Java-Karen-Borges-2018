package Modelo;


public class Cliente extends Pessoa {
	private int id_Cliente;

	public int getCodCliente() {
		return id_Cliente;
	}

	public void setCodCliente(int codCliente) {
		codCliente = codCliente;
	}

	public Cliente(int id_Pessoa, String nome, String sobrenome, String dtNascimento, char genero, String email,
			String fone, String rg, String cpf,int codCliente, String experiencia) {
		super(id_Pessoa, nome, sobrenome, dtNascimento, genero, email, fone, rg, cpf,experiencia);
		//this.id_Cliente = id_Cliente;
	}
	
	

}
