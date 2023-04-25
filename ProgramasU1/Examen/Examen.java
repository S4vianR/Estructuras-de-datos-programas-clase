public class Examen {
    private int i;

    public Examen(int e) {
        this.i = e;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void primero(int n) {
        int x = n, j = 5;
        this.i = x + j;
        segundo(i);
    }

    public void segundo(int i) {
        int j = i * i;
        this.i = tercero(j);
    }

    public int tercero(int j) {
        Examen e = new Examen(j);
        return e.getI() * 3;
    }

    public static void main(String[] args) {
        int x = 8;
        int y = 10;
        Examen e = new Examen(x);
        e.primero(y);
        System.out.println(e.getI());
        Examen e2 = e;
        e2.setI(20);
        System.out.println(e.getI());
        e = null;
        System.out.println(e2.getI());
    }
}