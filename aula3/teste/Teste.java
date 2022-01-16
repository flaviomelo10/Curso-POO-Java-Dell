package teste;

import clinicaveterinaria.CadastroCliente;

public class Teste {

	public static void main(String[] args) {
		CadastroCliente cliente = new CadastroCliente("Ana", "022362478-00", "8599999-8888", "Rua João Cordeiro, 472", "Luz", 5);
		
		System.out.println(cliente.toString());
	}

}
