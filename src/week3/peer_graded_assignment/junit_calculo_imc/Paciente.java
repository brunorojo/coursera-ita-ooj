package week3.peer_graded_assignment.junit_calculo_imc;

import java.text.DecimalFormat;

/*
 * Projeto WEEK1 - Cálculo do IMC. Coursera - ITA - Orientação a objetos com
 * java. 
 *
 */

/**
 * Cálcula o IMC do paciente.
 * 
 * @author Bruno Rojo
 *
 */
public class Paciente {

	private Double peso; // Em quilos.
	private Double altura; // Em metros.
	private Double calculoIMC; // Cálculo do IMC.

	/**
	 * Contrutor que recebe os argumentos em double do peso(quilo) e a altura (em
	 * metros.) do paciente.
	 * 
	 * @param peso   (quilo)
	 * @param altura (em metros)
	 * 
	 * @author Bruno Rojo
	 */
	Paciente(Double peso, Double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * Cálcula e retorna o Índice de Massa Corporal de acordo com a fórmula: <br>
	 * IMC = peso / (altura * altura).
	 * 
	 * @return retorna em double o cálculo do IMC.
	 * 
	 * @author Bruno Rojo
	 */
	public Double calcularIMC() {
		// Aplica a fórmula do IMC
		calculoIMC = (this.peso / (this.altura * this.altura));

		// Formata o resultado do cálculo para 1 casa decimal.
		String df = new DecimalFormat("0.#").format(calculoIMC).replace(",", ".");

		// Retorna o resultado do cálculo como Double e com 1 casa decimal.
		return Double.parseDouble(df);
	}

	/**
	 * Retorna uma String com a informação sobre o IMC cálculado de acordo com a
	 * classificação:<br> 
	 * Baixo peso muito grave = IMC abaixo de 16 kg/m²;<br>
	 * Baixo peso grave = IMC entre 16 e 16,99 kg/m²;<br>
	 * Baixo peso = IMC entre 17 e 18,49 kg/m²;<br>
	 * Peso normal = IMC entre 18,50 e 24,99 kg/m²;<br>
	 * Sobrepeso = IMC entre 25 e 29,99 kg/m²;<br>
	 * Obesidade grau I = IMC entre 30 e 34,99 kg/m²; <br>
	 * Obesidade grau II = IMC entre 35 e 39,99 kg/m²;<br>
	 * Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²;<br>
	 * 
	 * @return retorna uma String com a faixa do IMC do paciente.
	 */
	public String diagnostico() {

		if (calcularIMC() < 16) {
			return "Baixo peso muito grave. (IMC abaixo de 16 kg/m²)";

		} else if (calcularIMC() >= 16 && calcularIMC() < 16.99) {
			return "Baixo peso grave (IMC entre 16 e 16,99 kg/m²)";

		} else if (calcularIMC() >= 17 && calcularIMC() < 18.49) {
			return "Baixo peso (IMC entre 17 e 18,49 kg/m²)";

		} else if (calcularIMC() >= 18.50 && calcularIMC() < 24.99) {
			return "Peso normal (IMC entre 18,50 e 24,99 kg/m²)";

		} else if (calcularIMC() >= 25 && calcularIMC() < 29.99) {
			return "Sobrepeso (IMC entre 25 e 29,99 kg/m²)";

		} else if (calcularIMC() >= 30 && calcularIMC() < 34.99) {
			return "Obesidade grau I (IMC entre 30 e 34,99 kg/m²)";

		} else if (calcularIMC() >= 35 && calcularIMC() < 39.99) {
			return "Obesidade grau II (IMC entre 35 e 39,99 kg/m²)";

		} else {
			return "Obesidade grau III (IMC igual ou maior que 40 kg/m²)";
		}
	}

}

