package exercise_james;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    ProductManager productManager = new ProductManager();
    Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        int choice;
        do{
            System.out.println("-------MENU-------");
            System.out.println("1. Display menu product");
            System.out.println("2. Add new product");
            System.out.println("3. Edit product by ID");
            System.out.println("4. Delete product by ID");
            System.out.println("5. Search product by name");
            System.out.println("6. Search product by rising price");
            System.out.println("7. Search product by price go down ");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    sortUp();
                    break;
                case 7:
                    sortDown();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    public void display(){
        System.out.println("Product's list");
        productManager.displayProduct();
    }

    public void add(){
        System.out.println("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter product price: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product(name, price);
        productManager.addProduct(newProduct);
        System.out.println("Complete");
    }

    public void edit(){
        System.out.println("Please enter product's ID u want to edit: ");
        while (true){
            try{
                int inputID = scanner.nextInt();
                Product pr = productManager.findProductById(inputID);
                productManager.editProduct(pr);
                break;
            } catch (Exception e){
                System.out.println(e.getMessage());
                return;
            }
        }
    }

    public void delete(){
        System.out.println("Please enter product ID u want to delete: ");
        int id = scanner.nextInt();
        productManager.deleteProduct(id);
        System.out.println("Complete");
    }

    public void search(){
        System.out.println("Enter product name u want to find");
        String name = scanner.nextLine();
        for (Product product : productManager.productList){
            if(!Objects.equals(product.getName(), name)){
                System.out.println("Don't find product: " + name);
                break;
            } else {
                System.out.println("Result: " + "'" + name + "'" + "u want find");
                productManager.findProductByName(name);
                break;
            }
        }
    }

    public void sortUp(){
        productManager.risingPrices();
        System.out.println("List of products at incremental prices: ");
        productManager.displayProduct();
    }

    public void sortDown(){
        productManager.pricesGoDown();
        System.out.println("List of products at reduced prices: ");
        productManager.displayProduct();
    }

}
