import java.util.Arrays;
import java.util.Comparator;

public class Search {

    public static void main(String[] args) {

        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Shoes", "Fashion"),
            new Product(4, "Phone", "Electronics"),
            new Product(2, "Watch", "Accessories")
        };

        Product r1 = LinearSearch.search(products, 4);

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product r2 = BinarySearch.search(products, 4);

        printProduct(r1);
        printProduct(r2);
    }

    static void printProduct(Product p) {
        if (p == null) {
            System.out.println("Not Found");
            return;
        }
        System.out.println(p.productId + " " + p.productName + " " + p.category);
    }
}