package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolidivisibleTest {
    @Test
    void test() {
        Polidivisible polidivisible1 = new Polidivisible(102);
        assertTrue(polidivisible1.esPolidivisible());

        Polidivisible polidivisible2 = new Polidivisible(9876);
        assertTrue(polidivisible2.esPolidivisible());

        Polidivisible polidivisible3 = new Polidivisible(381654729);
        assertTrue(polidivisible3.esPolidivisible());
    }

}