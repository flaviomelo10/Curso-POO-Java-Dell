package exemplo4;

public class Principal {
	public static void mostrarCalculo(Operacao operacao, double x, double y) {
		System.out.println("O resultado é: " +operacao.calcular(x, y));
	}
	public static void main(String[] args) {
		Principal.mostrarCalculo(new Soma(), 3, 2);
		Principal.mostrarCalculo(new Divisao(), 10, 5);
	}

}
