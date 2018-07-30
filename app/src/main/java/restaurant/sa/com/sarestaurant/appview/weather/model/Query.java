
package restaurant.sa.com.sarestaurant.appview.weather.model;

import com.google.gson.annotations.SerializedName;
public class Query {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("created")
    private String mCreated;
    @SerializedName("lang")
    private String mLang;
    @SerializedName("results")
    private Results mResults;

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public String getCreated() {
        return mCreated;
    }

    public void setCreated(String created) {
        mCreated = created;
    }

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public Results getResults() {
        return mResults;
    }

    public void setResults(Results results) {
        mResults = results;
    }

}
