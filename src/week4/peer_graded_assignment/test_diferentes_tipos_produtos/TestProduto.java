package week4.peer_graded_assignment.test_diferentes_tipos_produtos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week4.peer_graded_assignment.diferentes_tipos_produtos.Produto;

/**
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e
 * para a classe CarrinhoCompras. Os testes de cada classe devem ser colocados
 * em classes separadas e devem estar em um diretório de código diferente das
 * classes de produção.
 * 
 * @author Bruno Rojo
 *
 */
public class TestProduto {

	// Inicia objetos.
	Produto prod1, prod2, prod3, prod4, prod5;

	@BeforeEach
	public void Before() {
		prod1 = new Produto("Notebook Acer", 1, 3500.0);
		prod2 = new Produto("Notebook Acer", 1, 3500.0);
		prod3 = new Produto("Celular Motorola", 2, 1250.0);
		prod4 = new Produto("Kindle Whiterpaper", 2, 1250.0);
		prod5 = new Produto("Celular Motorola", 2, 1250.0);
	}

	@Test
	public void testProdutosDiferentes() {
		assertEquals(false, prod1.equals(prod5));
	}

	@Test
	public void testProdutosDiferentesCodigosIguais() {
		assertEquals(true, prod3.equals(prod4));
	}

	@Test
	public void testProdutosIguais() {
		assertEquals(true, prod1.equals(prod2));
	}

}
