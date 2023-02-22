package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public class zzcb {
    private static UserManager zzaan;
    private static volatile boolean zzaao = !zzri();
    private static boolean zzaap = false;

    private zzcb() {
    }

    public static boolean zzri() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isUserUnlocked(Context context) {
        return !zzri() || zzo(context);
    }

    private static boolean zzn(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zzaan == null) {
                zzaan = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zzaan;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zzaan = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            zzaan = null;
        }
        return z;
    }

    private static boolean zzo(Context context) {
        if (zzaao) {
            return true;
        }
        synchronized (zzcb.class) {
            if (zzaao) {
                return true;
            }
            boolean zzn = zzn(context);
            if (zzn) {
                zzaao = zzn;
            }
            return zzn;
        }
    }
}
