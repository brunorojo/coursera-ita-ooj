package week5.peer_graded_assignment.formas_de_tratamento;

/**
 * Crie a seguintes implementações da interface IFormatadorNome:<br>
 * Informal: retorna somente o primeiro nome
 * 
 * @author Bruno Rojo
 *
 */
public class Informal implements IFormatadorNome {

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return nome;
	}

}