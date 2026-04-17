public class CarFactory {
    
    public static Car createCar(String type){
        if (type.equalsIgnoreCase("lux")){
            return new LuxCar();
        } else if (type.equalsIgnoreCase("eco")){
            return new EcoCar();
        }
        return null;
    }
}
