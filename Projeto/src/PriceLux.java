public class PriceLux implements Observer {

    @Override
    public void updateLux(Subject s) {
        double newPriceLux = ((GlobalConfig) s).getPriceLux();
        System.out.println("Preço setado para carro luxuoso: " + newPriceLux + " reais por km");
    }

    public void updateEco(Subject s) {
    }
    
}
