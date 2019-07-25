package week4.hands_on.entendendo_heranca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContaCorrente {

	public ContaCorrente cc;

	@BeforeEach
	private void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	public void depositoCC() {
		assertEquals(200, cc.saldo);

	}

	@Test
	public void saqueCC() {
		assertEquals(50, cc.sacar(50));
		assertEquals(150, cc.saldo);

	}

	@Test
	public void saqueMaiorQueSaldoCC() {
		assertEquals(200, cc.saldo);
		assertEquals(0, cc.sacar(250));
	}

}
