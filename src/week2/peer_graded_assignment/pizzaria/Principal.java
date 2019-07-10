package week2.peer_graded_assignment.pizzaria;

/**
 * <b>WEEK 2 Week3 - Coursera - ITA - Orientação a Objetos com java. Qual o preço da
 * pizza?</b><br>
 * 
 * Crie uma classe Principal com o método main() que faz o seguinte:<br>
 * 
 * -> Cria 3 pizzas com ingredientes diferentes; <br>
 * -> Adiciona essas Pizzas em um CarrinhoDeCompra; <br>
 * -> Imprime o total do CarrinhoDeCompra; <br>
 * -> Imprime a quantidade utilizada de cada ingrediente; <br>
 * 
 * 
 * @author Bruno Rojo (01/07/2019)
 * 
 */
public class Principal {

	public static void main(String[] args) {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		// Pizza 1 com 2 ingredientes.
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("molho de tomate");
		pizza1.adicionaIngrediente("muçarela");
		carrinho.addPizza(pizza1);
		
		
		// Pizza 2 com 4 ingredientes.
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("molho de tomate");
		pizza2.adicionaIngrediente("muçarela");
		pizza2.adicionaIngrediente("ovo");
		pizza2.adicionaIngrediente("cebola");
		carrinho.addPizza(pizza2); 



		// Pizza 3 com 6 ingredientes
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("molho de tomate");
		pizza3.adicionaIngrediente("muçarela");
		pizza3.adicionaIngrediente("alho torrado");
		pizza3.adicionaIngrediente("tomate");
		pizza3.adicionaIngrediente("orêgano");
		pizza3.adicionaIngrediente("alho");
		carrinho.addPizza(pizza3);

		// Pizza 4 (sem ingredientes...)
		Pizza pizzaSemIngredientes = new Pizza();
		pizzaSemIngredientes.adicionaIngrediente("");
		carrinho.addPizza(pizzaSemIngredientes);


		// Imprime a quantidade utilizada de cada ingrediente
		System.out.println("Total ingredientes do pedido.............: " + Pizza.getQtdCadaIngr());

		// Imprime o total do CarrinhoDeCompra
		System.out.println("       Valor total do pedido..............: R$" + carrinho.getTotal());
		
		

	}

}