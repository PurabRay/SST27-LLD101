public class Demo08 {
    public static void main(String[] args) {
        VehicleService bicycleService = new VehicleService(new Bicycle(), null, null);
        bicycleService.pedal(5);
        bicycleService.startEngine();
        VehicleService motorcycleService = new VehicleService(null, new ElectricMotorcycle(), new ElectricMotorcycle());
        motorcycleService.startEngine();
        motorcycleService.recharge(10);
    }
}