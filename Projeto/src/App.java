public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = CarFactory.createCar("lux");
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(100) + " reais");

        Car car2 = CarFactory.createCar("eco");
        car2.startRun();
        System.out.println("Preço da viagem: " + car2.getPrice(100) + " reais");
    }
}
