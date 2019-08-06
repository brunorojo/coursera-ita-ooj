package week6.hands_on.interface_polimorfismo;

/**
 * Week 6 - Interfaces e Polimorfismo
 * 
 * @author Bruno Rojo
 *
 */
public class Bateria implements Barulhento {

	@Override
	public String fazerBarulho() {
		return "pum pum tá tá ptiz (classe Bateria)";
	}

}
