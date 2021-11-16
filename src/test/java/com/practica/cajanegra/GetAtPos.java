package com.practica.cajanegra;


import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetAtPos {


	/**
	 * Casos de prueba C161-165
	 *
	 *
	 * @param p
	 */
	@ParameterizedTest
	@CsvSource({
			"0",
			"1",
			"2",
			"5",
			"10"
	})

	void testExceptionListaVacia(int p) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
		assertThrows(IllegalArgumentException.class, () -> lista.getAtPos(p));
	}

	/**
	 * Casos de prueba C141-145
	 *
	 *
	 * @param p
	 */
	@ParameterizedTest
	@CsvSource({
			"0, IllegalArgumentException.class",
			"1, A",
			"2, IllegalArgumentException.class",
			"5, IllegalArgumentException.class",
			"10, IllegalArgumentException.class"
	})

	void testExceptionLista1Elemento(int p, String s) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
		if (s.equals("IllegalArgumentException.class")){
			assertThrows(IllegalArgumentException.class, () -> lista.getAtPos(p));
		} else {
			assertEquals(lista.getAtPos(p), s);
		}
	}

	/**
	 * Casos de prueba C146-150
	 *
	 *
	 * @param p, s
	 */
	@ParameterizedTest
	@CsvSource({
			"0, IllegalArgumentException.class",
			"1, A",
			"2, B",
			"5, IllegalArgumentException.class",
			"10, IllegalArgumentException.class"
	})

	void testExceptionLista2Elemento(int p, String s) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "B");
		if (s.equals("IllegalArgumentException.class")){
			assertThrows(IllegalArgumentException.class, () -> lista.getAtPos(p));
		} else {
			assertEquals(lista.getAtPos(p), s);
		}
	}


	/**
	 * Casos de prueba C151-155
	 *
	 *
	 * @param p, s
	 */

	@ParameterizedTest
	@CsvSource({
			"0, IllegalArgumentException.class",
			"1, A",
			"2, B",
			"5, E",
			"10, IllegalArgumentException.class"
	})

	void testExceptionLista5Elemento(int p, String s) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "B", "C", "D", "E");
		if (s.equals("IllegalArgumentException.class")){
			assertThrows(IllegalArgumentException.class, () -> lista.getAtPos(p));
		} else {
			assertEquals(lista.getAtPos(p), s);
		}
	}

	/**
	 * Casos de prueba C156-160
	 *
	 *
	 * @param p, s
	 */

	@ParameterizedTest
	@CsvSource({
			"0, IllegalArgumentException.class",
			"1, A",
			"2, B",
			"5, E",
			"10, J"
	})

	void testExceptionLista10Elemento(int p, String s) {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
		if (s.equals("IllegalArgumentException.class")){
			assertThrows(IllegalArgumentException.class, () -> lista.getAtPos(p));
		} else {
			assertEquals(lista.getAtPos(p), s);
		}
	}
}
