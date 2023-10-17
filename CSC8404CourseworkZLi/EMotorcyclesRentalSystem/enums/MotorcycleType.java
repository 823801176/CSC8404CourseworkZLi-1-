package EMotorcyclesRentalSystem.enums;

public enum MotorcycleType {
    SMALL(15, 0.1),
    LARGE(20, 0.15);

    private final double batteryCapacity;
    private final double usagePerKillometer;

    MotorcycleType(double batteryCapacity, double usagePerKillometer) {
        this.batteryCapacity = batteryCapacity;
        this.usagePerKillometer = usagePerKillometer;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getUsagePerKillometer() {
        return usagePerKillometer;
    }
}
