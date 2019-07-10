package week2.hands_on.comparando_atributos_estatico_instancia;

public class Somador {

	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	
	
	void imprimir() {
		System.out.println(nome + " Variavel da Instancia:" + valorInstancia + " | Var.Estática:" + valorEstatica);
		
	}
}