package produtos;

public class Produtos {
	private String nome;
	private double valor;
	private int quantidade;
	private double valorDesconto;
	
	public Produtos(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produtos() {
		super();
	}
	
	public Produtos(String nome, double valor, int quantidade, double valorDesconto) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.valorDesconto = valorDesconto;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setValordesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public double getValorDesconto() {
		return valorDesconto;
	}
}
