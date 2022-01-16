package exemplo3;

import recursoshumanos.Funcionario;
import recursoshumanos.Vendedor;

public class Teste {

	public static void main(String[] args) {
		Funcionario vendedor = new Vendedor(1000, 5000.0, 200.0, 400.0);
		Funcionario diarista = new Diarista(1010, 3000.0, 50.0, 12.0, 150);
		
		System.out.println("O salário de vendedor é: "+vendedor.calcularSalario());
		System.out.println("O salário de diarista é "+diarista.calcularSalario());
	}

}
/*
A “transformação” de um objeto em uma referência de tipo diferente chama-se Casting. 
Isso ocorre quando tentamos, por exemplo, converter um valor float para o tipo int, 
desprezando sua parte decimal. Chamamos de Downcasting a tentativa de converter um 
objeto de um tipo para outro tipo superior a ele, ou seja, mais genérico, na hierarquia de Heranças.
*/