package week5.hands_on.interfaces_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Principal {

	
	public static void main(String[] args) {

		List<Candidato> lista = new ArrayList<>();
		lista.add(new Candidato(80, true, 30));
		lista.add(new Candidato(80, false, 25));
		lista.add(new Candidato(80, false, 28));
		lista.add(new Candidato(90, false, 20));

		Collections.sort(lista);

		int cont = lista.size();
		
		
		//Imprime a ordem do de ingressão no concurso.
		for(Candidato c:lista) {
			System.out.print("Ordem de ingressão no concurso:["+cont+"]....:");
			System.out.println(c);
			
			cont=cont-1;
		}
		
	}

}
