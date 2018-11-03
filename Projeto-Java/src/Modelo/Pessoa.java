package Modelo;


public class Pessoa {
	 	//---Atributos
	    private int id_Pessoa;
            private String login;
            private String senha;             
	    private String nome;
	    private String sobrenome;
	    private String dtNascimento;//alterar para tipo calender
	    private char genero;
	    private String email;
	    private String fone;
	    private String rg;
	    private String cpf;
            private String Experiencia;

    public Pessoa(String nome, String cpf, int idade) {
        
    }    
	    
	  
	    //----Getters and Setters
                public int getId_Pessoa() {
                    return id_Pessoa;
                }

                public void setId_Pessoa(int id_Pessoa) {
                    this.id_Pessoa = id_Pessoa;
                }

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public String getSenha() {
                    return senha;
                }

                public void setSenha(String senha) {
                    this.senha = senha;
                }
                public String getExperiencia() {
                     return Experiencia;
                }
                public void setExperiencia(String Experiencia) {
                    this.Experiencia = Experiencia;
                }
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public String getDtNascimento() {
			return dtNascimento;
		}
		public void setDtNascimento(String dtNascimento) {
			this.dtNascimento = dtNascimento;
		}
		public char getGenero() {
			return genero;
		}
		public void setGenero(char genero) {
			this.genero = genero;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFone() {
			return fone;
		}
		public void setFone(String fone) {
			this.fone = fone;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		//-------CONSTRUTOR

                public Pessoa(int codCadastro, String nome, String sobrenome, String dtNascimento, char genero, String email, String fone, String rg, String cpf, String Experiencia) {
                    this.id_Pessoa = id_Pessoa;
                    this.nome = nome;
                    this.sobrenome = sobrenome;
                    this.dtNascimento = dtNascimento;
                    this.genero = genero;
                    this.email = email;
                    this.fone = fone;
                    this.rg = rg;
                    this.cpf = cpf;
                    this.Experiencia = Experiencia;
                }
    
}
