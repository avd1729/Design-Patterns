package facade;

public class Client {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        PaymentSystem paymentSystem = new PaymentSystem();
        ShippingSystem shippingSystem = new ShippingSystem();

        OrderFacade orderFacade = new OrderFacade(inventorySystem, paymentSystem, shippingSystem);

        orderFacade.orderItem("IPhone 16 Pro Max",189000D);
    }
}
