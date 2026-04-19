public class CarSearch implements CarSearchInterface {
    
    SearchStrategy searchStrategy;

    public CarSearch() {
        this(new FastSearch());
    }

    public CarSearch(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

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
