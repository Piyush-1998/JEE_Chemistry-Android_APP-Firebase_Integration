package hotchemi.android.rate;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;

/* loaded from: classes.dex */
final class UriHelper {
    private static final String AMAZON_APPSTORE = "amzn://apps/android?p=";
    private static final String GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=";

    private UriHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri getGooglePlay(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(GOOGLE_PLAY + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri getAmazonAppstore(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(AMAZON_APPSTORE + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isPackageExists(Context context, String str) {
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(0)) {
            if (applicationInfo.packageName.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
