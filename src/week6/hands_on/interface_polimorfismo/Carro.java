package week6.hands_on.interface_polimorfismo;

/**
 * Week 6 - Interfaces e Polimorfismo
 * 
 * @author Bruno Rojo
 *
 */
public class Carro implements Barulhento {

	@Override
	public String fazerBarulho() {
		return "vrum vrum bibi (classe Carro)";

	}

}
