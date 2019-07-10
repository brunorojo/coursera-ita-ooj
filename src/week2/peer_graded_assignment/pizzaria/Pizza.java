package week2.peer_graded_assignment.pizzaria;

import java.util.HashMap;

/**
 * <b>WEEK 2 - Coursera - ITA - Orientação a Objetos com java. Qual o preço da
 * pizza?</b><br>
 * Crie uma classe Pizza que possua o método adicionaIngrediente() que recebe
 * uma String com o ingrediente a ser adicionado. Essa classe também deve
 * possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou
 * menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5
 * ingredientes custa 23 reais.
 * 
 * É preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize
 * uma variável estática na classe Pizza para guardar esse tipo de informação
 * (dica: utilize a classe HashMap para guardar o ingrediente como chave e um
 * Integer como valor). Crie o método estático contabilizaIngrediente() para ser
 * chamado dentro de adicionaIngrediente() e fazer esse registro.
 * 
 * @author Bruno Rojo
 *
 */
public class Pizza {
	static int qtdIngred = 0;

	// Variável estática que armazena os ingredientes e valor da pizza.
	static HashMap<String, Integer> hMapIngredientes = new HashMap<>();

	/**
	 * Método adicionaIngrediente() que recebe uma String com <br>
	 * o ingrediente a ser adicionado.
	 * 
	 * @param ingrediente
	 * @return void
	 * @author Bruno Rojo
	 */
	public void adicionaIngrediente(String ingrediente) {
		if (!ingrediente.isEmpty()) {
			Pizza.qtdIngred++;
			contablilizaIngrediente(ingrediente);
		} else {
			//System.err.println("[DEBUG] - Ingrediente inválido.");
		}

	}

	/**
	 * Método getPreco() que calcula da seguinte forma: <br>
	 * 2 ingredientes ou menos custam 15 reais,<br>
	 * de 3 a 5 ingredientes custam 20 reais <br>
	 * e mais de 5 ingredientes custa 23 reais.<br>
	 * 
	 * @return preço da pizza
	 * 
	 * @author Bruno Rojo
	 */
	public int getPreco() {
		if (Pizza.qtdIngred == 0)
			return 0;
		else if (Pizza.qtdIngred >= 1 && Pizza.qtdIngred <= 2)
			return 15;
		else if (Pizza.qtdIngred >= 3 && Pizza.qtdIngred <= 5)
			return 20;
		else
			return 23;
	}

	/**
	 * Crie o método estático contabilizaIngrediente() para ser chamado dentro de
	 * adicionaIngrediente() e fazer esse registro.
	 * 
	 * @param ingrediente
	 * @return void
	 * @author Bruno Rojo
	 */
	private static void contablilizaIngrediente(String ingrediente) {

		if (hMapIngredientes.containsKey(ingrediente)) {
			hMapIngredientes.put(ingrediente, (hMapIngredientes.get(ingrediente)) + 1);
			// System.out.println("[DEBUG]: " + hMapIngredientes + " - "
			// +hMapIngredientes.size());

		} else
			hMapIngredientes.put(ingrediente, 1);
		// System.out.println("[DEBUG]: " + hMapIngredientes + " - "
		// +hMapIngredientes.size());

	}

	/**
	 * Imprime a quantidade utilizada de cada ingrediente.<br>
	 * 
	 * @return Retorna a quantidade de cada ingrediente utilizado para o pedido.
	 * @author Bruno Rojo
	 */
	public static String getQtdCadaIngr() {
		
		return hMapIngredientes.toString();
		

	}
	
	
	
	/**
	 * Método estático para zera o registro de ingredientes. (Week3)<p>
	 * 
	 * <em>(Este novo método foi solicitado no exercício da Week3 de testes da Classe Pizza e TestCarrinhoDeCompras.)</em>
	 * 
	 * @author Bruno Rojo
	 * @date Julho de 2019
	 */
	public static void zerarRegistroIngredientes() {
		
		hMapIngredientes.clear();
		qtdIngred = 0;
	}
	
	
}



