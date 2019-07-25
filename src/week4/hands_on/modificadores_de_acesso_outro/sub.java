package week4.hands_on.modificadores_de_acesso_outro;

import week4.hands_on.modificadores_de_acesso.Referencia;

public class sub extends Referencia{

	public void testeAcesso() {
		
		Referencia r = new Referencia();
		
		//r.modificadorDefault = 0; //Não vísivel. 
		r.modificadorPublico = 0;
		//r.modificadorProtegido = 0; 
		//r.modificadorPrivado = 0; //Não vísivel.
		
	}
	 
	
	
}
