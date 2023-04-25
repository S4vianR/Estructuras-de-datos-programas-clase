// Reuben Rhienhart 20112048
public class Fracciones {
    // Atributos
    private int num1;
    private int denom1;
    private int num2;
    private int denom2;

    // Constructor por defecto
    public Fracciones() {
        this.num1 = 0;
        this.denom1 = 1;
        this.num2 = 0;
        this.denom2 = 1;
    }

    // Constructor
    public Fracciones(int num1, int denom1, int num2, int denom2) {
        this.num1 = num1;
        this.denom1 = denom1;
        this.num2 = num2;
        this.denom2 = denom2;
    }

    // Metodos
    // Suma
    public void sumaF(int numerador1, int numerador2, int denominador1, int denominador2) {
        int Fraccion1 = 0, Fraccion2 = 0, Resultado = 0;
        Fraccion1 = numerador1 * denominador2;
        Fraccion2 = numerador2 * denominador1;
        Resultado = Fraccion1 + Fraccion2;
        System.out.println("Resultado: " + Resultado + "/" + denominador1 * denominador2);
    }

    // Restadivision
    public void restaF(int numerador1, int numerador2, int denominador1, int denominador2) {
        int Fraccion1 = 0, Fraccion2 = 0, Resultado = 0;
        Fraccion1 = numerador1 * denominador2;
        Fraccion2 = numerador2 * denominador1;
        Resultado = Fraccion1 - Fraccion2;
        System.out.println("Resultado: " + Resultado + "/" + denominador1 * denominador2);
    }

    // Multiplicacion
    public void multiplicacionF(int numerador1, int numerador2, int denominador1, int denominador2) {
        int Fraccion1 = 0, Fraccion2 = 0;
        Fraccion1 = numerador1 * numerador2;
        Fraccion2 = denominador1 * denominador2;
        System.out.println("Resultado: " + Fraccion1 + "/" + Fraccion2);
    }

    // Division
    public void divisionF(int numerador1, int numerador2, int denominador1, int denominador2) {
        int Fraccion1 = 0, Fraccion2 = 0;
        Fraccion1 = numerador1 * denominador2;
        Fraccion2 = numerador2 * denominador1;
        System.out.println("Resultado: " + Fraccion1 + "/" + Fraccion2);
    }

    // Getters y setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int denom1) {
        this.denom1 = denom1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int denom2) {
        this.denom2 = denom2;
    } 

    // toString
    @Override
    public String toString() {
        return "\nFracciones\nFraccion 1: " + this.getNum1() + "/" + this.getDenom1() + "\nFraccion 2: " + this.getNum2() + "/" + this.getDenom2();
    }
}