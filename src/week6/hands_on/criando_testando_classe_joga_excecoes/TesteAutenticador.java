package week6.hands_on.criando_testando_classe_joga_excecoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class TesteAutenticador {

	@Test
	@Order(1)
	@DisplayName("1-Efetuar login com sucesso.")
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getLogin());
	}

	@SuppressWarnings("unused")
	@Test
	@Order(2)
	@DisplayName("2-Verificar retorno da exception sem try/catch, ao inserir senha inválida.")
	public void loginFalha() throws LoginException {
		Autenticador a = new Autenticador();

		Assertions.assertThrows(LoginException.class, () -> {
			Usuario u = a.logar("guerra", "senhadoguerra.errada");
		});

	}

	@SuppressWarnings("unused")
	@Test
	@Order(3)
	@DisplayName("3-Verificar retorno da exception com try/catch, ao inserir senha inválida.")
	public void informacoesDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("guerra", "senhadoguerra.errada");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}

	}

}