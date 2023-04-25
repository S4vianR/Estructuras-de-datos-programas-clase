
// Reuben Rhienhart 20112048
import java.util.ArrayList;
import java.util.Scanner;

public class VideoClub {
    // Escaneres
    Scanner gen = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    // Atributos
    private String nombre;
    private ArrayList<Pelicula> peliculas;
    private int numPeliculas = 0;

    // Constructor por omision
    public VideoClub() {
        this.nombre = "VideoClub";
        this.peliculas = new ArrayList<Pelicula>();
        this.numPeliculas = 0;
    }

    // Constructor con parametros
    public VideoClub(String nombre, ArrayList<Pelicula> peliculas, int numPeliculas) {
        this.nombre = nombre;
        this.peliculas = peliculas;
        this.numPeliculas = numPeliculas;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public int getNumPeliculas() {
        return numPeliculas;
    }

    public void setNumPeliculas(int numPeliculas) {
        this.numPeliculas = numPeliculas;
    }

    // toString
    @Override
    public String toString() {
        return "\nVideoClub " + nombre + "\nPeliculas: " + peliculas + "\nNumero de peliculas: " + numPeliculas;
    }

    // Agregar pelicula
    public void agregarPelicula() {
        // Preguntar
        System.out.println("Ingrese el nombre de la pelicula: ");
        String nombre = s1.nextLine();
        System.out.println("Ingrese el genero de la pelicula: ");
        String genero = s1.nextLine();
        System.out.println("Ingrese cuantas peliculas quiere agregar de ese titulo: ");
        int cantidad = gen.nextInt();
        System.out.println("Ingrese el codigo de la pelicula: ");
        int codigo = gen.nextInt();
        System.out.println("Ingrese el precio de la pelicula: ");
        double precio = gen.nextDouble();
        // Agregar
        peliculas.add(new Pelicula(nombre, genero, cantidad, codigo, precio));
        this.numPeliculas++;
        // Mostrar pelicula recien agregada
        System.out.println("Pelicula agregada: ");
        System.out.println(peliculas);
    }

    // Eliminar pelicula
    public void eliminarPelicula() {
        // Listar
        listarPeliculas();
        // Preguntar
        System.out.println("Ingrese el codigo de la pelicula que quiere eliminar: ");
        int codigo = gen.nextInt();
        // Eliminar
        for (Pelicula p : peliculas) {
            if (p.getCodigo() == codigo) {
                peliculas.remove(p);
                this.numPeliculas--;
            }
        }
    }

    // Listar peliculas del arraylist e imprimirlas
    public void listarPeliculas() {
        for (Pelicula p : this.peliculas) {
            System.out.println(p);
        }
    }

    // Vender pelicula
    public void venderPelicula() {
        String nombre;
        // Listar
        listarPeliculas();
        // Preguntar
        System.out.println("Ingrese el codigo de la pelicula que quiere vender: ");
        nombre = s1.nextLine();
        // Buscar
        for (Pelicula p : this.peliculas) {
            if (p.getNombre().equals(nombre)) {
                p.setCantidad(p.getCantidad() - 1);
            }
        }
    }

    // Buscar pelicula
    public void buscarPelicula() {
        String nombre;
        // Preguntar
        System.out.println("Ingrese el codigo de la pelicula que quiere buscar: ");
        nombre = s1.nextLine();
        // Buscar
        for (Pelicula p : this.peliculas) {
            if (p.getNombre().equals(nombre)) {
                System.out.println(p);
            }
        }
    }

    // Mostrar peliculas faltantes
    public void mostrarPeliculasFaltantes() {
        for (Pelicula p : this.peliculas) {
            if (p.getCantidad() == 0) {
                System.out.println(p);
            }
        }
    }
}
