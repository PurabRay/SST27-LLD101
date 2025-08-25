public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new DefaultTaxCalculator();
        EmailService emailService = new ConsoleEmailClient();
        OrderRepository orderRepository = new ConsoleOrderRepository();
        OrderService orderService = new OrderService(taxCalculator, emailService, orderRepository);
        orderService.checkout("a@shop.com", 100.0);
    }
}