public class Product {
    private String code;
    private String name;
    private double price;
    private int quantity;
    private String description;

    public Product() {
    }

    public Product(String code, String name, double price, int quantity, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product: code='%s', name='%s', price=%s, quantity=%d, description='%s'".formatted(code, name, price, quantity, description);
    }
}
