package exemplo;

public class Carro {
	public void descrever(String marca, String cor, int ano) {
		System.out.println("Descrição: " + marca + ", " + cor + ", " + ano);
	}
	
	public void descrever(String cor, int ano) {
		System.out.println("Descrição: " + cor + ", " + ano);
	}
}
