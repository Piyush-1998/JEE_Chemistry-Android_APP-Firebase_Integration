package hotchemi.android.rate;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
final class Utils {
    private Utils() {
    }

    static boolean underHoneyComb() {
        return Build.VERSION.SDK_INT < 11;
    }

    static boolean isLollipop() {
        return Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22;
    }

    static int getDialogTheme() {
        if (isLollipop()) {
            return R.style.CustomLollipopDialogStyle;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AlertDialog.Builder getDialogBuilder(Context context) {
        if (underHoneyComb()) {
            return new AlertDialog.Builder(context);
        }
        return new AlertDialog.Builder(context, getDialogTheme());
    }
}
