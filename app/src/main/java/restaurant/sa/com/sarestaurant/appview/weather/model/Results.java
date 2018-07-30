
package restaurant.sa.com.sarestaurant.appview.weather.model;
import com.google.gson.annotations.SerializedName;
public class Results {

    @SerializedName("channel")
    private Channel mChannel;

    public Channel getChannel() {
        return mChannel;
    }

    public void setChannel(Channel channel) {
        mChannel = channel;
    }

}
