public class CarSearchProxy implements CarSearchInterface {
    
    private CarSearchInterface base;
    
    public CarSearchProxy(CarSearchInterface base) {
        this.base = base;
    }
    

    public Car getCar(String type) {
        Car car;

        System.out.println("Proxy: Buscando carro do tipo: " + type);
        
        if(type.equalsIgnoreCase("lux")){
            System.out.println("Carro encontrado no proxy.");
            car = new LuxCar();
        }
        else if(type.equalsIgnoreCase("eco")){
            System.out.println("Carro encontrado no proxy.");
            car = new EcoCar();
        }
        else {
            System.out.println("Carro não encontrado no proxy. Delegando para o CarSearch.");
            car = base.getCar(type);
        }
        System.out.println("Saido do proxy...");
        return car;
    }
    
}
