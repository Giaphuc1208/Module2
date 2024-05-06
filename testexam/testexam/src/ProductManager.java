import java.util.*;

import static java.util.Collections.sort;

public class ProductManager {
    public static  List<Product> productList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public ProductManager() {
    }

    public void addNewProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(String code) {
        Iterator<Product> iterator = productList.iterator();
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
                System.out.println("Are you sure you want to delete this product? (press Y):");
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
    public void sortProduct(){
        System.out.println("Choose 1 or 2 to sort product by price: ");
        int choiceSort = Integer.parseInt(scanner.nextLine());
        switch (choiceSort){
            case 1:
                System.out.println("Go up prices");
                goUpPrice();
                break;
            case 2:
                System.out.println("Go down prices");
                goDownPrice();
                break;
            case 3:
                return;
        }
    }

    public void goUpPrice(){
        productList.sort(new CompareByPrice());
    }

    public void goDownPrice(){
        productList.sort(new CompareByPrice().reversed());
    }


    public Product findProductByCode(String product){
        for (Product product1 : productList){
            if (product1.getCode().equals(product)){
                return product1;
            }
        }
        return null;
    }

    public void findProductbyMaxPrice(){
        Product priceMax = productList.get(0);
        for (Product product : productList){
            if(priceMax.getPrice() < product.getPrice()){
                priceMax = product;
            }
        }
        System.out.println("Product with max price is: " + priceMax);
    }


    public List<Product> getProductList(){
        return productList;
    }
    public Product getProductByIndex(int index) {
        return productList.get(index);
    }
}
