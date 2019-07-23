package week4.peer_graded_assignment.diferentes_tipos_produtos;

import java.util.HashMap;
import java.util.Map;

/**
 * Crie uma classe CarrinhoCompras que armazene em um atributo interno do tipo
 * HashMap cada produto adicionado no carrinho e sua respectiva quantidade. O
 * método adicionaProduto() deve receber a instancia do produto e a quantidade.
 * Caso o produto já exista no HashMap, a quantidade deve ser somada a que já
 * existe no carrinho. Deve haver também um método removeProduto() que também
 * recebe a instancia do produto e a quantidade a ser removida. Observe que
 * produtos de tamanhos diferentes devem ser considerados como produtos
 * diferentes no carrinho. O carrinho deve possuir um método que calcula o valor
 * total da compra.
 * 
 * @author Bruno Rojo
 * 
 *
 */
public class CarrinhoCompras {

	public static Map<Produto, Integer> carrinho = new HashMap<>();

	private static double total = 0;

	public void adicionaProduto(Produto prod, int qtd) {
		int qtdCarrinho;
		if (carrinho.containsKey(prod)) {
			qtdCarrinho = carrinho.get(prod);
			somaParcial(prod, qtd);
			carrinho.put(prod, qtd += qtdCarrinho);
		} else {
			carrinho.put(prod, qtd);
			somaParcial(prod, qtd);
		}

	}

	public void removeProduto(Produto prod, int qtd) {
		if (carrinho.containsKey(prod)) {
			carrinho.merge(prod, qtd, (x, y) -> {
				return x - y < 1 ? null : x - y;
			});
			total -= prod.getPreco() * qtd;
		}
	}

	public double valorCompra() {
		return total;
	}

	private void somaParcial(Produto prod, int qtd) {
		total += prod.getPreco() * qtd;
	}

	public void limparCarrinho() {
		carrinho.clear();
		total = 0;

	}

}
