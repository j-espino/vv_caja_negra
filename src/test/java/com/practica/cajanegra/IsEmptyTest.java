package com.practica.cajanegra;


import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class IsEmptyTest {


	/**
	 * Caso de prueba C166
	 *
	 * @ParameterizedTest
	 *
	 */
	@Test


	void vacia() {
		SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
		assertEquals(lista.isEmpty(), true);
	}

	/**
	 * Caso C167-170
	 *
	 *
	 *   @ParameterizedTest
	 */
	@Test



	void lista1Elemento() {
		SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<>("A");
		assertEquals(lista1.isEmpty(), false);
	}

	/**
	 * Caso C167-170
	 *
	 *
	 *   @ParameterizedTest
	 */
	@Test

	void lista2Elemento() {
		SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<>("A", "B");
		assertEquals(lista2.isEmpty(), false);
	}

	/**
	 * Caso C167-170
	 *
	 *
	 *   @ParameterizedTest
	 */
	@Test

	void lista5Elemento() {
		SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<>("A", "B", "C", "D", "E");
		assertEquals(lista2.isEmpty(), false);
	}

	/**
	 * Caso C167-170
	 *
	 *
	 *   @ParameterizedTest
	 */
	@Test

	void lista10Elemento() {
		SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<>("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
		assertEquals(lista2.isEmpty(), false);
	}

}