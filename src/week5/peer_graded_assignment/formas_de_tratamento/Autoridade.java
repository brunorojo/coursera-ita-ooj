package week5.peer_graded_assignment.formas_de_tratamento;

/**
 * Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome
 * e uma instância de IFormatadorNome.<br>
 * Essa classe deve possuir um método getTratamento() que delega a formatação do
 * nome para a instância de IFormatadorNome.
 * 
 * 
 * @author Bruno Rojo
 *
 */

public class Autoridade {
	private String nome;
	private String sobrenome;
	private IFormatadorNome formatadorNome;

	public Autoridade(String nome, String sobrenome, IFormatadorNome formatadorNome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadorNome = formatadorNome;
	}

	public String getTratamento() {
		return formatadorNome.formatarNome(nome, sobrenome);
	}

}