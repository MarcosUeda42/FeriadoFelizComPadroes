public class LuxCar implements Car {
    
    @Override
    public void startRun() {
        System.out.println("Viagem com carro de luxo...");
    }

    @Override
    public double getPrice(double price, double km) {
        return price * km;
    }
}
