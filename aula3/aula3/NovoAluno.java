package aula3;

public class NovoAluno {
	private String nome;
	private int codigo;
	private double nota1;
	private double nota2;
	   
	public String getNome(){
		return this.nome;
		}
	public void setNome(String nome) {
		this.nome = nome;
		}
	public int getCodigo(){
		return this.codigo;
		}
	public void setCodigo(int codigo){
		this.codigo = codigo;
		}
	public double getNota1(){
		return this.nota1;
		}
	public void setNota1(double nota1){
		this.nota1 = nota1;
		}
	public double getNota2(){
		return this.nota2;
		}
	public void setNota2(double nota2){
		this.nota2 = nota2;
		}
	public void media(){
		double media = (getNota1() + getNota2())/2;
		System.out.println("A média do(a) aluno(a) " +getNome()+ " é: " +media);
		}
	}
