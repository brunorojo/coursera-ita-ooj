package week4.hands_on.heranca_na_classe_carro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCarroMult {

	CarroDeCorrida c;

	@BeforeEach
	public void inicializaCarro() {
		c = new CarroMult("teste", 1.5, 100);
	}

	@Test
	public void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testAcelerarUmaVez() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());

	}

	@Test
	public void testAcelerarduasVezes() {
		c.acelerar();
		c.acelerar();
		assertEquals(15, c.getVelocidade());

	}

	@Test
	public void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());

	}

	@Test
	public void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		for (int i = 0; i < 14; i++) {
			c.acelerar();
		}

		assertEquals(100, c.getVelocidade());

	}

}
