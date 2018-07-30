package restaurant.sa.com.sarestaurant.appview.signup.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lrestaurant/sa/com/sarestaurant/appview/signup/view/SignUpView;", "", "displayValidationMessage", "", "view", "Landroid/support/design/widget/TextInputLayout;", "removeError", "", "Landroid/view/View;", "setError", "app_debug"})
public abstract interface SignUpView {
    
    public abstract boolean displayValidationMessage(@org.jetbrains.annotations.Nullable()
    android.support.design.widget.TextInputLayout view);
    
    public abstract void setError(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void removeError(@org.jetbrains.annotations.NotNull()
    android.view.View view);
}