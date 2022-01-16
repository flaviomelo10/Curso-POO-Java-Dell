package exemplo3;

import recursoshumanos.Funcionario;

public class Diarista extends Funcionario{
	private double valorHora;
	private double quantidadeHoras;
	
	public Diarista(long cpf, double salario, double desconto, double valorHora, double quantidadeHoras) {
		super(cpf, salario, desconto);
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
	}

	public Diarista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}
	
	public double calcularSalario() {
		return valorHora * quantidadeHoras;
	}
}
