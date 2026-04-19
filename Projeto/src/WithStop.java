public class WithStop extends CarDecorador {
    public WithStop(Car car) {
        super(car);
    }

    @Override
    public double getPrice(double price, double km) {
        return super.getPrice(price, km) + 20;
    }
}
