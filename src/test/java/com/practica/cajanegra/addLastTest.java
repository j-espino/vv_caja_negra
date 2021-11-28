package com.practica.cajanegra;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedList;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class addLastTest {

    //Lista = ["A","B","C","D","E","F"]
    @ParameterizedTest
    @Order(1)
    @DisplayName("Lista Vacia")
    @ValueSource( strings = {
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
            lista.addLast(element);
            assertEquals(lista.getAtPos(1),element);
    }

    @ParameterizedTest
    @Order(2)
    @DisplayName("Lista con un elemento")
    @ValueSource( strings = {
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "[",
    })
    void testListaUnElem(String element) {
            SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
            lista.addLast(element);
            assertEquals(lista.getAtPos(2),element);
    }

    @ParameterizedTest
    @Order(3)
    @DisplayName("Lista con dos elementos")
    @ValueSource( strings = {
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "[",
    })
    void testListaDosElem(String element) {
            SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B");
            lista.addLast(element);
            assertEquals(lista.getAtPos(3),element);
    }

    @ParameterizedTest
    @Order(4)
    @DisplayName("Lista con n/2 elementos")
    @ValueSource( strings = {
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "[",
    })
    void testListaMitadElem(String element) {
            SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C");
            lista.addLast(element);
            assertEquals(lista.getAtPos(4),element);
    }

    @ParameterizedTest
    @Order(5)
    @DisplayName("Lista con n-1 elementos")
    @ValueSource( strings = {
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "[",
    })
    void testListaNMenosUnoElem(String element) {
            SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
            lista.addLast(element);
            assertEquals(lista.getAtPos(6),element);
    }

    @ParameterizedTest
    @Order(6)
    @DisplayName("Lista con n elementos")
    @ValueSource( strings = {
            "@",
            "A",
            "B",
            "M",
            "Y",
            "Z",
            "[",
    })
    void testListaNElem(String element) {
            SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E","F");
            lista.addLast(element);
            assertEquals(lista.getAtPos(7),element);
    }
//=====================================================================================================================
//CASOS DE PRUEBA ESPECIALES===========================================================================================
//=====================================================================================================================

    //""****************************************************************************
    @ParameterizedTest
    @Order(7)
    @DisplayName("CASO DE PRUEBA ESPECIAL:Lista Vacia con elemento vacio")
    @EmptySource
     void testListaVaciaElementoVacio(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        lista.addLast(element);
        assertEquals(lista.getAtPos(1),element);
    }

    @ParameterizedTest
    @Order(8)
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con un elemento y con elemento vacio")
    @EmptySource
    void testListaUnElemenElementoVacio(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
        lista.addLast(element);
        assertEquals(lista.getAtPos(2),element);
    }

    @ParameterizedTest
    @Order(9)
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con dos elementos y con elemento vacio")
    @EmptySource
    void testListaDosElemElementoVacio(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B");
        lista.addLast(element);
        assertEquals(lista.getAtPos(3),element);
    }

    @ParameterizedTest
    @Order(10)
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n/2 elementos y con elemento vacio")
    @EmptySource
    void testListaMitadElemElementoVacio(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C");
        lista.addLast(element);
        assertEquals(lista.getAtPos(4),element);
    }

    @ParameterizedTest
    @Order(11)
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n-1 elementos y con elemento vacio")
    @EmptySource
    void testListaNMenosUnoElemElementoVacio(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
        lista.addLast(element);
        assertEquals(lista.getAtPos(6),element);
    }

    @ParameterizedTest
    @Order(12)
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n elementos y con elemento vacio")
    @EmptySource
    void testListaNElemElementoVacio(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E","F");
        lista.addLast(element);
        assertEquals(lista.getAtPos(7),element);
    }

    //"M, N"****************************************************************************

    @ParameterizedTest
    @Order(13)
    @CsvSource({
            "M, N"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL:Lista Vacia con dos argumentos")
    void testListaVaciaDosArgumentos(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        lista.addLast(element);
        assertEquals(lista.getAtPos(1),element);
    }

    @ParameterizedTest
    @Order(14)
    @CsvSource({
            "M, N"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con un elemento y con dos argumentos")
    void testListaUnElemenDosArgumentos(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
        lista.addLast(element);
        assertEquals(lista.getAtPos(2),element);
    }

    @ParameterizedTest
    @Order(15)
    @CsvSource({
            "M, N"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con dos elementos y con dos argumentos")
    void testListaDosElemDosArgumentos(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B");
        lista.addLast(element);
        assertEquals(lista.getAtPos(3),element);
    }

    @ParameterizedTest
    @Order(16)
    @CsvSource({
            "M, N"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n/2 elementos y con dos argumentos")
    void testListaMitadElemDosArgumentos(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C");
        lista.addLast(element);
        assertEquals(lista.getAtPos(4),element);
    }

    @ParameterizedTest
    @Order(17)
    @CsvSource({
            "M, N"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n-1 elementos y con dos argumentos")
    void testListaNMenosUnoElemDosArgumentos(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
        lista.addLast(element);
        assertEquals(lista.getAtPos(6),element);
    }

    @ParameterizedTest
    @Order(18)
    @CsvSource({
            "M, N"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n elementos y con dos argumentos")
    void testListaNElemDosArgumentos(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E","F");
        lista.addLast(element);
        assertEquals(lista.getAtPos(7),element);
    }

    //"107374182" N/2 = 107374182****************************************************************************

    @ParameterizedTest
    @Order(19)
    @CsvSource({
            "107374182"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL:Lista Vacia con dos argumentos")
    void testListaVaciaConInt(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        lista.addLast(element);
        assertEquals(lista.getAtPos(1),element);
    }

    @ParameterizedTest
    @Order(20)
    @CsvSource({
            "107374182"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con un elemento y con dos argumentos")
    void testListaUnElemenConInt(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
        lista.addLast(element);
        assertEquals(lista.getAtPos(2),element);
    }

    @ParameterizedTest
    @Order(21)
    @CsvSource({
            "107374182"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con dos elementos y con dos argumentos")
    void testListaDosElemConInt(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B");
        lista.addLast(element);
        assertEquals(lista.getAtPos(3),element);
    }

    @ParameterizedTest
    @Order(22)
    @CsvSource({
            "107374182"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n/2 elementos y con dos argumentos")
    void testListaMitadElemConInt(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C");
        lista.addLast(element);
        assertEquals(lista.getAtPos(4),element);
    }

    @ParameterizedTest
    @Order(23)
    @CsvSource({
            "107374182"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n-1 elementos y con dos argumentos")
    void testListaNMenosUnoElemConInt(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
        lista.addLast(element);
        assertEquals(lista.getAtPos(6),element);
    }

    @ParameterizedTest
    @Order(24)
    @CsvSource({
            "107374182"
    })
    @DisplayName("CASO DE PRUEBA ESPECIAL: Lista con n elementos y con dos argumentos")
    void testListaNElemConInt(String element) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E","F");
        lista.addLast(element);
        assertEquals(lista.getAtPos(7),element);
    }

}