package restaurant.sa.com.sarestaurant.appview.restaurant.favorite.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001/B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J\u001c\u0010%\u001a\u00020&2\n\u0010\'\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\"H\u0016J\u001c\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"H\u0016J \u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00050-j\b\u0012\u0004\u0012\u00020\u0005`.2\u0006\u0010$\u001a\u00020\"H\u0002R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u0019\u00a8\u00060"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/favorite/adapter/FavoriteListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/favorite/adapter/FavoriteListAdapter$CustomViewHolder;", "items", "", "Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "favoriteRestaurantModel", "getFavoriteRestaurantModel", "()Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "setFavoriteRestaurantModel", "(Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;)V", "imgUrl", "getImgUrl", "setImgUrl", "(Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "photoReference", "getPhotoReference", "setPhotoReference", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "CustomViewHolder", "app_debug"})
public final class FavoriteListAdapter extends android.support.v7.widget.RecyclerView.Adapter<restaurant.sa.com.sarestaurant.appview.restaurant.favorite.adapter.FavoriteListAdapter.CustomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "FavoriteListAdapter";
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel favoriteRestaurantModel;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String photoReference;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String imgUrl;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> items;
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
    public final java.lang.String getPhotoReference() {
        return null;
    }
    
    public final void setPhotoReference(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgUrl() {
        return null;
    }
    
    public final void setImgUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public restaurant.sa.com.sarestaurant.appview.restaurant.favorite.adapter.FavoriteListAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.favorite.adapter.FavoriteListAdapter.CustomViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final java.util.ArrayList<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> removeItem(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public FavoriteListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u001b\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/favorite/adapter/FavoriteListAdapter$CustomViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/favorite/adapter/FavoriteListAdapter;Landroid/view/View;)V", "favoriteButton", "Landroid/widget/ToggleButton;", "kotlin.jvm.PlatformType", "getFavoriteButton", "()Landroid/widget/ToggleButton;", "setFavoriteButton", "(Landroid/widget/ToggleButton;)V", "restaurantAddress", "Landroid/widget/TextView;", "getRestaurantAddress", "()Landroid/widget/TextView;", "setRestaurantAddress", "(Landroid/widget/TextView;)V", "restaurantImage", "Landroid/widget/ImageView;", "getRestaurantImage", "()Landroid/widget/ImageView;", "setRestaurantImage", "(Landroid/widget/ImageView;)V", "restaurantName", "getRestaurantName", "setRestaurantName", "sharePost", "getSharePost", "setSharePost", "app_debug"})
    public final class CustomViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private android.widget.TextView restaurantName;
        private android.widget.TextView restaurantAddress;
        private android.widget.ToggleButton favoriteButton;
        private android.widget.ImageView restaurantImage;
        private android.widget.ImageView sharePost;
        
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