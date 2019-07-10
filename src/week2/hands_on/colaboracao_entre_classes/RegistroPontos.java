package week2.hands_on.colaboracao_entre_classes;

public class RegistroPontos {

	private CalculadoraBonus bonus;
	
	//Construtor recebe obj calculadora de bonus
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
	}

	//Faz um comentario...
	public void fazerUmComentario(Usuario u) {
		
		 u.pontos += 3 * bonus.bonus(u);
	}
	//Criar um novo topico 
	public void criarUmTopico(Usuario u) {
		u.pontos += 5 * bonus.bonus(u);
	}

	//Dar um like
	public void darUmLike(Usuario u) {
		u.pontos += 1 * + bonus.bonus(u);
	}

}
