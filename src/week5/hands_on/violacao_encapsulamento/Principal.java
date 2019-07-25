package week5.hands_on.violacao_encapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		Pilha p = new Pilha(10);
		
		//Adiciona
		p.empilhar("eduardo");
		p.empilhar("maria");
		p.empilhar("jose");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		//Desempilhando...
		System.out.println("--------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		

	}
	
	

}
