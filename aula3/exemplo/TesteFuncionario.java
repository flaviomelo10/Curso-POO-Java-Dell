package exemplo;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario01 = new Funcionario();
		funcionario01.nome = "Leonardo";
		funcionario01.salario = 1500;
		
		funcionario01.aplicarBonusAoSalario(350);
		funcionario01.exibirDadosFuncionario();
	
	}

}
