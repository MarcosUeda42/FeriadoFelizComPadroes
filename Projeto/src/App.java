public class App {
    public static void main(String[] args) throws Exception {

        GlobalConfig config = GlobalConfig.getInstance();
        
        new CreateRun().createLuxGoogle(config.getPriceLux());
        
        System.out.println("\n");

        new CreateRun().createEcoGoogle(config.getPriceEco());

        System.out.println("\n");

        config.setPriceLux(3.0);
        config.setPriceEco(1.5);
        
        new CreateRun().createLuxWaze(config.getPriceLux());

        System.out.println("\n");

        new CreateRun().createEcoWaze(config.getPriceEco());

        System.out.println("\n");

        new CreateRun().createLuxStop(config.getPriceLux());

    }
}
