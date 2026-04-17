public class EcoCar implements Car {
    
    @Override
    public void startRun() {
        System.out.println("Viagem com carro normal...");
    }

    @Override
    public double getPrice(double km) {
        return 1.0 * km;
    }
}
