import java.util.*;

import static java.util.Collection.*;

public class ProductManager {
    List<Product> products = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public ProductManager() {
    }

    public void addNewProduct(Product product){
        products.add(product);
    }

    public void removeProduct(String code) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getCode().equals(code)) {
                iterator.remove();
                break;
            }
        }
    }
    public void deleteProduct(Scanner scanner){
        while (true){
            System.out.println("Enter product code to delete: ");
            String deleteCode = scanner.nextLine();

            if(deleteCode.isEmpty()){
                break;
            }

            Product deleteProduct = findProductByCode(deleteCode);
            if (deleteCode != null){
                System.out.println("Product needs to delete:");
                System.out.println(deleteCode);
                System.out.println("Are you sure you want to delete this product? (Y/N):");
                String confirm = scanner.nextLine();
                if(confirm.equalsIgnoreCase("Y")){
                    removeProduct(deleteCode);
                    System.out.println("The product is deleted from the system.");
                } else {
                    System.out.println("Unable to find product with above product code.");
                }

            }
        }
    }

    public void sortProduct(Scanner scanner){
        boolean sortMenu = true;
        while (sortMenu){
            System.out.println("Select sort:");
            System.out.println("1. Arrange at incremental prices");
            System.out.println("2. Arrange at reduced prices");
            System.out.println("3. Back to Main Menu");
            System.out.println("Choose: ");
            int sortChoice = Integer.parseInt(scanner.nextLine());
            switch (sortChoice){
                case 1:
                  Collection.sort
            }
        }
    }


    public Product findProductByCode(String product){
        for (Product product1 : products){
            if (product1.getCode().equals(product)){
                return product1;
            }
        }
        return null;
    }

    public List<Product> getProducts(){
        return products;
    }
    public Product getProductByIndex(int index) {
        return products.get(index);
    }
}
