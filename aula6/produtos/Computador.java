package produtos;

public class Computador extends Produto implements Autenticacao {
	
	private long codigo = 123765;
	
	@Override
	public double calcularPreco(double preco, double lucro) {
		
		return preco + lucro;
	}

	@Override
	public boolean autenticaCodigo(long codigoDeBarras) {
	
		return (codigo == codigoDeBarras);
	}

}
