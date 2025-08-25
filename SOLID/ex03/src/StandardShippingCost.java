public class StandardShippingCost implements ShippingCostStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}
