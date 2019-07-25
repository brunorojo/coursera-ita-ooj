package week4.hands_on.modificadores_de_acesso;

public class OutraMesmoPacote {

	public void testeAcesso() {
		Referencia r =  new Referencia();
		
		r.modificadorDefault = 0; 
		r.modificadorPublico = 0;
		r.modificadorProtegido = 0; 
		// r.modificadorPrivado = 0; //Não vísivel. 
	}
	
}
