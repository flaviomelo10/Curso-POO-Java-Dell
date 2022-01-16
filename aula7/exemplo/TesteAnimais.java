package exemplo;

public class TesteAnimais {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		Animal a2 = new SerHumano();
		Animal a3 = new Cavalo();
		Animal a4 = new Sapo();
		
		a1.moverSe(2);
		a2.moverSe(2);
		a3.moverSe(2);
		a4.moverSe(2);
	}

}
