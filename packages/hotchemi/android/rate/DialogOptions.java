package hotchemi.android.rate;

import android.content.Context;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class DialogOptions {
    private Reference<OnClickButtonListener> listener;
    private View view;
    private boolean showNeutralButton = true;
    private boolean showNegativeButton = true;
    private boolean showTitle = true;
    private boolean cancelable = false;
    private StoreType storeType = StoreType.GOOGLEPLAY;
    private int titleResId = R.string.rate_dialog_title;
    private int messageResId = R.string.rate_dialog_message;
    private int textPositiveResId = R.string.rate_dialog_ok;
    private int textNeutralResId = R.string.rate_dialog_cancel;
    private int textNegativeResId = R.string.rate_dialog_no;
    private String titleText = null;
    private String messageText = null;
    private String positiveText = null;
    private String neutralText = null;
    private String negativeText = null;

    public boolean shouldShowNeutralButton() {
        return this.showNeutralButton;
    }

    public void setShowNeutralButton(boolean z) {
        this.showNeutralButton = z;
    }

    public boolean shouldShowNegativeButton() {
        return this.showNegativeButton;
    }

    public void setShowNegativeButton(boolean z) {
        this.showNegativeButton = z;
    }

    public boolean shouldShowTitle() {
        return this.showTitle;
    }

    public void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    public boolean getCancelable() {
        return this.cancelable;
    }

    public void setCancelable(boolean z) {
        this.cancelable = z;
    }

    public StoreType getStoreType() {
        return this.storeType;
    }

    public void setStoreType(StoreType storeType) {
        this.storeType = storeType;
    }

    public int getTitleResId() {
        return this.titleResId;
    }

    public void setTitleResId(int i) {
        this.titleResId = i;
    }

    public int getMessageResId() {
        return this.messageResId;
    }

    public void setMessageResId(int i) {
        this.messageResId = i;
    }

    public int getTextPositiveResId() {
        return this.textPositiveResId;
    }

    public void setTextPositiveResId(int i) {
        this.textPositiveResId = i;
    }

    public int getTextNeutralResId() {
        return this.textNeutralResId;
    }

    public void setTextNeutralResId(int i) {
        this.textNeutralResId = i;
    }

    public int getTextNegativeResId() {
        return this.textNegativeResId;
    }

    public void setTextNegativeResId(int i) {
        this.textNegativeResId = i;
    }

    public View getView() {
        return this.view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public OnClickButtonListener getListener() {
        Reference<OnClickButtonListener> reference = this.listener;
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    public void setListener(OnClickButtonListener onClickButtonListener) {
        this.listener = new WeakReference(onClickButtonListener);
    }

    public String getTitleText(Context context) {
        String str = this.titleText;
        return str == null ? context.getString(this.titleResId) : str;
    }

    public void setTitleText(String str) {
        this.titleText = str;
    }

    public String getMessageText(Context context) {
        String str = this.messageText;
        return str == null ? context.getString(this.messageResId) : str;
    }

    public void setMessageText(String str) {
        this.messageText = str;
    }

    public String getPositiveText(Context context) {
        String str = this.positiveText;
        return str == null ? context.getString(this.textPositiveResId) : str;
    }

    public void setPositiveText(String str) {
        this.positiveText = str;
    }

    public String getNeutralText(Context context) {
        String str = this.neutralText;
        return str == null ? context.getString(this.textNeutralResId) : str;
    }

    public void setNeutralText(String str) {
        this.neutralText = str;
    }

    public String getNegativeText(Context context) {
        String str = this.negativeText;
        return str == null ? context.getString(this.textNegativeResId) : str;
    }

    public void setNegativeText(String str) {
        this.negativeText = str;
    }
}
