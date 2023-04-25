import java.util.ArrayList;
public class Estacionamiento {
    // Arraylist de automoviles
    private ArrayList<Automovil> automoviles;
    // Numero de automoviles
    static private int numAutomoviles = 20;
    // Indice del ultimo automovil
    private int ultimoAutomovil = -1;

    // Constructor
    public Estacionamiento() {
        automoviles = new ArrayList<Automovil>();
    }
    // Push
    public void push(Automovil automovil) {
        if (ultimoAutomovil < numAutomoviles - 1) {
            automoviles.add(automovil);
            ultimoAutomovil++;
        }
    }

    // Pop
    public Automovil pop() {
        if (ultimoAutomovil >= 0) {
            Automovil automovil = automoviles.get(ultimoAutomovil);
            automoviles.remove(ultimoAutomovil);
            ultimoAutomovil--;
            return automovil;
        }
        return null;
    }

    // Peek
    public Automovil peek() {
        if (ultimoAutomovil >= 0) {
            return automoviles.get(ultimoAutomovil);
        }
        return null;
    }
    // isEmpty
    public boolean isEmpty() {
        return ultimoAutomovil == -1;
    }

    // isFull
    public boolean isFull() {
        return ultimoAutomovil == numAutomoviles - 1;
    }

    // Size
    public int size() {
        return ultimoAutomovil + 1;
    }

    // Impirmir todos los automoviles
    @Override
    public String toString() {
        String automovilesString = "[";
        for (int i = 0; i < automoviles.size(); i++) {
            automovilesString += automoviles.get(i).toString() + ", ";
        }
        automovilesString += "]";
        return automovilesString;
    }
}