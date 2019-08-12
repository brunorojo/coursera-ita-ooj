package week6.hands_on.criando_testando_classe_joga_excecoes;

public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException {
		if (login.equals("guerra") && senha.equals("senhadoguerra")) {
			return new Usuario(login);
			
			
		}
		
		throw new LoginException("O usuario e a snha nã batem", login);

		
	}
	
}
