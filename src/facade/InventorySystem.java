package facade;

public class InventorySystem {
    public boolean checkStock(String product) {
        System.out.println("Checking stock for: " + product);
        return true; // Assume product is always in stock for simplicity
    }
}
