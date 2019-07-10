package week3.hands_on.junit_metodos;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Coursera - OOJ
 * Week3 - Hands-on: Métodos Before e After no JUnit
 * Estudos do JUnit 5.
 * 
 * @author br108007
 *
 */

class MetodosBeforeAfterNoJUnit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("		@BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("		@AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach");
	}

	@Test
	void test1() {
		System.out.println("	Teste 1");
	}
	
	@Test
	void test2() {
		System.out.println("	Teste 2");
	}
	
	@Test
	void test3() {
		System.out.println("	Teste 3");
	}
	
	@Test
	void test4() {
		System.out.println("	Teste 4");
	}

}
