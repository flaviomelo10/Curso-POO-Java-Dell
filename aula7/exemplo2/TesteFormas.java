package exemplo2;

import java.util.Scanner;

public class TesteFormas {
	public static void desenhar(FormaGeometrica f) {
		System.out.println(f.representacao());
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opc;
		
		System.out.println("Digite a opção da figura desejada: \n1 - Quadrado" + "\n2 - Triângulo");
		opc = entrada.nextInt();
		
		if(opc == 1)
			desenhar(new Quadrado());
		else if(opc == 2)
			desenhar(new Triangulo());
		else
			desenhar(new FormaGeometrica());
	}

}
