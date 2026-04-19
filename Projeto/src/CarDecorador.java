public class CarDecorador implements Car {
    protected Car car;

    public CarDecorador(Car car) {
        this.car = car;
    }

    @Override
    public void startRun() {
        car.startRun();
    }

    @Override
    public double getPrice(double price, double km) {
        return car.getPrice(price, km);
    }
}
