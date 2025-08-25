    import java.util.HashMap;
    import java.util.Map;

    public class PaymentProcessingService {
        private final Map<String, PaymentProcessor> processors;

        public PaymentProcessingService(Map<String, PaymentProcessor> processors) {
            this.processors = new HashMap<>(processors);
        }

        public String pay(Payment payment) {
            PaymentProcessor processor = processors.get(payment.provider);
            if (processor == null) {
                throw new RuntimeException("No provider");
            }
            return processor.processPayment(payment.amount);
        }
    }