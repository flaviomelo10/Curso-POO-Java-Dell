package produtos;

public class Principal {

	public static void main(String[] args) {
		Computador computador = new Computador();
		
		System.out.println("Código de barras: " +computador.autenticaCodigo(123765));
		
		System.out.println("Preço do produto: " +computador.calcularPreco(4000.0, 800.0));
		
		Autenticacao t = new Computador();
	}

}
