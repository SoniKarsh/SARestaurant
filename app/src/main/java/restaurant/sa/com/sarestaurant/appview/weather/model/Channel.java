
package restaurant.sa.com.sarestaurant.appview.weather.model;

import com.google.gson.annotations.SerializedName;
public class Channel {

    @SerializedName("astronomy")
    private Astronomy mAstronomy;
    @SerializedName("atmosphere")
    private Atmosphere mAtmosphere;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("item")
    private Item mItem;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("lastBuildDate")
    private String mLastBuildDate;
    @SerializedName("link")
    private String mLink;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("ttl")
    private String mTtl;
    @SerializedName("units")
    private Units mUnits;
    @SerializedName("wind")
    private Wind mWind;

    public Astronomy getAstronomy() {
        return mAstronomy;
    }

    public void setAstronomy(Astronomy astronomy) {
        mAstronomy = astronomy;
    }

    public Atmosphere getAtmosphere() {
        return mAtmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        mAtmosphere = atmosphere;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image image) {
        mImage = image;
    }

    public Item getItem() {
        return mItem;
    }

    public void setItem(Item item) {
        mItem = item;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getLastBuildDate() {
        return mLastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        mLastBuildDate = lastBuildDate;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTtl() {
        return mTtl;
    }

    public void setTtl(String ttl) {
        mTtl = ttl;
    }

    public Units getUnits() {
        return mUnits;
    }

    public void setUnits(Units units) {
        mUnits = units;
    }

    public Wind getWind() {
        return mWind;
    }

    public void setWind(Wind wind) {
        mWind = wind;
    }

}
