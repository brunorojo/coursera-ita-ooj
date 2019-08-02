package week5.peer_graded_assignment.formas_de_tratamento;

/**
 * Crie testes de unidade que fazem os testes da classe Autoridade com cada uma das implementações da interface.
 * 
 * @author Bruno Rojo
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestAutoridade {

	private Autoridade autoridade;
	
	
	@Test
	public void informalTest() {
		
		autoridade = new Autoridade("Bruno", "Rojo", new Informal());
		
		assertEquals("Bruno", autoridade.getTratamento());
	}

	@Test
	public void respeitosoMasculinoTest() {
		autoridade = new Autoridade("Bruno", "Rojo", new Respeitoso(ESexo.Masculino));
		
		assertEquals("Sr. Rojo", autoridade.getTratamento());
	}

	@Test
	public void respeitosoFemininoTest() {
		autoridade = new Autoridade("Renata", "Rojo", new Respeitoso(ESexo.Feminino));
		assertEquals("Sra. Rojo", autoridade.getTratamento());
	}

	@Test
	public void comTituloExcelentissimoTest() {
		autoridade = new Autoridade("Bruno", "Rojo", new ComTitulo(ETitulo.Excelentíssimo));
		assertEquals("Excelentíssimo Bruno Rojo", autoridade.getTratamento());
	}

	@Test
	public void comTituloIntocavelTest() {
		autoridade = new Autoridade("Bruno", "Rojo", new ComTitulo(ETitulo.Intocável));
		assertEquals("Intocável Bruno Rojo", autoridade.getTratamento());
	}
	
	@Test
	public void comTituloHonoravelTest() {
		autoridade = new Autoridade("Bruno", "Rojo", new ComTitulo(ETitulo.Honorável));
		
		assertEquals("Honorável Bruno Rojo", autoridade.getTratamento());
	}
	
	@Test
	public void comTituloMagnificoTest() {
		autoridade = new Autoridade("Bruno", "Rojo", new ComTitulo(ETitulo.Magnífico));
		assertEquals("Magnífico Bruno Rojo", autoridade.getTratamento());
	
		
		
	}
	
}
