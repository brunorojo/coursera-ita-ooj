package week4.peer_graded_assignment.test_diferentes_tipos_produtos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week4.peer_graded_assignment.diferentes_tipos_produtos.ProdutoComTamanho;


/**
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e
 * para a classe CarrinhoCompras. Os testes de cada classe devem ser colocados
 * em classes separadas e devem estar em um diretório de código diferente das
 * classes de produção.
 * 
 * @author Bruno Rojo
 *
 */
public class TestProdutoComTamanho {

	ProdutoComTamanho prod1, prod2, prod3, prod4, prod5;

	
	@BeforeEach
	public void Before() {
		prod1 = new ProdutoComTamanho ("Computador", 1, 4500.0, 45);
		prod2 = new ProdutoComTamanho ("Computador", 1, 4500.0, 45);
		prod3 = new ProdutoComTamanho ("Celular", 1, 4500.0, 45);
		prod4 = new ProdutoComTamanho ("Tablet", 1, 1300.0, 30);
		prod5 = new ProdutoComTamanho ("Relógio", 4, 500.0, 5);
		
	}
	

	@Test
	public void testProdutosIguais() {
		assertEquals(true, prod1.equals(prod2));
	}
	

	@Test
	public void testProdutosDiferentesCodigosIguais() {
		assertEquals(true, prod1.equals(prod3));
	}
	

	@Test
	public void testProdutosDiferentesCodigosIguaisTamanhosDifs() {
		assertEquals(false, prod3.equals(prod4));
	}
	
	@Test
	public void testProdutosDiferentes() {
		assertEquals(false, prod1.equals(prod5));
	}

}