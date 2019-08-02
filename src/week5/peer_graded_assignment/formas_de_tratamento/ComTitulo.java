package week5.peer_graded_assignment.formas_de_tratamento;

/**
 * Crie a seguintes implementações da interface IFormatadorNome:<br>
 * ComTítulo: deve receber em seu construtor o título e retornar o título
 * seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"
 * 
 * @author Bruno Rojo
 *
 */
public class ComTitulo implements IFormatadorNome {

	private ETitulo titulo;

	public ComTitulo(ETitulo titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;
	}

}