package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class addNTimesTest {
//Lista = ["A","B","C","D","E","F"] s=6
// F = Float.MAX_VALUE 3.40282346638528860e+38 /2 = 17014117000000000000000000000.000000
    /**
     * Casos de prueba con salida IllegalArgumentException cuando n<0
     * que esta definido pero para element ∉ [A,Z] tambien deberia dar.
     *
     * @param element
     * @param n
     */
    @ParameterizedTest
    @Order(1)
    @DisplayName("Prueba de IllegalArgumentException con Lista Vacia")
    @CsvSource({
            "@,	-1",
            "A,	-1",
            "B,	-1",
            "M,	-1",
            "Y,	-1",
            "Z,	-1",
            "[,	-1",
            "'',-1",
            "M,N,-1",
            "3,-1",
            "@,	0",
            "[,	0",
            "'',0",
            "M,N,0",
            "3,0",
            "@,	1",
            "[,	1",
            "'',1",
            "M,N,1",
            "3,1",
            "@,	3",
            "[,	3",
            "'',3",
            "M,N,3",
            "3,3",
            "@,	5",
            "[,	5",
            "'',5",
            "M,N,5",
            "3,5",
            "@,	6",
            "[,	6",
            "'',6",
            "M,N,6",
            "3,6",
            "@,	7",
            "[,7",
            "'',7",
            "M,N,7",
            "3,7",
            "M, 17014117000000000000000000000.000000",
            "'',17014117000000000000000000000.000000",
            "M,N,17014117000000000000000000000.000000",
            "3,17014117000000000000000000000.000000"
    })
    void testExceptions1(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertThrows(IllegalArgumentException.class, () -> lista.addNTimes(element, n));
    }


    @ParameterizedTest
    @Order(2)
    @DisplayName("Prueba de IllegalArgumentException con Lista con un Elemen")
    @CsvSource({
            "@,	-1",
            "A,	-1",
            "B,	-1",
            "M,	-1",
            "Y,	-1",
            "Z,	-1",
            "[,	-1",
            "'',-1",
            "M,N,-1",
            "3,-1",
            "@,	0",
            "[,	0",
            "'',0",
            "M,N,0",
            "3,0",
            "@,	1",
            "[,	1",
            "'',1",
            "M,N,1",
            "3,1",
            "@,	3",
            "[,	3",
            "'',3",
            "M,N,3",
            "3,3",
            "@,	5",
            "[,	5",
            "'',5",
            "M,N,5",
            "3,5",
            "@,	6",
            "[,	6",
            "'',6",
            "M,N,6",
            "3,6",
            "@,	7",
            "[,7",
            "'',7",
            "M,N,7",
            "3,7",
            "M, 17014117000000000000000000000.000000",
            "'',17014117000000000000000000000.000000",
            "M,N,17014117000000000000000000000.000000",
            "3,17014117000000000000000000000.000000"
    })
    void testExceptions2(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
        assertThrows(IllegalArgumentException.class, () -> lista.addNTimes(element, n));
    }

    @ParameterizedTest
    @Order(3)
    @DisplayName("Prueba de IllegalArgumentException con Lista con s/2 Elemen")
    @CsvSource({
            "@,	-1",
            "A,	-1",
            "B,	-1",
            "M,	-1",
            "Y,	-1",
            "Z,	-1",
            "[,	-1",
            "'',-1",
            "M,N,-1",
            "3,-1",
            "@,	0",
            "[,	0",
            "'',0",
            "M,N,0",
            "3,0",
            "@,	1",
            "[,	1",
            "'',1",
            "M,N,1",
            "3,1",
            "@,	3",
            "[,	3",
            "'',3",
            "M,N,3",
            "3,3",
            "@,	5",
            "[,	5",
            "'',5",
            "M,N,5",
            "3,5",
            "@,	6",
            "[,	6",
            "'',6",
            "M,N,6",
            "3,6",
            "@,	7",
            "[,7",
            "'',7",
            "M,N,7",
            "3,7",
            "M, 17014117000000000000000000000.000000",
            "'',17014117000000000000000000000.000000",
            "M,N,17014117000000000000000000000.000000",
            "3,17014117000000000000000000000.000000"
    })
    void testExceptions3(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C");
        assertThrows(IllegalArgumentException.class, () -> lista.addNTimes(element, n));
    }

    @ParameterizedTest
    @Order(4)
    @DisplayName("Prueba de IllegalArgumentException con Lista con s-1 Elemen")
    @CsvSource({
            "@,	-1",
            "A,	-1",
            "B,	-1",
            "M,	-1",
            "Y,	-1",
            "Z,	-1",
            "[,	-1",
            "'',-1",
            "M,N,-1",
            "3,-1",
            "@,	0",
            "[,	0",
            "'',0",
            "M,N,0",
            "3,0",
            "@,	1",
            "[,	1",
            "'',1",
            "M,N,1",
            "3,1",
            "@,	3",
            "[,	3",
            "'',3",
            "M,N,3",
            "3,3",
            "@,	5",
            "[,	5",
            "'',5",
            "M,N,5",
            "3,5",
            "@,	6",
            "[,	6",
            "'',6",
            "M,N,6",
            "3,6",
            "@,	7",
            "[,7",
            "'',7",
            "M,N,7",
            "3,7",
            "M, 17014117000000000000000000000.000000",
            "'',17014117000000000000000000000.000000",
            "M,N,17014117000000000000000000000.000000",
            "3,17014117000000000000000000000.000000"
    })
    void testExceptions4(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
        assertThrows(IllegalArgumentException.class, () -> lista.addNTimes(element, n));
    }

    @ParameterizedTest
    @Order(5)
    @DisplayName("Prueba de IllegalArgumentException con Lista con s Elemen")
    @CsvSource({
            "@,	-1",
            "A,	-1",
            "B,	-1",
            "M,	-1",
            "Y,	-1",
            "Z,	-1",
            "[,	-1",
            "'',-1",
            "M,N,-1",
            "3,-1",
            "@,	0",
            "[,	0",
            "'',0",
            "M,N,0",
            "3,0",
            "@,	1",
            "[,	1",
            "'',1",
            "M,N,1",
            "3,1",
            "@,	3",
            "[,	3",
            "'',3",
            "M,N,3",
            "3,3",
            "@,	5",
            "[,	5",
            "'',5",
            "M,N,5",
            "3,5",
            "@,	6",
            "[,	6",
            "'',6",
            "M,N,6",
            "3,6",
            "@,	7",
            "[,7",
            "'',7",
            "M,N,7",
            "3,7",
            "M, 17014117000000000000000000000.000000",
            "'',17014117000000000000000000000.000000",
            "M,N,17014117000000000000000000000.000000",
            "3,17014117000000000000000000000.000000"
    })
    void testExceptions5(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E","F");
        assertThrows(IllegalArgumentException.class, () -> lista.addNTimes(element, n));
    }

//===================================================================================================================
//***************PRUEBAS DE CLASES VALIDAS***************************************************************************
//===================================================================================================================

    /**
     * Casos correspondientes a los casos de prueba correspondientes
     *al funcionanmiento normal del metodo.
     * @param element
     * @param n
     */
    @ParameterizedTest
    @Order(6)
    @DisplayName("Prueba de buen funcionamiento con Lista Vacia")
    @CsvSource({
            "A,	0",
            "B,	0",
            "M,	0",
            "Y,	0",
            "Z,	0",
            "A,	1",
            "B,	1",
            "M,	1",
            "Y,	1",
            "Z,	1",
            "A,	3",
            "B,	3",
            "M,	3",
            "Y,	3",
            "Z,	3",
            "A,	5",
            "B,	5",
            "M,	5",
            "Y,	5",
            "Z,	5",
            "A,	6",
            "B,	6",
            "M,	6",
            "Y,	6",
            "Z,	6",
            "A,	7",
            "B,	7",
            "M,	7",
            "Y,	7",
            "Z,	7"
    })
    void testAddNElements1(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        lista.addNTimes(element, n);
        assertEquals(lista.getAtPos(n), element);
    }

    @ParameterizedTest
    @Order(7)
    @DisplayName("Prueba de buen funcionamiento con un elemento en la lista")
    @CsvSource({
            "A,	0",
            "B,	0",
            "M,	0",
            "Y,	0",
            "Z,	0",
            "A,	1",
            "B,	1",
            "M,	1",
            "Y,	1",
            "Z,	1",
            "A,	3",
            "B,	3",
            "M,	3",
            "Y,	3",
            "Z,	3",
            "A,	5",
            "B,	5",
            "M,	5",
            "Y,	5",
            "Z,	5",
            "A,	6",
            "B,	6",
            "M,	6",
            "Y,	6",
            "Z,	6",
            "A,	7",
            "B,	7",
            "M,	7",
            "Y,	7",
            "Z,	7"
    })
    void testAddNElements2(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
        lista.addNTimes(element, n);
        assertEquals(lista.getAtPos(n), element);
    }

    @ParameterizedTest
    @Order(8)
    @DisplayName("Prueba de buen funcionamiento con s/2 elementos en la lista")
    @CsvSource({
            "A,	0",
            "B,	0",
            "M,	0",
            "Y,	0",
            "Z,	0",
            "A,	1",
            "B,	1",
            "M,	1",
            "Y,	1",
            "Z,	1",
            "A,	3",
            "B,	3",
            "M,	3",
            "Y,	3",
            "Z,	3",
            "A,	5",
            "B,	5",
            "M,	5",
            "Y,	5",
            "Z,	5",
            "A,	6",
            "B,	6",
            "M,	6",
            "Y,	6",
            "Z,	6",
            "A,	7",
            "B,	7",
            "M,	7",
            "Y,	7",
            "Z,	7"
    })
    void testAddNElements3(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C");
        lista.addNTimes(element, n);
        assertEquals(lista.getAtPos(n), element);
    }

    @ParameterizedTest
    @Order(9)
    @DisplayName("Prueba de buen funcionamiento con s-1 elementos en la lista")
    @CsvSource({
            "A,	0",
            "B,	0",
            "M,	0",
            "Y,	0",
            "Z,	0",
            "A,	1",
            "B,	1",
            "M,	1",
            "Y,	1",
            "Z,	1",
            "A,	3",
            "B,	3",
            "M,	3",
            "Y,	3",
            "Z,	3",
            "A,	5",
            "B,	5",
            "M,	5",
            "Y,	5",
            "Z,	5",
            "A,	6",
            "B,	6",
            "M,	6",
            "Y,	6",
            "Z,	6",
            "A,	7",
            "B,	7",
            "M,	7",
            "Y,	7",
            "Z,	7"
    })
    void testAddNElements4(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
        lista.addNTimes(element, n);
        assertEquals(lista.getAtPos(n), element);
    }

    @ParameterizedTest
    @Order(10)
    @DisplayName("Prueba de buen funcionamiento con s elementos en la lista")
    @CsvSource({
            "A,	0",
            "B,	0",
            "M,	0",
            "Y,	0",
            "Z,	0",
            "A,	1",
            "B,	1",
            "M,	1",
            "Y,	1",
            "Z,	1",
            "A,	3",
            "B,	3",
            "M,	3",
            "Y,	3",
            "Z,	3",
            "A,	5",
            "B,	5",
            "M,	5",
            "Y,	5",
            "Z,	5",
            "A,	6",
            "B,	6",
            "M,	6",
            "Y,	6",
            "Z,	6",
            "A,	7",
            "B,	7",
            "M,	7",
            "Y,	7",
            "Z,	7"
    })
    void testAddNElements5(String element, int n) {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E","F");
        lista.addNTimes(element, n);
        assertEquals(lista.getAtPos(n), element);
    }
}
