package week2.hands_on.refatorando_funcoes_para_metodos;

public class Principal {

	
	public static void main(String[] args) {
		Aluno guerra = new Aluno();
		guerra.bimestre1 = 70;
		guerra.bimestre2 = 70;
		guerra.bimestre3 = 70;
		guerra.bimestre4 = 70;
		
		System.out.println(guerra.media());
		System.out.println(guerra.passouDeAno());
	}
}
