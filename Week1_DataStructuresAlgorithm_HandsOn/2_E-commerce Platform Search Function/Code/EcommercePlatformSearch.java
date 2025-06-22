public class EcommercePlatformSearch {
    public static void main(String[] args) {
        Product[] products = {
                new Product(201, "Smartphone", "Electronics"),
                new Product(202, "Running Shoes", "Footwear"),
                new Product(203, "Bluetooth Headphones", "Electronics"),
                new Product(204, "Backpack", "Accessories"),
                new Product(205, "Coffee Mug", "Kitchenware")
        };

        System.out.println("Binary Search:");
        Product result = LinearAndBinarySearch.binarySearch(products, 204);
        if (result != null) {
            System.out.println("Found: " + result.productName);
        } else {
            System.out.println("Product not found");
        }
        System.out.println();
        System.out.println();
        System.out.println("Linear search:");
        Product result1 = LinearAndBinarySearch.binarySearch(products, 204);
        if (result1 != null) {
            System.out.println("Found: " + result1.productName);
        } else {
            System.out.println("Product not found");
        }
    }
}
