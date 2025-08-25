import java.util.HashMap;
import java.util.Map;

public class Demo04 {
    public static void main(String[] args) {
        Map<String, PaymentProcessor> processors = new HashMap<>();
        processors.put("CARD", new CardPaymentProcessor());
        processors.put("UPI", new UpiPaymentProcessor());
        processors.put("WALLET", new WalletPaymentProcessor());
        PaymentProcessingService service = new PaymentProcessingService(processors);
        System.out.println(service.pay(new Payment("UPI", 499)));
    }
}