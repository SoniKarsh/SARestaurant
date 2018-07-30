
package restaurant.sa.com.sarestaurant.appview.weather.model;

import com.google.gson.annotations.SerializedName;
public class Condition {

    @SerializedName("code")
    private String mCode;
    @SerializedName("date")
    private String mDate;
    @SerializedName("temp")
    private String mTemp;
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

    public String getTemp() {
        return mTemp;
    }

    public void setTemp(String temp) {
        mTemp = temp;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

}
