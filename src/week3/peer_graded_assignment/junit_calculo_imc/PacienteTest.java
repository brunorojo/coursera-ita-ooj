package week3.peer_graded_assignment.junit_calculo_imc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Week 3 - Coursera - ITA Orientação a Objetos em Java.
 * 
 * 
 * Testes do week4.projeto Cálculo IMC (Week1).
 * 
 * 
 * @author Bruno Rojo
 * @date Julho de 2019
 *
 */
class PacienteTest {

	// Baixo peso muito grave = IMC abaixo de 16 kg/m²
	@Test
	void baixoPesoMuitoGrave() {
		Paciente p = new Paciente(50.0, 1.81);
		double imcEsperado = 15.3;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Baixo peso muito grave. (IMC abaixo de 16 kg/m²)", p.diagnostico());

	}

	// Baixo peso grave = IMC entre 16 e 16,99 kg/m²
	@Test
	void baixoPesoGrave() {
		Paciente p = new Paciente(55.0, 1.81);
		double imcEsperado = 16.8;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Baixo peso grave (IMC entre 16 e 16,99 kg/m²)", p.diagnostico());

	}

	// Baixo peso = IMC entre 17 e 18,49 kg/m²
	@Test
	void baixoPeso() {
		Paciente p = new Paciente(59.0, 1.81);
		double imcEsperado = 18.0;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Baixo peso (IMC entre 17 e 18,49 kg/m²)", p.diagnostico());

	}

	// Peso normal = IMC entre 18,50 e 24,99 kg/m²
	void pesoNormal() {
		Paciente p = new Paciente(61.0, 1.81);
		double imcEsperado = 18.6;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Peso normal (IMC entre 18,50 e 24,99 kg/m²)", p.diagnostico());

	}

	// Sobrepeso = IMC entre 25 e 29,99 kg/m²
	@Test
	void sobrePeso() {
		Paciente p = new Paciente(85.0, 1.81);
		double imcEsperado = 25.9;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Sobrepeso (IMC entre 25 e 29,99 kg/m²)", p.diagnostico());

	}

	// Obesidade grau I = IMC entre 30 e 34,99 kg/m²
	@Test
	void obesidadeGrauI() {
		Paciente p = new Paciente(99.0, 1.81);
		double imcEsperado = 30.2;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Obesidade grau I (IMC entre 30 e 34,99 kg/m²)", p.diagnostico());

	}

	// Obesidade grau II = IMC entre 35 e 39,99 kg/m²
	@Test
	void obesidadeGrauII() {
		Paciente p = new Paciente(115.0, 1.81);
		double imcEsperado = 35.1;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Obesidade grau II (IMC entre 35 e 39,99 kg/m²)", p.diagnostico());

	}

	// Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
	@Test
	void obesidadeGrauIII() {
		Paciente p = new Paciente(131.0, 1.81);
		double imcEsperado = 40.0;
		assertEquals(imcEsperado, p.calcularIMC(), Math.abs(imcEsperado - p.calcularIMC()));
		assertEquals("Obesidade grau III (IMC igual ou maior que 40 kg/m²)", p.diagnostico());

	}

}
