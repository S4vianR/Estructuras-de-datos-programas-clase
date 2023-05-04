package LinkedList;
public class Nodo {
    private Alumnos alumno;
    private Nodo siguiente;

    public Nodo(Alumnos alumno) {
        this.alumno = alumno;
        this.siguiente = null;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
