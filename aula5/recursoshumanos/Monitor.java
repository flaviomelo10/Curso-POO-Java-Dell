package recursoshumanos;

public class Monitor extends Aluno{
	private String disciplinaMonitoria;
	
	public Monitor(String matricula, String disciplinaMonitoria) {
		super(matricula);
		this.disciplinaMonitoria = disciplinaMonitoria;
	}
	
	public void acesso() {
		System.out.println("O valor é: " +email);
	}
}
