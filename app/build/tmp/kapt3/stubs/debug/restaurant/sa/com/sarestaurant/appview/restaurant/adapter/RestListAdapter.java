package restaurant.sa.com.sarestaurant.appview.restaurant.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\\B3\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010M\u001a\u00020N2\u0006\u0010+\u001a\u00020\tH\u0002J\b\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020PH\u0016J\u001c\u0010S\u001a\u00020N2\n\u0010T\u001a\u00060\u0002R\u00020\u00002\u0006\u0010R\u001a\u00020PH\u0016J\u001c\u0010U\u001a\u00060\u0002R\u00020\u00002\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020PH\u0016J\u0010\u0010Y\u001a\u00020N2\u0006\u0010R\u001a\u00020PH\u0002J\u000e\u0010Z\u001a\u00020N2\u0006\u0010[\u001a\u00020\u000eR\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0010R\u001a\u0010A\u001a\u00020BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020HX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\u00a8\u0006]"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter$CustomViewHolder;", "items", "Ljava/util/ArrayList;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/Result;", "Lkotlin/collections/ArrayList;", "favItems", "", "Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Ljava/util/List;Landroid/content/Context;)V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "FRAGMENT_DETAIL_REST", "getFRAGMENT_DETAIL_REST", "setFRAGMENT_DETAIL_REST", "(Ljava/lang/String;)V", "TAG", "getTAG", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "detailFragment", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;", "getDetailFragment", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;", "setDetailFragment", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;)V", "detailPresenter", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "getDetailPresenter", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "setDetailPresenter", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;)V", "getFavItems", "()Ljava/util/List;", "setFavItems", "(Ljava/util/List;)V", "favoriteRestaurantModel", "getFavoriteRestaurantModel", "()Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;", "setFavoriteRestaurantModel", "(Lrestaurant/sa/com/sarestaurant/model/FavoriteRestaurantModel;)V", "homeActivity", "Lrestaurant/sa/com/sarestaurant/HomeActivity;", "getHomeActivity", "()Lrestaurant/sa/com/sarestaurant/HomeActivity;", "setHomeActivity", "(Lrestaurant/sa/com/sarestaurant/HomeActivity;)V", "isClickable", "", "()Z", "setClickable", "(Z)V", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "noImage", "getNoImage", "restaurantDetailModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "getRestaurantDetailModel", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "setRestaurantDetailModel", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;)V", "shareModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;", "getShareModel", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;", "setShareModel", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;)V", "addItem", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "retrofitCall", "placeId", "CustomViewHolder", "app_debug"})
public final class RestListAdapter extends android.support.v7.widget.RecyclerView.Adapter<restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RestListAdapter.CustomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RestaurantListAdapter";
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel favoriteRestaurantModel;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel shareModel;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment detailFragment;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.HomeActivity homeActivity;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String FRAGMENT_DETAIL_REST;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter detailPresenter;
    @org.jetbrains.annotations.NotNull()
    public restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel restaurantDetailModel;
    private boolean isClickable;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BASE_URL = "https://maps.googleapis.com";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String noImage = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> items;
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
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment getDetailFragment() {
        return null;
    }
    
    public final void setDetailFragment(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.RestaurantDetailFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.HomeActivity getHomeActivity() {
        return null;
    }
    
    public final void setHomeActivity(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.HomeActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFRAGMENT_DETAIL_REST() {
        return null;
    }
    
    public final void setFRAGMENT_DETAIL_REST(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter getDetailPresenter() {
        return null;
    }
    
    public final void setDetailPresenter(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel getRestaurantDetailModel() {
        return null;
    }
    
    public final void setRestaurantDetailModel(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel p0) {
    }
    
    public final boolean isClickable() {
        return false;
    }
    
    public final void setClickable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoImage() {
        return null;
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
    
    public final void retrofitCall(@org.jetbrains.annotations.NotNull()
    java.lang.String placeId) {
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
    public final java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> p0) {
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
    java.util.ArrayList<restaurant.sa.com.sarestaurant.appview.restaurant.model.Result> items, @org.jetbrains.annotations.NotNull()
    java.util.List<restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel> favItems, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\"\u0010\'\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\"\u0010*\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#\u00a8\u0006-"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter$CustomViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RestListAdapter;Landroid/view/View;)V", "favoriteButton", "Landroid/widget/ToggleButton;", "kotlin.jvm.PlatformType", "getFavoriteButton", "()Landroid/widget/ToggleButton;", "setFavoriteButton", "(Landroid/widget/ToggleButton;)V", "holderView", "Landroid/support/v7/widget/CardView;", "getHolderView", "()Landroid/support/v7/widget/CardView;", "setHolderView", "(Landroid/support/v7/widget/CardView;)V", "placeId", "", "getPlaceId", "()Ljava/lang/String;", "setPlaceId", "(Ljava/lang/String;)V", "restaurantAddress", "Landroid/widget/TextView;", "getRestaurantAddress", "()Landroid/widget/TextView;", "setRestaurantAddress", "(Landroid/widget/TextView;)V", "restaurantImage", "Landroid/widget/ImageView;", "getRestaurantImage", "()Landroid/widget/ImageView;", "setRestaurantImage", "(Landroid/widget/ImageView;)V", "restaurantImgUrl", "getRestaurantImgUrl", "setRestaurantImgUrl", "restaurantName", "getRestaurantName", "setRestaurantName", "sharePost", "getSharePost", "setSharePost", "app_debug"})
    public final class CustomViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private android.support.v7.widget.CardView holderView;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String restaurantImgUrl;
        private android.widget.TextView restaurantName;
        private android.widget.TextView restaurantAddress;
        private android.widget.ToggleButton favoriteButton;
        private android.widget.ImageView restaurantImage;
        private android.widget.ImageView sharePost;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String placeId;
        
        public final android.support.v7.widget.CardView getHolderView() {
            return null;
        }
        
        public final void setHolderView(android.support.v7.widget.CardView p0) {
        }
        
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPlaceId() {
            return null;
        }
        
        public final void setPlaceId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}