package exemplo;

public class Funcionario {
	String nome;
	double salario;
	
	public void aplicarBonusAoSalario(double valor) {
		salario = salario + valor;
	}
	
	public void exibirDadosFuncionario() {
		System.out.println("Funcionário " +nome);
		System.out.println("Salário anual: R$" +salario);
	}
}
