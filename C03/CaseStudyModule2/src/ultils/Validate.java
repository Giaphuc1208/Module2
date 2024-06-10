package ultils;

public class Validate {
    public String inputNewTypeRoom(){
        String type = "";
        while (type.isEmpty()){
            System.out.println("Enter new type room: ");
            type = Input.getString();
        }
        return type;
    }

    public double inputValidPrice() {
        double price = 0;
        while (price <= 0) {
            System.out.println("Enter new price: ");
            price = Input.getDou();
        }
        return price;
    }
}
