package Modelo;


public class Prestador extends Pessoa {
    //Atributos
	private int id_Prestador;
	private int cnpj;
    private final String fone;
	//Getters e Setters
        public int getId_Prestador() {
            return id_Prestador;
        }

        public void setId_Prestador(int id_Prestador) {
             this.id_Prestador = id_Prestador;
        }   
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
        //Construtores

    public Prestador(int id_Prestador, int cnpj, String fone, int codCadastro, String nome, String sobrenome, String dtNascimento, char genero, String email,String rg, String cpf, String Experiencia) {
        super(codCadastro, nome, sobrenome, dtNascimento, genero, email, fone, rg, cpf, Experiencia);
        this.id_Prestador = id_Prestador;
        this.cnpj = cnpj;
        this.fone = fone;
    }
        

 }
