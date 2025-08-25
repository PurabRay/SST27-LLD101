import java.util.HashMap;
import java.util.Map;

public class Demo03 {
    public static void main(String[] args) {
        Map<String, ShippingCostStrategy> strategies = new HashMap<>();
        strategies.put("STANDARD", new StandardShippingCost());
        strategies.put("EXPRESS", new ExpressShippingCost());
        strategies.put("OVERNIGHT", new OvernightShippingCost());
        ShippingCostService service = new ShippingCostService(strategies);
        System.out.println(service.cost(new Shipment("EXPRESS", 2.0)));
    }
}