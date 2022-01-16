package pacoteteste;

import recursoshumanos.Funcionario;
import recursoshumanos.Monitor;
import recursoshumanos.Vendedor;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
	    funcionario.setCpf(1234567891);
	    funcionario.setSalario(1209.75);
	    funcionario.setDesconto(102.35);
	      
	    System.out.println("Salário líquido: " + funcionario.calcularSalario());
	      
	    Vendedor vendedor = new Vendedor(1234567892, 1620.50, 120.45, 50.55);
	      
	    System.out.println("Salário líquido: " +vendedor.calcularSalario());
	    
	    Monitor monitor = new Monitor("123", "Biologia");
	    System.out.println("A matrícula é: " +monitor.getMatricula());
	    monitor.acesso();
	    

	}

}
