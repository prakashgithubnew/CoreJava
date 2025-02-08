package CoreJavaPractise.ExceptionHandling;

class InventoryService {
    private int availableQuantity = 100; // Initial available quantity

    public void processOrder(int quantity) {
        if (quantity > availableQuantity) {
            // Throw a custom InsufficientInventoryException if the requested quantity exceeds available quantity
            throw new InsufficientInventoryException("Insufficient inventory. Available quantity: " + availableQuantity);
        }
        // Actual order processing logic goes here
        // Update inventory, process payment, etc.
    }
}
