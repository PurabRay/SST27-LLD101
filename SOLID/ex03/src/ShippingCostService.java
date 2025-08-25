import java.util.HashMap;
import java.util.Map;

public class ShippingCostService {
    private final Map<String, ShippingCostStrategy> strategies;

    public ShippingCostService(Map<String, ShippingCostStrategy> strategies) {
        this.strategies = new HashMap<>(strategies);
    }

    public double cost(Shipment shipment) {
        ShippingCostStrategy strategy = strategies.get(shipment.type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown type: " + shipment.type);
        }
        return strategy.calculateCost(shipment.weightKg);
    }
}