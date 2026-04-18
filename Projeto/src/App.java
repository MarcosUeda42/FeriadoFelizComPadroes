public class App {
    public static void main(String[] args) throws Exception {

        GlobalConfig config = GlobalConfig.getInstance();

        AdaptGPSGoogle google = new AdaptGPSGoogle(new GoogleMaps());
        AdaptGPSWaze waze = new AdaptGPSWaze(new Waze());
        GPSSystem system = new GPSSystem();
        
        CarSearch cs = new CarSearch();
        CarSearchProxy proxy = new CarSearchProxy(cs);

        Car car1 = CarFactory.createCar("lux");
        Car car2 = CarFactory.createCar("eco");

        proxy.getCar("lux");
        system.initGPS(google);
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(config.getPriceLux(), 100) + " reais");

        System.out.println("\n");

        proxy.getCar("eco");
        system.initGPS(google);
        car2.startRun();
        System.out.println("Preço da viagem: " + car2.getPrice(config.getPriceEco(), 100) + " reais");

        System.out.println("\n");

        config.setPriceLux(3.0);
        config.setPriceEco(1.5);
        
        proxy.getCar("lux");
        system.initGPS(waze);
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(config.getPriceLux(), 100) + " reais");

        System.out.println("\n");

        proxy.getCar("eco");
        system.initGPS(waze);
        car2.startRun();
        System.out.println("Preço da viagem: " + car2.getPrice(config.getPriceEco(), 100) + " reais");
    }
}
