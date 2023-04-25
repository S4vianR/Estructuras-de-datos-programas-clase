public class Automovil {
    private String placas;
    private String marca;
    private String modelo;
    private String color;

    public Automovil(String placas, String marca, String modelo, String color) {
        this.placas = placas;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}