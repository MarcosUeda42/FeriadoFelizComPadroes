public class AdaptGPSGoogle implements GPS {

    private GoogleMaps googleMaps;
    
    public AdaptGPSGoogle(GoogleMaps googleMaps) {
        this.googleMaps = googleMaps;
    }
    
    @Override
    public void init() {
        googleMaps.getRoute();
    }
}
