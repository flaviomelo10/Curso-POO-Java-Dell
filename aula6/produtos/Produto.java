package produtos;

public abstract class Produto {
	public double preco;
	public int quantidade;
	public long codigoDeBarras;
	
	public abstract double calcularPreco(double preco, double lucro);
}
