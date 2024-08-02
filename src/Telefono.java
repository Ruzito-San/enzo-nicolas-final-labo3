import java.util.Objects;

public class Telefono extends ProdElectronico{
    protected String sistema;
    protected int almacenamiento;
    protected double pantalla;

    public Telefono(String marca, String name, int stock, double price, String sistema, int almacenamiento, double pantalla) {
        super(marca, name, stock, price);
        this.sistema = sistema;
        this.almacenamiento = almacenamiento;
        this.pantalla = pantalla;
    }


    @Override
    public String toString() {
        return "Telefono{" +
                "sistema='" + sistema + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", pantalla=" + pantalla +
                ", marca='" + marca + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono = (Telefono) o;
        return almacenamiento == telefono.almacenamiento && pantalla == telefono.pantalla && Objects.equals(sistema, telefono.sistema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sistema, almacenamiento, pantalla);
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }
}
