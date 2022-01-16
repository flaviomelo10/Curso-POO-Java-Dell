package automovel;

public class Teste {

	public static void main(String[] args) {
		Automovel auto01 = new Automovel("Ferrari");
		auto01.setQuantidadeDePassageiros(5);
		auto01.setCombustivel("Gasolina");
		Automovel auto02 = new Automovel("Trator", "Óleo diesel", 1);
		
		System.out.println(auto01.getNome() + " - utiliza " + auto01.getCombustivel());
		
		System.out.println(auto02.getNome() + " - transporta " + auto02.getQuantidadeDePassageiros());
	}

}
