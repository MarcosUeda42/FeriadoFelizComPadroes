public class EcoCar implements Car {
    
    @Override
    public void startRun() {
        System.out.println("Viagem com carro normal...");
    }

    @Override
    public double getPrice(double price, double km) {
        return price * km;
    }
}
