package recursoshumanos;

public class Aluno {
	private String matricula;
	protected String email = "Ana";
	
	public Aluno(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
