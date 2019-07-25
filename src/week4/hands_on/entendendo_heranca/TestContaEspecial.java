package week4.hands_on.entendendo_heranca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContaEspecial extends TestContaCorrente {

	
	@BeforeEach
	public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}

	@Test
	public void saqueMaiorQueSaldo() {

		assertEquals(0, cc.sacar(350));
		assertEquals(200, cc.saldo);

	}

	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() {
		assertEquals(250, cc.sacar(250));
		assertEquals(-50, cc.saldo);

	}

}
