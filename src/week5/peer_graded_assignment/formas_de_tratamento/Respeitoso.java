package week5.peer_graded_assignment.formas_de_tratamento;

/**
 * Crie a seguintes implementações da interface IFormatadorNome:<br>
 * 
 * Respeitoso: deve receber em seu construtor a informação se é masculino ou
 * feminino, e retornar "Sr." ou "Sra." seguido do sobrenome
 * 
 * @author Bruno Rojo
 *
 */
public class Respeitoso implements IFormatadorNome {

	private String titulo;

	public Respeitoso(ESexo sexo) {
		if (sexo.equals(ESexo.Masculino)) {
			this.titulo = "Sr. ";
		} else {
			this.titulo = "Sra. ";
		}
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo + sobrenome;
	}

}