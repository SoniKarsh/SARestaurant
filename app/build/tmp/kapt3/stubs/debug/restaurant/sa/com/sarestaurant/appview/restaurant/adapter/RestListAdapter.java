package restaurant.sa.com.sarestaurant.appview.restaurant.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010&\u001a\u00020\'2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0016J\u001c\u0010,\u001a\u00020\'2\n\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020)H\u0016J\u001c\u0010.\u001a\u00060\u0002R\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020)H\u0016J\u0010\u00102\u001a\u00020\'2\u0006\u0010+\u001a\u00020)H\u0002R\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00064"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter$CustomViewHolder;", "items", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;", "favItems", "", "Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "context", "Landroid/content/Context;", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;Ljava/util/List;Landroid/content/Context;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getFavItems", "()Ljava/util/List;", "setFavItems", "(Ljava/util/List;)V", "favoriteRestaurantModel", "getFavoriteRestaurantModel", "()Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "setFavoriteRestaurantModel", "(Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;)V", "getItems", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;", "setItems", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ResponseModelClass;)V", "shareModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;", "getShareModel", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;", "setShareModel", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;)V", "addItem", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "CustomViewHolder", "app_debug"})
public final class RestListAdapter extends android.support.v7.widget.RecyclerView.Adapter<restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter.CustomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RestaurantListAdapter";
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel favoriteRestaurantModel;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel shareModel;
    @org.jetbrains.annotations.NotNull()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass items;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> favItems;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel getFavoriteRestaurantModel() {
        return null;
    }
    
    public final void setFavoriteRestaurantModel(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel getShareModel() {
        return null;
    }
    
    public final void setShareModel(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter.CustomViewHolder holder, int position) {
    }
    
    private final void removeItem(int position) {
    }
    
    private final void addItem(restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel favoriteRestaurantModel) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> getFavItems() {
        return null;
    }
    
    public final void setFavItems(@org.jetbrains.annotations.NotNull()
    java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public RestListAdapter(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ResponseModelClass items, @org.jetbrains.annotations.NotNull()
    java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> favItems, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\"\u0010!\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017\u00a8\u0006$"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter$CustomViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter;Landroid/view/View;)V", "favoriteButton", "Landroid/widget/ToggleButton;", "kotlin.jvm.PlatformType", "getFavoriteButton", "()Landroid/widget/ToggleButton;", "setFavoriteButton", "(Landroid/widget/ToggleButton;)V", "restaurantAddress", "Landroid/widget/TextView;", "getRestaurantAddress", "()Landroid/widget/TextView;", "setRestaurantAddress", "(Landroid/widget/TextView;)V", "restaurantImage", "Landroid/widget/ImageView;", "getRestaurantImage", "()Landroid/widget/ImageView;", "setRestaurantImage", "(Landroid/widget/ImageView;)V", "restaurantImgUrl", "", "getRestaurantImgUrl", "()Ljava/lang/String;", "setRestaurantImgUrl", "(Ljava/lang/String;)V", "restaurantName", "getRestaurantName", "setRestaurantName", "sharePost", "getSharePost", "setSharePost", "app_debug"})
    public final class CustomViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String restaurantImgUrl;
        private android.widget.TextView restaurantName;
        private android.widget.TextView restaurantAddress;
        private android.widget.ToggleButton favoriteButton;
        private android.widget.ImageView restaurantImage;
        private android.widget.ImageView sharePost;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRestaurantImgUrl() {
            return null;
        }
        
        public final void setRestaurantImgUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final android.widget.TextView getRestaurantName() {
            return null;
        }
        
        public final void setRestaurantName(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getRestaurantAddress() {
            return null;
        }
        
        public final void setRestaurantAddress(android.widget.TextView p0) {
        }
        
        public final android.widget.ToggleButton getFavoriteButton() {
            return null;
        }
        
        public final void setFavoriteButton(android.widget.ToggleButton p0) {
        }
        
        public final android.widget.ImageView getRestaurantImage() {
            return null;
        }
        
        public final void setRestaurantImage(android.widget.ImageView p0) {
        }
        
        public final android.widget.ImageView getSharePost() {
            return null;
        }
        
        public final void setSharePost(android.widget.ImageView p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}