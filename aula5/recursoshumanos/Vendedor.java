package recursoshumanos;

public class Vendedor extends Funcionario{
	public double comissao;
		   
	public void setComissao(double comissao){
		this.comissao = comissao;
		}   
	
	public double getComissao(){
		return this.comissao;
		}
		   
	public Vendedor(long cpf, double salario, double desconto, double comissao){
		super(cpf, salario, desconto);
		this.comissao = comissao;
		}
		   
	public double calcularSalario(){
		return super.calcularSalario() + this.getComissao();
		}
}
