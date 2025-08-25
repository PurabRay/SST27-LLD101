public class OvernightShippingCost implements ShippingCostStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}