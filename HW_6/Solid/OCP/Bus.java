package OCP;

public class Bus extends Vehicle {
    /**
     * Конструктор
     *
     * @param maxSpeed max скорость автобуса
     */
    public Bus(int maxSpeed) {
        super(maxSpeed, "brand");
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}