package restaurant.sa.com.sarestaurant.appview.restaurant.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001-B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010$\u001a\u00020\tH\u0016J\u001c\u0010%\u001a\u00020&2\n\u0010\'\u001a\u00060\u0002R\u00020\u00002\u0006\u0010(\u001a\u00020\tH\u0016J\u001c\u0010)\u001a\u00060\u0002R\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006."}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RecyclerAdapterclass;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RecyclerAdapterclass$CustomViewHolder;", "context", "Landroid/content/Context;", "items", "Ljava/util/ArrayList;", "", "imageItems", "", "shareModel", "Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;)V", "TAG", "getTAG", "()Ljava/lang/String;", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getImageItems", "()Ljava/util/ArrayList;", "setImageItems", "(Ljava/util/ArrayList;)V", "getItems", "setItems", "getShareModel", "()Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;", "setShareModel", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/model/ShareModel;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CustomViewHolder", "app_debug"})
public final class RecyclerAdapterclass extends android.support.v7.widget.RecyclerView.Adapter<restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RecyclerAdapterclass.CustomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public com.facebook.CallbackManager callbackManager;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RecyclerAdapterclass";
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> items;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> imageItems;
    @org.jetbrains.annotations.NotNull()
    private restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel shareModel;
    
    @org.jetbrains.annotations.NotNull()
    public final com.facebook.CallbackManager getCallbackManager() {
        return null;
    }
    
    public final void setCallbackManager(@org.jetbrains.annotations.NotNull()
    com.facebook.CallbackManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RecyclerAdapterclass.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.adapter.RecyclerAdapterclass.CustomViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getImageItems() {
        return null;
    }
    
    public final void setImageItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel getShareModel() {
        return null;
    }
    
    public final void setShareModel(@org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel p0) {
    }
    
    public RecyclerAdapterclass(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> imageItems, @org.jetbrains.annotations.NotNull()
    restaurant.sa.com.sarestaurant.appview.restaurant.model.ShareModel shareModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RecyclerAdapterclass$CustomViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lrestaurant/sa/com/sarestaurant/appview/restaurant/adapter/RecyclerAdapterclass;Landroid/view/View;)V", "cardView", "Landroid/support/v7/widget/CardView;", "kotlin.jvm.PlatformType", "getCardView", "()Landroid/support/v7/widget/CardView;", "setCardView", "(Landroid/support/v7/widget/CardView;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class CustomViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private android.support.v7.widget.CardView cardView;
        private android.widget.TextView textView;
        private android.widget.ImageView imageView;
        
        public final android.support.v7.widget.CardView getCardView() {
            return null;
        }
        
        public final void setCardView(android.support.v7.widget.CardView p0) {
        }
        
        public final android.widget.TextView getTextView() {
            return null;
        }
        
        public final void setTextView(android.widget.TextView p0) {
        }
        
        public final android.widget.ImageView getImageView() {
            return null;
        }
        
        public final void setImageView(android.widget.ImageView p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}