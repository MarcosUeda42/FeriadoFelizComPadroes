public class CarSearch implements CarSearchInterface {
    
    public Car getCar(String type) {
        System.out.println("Carro encontrado: " + type);
        if (type.equalsIgnoreCase("lux")) {
            return new LuxCar();
        } else if (type.equalsIgnoreCase("eco")) {
            return new EcoCar();
        }
        return null;
    }

}
