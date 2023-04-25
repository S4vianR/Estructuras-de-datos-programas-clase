// Reuben Rhienhart 20112048

public class VideoClub {
    // Atributos
    private String nombre;
    private Pelicula[] peliculas;
    private int numPeliculas = 0;

    // Constructor por omision
    public VideoClub() {
        this.nombre = "Sin nombre";
        this.peliculas = new Pelicula[100];
        this.numPeliculas = 0;
    }

    // Constructor con parametros
    public VideoClub(String nombre, Pelicula[] peliculas, int numPeliculas) {
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

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
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
        return "\nVideo club: " + nombre + "\nPeliculas: " + peliculas + "\nNumero de peliculas: " + numPeliculas;
    }

    // Metodo para agregar peliculas
    public void agregarPelicula(Pelicula p) {
        peliculas[numPeliculas++] = p;
    }

    // Metodo para borrar peliculas
    public void borrarPelicula(int codigo) {
        for (int i = 0; i < numPeliculas; i++) {
            if (peliculas[i].getCodigo() == codigo) {
                peliculas[i] = peliculas[numPeliculas - 1];
                numPeliculas--;
                break;
            }
        }
    }

    // Metodo para listar peliculas
    public void listarPeliculas() {
        for (int i = 0; i < this.numPeliculas; i++){
            System.out.println("Pelicula no. " + i + ": " + peliculas[i].toString());
        }
    }

    // Metodo para vender peliculas
    public void venderPelicula(int codigo) {
        for (int i = 0; i < numPeliculas; i++) {
            if (peliculas[i].getCodigo() == codigo) {
                peliculas[i].setCantidad(peliculas[i].getCantidad() - 1);
                break;
            }
        }
    }

    // Metodo para mostrar las peliculas faltantes
    public void mostrarPeliculasFaltantes() {
        for (int i = 0; i < numPeliculas; i++) {
            if (peliculas[i].getCantidad() == 0) {
                System.out.println("Pelicula no. " + i + ": " + peliculas[i].toString());
            }
        }
    }
}
