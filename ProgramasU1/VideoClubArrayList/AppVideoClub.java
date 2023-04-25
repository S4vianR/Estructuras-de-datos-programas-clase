// Reuben Rhienhart 20112048
import java.util.Scanner;
public class AppVideoClub {
    public static void main(String[] args) {
        int op = 0;
        // Scanners
        Scanner gen = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        // Videoclub
        VideoClub Alarcon = new VideoClub();

        // Menu
        do {
            System.out.println("\nMenu\n1. Agregar pelicula\n2. Borrar pelicula\n3. Listar pelicula\n4. Buscar pelicula\n5. Vender pelicula\n6. Mostrar peliculas faltantes\n7. Salir");
            op = gen.nextInt();
            switch (op){
                case 1:
                    // Agregar pelicula
                    Alarcon.agregarPelicula();
                    break;
                case 2:
                    // Borrar pelicula
                    Alarcon.eliminarPelicula();
                    break;
                case 3:
                    // Listar pelicula
                    Alarcon.listarPeliculas();
                    break;
                case 4:
                    // Buscar pelicula
                    Alarcon.buscarPelicula();
                    break;
                case 5:
                    // Vender pelicula
                    Alarcon.venderPelicula();
                    break;
                case 6:
                    // Mostrar peliculas faltantes
                    Alarcon.mostrarPeliculasFaltantes();
                    break;
                case 7:
                    // Salir
                    System.out.println("Saliendo...");
                    break;
            }
        } while (op != 7);
    }
}
