public class VehicleService {
    private final Pedalable pedalable;
    private final EnginePowered enginePowered;
    private final Rechargeable rechargeable;

    public VehicleService(Pedalable pedalable, EnginePowered enginePowered, Rechargeable rechargeable) {
        this.pedalable = pedalable;
        this.enginePowered = enginePowered;
        this.rechargeable = rechargeable;
    }

    public void pedal(int effort) {
        if (pedalable == null) {
            System.out.println("Pedaling not supported");
        } else {
            pedalable.pedal(effort);
        }
    }

    public void startEngine() {
        if (enginePowered == null) {
            System.out.println("Engine not supported");
        } else {
            enginePowered.startEngine();
        }
    }

    public void recharge(int kWh) {
        if (rechargeable == null) {
            System.out.println("Recharging not supported");
        } else {
            rechargeable.recharge(kWh);
        }
    }
}