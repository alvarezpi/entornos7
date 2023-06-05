package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumaDescendenteTest {

    @Test
    public void testSumaDescendente() {
        // Caso de prueba 1: número positivo
        SumaDescendente sumaDescendente1 = new SumaDescendente(4578);
        assertEquals(5242, sumaDescendente1.calcularSumaDescendente());

        // Caso de prueba 2: número negativo
        SumaDescendente sumaDescendente2 = new SumaDescendente(1234);
        assertEquals(1506, sumaDescendente2.calcularSumaDescendente());

        // Caso de prueba 3: número con dígitos repetidos
        SumaDescendente sumaDescendente3 = new SumaDescendente(7777);
        assertEquals(8638, sumaDescendente3.calcularSumaDescendente());

        // Caso de prueba 4: número de un solo dígito
        SumaDescendente sumaDescendente4 = new SumaDescendente(9);
        assertEquals(9, sumaDescendente4.calcularSumaDescendente());
    }
}






