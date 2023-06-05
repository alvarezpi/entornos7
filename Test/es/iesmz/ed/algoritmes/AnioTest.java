package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnioTest {
    @Test

    void test(){
        // Prueba con un año sin dígitos repetidos
        Anio anio1 = new Anio(2023);
        int cantidadDigitosRepetidos1 = anio1.digitsDiferents();
        assertEquals(1,cantidadDigitosRepetidos1);

        // Caso de prueba 2: anio sin dígitos repetidos (1990)
        Anio anio2 = new Anio(1990);
        int cantidadDigitosRepetidos2 = anio2.digitsDiferents();
        assertEquals(1, cantidadDigitosRepetidos2);

        // Caso de prueba 3: anio con todos los dígitos repetidos (7777)
        Anio anio3 = new Anio(7777);
        int cantidadDigitosRepetidos3 = anio3.digitsDiferents();
        assertEquals(1, cantidadDigitosRepetidos3);
    }



}