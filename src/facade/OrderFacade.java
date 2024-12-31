package facade;

public class OrderFacade {
    InventorySystem inventorySystem;
    PaymentSystem paymentSystem;
    ShippingSystem shippingSystem;

    public OrderFacade(InventorySystem inventorySystem, PaymentSystem paymentSystem, ShippingSystem shippingSystem) {
        this.inventorySystem = inventorySystem;
        this.paymentSystem = paymentSystem;
        this.shippingSystem = shippingSystem;
    }

    public void orderItem(String product, Double amount){
        if(inventorySystem.checkStock(product)){
            paymentSystem.processPayment(amount);
            shippingSystem.shipProduct(product);
        }
    }
}
