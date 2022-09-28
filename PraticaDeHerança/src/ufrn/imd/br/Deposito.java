package ufrn.imd.br;

import java.util.ArrayList;

public class Deposito extends Produto {

	public ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	
	
	
	
	public void adicionarProduto(Produto p) {
		listaProdutos.add(p);
		System.out.println("Produto adicionado com sucesso");
	}
	
	
	public void removerProduto(Produto p) {
		listaProdutos.remove(p);
		System.out.println("Produto removido com sucesos");
	}
	
	
	public void quantProdutos() {
		int quant = listaProdutos.size();
		System.out.println("A lista de produtos atual contém " + quant + " produtos");
	}
	
	public boolean emptyDeposit(ArrayList<Produto> a) {
		if(a.size() == 0) {
			System.out.println("A lista de produtos no momento está vazia");
			return true;
		}
		else{
			System.out.println("A lista de produtos no momento ainda contém produtos");
			return false;
		}	
	}
	
	
	public Produto produtoMaisCaro(ArrayList<Produto> prodExemplo) {
		if(emptyDeposit(prodExemplo) == true ) {
			System.out.println("Nenhuma operação pode ser feita, a lista está vazia");
			return null;
		}
		else{
			Produto produtoMaisCaro = prodExemplo.get(0);
			for (Produto produto : prodExemplo) {
				if (produto.getPreco() > produtoMaisCaro.getPreco()) {
					produtoMaisCaro = produto;
				}
			}
			
			return produtoMaisCaro;
			
		}
		
	}
}
