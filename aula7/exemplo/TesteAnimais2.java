package exemplo;

public class TesteAnimais2 {

	public static void main(String[] args) {
		Animal a;
		System.out.println("1 - Ser Humano \n2 - Cavalo \n3 - Sapo");
		int opc = 1;
		System.out.println("Opção escolhida "+opc);
		if(opc == 1)
			a = new SerHumano();
		else
			if(opc == 2)
				a = new Cavalo();
			else
				if(opc == 3)
					a = new Sapo();
				else
					a = new Animal();
		a.moverSe(2);
	}

}
