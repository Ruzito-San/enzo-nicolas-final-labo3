import java.util.Objects;

public class Accesorio extends ProdElectronico{
    protected String cannecion;
    protected String compatibilidad;


    public Accesorio(String marca, String name, int stock, double price, String cannecion, String compatibilidad) {
        super(marca, name, stock, price);
        this.cannecion = cannecion;
        this.compatibilidad = compatibilidad;
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "cannecion='" + cannecion + '\'' +
                ", compatibilidad='" + compatibilidad + '\'' +
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
        Accesorio accesorio = (Accesorio) o;
        return Objects.equals(cannecion, accesorio.cannecion) && Objects.equals(compatibilidad, accesorio.compatibilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cannecion, compatibilidad);
    }

    public String getCannecion() {
        return cannecion;
    }

    public void setCannecion(String cannecion) {
        this.cannecion = cannecion;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }
}
