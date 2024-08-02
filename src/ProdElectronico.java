import java.util.Objects;

public class ProdElectronico {
    protected String marca;
    protected String name;
    protected int stock;
    protected double price;


    public ProdElectronico() {
        this.marca = "";
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public ProdElectronico(String marca, String name, int stock, double price) {
        this.marca = marca;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
