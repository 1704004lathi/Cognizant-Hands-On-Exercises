package file.scs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private String category;

    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name.toLowerCase(); // For case-insensitive search
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Category: " + category);
    }
}

public class SearchFunction {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iPhone 14 Pro", "Mobiles"));
        products.add(new Product(2, "Samsung Galaxy S23", "Mobiles"));
        products.add(new Product(3, "Sony Headphones", "Accessories"));
        products.add(new Product(4, "Nike Shoes", "Footwear"));
        products.add(new Product(5, "Apple Watch", "Wearables"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to E-Commerce Product Search");
        System.out.print("Enter product name to search: ");
        String query = sc.nextLine().toLowerCase();

        boolean found = false;
        for (Product product : products) {
            if (product.getName().contains(query)) {
                product.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found for: " + query);
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
