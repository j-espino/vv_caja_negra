package com.practica.cajanegra;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class RemoveLastTelem {

    /**
     * Casos de prueba C50-56
     *
     *
     * @param elem
     */
    @ParameterizedTest
    @CsvSource({
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "["
    })

    void testEmptyList(String elem){
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertThrows(com.cajanegra.EmptyCollectionException.class, () -> lista.removeLast(elem));
    }

    /**
     * Casos de prueba C57-63
     *
     *
     * @param elem
     * @param output
     */
    @ParameterizedTest
    @CsvSource({
            "@, java.util.NoSuchElementException",
            "A, A",
            "B, java.util.NoSuchElementException",
            "M, java.util.NoSuchElementException",
            "Y, java.util.NoSuchElementException",
            "Z, java.util.NoSuchElementException",
            "[, java.util.NoSuchElementException"
    })


    void testFirstPos(String elem, String output) throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","H","I","J","K","L","N");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("H","I","J","K","L","N");

        if (output.equals("java.util.NoSuchElementException")) {
            assertThrows(java.util.NoSuchElementException.class, () -> lista.removeLast(elem));
        }
        else {
            assertAll(
                    () -> assertEquals(output, lista.removeLast(elem)),
                    () -> assertEquals(sublista.toString(),lista.toString())
            );
        }
    }

    /**
     * Casos de prueba C64-70
     *
     *
     * @param elem
     * @param output
     */

    @ParameterizedTest
    @CsvSource({
            "@, java.util.NoSuchElementException",
            "A, A",
            "B, java.util.NoSuchElementException",
            "M, java.util.NoSuchElementException",
            "Y, java.util.NoSuchElementException",
            "Z, java.util.NoSuchElementException",
            "[, java.util.NoSuchElementException"
    })

    void testSecondPos(String elem, String output) throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","A","I","J","K","L","N");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("A","I","J","K","L","N");
        if (output.equals("java.util.NoSuchElementException")) {
            assertThrows(java.util.NoSuchElementException.class, () -> lista.removeLast(elem));
        }
        else {
            assertAll(
                    () -> assertEquals(output, lista.removeLast(elem)),
                    () -> assertEquals(sublista.toString(),lista.toString())
            );
        }
    }

    /**
     * Casos de prueba C71-77
     *
     *
     * @param elem
     * @param output
     */

    @ParameterizedTest
    @CsvSource({
            "@, java.util.NoSuchElementException",
            "A, A",
            "B, java.util.NoSuchElementException",
            "M, java.util.NoSuchElementException",
            "Y, java.util.NoSuchElementException",
            "Z, java.util.NoSuchElementException",
            "[, java.util.NoSuchElementException"
    })

    void testMiddlePos(String elem, String output) throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("C","B","A","A","K","L","N");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("C","B","A","K","L","N");
        if (output.equals("java.util.NoSuchElementException")) {
            assertThrows(java.util.NoSuchElementException.class, () -> lista.removeLast(elem));
        }
        else {
            assertAll(
                    () -> assertEquals(output, lista.removeLast(elem)),
                    () -> assertEquals(sublista.toString(),lista.toString())
            );
        }
    }

    /**
     * Casos de prueba C78-84
     *
     *
     * @param elem
     * @param output
     */

    @ParameterizedTest
    @CsvSource({
            "@, java.util.NoSuchElementException",
            "A, A",
            "B, java.util.NoSuchElementException",
            "M, java.util.NoSuchElementException",
            "Y, java.util.NoSuchElementException",
            "Z, java.util.NoSuchElementException",
            "[, java.util.NoSuchElementException"
    })

    void testPreFinalPos(String elem, String output) throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("B","C","I","J","A","A","N");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("B","C","I","J","A","N");
        if (output.equals("java.util.NoSuchElementException")) {
            assertThrows(java.util.NoSuchElementException.class, () -> lista.removeLast(elem));
        }
        else {
            assertAll(
                    () -> assertEquals(output, lista.removeLast(elem)),
                    () -> assertEquals(sublista.toString(),lista.toString())
            );
        }
    }

    /**
     * Casos de prueba C85-91
     *
     *
     * @param elem
     * @param output
     */

    @ParameterizedTest
    @CsvSource({
            "@, java.util.NoSuchElementException",
            "A, A",
            "B, java.util.NoSuchElementException",
            "M, java.util.NoSuchElementException",
            "Y, java.util.NoSuchElementException",
            "Z, java.util.NoSuchElementException",
            "[, java.util.NoSuchElementException"
    })

    void testFinalPos(String elem, String output) throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("B","C","I","J","L","A","A");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("B","C","I","J","L","A");
        if (output.equals("java.util.NoSuchElementException")) {
            assertThrows(java.util.NoSuchElementException.class, () -> lista.removeLast(elem));
        }
        else {
            assertAll(
                    () -> assertEquals(output, lista.removeLast(elem)),
                    () -> assertEquals(sublista.toString(),lista.toString())
            );
        }
    }


    /**
     * Casos de prueba C92-98
     *
     *
     * @param elem
     * @param output
     */

    @ParameterizedTest
    @CsvSource({
            "@, java.util.NoSuchElementException",
            "A, java.util.NoSucElementException",
            "B, java.util.NoSuchElementException",
            "M, java.util.NoSuchElementException",
            "Y, java.util.NoSuchElementException",
            "Z, java.util.NoSuchElementException",
            "[, java.util.NoSuchElementException"
    })

    void tesNotFound(String elem, String output) throws EmptyCollectionException {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("B","C","I","J","L","Y","Z");
        SingleLinkedListImpl<String> sublista = new SingleLinkedListImpl<>("B","C","I","J","L","Y","Z");
        if (output.equals("java.util.NoSuchElementException")) {
            assertThrows(java.util.NoSuchElementException.class, () -> lista.removeLast(elem));
        }
        else {
            assertAll(
                    () -> assertEquals(output, lista.removeLast(elem)),
                    () -> assertEquals(sublista.toString(),lista.toString())
            );
        }
    }

}