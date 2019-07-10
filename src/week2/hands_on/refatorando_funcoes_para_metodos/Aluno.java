package week2.hands_on.refatorando_funcoes_para_metodos;


public class Aluno {

	int bimestre1;
	int bimestre2;
	int bimestre3;
	int bimestre4;
	
	
	public int media() {
		int total = 0;
		total += bimestre1;
		total += bimestre2;
		total += bimestre3;
		total += bimestre4;

		return total / 4;
	}

	public boolean passouDeAno() {
	
		if (media() >= 60) {
			return true;
		}
		return false;
	}
	
}

