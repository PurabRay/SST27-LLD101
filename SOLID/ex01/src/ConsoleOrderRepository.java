public class ConsoleOrderRepository implements OrderRepository {
    @Override
    public void storeOrder(String customerEmail, double total) {
        System.out.println("Order stored (pretend DB).");
    }
}