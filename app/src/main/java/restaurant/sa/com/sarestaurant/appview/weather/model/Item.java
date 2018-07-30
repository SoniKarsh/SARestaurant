
package restaurant.sa.com.sarestaurant.appview.weather.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("condition")
    private Condition mCondition;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("forecast")
    private List<Forecast> mForecast;
    @SerializedName("guid")
    private Guid mGuid;
    @SerializedName("lat")
    private String mLat;
    @SerializedName("link")
    private String mLink;
    @SerializedName("long")
    private String mLong;
    @SerializedName("pubDate")
    private String mPubDate;
    @SerializedName("title")
    private String mTitle;

    public Condition getCondition() {
        return mCondition;
    }

    public void setCondition(Condition condition) {
        mCondition = condition;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public List<Forecast> getForecast() {
        return mForecast;
    }

    public void setForecast(List<Forecast> forecast) {
        mForecast = forecast;
    }

    public Guid getGuid() {
        return mGuid;
    }

    public void setGuid(Guid guid) {
        mGuid = guid;
    }

    public String getLat() {
        return mLat;
    }

    public void setLat(String lat) {
        mLat = lat;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public String getLong() {
        return mLong;
    }

    public void setLong(String mlong) {
        mLong = mlong;
    }

    public String getPubDate() {
        return mPubDate;
    }

    public void setPubDate(String pubDate) {
        mPubDate = pubDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
