
package restaurant.sa.com.sarestaurant.appview.restaurant.model;

import com.google.gson.annotations.SerializedName;

public class PlusCode {

    @SerializedName("compound_code")
    private String compoundCode;
    @SerializedName("global_code")
    private String globalCode;

    public String getCompoundCode() {
        return compoundCode;
    }

    public void setCompoundCode(String compoundCode) {
        this.compoundCode = compoundCode;
    }

    public String getGlobalCode() {
        return globalCode;
    }

    public void setGlobalCode(String globalCode) {
        this.globalCode = globalCode;
    }

}
