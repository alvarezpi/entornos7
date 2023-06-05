package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {
    @Test
    public void testDivisio() {
        // Caso de prueba 1: división de 11! / 8!
        DividirFactorial division1 = new DividirFactorial(11, 8);
        double resultado1 = division1.divisio();
        assertEquals(990, resultado1);

        // Caso de prueba 2: división de 6! / 3!
        DividirFactorial division2 = new DividirFactorial(6, 3);
        double resultado2 = division2.divisio();
        assertEquals(120, resultado2);

        // Caso de prueba 3: división de 5! / 2!
        DividirFactorial division3 = new DividirFactorial(5, 2);
        double resultado3 = division3.divisio();
        assertEquals(60, resultado3);

        // Caso de prueba 4: división de 8! / 6!
        DividirFactorial division4 = new DividirFactorial(8, 6);
        double resultado4 = division4.divisio();
        assertEquals(56, resultado4);
    }

}