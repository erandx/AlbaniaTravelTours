package bestshot.pro.albaniatraveltours;

public class Albania {

    // City/Place Name (e.g. Tirana, Bujtina Gjelit)
    private String mPlaceName;
    // City/Place Info (e.g. Californication, A.d.i.d.a.s)
    private String mPlaceInfo;
    // City/Place Info (e.g. Californication, A.d.i.d.a.s)
    private String mLocationInfo;
    // Drawable resource ID of City/Place.
    private int mPlaceImage;
    // City/Restaurant Map Location
    private int mMap;

    // City/Restaurant Google Map Link
    private String link;

    /*
     * Create a new Albania object.
     *
     * @param aName is the name of the City/Place (e.g. Tirana
     * @param aPlace is Place/Hotel/Restaurant Info (e.g. Kruja/Hotel Panorama)
     * @param image is drawable reference ID that corresponds to the City/Place
     * */
    public Albania(String aName, String aInfo, String lInfo, int imageResourceId) {
        this.mPlaceName = aName;
        this.mPlaceInfo = aInfo;
        this.mLocationInfo = lInfo;
        this.mPlaceImage = imageResourceId;
    }

    /*
     * Create a new Albania object.
     *
     * @param aName is the name of the City/Place (e.g. Tirana
     * @param aPlace is Place/Hotel/Restaurant Info (e.g. Kruja/Hotel Panorama)
     * @param image is drawable reference ID that corresponds to the City/Place
     * */
    public Albania(String aName, String aInfo, String lInfo, int imageResourceId, int mMap, String link) {
        this.mPlaceName = aName;
        this.mPlaceInfo = aInfo;
        this.mLocationInfo = lInfo;
        this.mPlaceImage = imageResourceId;
        this.mMap = mMap;
        this.link = link;
    }

    /**
     * Get the name of the City/Tour
     */
    public String getmPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the Location Info
     */
    public String getmLocationInfo() {
        return mLocationInfo;
    }

    /**
     * Get the City/Place Info
     */
    public String getmPlaceInfo() {
        return mPlaceInfo;
    }

    /**
     * Get the image resource ID
     */
    public int getmPlaceImage() {
        return mPlaceImage;
    }

    /**
     * Get the map resource ID
     */
    public int getmCityMap() {
        return mMap;
    }

    public String getLink() {
        return link;
    }

}
