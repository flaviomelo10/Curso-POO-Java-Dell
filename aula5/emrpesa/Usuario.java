package emrpesa;

class Usuario {
	private String nome;
	private int senha;
	
	public Usuario(String nome, int senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setMatricula(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}


