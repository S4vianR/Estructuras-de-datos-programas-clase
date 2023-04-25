public class Reinas {
    // Tamaño del tablero de ajedrez
    private static final int tablero = 8;
    // Array para almacenar la posición de las reinas en el tablero
    private static int[] reinas = new int[tablero];

    public static void main(String[] args) {
        // Llamamos a la función "resolver" para resolver el problema
        resolver(0);
    }

    // Función recursiva para resolver el problema de las 8 reinas utilizando
    // backtracking
    private static void resolver(int fila) {
        // Si hemos llegado al final del tablero (es decir, hemos colocado todas las
        // reinas), imprimimos el tablero y retornamos
        if (fila == tablero) {
            imprimirTablero();
            return;
        }

        // Iteramos sobre todas las columnas de la fila actual
        for (int col = 0; col < tablero; col++) {
            // Verificamos si es seguro colocar una reina en la fila y columna actual
            if (esValido(fila, col)) {
                // Si es seguro, almacenamos la posición de la reina en el array "reinas" y
                // llamamos recursivamente a "resolver" para la siguiente fila
                reinas[fila] = col;
                resolver(fila + 1);
            }
        }
    }

    // Función para verificar si es seguro colocar una reina en la fila y columna
    // especificadas
    private static boolean esValido(int fila, int col) {
        // Iteramos sobre las filas ya colocadas
        for (int i = 0; i < fila; i++) {
            // Verificamos si hay otra reina en la misma columna o en la misma diagonal
            if (reinas[i] == col ||
                    reinas[i] - i == col - fila ||
                    reinas[i] + i == col + fila) {
                return false;
            }
        }
        // Si no hay otras reinas en la misma columna o en la misma diagonal, es seguro
        // colocar una reina en la fila y columna especificadas
        return true;
    }

    // Función para imprimir el tablero con las reinas colocadas
    private static void imprimirTablero() {
        for (int fila = 0; fila < tablero; fila++) {
            for (int col = 0; col < tablero; col++) {
                if (reinas[fila] == col) {
                    // Si hay una reina en esta posición, imprimimos una "Q"
                    System.out.print("Q ");
                } else {
                    // Si no hay una reina en esta posición, imprimimos un "."
                    System.out.print(". ");
                }
            }
            // Agregamos un salto de línea al final de cada fila
            System.out.println();
        }
        // Agregamos un salto de línea adicional al final del tablero
        System.out.println();
    }
}