package exercise_james;

public class Product {
    private int id;
    private String name;
    private double price;
    private static int lastedID = 0;

    public Product(String name, Double price) {
        this.id = ++lastedID;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
}
