package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzr {
    private final boolean zzea = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(Context context) {
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
