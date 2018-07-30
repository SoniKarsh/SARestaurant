
package restaurant.sa.com.sarestaurant.appview.weather.model;

import com.google.gson.annotations.SerializedName;
public class Forecast {

    @SerializedName("code")
    private String mCode;
    @SerializedName("date")
    private String mDate;
    @SerializedName("day")
    private String mDay;
    @SerializedName("high")
    private String mHigh;
    @SerializedName("low")
    private String mLow;
    @SerializedName("text")
    private String mText;

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getDay() {
        return mDay;
    }

    public void setDay(String day) {
        mDay = day;
    }

    public String getHigh() {
        return mHigh;
    }

    public void setHigh(String high) {
        mHigh = high;
    }

    public String getLow() {
        return mLow;
    }

    public void setLow(String low) {
        mLow = low;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

}
