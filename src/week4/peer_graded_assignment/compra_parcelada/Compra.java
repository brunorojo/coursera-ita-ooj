package week4.peer_graded_assignment.compra_parcelada;

/**
 * Crie uma classe chamada Compra que recebe o valor da compra no construtor e o
 * armazena em um atributo. Essa classe deve possuir o método total() que
 * retorna o valor total da compra.
 * 
 * @author Bruno Rojo
 *
 */
public class Compra {
	
	protected double valor;

	public Compra(double valor) {

		this.valor = valor;
	}

	/**
	 * Retorna o valor total da compra.
	 * @return
	 */
	public double total() {

		return this.valor;

	}
}
