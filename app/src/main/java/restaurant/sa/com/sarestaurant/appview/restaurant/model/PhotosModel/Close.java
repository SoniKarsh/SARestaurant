
package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;
public class Close {

    @SerializedName("day")
    private Long mDay;
    @SerializedName("time")
    private String mTime;

    public Long getDay() {
        return mDay;
    }

    public void setDay(Long day) {
        mDay = day;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

}
