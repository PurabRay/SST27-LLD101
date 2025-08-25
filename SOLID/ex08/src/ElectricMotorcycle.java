public class ElectricMotorcycle implements EnginePowered, Rechargeable {
    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void recharge(int kWh) {
        System.out.println("Recharged with " + kWh + " kWh");
    }
}
