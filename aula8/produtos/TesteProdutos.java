package produtos;

public class TesteProdutos {

	public static void main(String[] args) {
		Produtos produto1 = new Produtos("Geleia de uva", 25.00, 2);
		Produtos produto2 = new Produtos("Pasta de Amendoim", 16.50, 1, 4.00);
		
		System.out.println("Produto: " + produto1.getNome() + "\n" +
							"Valor: R$" + produto1.getValor() + "\n" +
							"Quantidade: " + produto1.getQuantidade());
		
		System.out.println();
		
		System.out.println("Produto: " + produto2.getNome() + "\n" +
							"Valor: R$" + produto2.getValor() + "\n" +
							"Quantidade: " + produto2.getQuantidade() + "\n" +
							"Desconto: R$" +produto2.getValorDesconto());
	}
	
}
