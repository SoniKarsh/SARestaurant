
package restaurant.sa.com.sarestaurant.appview.weather.model;

import com.google.gson.annotations.SerializedName;
public class Guid {

    @SerializedName("isPermaLink")
    private String mIsPermaLink;

    public String getIsPermaLink() {
        return mIsPermaLink;
    }

    public void setIsPermaLink(String isPermaLink) {
        mIsPermaLink = isPermaLink;
    }

}
