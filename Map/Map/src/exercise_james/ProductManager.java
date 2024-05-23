package exercise_james;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    public void displayProduct(){
        if(productList.isEmpty()){
            System.out.println("Unproductively");
        } else {
            for (Product product : productList){
                System.out.println(product);
            }
        }
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public int findIndexById(int id){
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id){
                return 1;
            }
        }
        return -1;
    }

    public Product findProductById(int id) throws Exception{
        if(findIndexById(id) == -1){
            throw new Exception("Don't find any product");
        }
        return productList.get(findIndexById(id));
    }

    public void editProduct(Product pr){
        System.out.println("Please re-enter product's name: ");
        String inputName = scanner.nextLine();
        System.out.println("Please re-enter product's price: ");
        double inputPrice = scanner.nextDouble();
        pr.setName(inputName);
        pr.setPrice(inputPrice);
        System.out.println("Complete");
    }

    public void deleteProduct(int id){
        int index = findIndexById(id);
        productList.remove(index);
    }

    public void findProductByName(String name){
        for (Product product : productList){
            if (product.getName().toLowerCase().startsWith(name.toLowerCase())){
                System.out.println(product);
            }
        }
    }

    public void risingPrices(){
        productList.sort(new ProductComparator());
    }

    public void pricesGoDown(){
        productList.sort(new ProductComparator().reversed());
    }


}
