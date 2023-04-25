public class Amante {

    private String[] preferencias;
    private Boolean estatus;
    private String nombre;
    private String pareja;

    public Amante(String n, String n2, String n3, String n4, boolean estatus, String g) {
        this.preferencias = new String[] { n, n2, n3, n4 };
        this.estatus = estatus;
        this.nombre = g;
        this.pareja = null;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String genero) {
        this.nombre = genero;
    }

    public String getPareja() {
        return pareja;
    }

    public void setPareja(String pareja) {
        this.pareja = pareja;
    }

    public String[] getPreferencias() {
        return preferencias;
    }

    @Override
    public String toString() {
        return "amante{" + nombre + ", pareja=" + pareja + '}';
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setPreferencias(String[] preferencias) {
        this.preferencias = preferencias;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

}