package com.practica.cajanegra;


import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddAtPosTest {


	/**
	 * Casos de prueba con salida IllegalArgumentException, Clases E1, E3 y P1
	 *
	 * @param element
	 * @param p
	 */
	@ParameterizedTest
	@CsvSource({
			"@,	0",
			"A,	0",
			"B,	0",
			"M,	0",
			"Y,	0",
			"Z,	0",
			"[,	0",
			"@,	1",
			"[,	1",
			"@,	2",
			"[,	2",
			"@,	3",
			"[,	3",
			"@,	6",
			"[,	6",
			"@,	7",
			"[,	7"
	})
	void testExceptions(String element, int p) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "B", "C", "D", "E", "F");
		assertThrows(IllegalArgumentException.class, () -> lista.addAtPos(element, p));
	}

	/**
	 * Casos correspondientes a las clases E2 y P2
	 *
	 * @param element
	 * @param p
	 */
	@ParameterizedTest
	@CsvSource({
			"A,	1",
			"B,	1",
			"M,	1",
			"Y,	1",
			"Z,	1",
			"A,	2",
			"B,	2",
			"M,	2",
			"Y,	2",
			"Z,	2",
			"A,	3",
			"B,	3",
			"M,	3",
			"Y,	3",
			"Z,	3",
			"A,	6",
			"B,	6",
			"M,	6",
			"Y,	6",
			"Z,	6",
	})
	void testGivenPosition(String element, int p) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "B", "C", "D", "E", "F");
		lista.addAtPos(element, p);
		assertEquals(lista.getAtPos(p), element);
	}

	/**
	 * Casos correspondientes a las clases E2 y P3
	 *
	 * @param element
	 * @param p
	 */
	@ParameterizedTest
	@CsvSource({
			"A,	7",
			"B,	7",
			"M,	7",
			"Y,	7",
			"Z,	7",
	})
	void testLastPosition(String element, int p) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "B", "C", "D", "E", "F");
		lista.addAtPos(element, p);
		assertEquals(lista.getAtPos(p), lista.getAtPos(lista.size()));
	}


}
