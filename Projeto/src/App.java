public class App {
    public static void main(String[] args) throws Exception {

        GlobalConfig config = GlobalConfig.getInstance();

        Car car1 = CarFactory.createCar("lux");
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(config.getPriceLux(), 100) + " reais");

        Car car2 = CarFactory.createCar("eco");
        car2.startRun();
        System.out.println("Preço da viagem: " + car2.getPrice(config.getPriceEco(), 100) + " reais");

        System.out.println("\n");

        config.setPriceLux(3.0);
        config.setPriceEco(1.5);
        
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(config.getPriceLux(), 100) + " reais");

        car2.startRun();
        System.out.println("Preço da viagem: " + car2.getPrice(config.getPriceEco(), 100) + " reais");
    }
}
