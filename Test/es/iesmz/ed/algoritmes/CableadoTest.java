package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CableadoTest {
    @Test
    public void testesPotConnectar() {
        // Caso de prueba 1: cables { "MM", "MF", "FM", "FF" }
        String[] cables1 = { "MM", "MF", "FM", "FF" };
        Cableado cableado1 = new Cableado(cables1);
        boolean resultado1 = cableado1.esPotConnectar();
        assertTrue(resultado1);

        // Caso de prueba 2: cables { "HM" }
        String[] cables2 = { "HM" };
        Cableado cableado2 = new Cableado(cables2);
        boolean resultado2 = cableado2.esPotConnectar();
        assertTrue(resultado2);

        // Caso de prueba 3: cables { "HH" }
        String[] cables3 = { "HH" };
        Cableado cableado3 = new Cableado(cables3);
        boolean resultado3 = cableado3.esPotConnectar();
        assertTrue(resultado3);

        // Caso de prueba 4: cables { "HM", "MH" }
        String[] cables4 = { "HM", "MH" };
        Cableado cableado4 = new Cableado(cables4);
        boolean resultado4 = cableado4.esPotConnectar();
        assertFalse(resultado4);

        // Caso de prueba 5: cables { "HM", "HH", "MM" }
        String[] cables5 = { "HM", "HH", "MM" };
        Cableado cableado5 = new Cableado(cables5);
        boolean resultado5 = cableado5.esPotConnectar();
        assertTrue(resultado5);
    }

}