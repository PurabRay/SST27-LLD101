public class Demo09 {
    public static void main(String[] args) {
        OrderRepository repository = new SqlOrderRepository();
        Logger logger = new ConsoleLogger();
        OrderController controller = new OrderController(repository, logger);
        controller.create("ORD-1");
    }
}