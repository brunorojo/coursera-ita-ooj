package week2.peer_graded_assignment.pizzaria;

import java.util.ArrayList;

/**
 * <b>WEEK 2 - Coursera - ITA - Orientação a Objetos com java. Qual o preço da
 * pizza?</b><br>
 * Crie uma nova classe chamada CarrinhoDeComprasMarioFelesSJunior que pode receber objetos da
 * classe PizzaMarioFelesSJunior. Ela deve ter um método que retorna o valor total de todas as
 * pizzas adicionadas. O Carrinho não pode aceitar que seja adicionada uma pizza
 * sem ingredientes.
 * 
 * @author Bruno Rojo
 *
 */
public class CarrinhoDeCompras {

	private ArrayList<Pizza> aListPizzas = new ArrayList<>();

	private int total = 0;

	/**
	 * Adiciona no carrinho a pizza.<br>
	 * - O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.
	 * 
	 * @implNote Método foi alterado para boolean, para atender os testes unitários da week3.
	 * 
	 * @param pizza
	 * @author Bruno Rojo
	 */
	public boolean addPizza(Pizza pizza) {
		if (Pizza.qtdIngred != 0) {
			aListPizzas.add(pizza);
			return true;
		} else {
			//System.err.println("[DEBUG] - Favor inserir um ingrediente válido... Retorna FALSE.");
			return false;
		}
	}

	/**
	 * Retorna o valor total de todas as pizzas adicionadas no carrinho.
	 * 
	 * @return valor total das pizzas.
	 * @author Bruno Rojo
	 */
	public int getTotal() {
		for (int i = 0; i < aListPizzas.size(); i++) {
			total += aListPizzas.get(i).getPreco();
		}
		return total;
	}

}