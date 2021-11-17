package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class sizeTest {
    @Test
    public void testSizeListaVacia(){
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertEquals(lista.size(),0);
    }

    @Test
    public void testSizeUnElem(){
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A");
        assertEquals(lista.size(),1);
    }

    @Test
    public void testSizeNElem(){
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>("A","B","C","D","E");
        assertEquals(lista.size(),5);
    }

}
