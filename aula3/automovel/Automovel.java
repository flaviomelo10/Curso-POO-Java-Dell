package automovel;

public class Automovel {
	private String nome;
	private String combustivel;
	private int quantidadeDePassageiros;
	public Automovel(String nome) {
		this.nome = nome;
	}
	public Automovel(String nome, String combustivel, int quantidadeDePassageiros) {
		this.nome = nome;
		this.combustivel = combustivel;
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getQuantidadeDePassageiros() {
		return quantidadeDePassageiros;
	}
	public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}
	
}
