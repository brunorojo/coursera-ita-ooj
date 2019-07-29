package week4.peer_graded_assignment.compra_parcelada;



/**
 * Crie uma subclasse chamada CompraParcelada que estende a classe Compra. Essa
 * classe deve receber no construtor também as informações da quantidade de
 * parcelas e o juros mensal. Crie uma nova implementação do método total() na
 * subclasse que faz o cálculo utilizando juros compostos.
 * 
 * @author Bruno Rojo
 *
 */
public class CompraParcelada extends Compra {

	private int qtdParcelas;
	private double jurosMensal;
	private double valorTotal;

	
	public CompraParcelada(double valor, int qtdParcelas, double jurosMensal) {
		super(valor);
		this.qtdParcelas = qtdParcelas;
		this.jurosMensal = jurosMensal;
	}

	@Override
	public double total() {
		this.valorTotal = super.valor * Math.pow((1.0 + this.jurosMensal / 100), qtdParcelas);	
		return Math.round(this.valorTotal * 100) / 100.00;
	}

}
