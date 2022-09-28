package ufrn.imd.br;

public class LojaView extends Deposito {
	public static void main(String[] args) {
		
		ProdutoDuravel produ1 = new ProdutoDuravel();
		ProdutoDuravel produ2 = new ProdutoDuravel();
		ProdutoDuravel produ3 = new ProdutoDuravel();
		
		ProdutoNaoDuravel proNaod1 = new ProdutoNaoDuravel();
		ProdutoNaoDuravel proNaod2 = new ProdutoNaoDuravel();
		ProdutoNaoDuravel proNaod3 = new ProdutoNaoDuravel();
		
		
		produ1.setNome("Cadeira Gamer");
		produ1.setPreco(2599.00);
		
		produ2.setNome("Computador AMD Ryzen");
		produ2.setPreco(3000.00);
		
		produ3.setNome("Copo Stanley");
		produ3.setPreco(120.00);
		
		
		proNaod1.setNome("Carne de Sol KG");
		proNaod1.setPreco(65.00);
		
		proNaod2.setNome("Macarrão Talharim");
		proNaod2.setPreco(10.50);
		
		proNaod3.setNome("Queijo Mussarela KG");
		proNaod3.setPreco(39.99);
		
		Deposito Nordestão = new Deposito();
		boolean isEmpty = Nordestão.emptyDeposit(Nordestão.listaProdutos);
		
		Nordestão.adicionarProduto(produ1);
		Nordestão.adicionarProduto(produ2);
		Nordestão.adicionarProduto(produ3);
		
		Nordestão.adicionarProduto(proNaod1);
		Nordestão.adicionarProduto(proNaod2);
		Nordestão.adicionarProduto(proNaod3);
		
		Nordestão.removerProduto(produ2);
		
		Nordestão.removerProduto(proNaod3);
		
		Nordestão.quantProdutos();
		
		Nordestão.produtoMaisCaro(Nordestão.listaProdutos);
		
	}
	

	
	

	
	
}
