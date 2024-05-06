import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductManager products = new ProductManager();

    public static void main(String[] args) {
        while (true){
            displayMenu();
            System.out.println("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    displayListProduct(0);
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    products.deleteProduct(scanner);
                    break;
                case 5:
                    products.sortProduct();
                    break;
                case 6:
                    products.findProductbyMaxPrice();
                    break;
                case 7:
                   CsvWriteAndReadFile.readFile();
                   break;
                case 8:
                    CsvWriteAndReadFile.writeFile();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Choose again.");
            }
        }
    }

    private static void displayMenu(){
        System.out.println("--------------Menu--------------");
        System.out.println("|   1. Display product's List  |");
        System.out.println("|   2. Add new product         |");
        System.out.println("|   3. Update product          |");
        System.out.println("|   4. Delete product          |");
        System.out.println("|   5. Sort product            |");
        System.out.println("|   6. Find highest price      |");
        System.out.println("|   7. Read file               |");
        System.out.println("|   8. Write file              |");
        System.out.println("|   9. Exit                    |");
        System.out.println("-------------------------------");
    }

    private static void displayListProduct(int currentPage){
        if(products.getProductList().isEmpty()){
            System.out.println("There's no product");
            return;
        }
        int perPage = 5;
        for (int i = currentPage * perPage; i < currentPage * perPage + perPage ; i++) {
            if(i >= products.getProductList().size()){
                return;
            }
            System.out.println(products.getProductByIndex(i));
        }
        scanner.nextLine();
        displayListProduct(++currentPage);
    }

    private static void addNewProduct(){
        String code = inputCode();
        String name = inputName();
        double price = inputPrice();
        int quantity = inputQuantity();
        String description = inputDescription();
        Product product = new Product(code,name,price,quantity,description);
        products.addNewProduct(product);
        System.out.println("Done!!");
    }

    private static void updateProduct(){
        System.out.println("Enter product code: ");
        String code = scanner.nextLine().trim();
        if(code.isEmpty()){
            return;
        }
        Product product = products.findProductByCode(code);
        if (product == null){
            System.err.println("Product not found with code: " + code);
            updateProduct();
            return;
        }
        System.out.println(product);
        while (true) {
            System.out.println("Product information before update: ");
            System.out.println("1. Code Product");
            System.out.println("2. Name product");
            System.out.println("3. Price");
            System.out.println("4. Quantity");
            System.out.println("5. Description");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice){
                case 1:
                    String newCode = inputCode();
                    product.setCode(newCode);
                    break;
                case 2:
                    String newName = inputName();
                    product.setName(newName);
                    break;
                case 3:
                    double newPrice = inputPrice();
                    product.setPrice(newPrice);
                    break;
                case 4:
                    int quantity = inputQuantity();
                    product.setQuantity(quantity);
                    break;
                case 5:
                    String description = inputDescription();
                    product.setDescription(description);
                    break;
                case 6:
                    return;
                default:
                    System.err.println("Invalid selection!!");
                    break;
            }
            System.out.println("Product information after update:");
            System.out.println(product);
        }
    }


    static String inputName() {
        String name = "";
        while(name.isEmpty()) {
            System.out.println("Enter product name: ");
            name = scanner.nextLine();
        }
        return name;
    }

    static String inputCode(){
        String code = "";
        while (code.isEmpty() || products.findProductByCode(code) != null){
            System.out.println("Enter code");
            code = scanner.nextLine();
        }
        return code;
    }


    static double inputPrice(){
        double price = 0;
        while(price <= 0) {
            System.out.println("Enter price: ");
            try{
            price = Double.parseDouble(scanner.nextLine());
            } catch (Exception exception) {
                System.err.println("Please enter number!");
            }
        }
        return price;
    }

    static int inputQuantity(){
        int quantity = -1;
        while (quantity < 0){
            System.out.println("Enter quantity: ");
            try{
            quantity = Integer.parseInt(scanner.nextLine());
        } catch (Exception exception){
                System.err.println("Please enter number!");
            }
        }
        return quantity;
    }

    static String inputDescription() {
        System.out.println("Enter product description: ");
        return scanner.nextLine();
    }

}
