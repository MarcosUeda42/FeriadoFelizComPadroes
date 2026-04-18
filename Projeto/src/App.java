public class App {
    public static void main(String[] args) throws Exception {

        GlobalConfig config = GlobalConfig.getInstance();

        CarSearch cs = new CarSearch();
        CarSearchProxy proxy = new CarSearchProxy(cs);

        Car car1 = CarFactory.createCar("lux");

        proxy.getCar("lux");
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(config.getPriceLux(), 100) + " reais");

        System.out.println("\n");

        Car car2 = CarFactory.createCar("eco");
        proxy.getCar("eco");
        car2.startRun();
        System.out.println("Preço da viagem: " + car2.getPrice(config.getPriceEco(), 100) + " reais");

        System.out.println("\n");

        config.setPriceLux(3.0);
        config.setPriceEco(1.5);
        
        proxy.getCar("lux");
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(config.getPriceLux(), 100) + " reais");

        System.out.println("\n");

        proxy.getCar("eco");
        car2.startRun();
        System.out.println("Preço da viagem: " + car2.getPrice(config.getPriceEco(), 100) + " reais");
    }
}
