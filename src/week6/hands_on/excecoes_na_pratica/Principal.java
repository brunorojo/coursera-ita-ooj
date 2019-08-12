package week6.hands_on.excecoes_na_pratica;

public class Principal {

	/**
	 * Week6 - Hands-on: Exceções na Prática
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		a(-100);
		System.out.println("terminando execucao de main()");

	}

	public static void a(int i) {
		System.out.println("executando a() com: " + i);

		try {
			b(i);
		} catch (Exception e) {
			System.out.println("tratando a exceção: " + e.getMessage());
		}
		System.out.println("terminando execucao de a()");

	}

	public static void b(int i) throws Exception {
		System.out.println("executando b() com: " + i);
		if (i > 0)
			throw new Exception("mensagem");

		System.out.println("terminando execucao de b()");
	}

}
