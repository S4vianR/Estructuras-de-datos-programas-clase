public class Fracciones {
    // Atributos
    private int numerador;
    private int denominador;    

    // Constructor sin parámetros
    public Fracciones() {
        this.numerador = 0;
        this.denominador = 1;
    }
    // Constructor
    public Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Setters
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    // Getters
    public int getNumerador() {
        return this.numerador;
    }
    public int getDenominador() {
        return this.denominador;
    }

    // Métodos
    public void mostrar() {
        System.out.println(this.numerador + "/" + this.denominador);
    }
    public void simplificar() {
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }
    public void sumar(Fracciones f) {
        this.numerador = this.numerador * f.getDenominador() + this.denominador * f.getNumerador();
        this.denominador = this.denominador * f.getDenominador();
        simplificar();
    }
    public void restar(Fracciones f) {
        this.numerador = this.numerador * f.getDenominador() - this.denominador * f.getNumerador();
        this.denominador = this.denominador * f.getDenominador();
        simplificar();
    }
    public void multiplicar(Fracciones f) {
        this.numerador *= f.getNumerador();
        this.denominador *= f.getDenominador();
        simplificar();
    }
    public void dividir(Fracciones f) {
        this.numerador *= f.getDenominador();
        this.denominador *= f.getNumerador();
        simplificar();
    }
    public int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    // toString
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
