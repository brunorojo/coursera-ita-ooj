package week4.peer_graded_assignment.diferentes_tipos_produtos;

/**
 * Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. Essa
 * classe deve possuir uma informação adicional de tamanho. Um exemplo seria o
 * tamanho de uma roupa ou a numeração de um calçado. Método equals() e
 * hashCode() devem ser sobrescritos de forma que um produto com mesmo código e
 * tamanhos diferentes são considerados diferentes.
 * 
 * @author Bruno Rojo
 * 23 de Julho de 2019.
 */

public class ProdutoComTamanho extends Produto {

	
	private int tamanho;

	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	public int getCodigo() {
		return super.getCodigo();
	}

	@Override
	public int hashCode() {
		return super.hashCode() + tamanho;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (!super.equals(obj))
			return false;

		if (getClass() != obj.getClass())
			return false;

		ProdutoComTamanho newObj = (ProdutoComTamanho) obj;
		if (tamanho != newObj.tamanho && getCodigo() == newObj.getCodigo())
			return false;
		return true;
	}

}