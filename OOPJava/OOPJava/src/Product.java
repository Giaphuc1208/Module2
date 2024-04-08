public class Product {
    String name;
    double price;
    int quatity;
    Product(String name, double price, int quatity){
        this.name = name;
        this.price = price;
        this.quatity = quatity;
    }
    Product (String name, double price){
        this.name = name;
        this.price = price;
    }

    void getName (){
        System.out.println("Get name product: ");
    }
}
