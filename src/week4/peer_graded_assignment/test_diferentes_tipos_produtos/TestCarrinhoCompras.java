package week4.peer_graded_assignment.test_diferentes_tipos_produtos;

import week4.peer_graded_assignment.diferentes_tipos_produtos.CarrinhoCompras;
import week4.peer_graded_assignment.diferentes_tipos_produtos.ProdutoComTamanho;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e
 * para a classe CarrinhoCompras. Os testes de cada classe devem ser colocados
 * em classes separadas e devem estar em um diretório de código diferente das
 * classes de produção.
 * 
 * @author Bruno Rojo
 *
 */
public class TestCarrinhoCompras {

	ProdutoComTamanho prod1, prod2, prod3, prod4, prod5;
		
	CarrinhoCompras carrinho = new CarrinhoCompras();
	

	@BeforeEach
	public void Before() { 

		prod1 = new ProdutoComTamanho ("Computador1", 01, 100.1, 1); //Nome, código, valor e tamanho.
		prod2 = new ProdutoComTamanho ("Computador2", 02, 200.1, 2); //Nome, código, valor e tamanho.
		prod3 = new ProdutoComTamanho ("Computador3", 03, 300.1, 3); //Nome, código, valor e tamanho.
		prod4 = new ProdutoComTamanho ("Computador4", 04, 400.1, 4); //Nome, código, valor e tamanho.
		prod5 = new ProdutoComTamanho ("Computador5", 01, 500.1, 5); //Nome, código, valor e tamanho.
	}
	

	@BeforeEach
	public void limpaCarrinho() {
		carrinho.limparCarrinho();
	}
	

	@Test
	public void testValorTotalCompra() {
		carrinho.adicionaProduto(prod1, 1);
		carrinho.adicionaProduto(prod2, 1);
		carrinho.adicionaProduto(prod3, 1);
		carrinho.adicionaProduto(prod4, 1);
		carrinho.adicionaProduto(prod5, 1);
		assertEquals(1500.5, carrinho.valorCompra());
	}
	
	
	@Test
	public void testAdicionaERemoveProdutos() {
		carrinho.adicionaProduto(prod1,2);
		carrinho.adicionaProduto(prod2,2);
		carrinho.removeProduto(prod1, 2);
		carrinho.removeProduto(prod2, 2);
		assertEquals(00.0, carrinho.valorCompra());
	}
	
	
}