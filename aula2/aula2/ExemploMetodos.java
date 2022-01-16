package aula2;

public class ExemploMetodos {
	
	public static double somar(double valor_1, double valor_2) {
		return valor_1 + valor_2;
	}
	
	public static void somar_2(double valor_1, double valor_2) {
		double somar_2 = valor_1 + valor_2;
		System.out.println("A soma vale: " +somar_2);
	}
	
	public static double subtrair(double valor_1, double valor_2) {
		return valor_1 - valor_2;
	}
	
	public static void subtrair_2(double valor_1, double valor_2) {
		double subtrair_2 = valor_1 - valor_2;
		System.out.println("A diferença vale: " +subtrair_2);
	}
	
	public static double multiplicar(double valor_1, double valor_2) {
		return valor_1 * valor_2;
	}
	
	public static void multiplicar_2(double valor_1, double valor_2) {
		double multiplicar_2 = valor_1 * valor_2;
		System.out.println("O produto vale: " +multiplicar_2);
	}
	
	public static double dividir(double valor_1, double valor_2) {
		return valor_1 / valor_2;
	}
	
	public static void dividir_2(double valor_1, double valor_2) {
		double dividir_2 = valor_1 / valor_2;
		System.out.println("O quociente vale: " +dividir_2);
	}
	
	public static void main(String[] args) {
		System.out.println(somar(7, 3));
		somar_2(7, 3);
		System.out.println("-------------");
		System.out.println(subtrair(10, 5));
		subtrair_2(10, 5);
		System.out.println("-------------");
		System.out.println(multiplicar(6, 8));
		multiplicar_2(6, 8);
		System.out.println("-------------");
		System.out.println(dividir(45, 9));
		dividir_2(45, 9);
	}

}
