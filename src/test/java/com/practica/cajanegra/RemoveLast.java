package com.practica.cajanegra;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class RemoveLast {

/**
 * Casos de prueba C43
 *
 */

    @Test
    void testEmptyList() {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertThrows(com.cajanegra.EmptyCollectionException.class, () -> lista.removeLast());
    }

    /**
     * Casos de prueba C44
     *
     */

    @Test
    void testFirstPos() throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>();

        assertAll(
                () -> assertEquals(lista.getAtPos(lista.size()), lista.removeLast()),
                () -> assertEquals(sublista.toString(), lista.toString())
        );

    }


    /**
     * Casos de prueba C45
     *
     */

    @Test
    void testSecondPos() throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "H");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("A");

        assertAll(
                () -> assertEquals(lista.getAtPos(lista.size()), lista.removeLast()),
                () -> assertEquals(sublista.toString(), lista.toString())
        );
    }


    /**
     * Casos de prueba C46
     *
     */
    @Test
    void testMiddlePos() throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "H", "I");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("A", "H");

        assertAll(
                () -> assertEquals(lista.getAtPos(lista.size()), lista.removeLast()),
                () -> assertEquals(sublista.toString(), lista.toString())
        );
    }
}
