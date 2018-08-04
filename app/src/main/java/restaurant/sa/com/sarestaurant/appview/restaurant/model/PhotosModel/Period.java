
package restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotosModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;
public class Period {

    @SerializedName("close")
    private Close mClose;
    @SerializedName("open")
    private Open mOpen;

    public Close getClose() {
        return mClose;
    }

    public void setClose(Close close) {
        mClose = close;
    }

    public Open getOpen() {
        return mOpen;
    }

    public void setOpen(Open open) {
        mOpen = open;
    }

}
