public class CarSearchProxy implements CarSearchInterface {
    
    private CarSearchInterface base;
    
    public CarSearchProxy(CarSearchInterface base) {
        this.base = base;
    }
    

    public Car getCar(String type) {
        Car car;

        System.out.println("Proxy: Buscando carro do tipo: " + type);
        
        car = base.getCar(type);
        
        System.out.println("Saido do proxy...");
        return car;
    }
    
}
