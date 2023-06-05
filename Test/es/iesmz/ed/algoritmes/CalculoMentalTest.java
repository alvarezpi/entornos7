package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculoMentalTest {
        @Test
        public void testCalculoMental() {
            // Ejemplo 1: 15 + 8 - 7 + 10 - 3 = 23
            String secuencia1 = "15 + 8 - 7 + 10 - 3";
            int resultado1 = CalculoMental.calcularSecuencia(secuencia1);
            assertEquals(23, resultado1);

            // Ejemplo 2: 100 - 50 + 25 + 10 - 5 = 80
            String secuencia2 = "100 - 50 + 25 + 10 - 5";
            int resultado2 = CalculoMental.calcularSecuencia(secuencia2);
            assertEquals(80, resultado2);

            // Ejemplo 3: 5 - 3 + 2 - 1 = 3
            String secuencia3 = "5 - 3 + 2 - 1";
            int resultado3 = CalculoMental.calcularSecuencia(secuencia3);
            assertEquals(3, resultado3);
        }
    }



