package week4.hands_on.heranca_na_classe_carro;

public class Carro {
	private int potencia;
	private int velocidade;
	private int velocidadeMaxima;
	private String nome;

	public Carro(String nome, int potencia, int velocidadeMaxima) {
		this.nome =  nome;
		this.potencia = potencia;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}
	
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;
	}

	public void frear() {
		velocidade = velocidade / 2;
	}

	
	
	
	public int getVelocidade() {
		return velocidade;

	}

	public String getNome() {
		return nome;
	}

	
}
