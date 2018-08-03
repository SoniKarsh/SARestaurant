package restaurant.sa.com.sarestaurant.appview.restaurant.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000eH\u0016J\u0018\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\'2\u0006\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\b\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/ImageSlideAdapter;", "Landroid/support/v4/view/PagerAdapter;", "context", "Landroid/content/Context;", "images", "Ljava/util/ArrayList;", "", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "TAG", "getTAG", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "i", "", "getI", "()I", "setI", "(I)V", "getImages", "()Ljava/util/ArrayList;", "inflater", "Landroid/view/LayoutInflater;", "isStopped", "", "()Z", "setStopped", "(Z)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getCount", "instantiateItem", "view", "isViewFromObject", "Landroid/view/View;", "app_debug"})
public final class ImageSlideAdapter extends android.support.v4.view.PagerAdapter {
    private final android.view.LayoutInflater inflater = null;
    private int i;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "ImageSlideAdapter";
    private boolean isStopped;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> images = null;
    
    public final int getI() {
        return 0;
    }
    
    public final void setI(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final boolean isStopped() {
        return false;
    }
    
    public final void setStopped(boolean p0) {
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup view, int position) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImages() {
        return null;
    }
    
    public ImageSlideAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> images) {
        super();
    }
}