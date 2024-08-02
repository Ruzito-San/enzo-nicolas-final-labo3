import java.util.Objects;

public class Computadora extends ProdElectronico{
    protected String Procesador;
    protected int ram;
    protected int disco;


    public Computadora(String marca, String name, int stock, double price, String procesador, int ram, int disco) {
        super(marca, name, stock, price);
        Procesador = procesador;
        this.ram = ram;
        this.disco = disco;
    }


    @Override
    public String toString() {
        return "Computadora{" +
                "Procesador='" + Procesador + '\'' +
                ", ram=" + ram +
                ", disco=" + disco +
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
        if (!super.equals(o)) return false;
        Computadora that = (Computadora) o;
        return ram == that.ram && disco == that.disco && Objects.equals(Procesador, that.Procesador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Procesador, ram, disco);
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }
}
