public class LuxCar implements Car {
    
    @Override
    public void startRun() {
        System.out.println("Viagem com carro de luxo...");
    }

    @Override
    public double getPrice(double km) {
        return 2.0 * km;
    }
}
