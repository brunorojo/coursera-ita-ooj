package week6.hands_on.criando_testando_classe_joga_excecoes;

public class LoginException extends Exception {

	private String login;
	
	public LoginException(String message, String login) {
	
		super(message);
		this.login = login;
	
	}
	
	public String getLogin() {
		return login;
	}

	
	
}
