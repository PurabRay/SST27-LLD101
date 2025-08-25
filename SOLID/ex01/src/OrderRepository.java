public interface OrderRepository {
    void storeOrder(String customerEmail, double total);
}