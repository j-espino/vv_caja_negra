package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class indexOfTest {
    @Test

    void testListaVacia(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertThrows(java.util.NoSuchElementException.class, () -> lista.indexOf("A"));
    }
    @ParameterizedTest
    @CsvSource({

            "A,1",
            "B,2",
            "M,3",
            "Y,4",
            "Z,5"

    })
    void testListaCorrespondida(String element,int p) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","M","Y","Z");
        assertEquals(lista.indexOf(element), p);
    }
    @Test

    void testListaNoCorrespondida() {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("E","F","G","H","I");
        assertThrows(java.util.NoSuchElementException.class, () -> lista.indexOf("B"));

    }
    @ParameterizedTest
    @CsvSource({

            "@,1",
            "[,2"

    })
    void testValoresFueraRango(String element, int p){
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("@","[");
        assertEquals(lista.indexOf(element), p);

    }
    @Test
    void testNullListaVacia(){
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertThrows(java.util.NoSuchElementException.class, () -> lista.indexOf(null));

    }
    @Test
    void testNullListaLlena(){
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","M","Y","Z");
        assertThrows(java.util.NoSuchElementException.class, () -> lista.indexOf(null));

    }
}
