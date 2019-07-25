package week4.hands_on.entendendo_heranca;

public class ContaCorrente {

	
	int saldo;
	
	public int sacar(int valor) {
		if(valor > saldo) {
			return 0;
		}else {
			saldo -= valor;
			return valor;
		}
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}
	
}
