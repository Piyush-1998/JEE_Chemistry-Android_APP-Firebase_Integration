package hotchemi.android.rate;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class IntentHelper {
    private static final String GOOGLE_PLAY_PACKAGE_NAME = "com.android.vending";

    private IntentHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createIntentForGooglePlay(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", UriHelper.getGooglePlay(context.getPackageName()));
        if (UriHelper.isPackageExists(context, "com.android.vending")) {
            intent.setPackage("com.android.vending");
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent createIntentForAmazonAppstore(Context context) {
        return new Intent("android.intent.action.VIEW", UriHelper.getAmazonAppstore(context.getPackageName()));
    }
}
