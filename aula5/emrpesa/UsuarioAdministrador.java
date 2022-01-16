package emrpesa;

public class UsuarioAdministrador extends Usuario{
	public String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public UsuarioAdministrador(String nome, int senha) {
		super(nome, senha);
		this.setor = setor;
	}
	
	
}
