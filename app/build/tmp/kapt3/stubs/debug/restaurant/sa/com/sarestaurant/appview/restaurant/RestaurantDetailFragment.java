package restaurant.sa.com.sarestaurant.appview.restaurant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\'\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010\"H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00064"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/RestaurantDetailFragment;", "Landroid/support/v4/app/Fragment;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "()V", "TAG", "", "detailPresenter", "getDetailPresenter", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;", "setDetailPresenter", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/presenter/DetailPresenter;)V", "imageArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getImageArrayList", "()Ljava/util/ArrayList;", "setImageArrayList", "(Ljava/util/ArrayList;)V", "imgUrl", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "mPager", "Landroid/support/v4/view/ViewPager;", "noImage", "getNoImage", "restaurantDetailModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "getRestaurantDetailModel", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;", "setRestaurantDetailModel", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/RestaurantDetailModel;)V", "thisContext", "Landroid/content/Context;", "getThisContext", "()Landroid/content/Context;", "setThisContext", "(Landroid/content/Context;)V", "getRestaurantData", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class RestaurantDetailFragment extends android.support.v4.app.Fragment implements restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter {
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter detailPresenter;
    @org.jetbrains.annotations.Nullable()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel restaurantDetailModel;
    private final java.lang.String TAG = "RestDetailFragment";
    private android.support.v4.view.ViewPager mPager;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> imageArrayList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imgUrl;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context thisContext;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String noImage = "https://www.aubreydaniels.com/sites/default/files/default_images/x2017-05-15_18.png.pagespeed.ic.tLD9q0ZZph.png";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter getDetailPresenter() {
        return null;
    }
    
    public final void setDetailPresenter(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.presenter.DetailPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel getRestaurantDetailModel() {
        return null;
    }
    
    public final void setRestaurantDetailModel(@org.jetbrains.annotations.Nullable()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImageArrayList() {
        return null;
    }
    
    public final void setImageArrayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImgUrl() {
        return null;
    }
    
    public final void setImgUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getThisContext() {
        return null;
    }
    
    public final void setThisContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoImage() {
        return null;
    }
    
    @java.lang.Override()
    public void getRestaurantData(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.RestaurantDetailModel restaurantDetailModel) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public RestaurantDetailFragment() {
        super();
    }
}