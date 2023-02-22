package maes.tech.intentanim;

import android.app.Activity;
import android.content.Context;
import com.tech.intentanim.R;

/* loaded from: classes.dex */
public class CustomIntent {
    public static String[] types = {"", ""};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void customType(Context context, String str) {
        char c;
        Activity activity = (Activity) context;
        switch (str.hashCode()) {
            case -1374662296:
                if (str.equals("right-to-left")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -858623733:
                if (str.equals("up-to-bottom")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 300472144:
                if (str.equals("left-to-right")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 485127852:
                if (str.equals("fadein-to-fadeout")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1165882635:
                if (str.equals("bottom-to-up")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1383869464:
                if (str.equals("rotateout-to-rotatein")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        } else if (c == 1) {
            activity.overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
        } else if (c == 2) {
            activity.overridePendingTransition(R.anim.bottom_to_up, R.anim.up_to_bottom);
        } else if (c == 3) {
            activity.overridePendingTransition(R.anim.up_to_bottom2, R.anim.bottom_to_up2);
        } else if (c == 4) {
            activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        } else if (c != 5) {
        } else {
            activity.overridePendingTransition(R.anim.rotatein_out, R.anim.rotateout_in);
        }
    }
}
