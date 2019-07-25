package week4.hands_on.modificadores_de_acesso_outro;

import week4.hands_on.modificadores_de_acesso.Referencia;

public class Outra {

	public void testeAcesso() {
		Referencia r =  new Referencia();
		//r.modificadorDefault = 0; //Default não é visível...
		r.modificadorPublico = 0;
		//r.modificadorProtegido = 0; //Protegido não é visível...
		//r.modificadorPrivado = 0; //Privado não é visível...
		
	}
}
