package week3.peer_graded_assignment.junit_calculo_imc;

/**
 * Classe PrincipalMarioFelesSJunior, que se cria 3 instâncias da classe Paciente com valores
 * diferentes e se imprime no console o resultado dos dois métodos criados na
 * classe Paciente.
 * 
 * @param args
 * @author Bruno Rojo
 */
public class Principal {


	public static void main(String[] args) {

		Paciente p1 = new Paciente(52.0, 1.81); // peso e altura
		Paciente p2 = new Paciente(120.0, 1.81); // peso e altura
		Paciente p3 = new Paciente(150.0, 1.81); // peso e altura

		System.out.println("IMC: " + p1.calcularIMC() + " | Diagnóstico: " + p1.diagnostico());
		System.out.println("IMC: " + p2.calcularIMC() + " | Diagnóstico: " + p2.diagnostico());
		System.out.println("IMC: " + p3.calcularIMC() + " | Diagnóstico: " + p3.diagnostico());

	}

}
