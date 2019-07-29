package week4.hands_on.heranca_na_classe_carro;

//Antiga classe carro, que foi criada no hangs on parte 1 e na parte 2, foi renomeada para CarroSoma.
public class CarroSoma extends CarroDeCorrida {

	private int potencia;

	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	public void acelerar() {
		velocidade += potencia;
		if (velocidade > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}

}
