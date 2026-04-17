public class GlobalConfig {
    
    private static GlobalConfig instance;

    private double priceEco;
    private double priceLux;

    private GlobalConfig() {
        priceEco = 1.0;
        priceLux = 2.0;
    }
    
    public static synchronized GlobalConfig getInstance() {
        if (instance == null) {
            instance = new GlobalConfig();
        }
        return instance;
    }

    public double getPriceEco() {
        return priceEco;
    }

    public double getPriceLux() {
        return priceLux;
    }   

    public void setPriceEco(double priceEco) {
        this.priceEco = priceEco;
        System.out.println("Preço setado para carro normal: " + priceEco + " reais por km");
    }

    public void setPriceLux(double priceLux) {
        this.priceLux = priceLux;
        System.out.println("Preço setado para carro luxuoso: " + priceLux + " reais por km");
    }
}
