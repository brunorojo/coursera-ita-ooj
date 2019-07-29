package week4.peer_graded_assignment.compra_parcelada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCompras {

	// Juros Compostos, teste de valor futuro (ou montante) para 0 parcela.
		@Test
		public void compraEm0Parcela() {
			Compra c = new CompraParcelada(100.0, 0, 10.0);
			assertEquals(100.0, c.total());
		}
	
	
	// Juros Compostos, teste de valor futuro (ou montante) para 1 parcela.
	@Test
	public void compraEm1Parcela() {
		Compra c = new CompraParcelada(100.0, 1, 10.0);
		assertEquals(110.0, c.total());
	}

	// Juros Compostos, teste de valor futuro (ou montante) para 2 parcelas.
	@Test
	public void compraEm2Parcelas() {
		Compra c = new CompraParcelada(100.0, 2, 10.0);
		assertEquals(121.00, c.total());
	}

	// Juros Compostos, teste de valor futuro (ou montante) para 5 parcelas.
	@Test
	public void compraEm5Parcelas() {
		Compra c = new CompraParcelada(100.00, 5, 10.0);
		assertEquals(161.05, c.total());
	}


	// Juros Compostos, teste de valor futuro (ou montante) para 10 parcelas.
	@Test
	public void compraEm10Parcelas() {
		Compra c = new CompraParcelada(100.0, 10, 10.0);
		assertEquals(259,37, c.total());
	}
	
	
	// Juros Compostos, teste de valor futuro (ou montante) para 12 parcelas.
	@Test
	public void compraEm12Parcelas() {
		Compra c = new CompraParcelada(100.0, 12, 10.0);
		assertEquals(313.84, c.total());
	}


}