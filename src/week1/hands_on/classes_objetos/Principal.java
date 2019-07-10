package week1.hands_on.classes_objetos;

public class Principal {
	public static void main(String[] args) {

		// CARRO 1
		Carro c1 = new Carro();
		c1.potencia = 10;
		c1.nome = "Corcel";
		c1.velocidade = 0;

		// CARRO 2
		Carro c2 = new Carro();
		c2.potencia = 15;
		c2.nome = "Carango";
		c2.velocidade = 0;

		// CARRO 3
		Carro c3 = new Carro();
		c3.potencia = 20;
		c3.nome = "Del Rey";
		c3.velocidade = 0;

		// Ação no carro 1
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();

		// Ação no carro 2
		c2.acelerar();
		c2.acelerar();

		// Ação no carro 3
		c3.acelerar();
		c3.acelerar();
		c3.acelerar();
		c3.acelerar();
		c3.frear();

		// Imprimir resultado...
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
	}

}

