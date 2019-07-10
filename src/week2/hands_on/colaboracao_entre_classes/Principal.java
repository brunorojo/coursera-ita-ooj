package week2.hands_on.colaboracao_entre_classes;


public class Principal {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.nome = "Bruno Rojo";
		usuario.vip = true;
		

		CalculadoraBonus calcBonus = new CalculadoraBonus();
		
		RegistroPontos regPontos = new RegistroPontos(calcBonus);
		
		regPontos.criarUmTopico(usuario);
		regPontos.criarUmTopico(usuario);
		regPontos.darUmLike(usuario);
		regPontos.fazerUmComentario(usuario);

		System.out.println("Nome: " + usuario.nome);
		System.out.println("Pontos: " + usuario.pontos);
		System.out.println("VIP: " + usuario.vip);
	}

}
