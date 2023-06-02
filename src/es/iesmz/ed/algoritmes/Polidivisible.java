package es.iesmz.ed.algoritmes;

import java.util.Scanner;
/**
* Esta es una clase que determina si un numero es o no polidivisible
* @author: Pilar Alvarez
* @version: 02/06/2023/
 */
public class Polidivisible {
    private long numero;

/**
* Constructor que recibe un número como parametro, y verifica si el numero es polidivisble.
* @param numero define la cifra  que se analizará
*/
    public Polidivisible(long numero) {
        this.numero = numero;
    }
    /**
     * Metodo que verifica si el numero tiene todos los digitos desde 0 hasta longitu -1
     * @return true o false despues de la verificacion
     */
    public boolean esPolidivisible() {
        String numeroStr = String.valueOf(numero);
        int longitud = numeroStr.length();

        for (int i = 1; i <= longitud; i++) {
            long subNumero = Long.parseLong(numeroStr.substring(0, i));

            if (subNumero % i != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long numero = scanner.nextLong();
            Polidivisible polidivisible = new Polidivisible(numero);
            boolean esPolidivisible = polidivisible.esPolidivisible();

            if (esPolidivisible) {
                System.out.println("POLIDIVISIBLE");
            } else {
                System.out.println("NOPOLIDIVISIBLE");
            }
        }
        scanner.close();
    }

}
