public class Product {
    int pid;
    double price;
    int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}
public class XYZ {

    public static void main(String[] args) {
        // Accepting product information from the user and storing it in an array
        Product[] products = new Product[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            // Creating Product object and adding it to the array
            products[i] = new Product(pid, price, quantity);
        }

        // Finding PID of the product with the highest price
        int maxPricePid = findMaxPricePid(products);
        System.out.println("Product with highest price has PID: " + maxPricePid);

        // Calculating and printing the total amount spent on products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on products: " + totalAmountSpent);

        scanner.close();
    }

    // Method to find the PID of the product with the highest price
    private static int findMaxPricePid(Product[] products) {
        int maxPricePid = -1;
        double maxPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPricePid = product.pid;
            }
        }

        return maxPricePid;
    }

    // Method to calculate the total amount spent on products
    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.price * product.quantity;
        }

        return totalAmountSpent;
    }
}
