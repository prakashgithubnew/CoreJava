package CoreJavaPractise.HandsOn.ExceptionHandling;

public class EcommerceApp {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();

        try {
            // Attempt to process an order
            inventoryService.processOrder(150); // This should throw an InsufficientInventoryException
        } catch (InsufficientInventoryException e) {
            // Handle the InsufficientInventoryException
            System.out.println("Order processing failed: " + e.getMessage());
            // Additional error handling logic can be added here
        }
    }
}