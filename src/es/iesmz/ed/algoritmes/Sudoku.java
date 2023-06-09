package es.iesmz.ed.algoritmes;
/**
 * Esta es una clase comprobara si es correcto el sudoku
 * @author: Pilar Alvarez
 * @version: 09/06/2023/
 */
public class Sudoku {
    private int[][] matriz;

    public Sudoku(int[][] matriz) {
        this.matriz = matriz;
    }

    public boolean esCorrecto() {
        return verificarFilas() && verificarColumnas() && verificarRegiones();
    }

    private boolean verificarFilas() {
        for (int fila = 0; fila < 9; fila++) {
            boolean[] numeros = new boolean[9];
            for (int columna = 0; columna < 9; columna++) {
                int numero = matriz[fila][columna];
                if (numeros[numero - 1]) {
                    return false;
                }
                numeros[numero - 1] = true;
            }
        }
        return true;
    }

    private boolean verificarColumnas() {
        for (int columna = 0; columna < 9; columna++) {
            boolean[] numeros = new boolean[9];
            for (int fila = 0; fila < 9; fila++) {
                int numero = matriz[fila][columna];
                if (numeros[numero - 1]) {
                    return false;
                }
                numeros[numero - 1] = true;
            }
        }
        return true;
    }

    private boolean verificarRegiones() {
        for (int regionFila = 0; regionFila < 3; regionFila++) {
            for (int regionColumna = 0; regionColumna < 3; regionColumna++) {
                boolean[] numeros = new boolean[9];
                for (int fila = regionFila * 3; fila < (regionFila + 1) * 3; fila++) {
                    for (int columna = regionColumna * 3; columna < (regionColumna + 1) * 3; columna++) {
                        int numero = matriz[fila][columna];
                        if (numeros[numero - 1]) {
                            return false;
                        }
                        numeros[numero - 1] = true;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] sudokuCorrecto = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        Sudoku sudoku = new Sudoku(sudokuCorrecto);
        boolean esCorrecto = sudoku.esCorrecto();
        System.out.println("El sudoku es " + (esCorrecto ? "correcto" : "incorrecto"));
    }
}

