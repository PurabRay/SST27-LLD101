public class ExpressShippingCost implements ShippingCostStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}