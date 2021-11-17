package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class addFirstTest {

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
        if (element.length() == 1 && element.charAt(0)>='A' && element.charAt(0) <='Z'){
            lista.addFirst(element);
            assertEquals(lista.getAtPos(1),element);
        }else
            assertThrows(IllegalArgumentException.class, () -> lista.addFirst(element));
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
    void testListaUnElem(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("B");
        if (element.length() == 1 && element.charAt(0)>='A' && element.charAt(0) <='Z'){
            lista.addFirst(element);
            assertEquals(lista.getAtPos(1),element);
        }else
            assertThrows(IllegalArgumentException.class, () -> lista.addFirst(element));
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
    void testListaNElem(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
        if (element.length() == 1 && element.charAt(0)>='A' && element.charAt(0) <='Z'){
            lista.addFirst(element);
            assertEquals(lista.getAtPos(1),element);
        }else
            assertThrows(IllegalArgumentException.class, () -> lista.addFirst(element));

    }
}
