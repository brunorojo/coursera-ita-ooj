package week4.peer_graded_assignment.diferentes_tipos_produtos;

public class Produto {

	/*
	 * Crie uma classe chamada Produto que deve possuir um nome, um código e um
	 * preço.
	 */

	private String nome;
	private int codigo;
	private double preco;

	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	/*
	 * Métodos getters dos atributos da classe.
	 */
	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	/*
	 * Sobrescreva os métodos equals() e hashCode() de Object (veja seção sobre
	 * esses métodos), de forma a serem considerados iguais instancias de Produto
	 * que possuam o mesmo código.
	 * 
	 * O método hashCode() também é definido na classe Object e retorna o código
	 * hash de um objeto, que é utilizado em várias classes que implementam
	 * estruturas de dados. Ele precisa obedecer a seguinte regra: quando o método
	 * equals() retornar true, o retorno de hashCode() desses objetos precisa ser
	 * igual. Mas se o retorno do hashCode() for igual, não necessariamente os
	 * objetos são iguais, ou seja, o equals() pode retornar true ou false.
	 */
	@Override
	public int hashCode() {
		return this.codigo;
	}


	@Override
	public boolean equals(Object obj) {

		// Verifica se objetos são iguais.
		if (this == obj)
			return true;

		// Verifica se o objeto é null.
		if (obj == null)
			return false;

		// Verifica se objeto é de outra classe.
		if (getClass() != obj.getClass())
			return false;

		// verifica se os códigos são diferentes.
		Produto newObj = (Produto) obj;
		if (codigo != newObj.codigo)
			return false;
		return true;
	}

}
