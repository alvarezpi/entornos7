package es.iesmz.ed.algoritmes;

import java.util.ArrayList;

public class CalculoMental {

            public static int calcularSecuencia(String secuencia) {
            int resultado = 0;
            int operador = 1; // 1 representa suma, -1 representa resta

            String[] elementos = secuencia.split(" ");

            for (String elemento : elementos) {
                if (elemento.equals("+")) {
                    operador = 1;
                } else if (elemento.equals("-")) {
                    operador = -1;
                } else {
                    int numero = Integer.parseInt(elemento);
                    resultado += operador * numero;
                }
            }

            return resultado;
        }

        public static void main(String[] args) {
            String secuencia = "15 + 8 - 7 + 10 - 4";
            int resultado = calcularSecuencia(secuencia);
            System.out.println("Resultado: " + resultado); // Debe imprimir "Resultado: 23"
        }
    }




