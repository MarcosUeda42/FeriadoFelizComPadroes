public class AdaptGPSWaze implements GPS {

    private Waze waze;
    
    public AdaptGPSWaze(Waze waze) {
        this.waze = waze;
    }
    
    @Override
    public void init() {
        waze.bestRoute();
    }
    

}
