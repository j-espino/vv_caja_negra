package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class indexOfTest {
    @ParameterizedTest
    @CsvSource({
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "[",
    })
    void testListaVacia(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertThrows(java.util.NoSuchElementException.class, () -> lista.indexOf(element));
    }
    @ParameterizedTest
    @CsvSource({
            "@,0",
            "A,1",
            "B,2",
            "M,3",
            "Y,4",
            "Z,5",
            "[,0",
    })
    void testListaOK(String element,int p) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","M","Y","Z");
        if(p == 0)
        assertThrows(java.util.NoSuchElementException.class, () -> lista.indexOf(element));
        else
            assertEquals(lista.getAtPos(p), element);
    }
    @ParameterizedTest
    @CsvSource({
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "[",
    })
    void testListaMal(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("E","F","G","H","I");
        assertThrows(java.util.NoSuchElementException.class, () -> lista.indexOf(element));

    }
}
