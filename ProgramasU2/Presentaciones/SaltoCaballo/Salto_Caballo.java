public class Salto_Caballo {
    static final int N = 8;
    static final int n = (N + 1);
    private int tablero[][] = new int[n][n];
    private int saltos[][] = { { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 }, { -2, -1 },
            { -1, -2 }, { 1, -2 }, { 2, -1 } };
    private boolean exito;
    private int x0, y0;

    public Salto_Caballo(int x, int y) throws Exception {
        if ((x < 1) || (x > N) || (y < 1) || (y > N)) {
            throw new Exception("Coordenadas fuera de rango");
        }
        x0 = x;
        y0 = y;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                tablero[i][j] = 0;
            }
        }
        tablero[x0][y0] = 1;
        exito = false;
    }

    public void saltoCaballo(int x, int y, int i) {
    int nx, ny;
    int k = 0;
    do {
    k++;
    nx = x + saltos[k - 1][0];
    ny = y + saltos[k - 1][1];
    if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N) && 
   (tablero[nx][ny]) == 0) {
    tablero[nx][ny] = i;
    if (i < N * N) {
    saltoCaballo(nx, ny, i + 1);
    if (!exito) {
    tablero[nx][ny] = 0;
    }
    } else {
    exito = true;
    }
    }
    } while ((k < 0 && !exito));
    }

    public boolean resolverProblema() {
        saltoCaballo(x0, y0, 2);
        return exito;
    }

    public void escribirTablero() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}