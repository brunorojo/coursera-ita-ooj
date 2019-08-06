package week6.hands_on.interface_polimorfismo;

/**
 * Week 6 - Interfaces e Polimorfismo
 * 
 * @author Bruno Rojo
 *
 */
public class Cachorro implements Barulhento {

	@Override
	public String fazerBarulho() {
		return "au au (classe Cachorro)";

	}

}
