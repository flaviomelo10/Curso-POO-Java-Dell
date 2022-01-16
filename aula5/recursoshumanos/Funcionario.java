package recursoshumanos;

public class Funcionario {
	public long cpf;
	public double salario;
	public double desconto;
	   
	public void setCpf(long cpf){
		this.cpf = cpf;
	}
	public long getCpf(){
		return this.cpf;
	}
	public void setSalario(double salario){
	    this.salario = salario;
	}
	public double getSalario(){
	    return this.salario;
	}
	public void setDesconto(double desconto){
	    this.desconto = desconto;
	}
	public double getDesconto(){
	    return this.desconto;
	}
	   
	public Funcionario(long cpf, double salario, double desconto){
	    this.cpf = cpf;
	    this.salario = salario;
	    this.desconto = desconto;   
	}

	public Funcionario(){}
	   
	public double calcularSalario(){
		return this.getSalario() - this.getDesconto();
		}
}
