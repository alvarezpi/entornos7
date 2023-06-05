package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

       @Test
        public void testesHyperpar() {
            // Caso de prueba 1: número hyperpar
            Hyperpar hyperpar1 = new Hyperpar(2468);
            assertTrue(hyperpar1.esHyperPar());

            // Caso de prueba 2: número no hyperpar
            Hyperpar hyperpar2 = new Hyperpar(1357);
            assertFalse(hyperpar2.esHyperPar());

            // Caso de prueba 3: número hyperpar negativo
            Hyperpar hyperpar3 = new Hyperpar(-4682);
            assertTrue(hyperpar3.esHyperPar());

            // Caso de prueba 4: número 0 (no se considera hyperpar)
            Hyperpar hyperpar4 = new Hyperpar(2681);
            assertFalse(hyperpar4.esHyperPar());
        }
    }


