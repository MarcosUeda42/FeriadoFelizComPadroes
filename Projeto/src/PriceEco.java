public class PriceEco implements Observer {

    @Override
    public void updateEco(Subject s) {
        double newPriceEco = ((GlobalConfig) s).getPriceEco();
        System.out.println("Preço setado para carro normal: " + newPriceEco + " reais por km");
    }

    public void updateLux(Subject s) {
    }
    
}
