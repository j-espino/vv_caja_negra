package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ToStringTest {
    @Test
    public void testToString()
    {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A", "B", "C", "D", "E", "F");
        String expected = "ABCDEF";
        assertEquals(expected, lista.toString());
    }

    @Test
    void testListaVacia() {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertThrows(java.util.NoSuchElementException.class, () -> lista.toString());
    }

};

