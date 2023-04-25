public class NumComplejo {
    // Atributos de la clase
    private int real;
    private int imaginario;
    private String signo;

    // Constructores de la clase
    public NumComplejo() {
        this.real = 0;
        this.imaginario = 0;
    }

    public NumComplejo(int real, int imaginario) {
        this.real = real != 0 ? real : 1;
        this.imaginario = imaginario != 0 ? imaginario : 1;
    }

    // Metodos de la clase
    // Suma de numeros complejos
    public void suma(NumComplejo nc1, NumComplejo nc2) {
        this.real = nc1.getReal() + nc2.getReal();
        this.imaginario = nc1.getImaginario() + nc2.getImaginario();
    }

    // Resta de numeros complejos
    public void resta(NumComplejo nc1, NumComplejo nc2) {
        this.real = nc1.getReal() - nc2.getReal();
        this.imaginario = nc1.getImaginario() - nc2.getImaginario();
    }

    // Multiplicacion de numeros complejos
    public void multiplicacion(NumComplejo nc1, NumComplejo nc2) {
        this.real = (nc1.getReal() * nc2.getReal()) - (nc1.getImaginario() * nc2.getImaginario());
        this.imaginario = (nc1.getReal() * nc2.getImaginario()) + (nc1.getImaginario() * nc2.getReal());
    }

    // Setters y getters
    public void setReal(int real) {
        this.real = real != 0 ? real : 1;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario != 0 ? imaginario : 1;
    }

    public int getReal() {
        return real;
    }

    public int getImaginario() {
        return imaginario;
    }

    // toString de la clase
    @Override
    public String toString() {
        if (this.imaginario > 0) {
            this.signo = "+";
        } else if (this.imaginario < 0)
            this.signo = "";
        return "\nOperacion con  numeros complejos\n" + this.real + this.signo + +this.imaginario + "i\n";
    }

}