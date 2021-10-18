package com.practica.cajanegra;


import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingleLinkedListImplTest {

	//TODO: Eliminar test de ejemplo, se necesitan casos de prueba a partir de clases de equivalencia
	@Test
	public void sampleTest() {
		SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<>("A", "B");
		assertEquals(2, myList.size());
	}


	//TODO: Eliminar test de ejemplo, se necesitan casos de prueba a partir de clases de equivalencia

	/**
	 * Testing for an empty and a non-empty list.
	 */
	@Test
	public void isEmptyTest() {
		SingleLinkedListImpl<String> myNonEmptyList = new SingleLinkedListImpl<>("A", "B");
		SingleLinkedListImpl<String> myEmptyList = new SingleLinkedListImpl<>();
		assertFalse(myNonEmptyList.isEmpty());
		assertTrue(myEmptyList.isEmpty());
	}

	//TODO: Eliminar test de ejemplo, se necesitan casos de prueba a partir de clases de equivalencia

	/**
	 * Testing for an empty and a non-empty list.
	 */
	@Test
	public void sizeTest() {
		SingleLinkedListImpl<String> myNonEmptyList = new SingleLinkedListImpl<>("A", "B");
		SingleLinkedListImpl<String> myEmptyList = new SingleLinkedListImpl<>();
		assertEquals(2, myNonEmptyList.size());
		assertEquals(0, myEmptyList.size());
	}


}
