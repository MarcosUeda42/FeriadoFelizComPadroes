public class CreateRun {
    
    public void createLuxGoogle(double price) {

        AdaptGPSGoogle google = new AdaptGPSGoogle(new GoogleMaps());
        GPSSystem system = new GPSSystem();

        CarSearch cs = new CarSearch();
        CarSearchProxy proxy = new CarSearchProxy(cs);

        Car car1 = CarFactory.createCar("lux");

        proxy.getCar("lux");
        system.initGPS(google);
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(price, 100) + " reais");
    }

    public void createEcoGoogle(double price) {

        AdaptGPSGoogle google = new AdaptGPSGoogle(new GoogleMaps());
        GPSSystem system = new GPSSystem();

        CarSearch cs = new CarSearch();
        CarSearchProxy proxy = new CarSearchProxy(cs);

        Car car1 = CarFactory.createCar("eco");

        proxy.getCar("eco");
        system.initGPS(google);
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(price, 100) + " reais");
    }

    
    public void createLuxWaze(double price) {

        AdaptGPSWaze waze = new AdaptGPSWaze(new Waze());
        GPSSystem system = new GPSSystem();

        CarSearch cs = new CarSearch();
        CarSearchProxy proxy = new CarSearchProxy(cs);

        Car car1 = CarFactory.createCar("lux");

        proxy.getCar("lux");
        system.initGPS(waze);
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(price, 100) + " reais");
    }

    public void createEcoWaze(double price) {

        AdaptGPSWaze waze = new AdaptGPSWaze(new Waze());
        GPSSystem system = new GPSSystem();

        CarSearch cs = new CarSearch();
        CarSearchProxy proxy = new CarSearchProxy(cs);

        Car car1 = CarFactory.createCar("eco");

        proxy.getCar("eco");
        system.initGPS(waze);
        car1.startRun();
        System.out.println("Preço da viagem: " + car1.getPrice(price, 100) + " reais");
    }

    public void createLuxStop(double price) {

        AdaptGPSGoogle google = new AdaptGPSGoogle(new GoogleMaps());
        GPSSystem system = new GPSSystem();

        CarSearch cs = new CarSearch();
        CarSearchProxy proxy = new CarSearchProxy(cs);

        Car car1 = CarFactory.createCar("lux");
        Car carStop = new WithStop(car1);

        proxy.getCar("lux");
        system.initGPS(google);
        carStop.startRun();
        System.out.println("Preço da viagem: " + carStop.getPrice(price, 100) + " reais");
    }
}
