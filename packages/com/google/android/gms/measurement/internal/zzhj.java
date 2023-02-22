package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhj implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzgp zzpt;

    private zzhj(zzgp zzgpVar) {
        this.zzpt = zzgpVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2 A[Catch: all -> 0x01d4, Exception -> 0x01d6, Merged into TryCatch #0 {all -> 0x01d4, Exception -> 0x01d6, blocks: (B:3:0x0008, B:7:0x0027, B:9:0x002d, B:12:0x0035, B:17:0x0046, B:20:0x0064, B:45:0x00d2, B:47:0x00de, B:49:0x00f1, B:52:0x00f9, B:54:0x00ff, B:56:0x0117, B:59:0x0125, B:62:0x0135, B:65:0x013d, B:67:0x0143, B:68:0x014e, B:72:0x015e, B:74:0x0164, B:76:0x016a, B:78:0x0170, B:80:0x0176, B:82:0x017e, B:87:0x018b, B:90:0x01a4, B:92:0x01b9, B:24:0x0077, B:27:0x007e, B:29:0x0084, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:36:0x00a4, B:38:0x00b8, B:40:0x00c2, B:42:0x00cc, B:39:0x00bd, B:100:0x01d7), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e A[Catch: all -> 0x01d4, Exception -> 0x01d6, Merged into TryCatch #0 {all -> 0x01d4, Exception -> 0x01d6, blocks: (B:3:0x0008, B:7:0x0027, B:9:0x002d, B:12:0x0035, B:17:0x0046, B:20:0x0064, B:45:0x00d2, B:47:0x00de, B:49:0x00f1, B:52:0x00f9, B:54:0x00ff, B:56:0x0117, B:59:0x0125, B:62:0x0135, B:65:0x013d, B:67:0x0143, B:68:0x014e, B:72:0x015e, B:74:0x0164, B:76:0x016a, B:78:0x0170, B:80:0x0176, B:82:0x017e, B:87:0x018b, B:90:0x01a4, B:92:0x01b9, B:24:0x0077, B:27:0x007e, B:29:0x0084, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:36:0x00a4, B:38:0x00b8, B:40:0x00c2, B:42:0x00cc, B:39:0x00bd, B:100:0x01d7), top: B:106:0x0008 }, TRY_ENTER] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhj.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zzpt.zzt().onActivityDestroyed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zzpt.zzt().onActivityPaused(activity);
        zziw zzv = this.zzpt.zzv();
        zzv.zzaa().zza(new zzja(zzv, zzv.zzx().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.zzpt.zzt().onActivityResumed(activity);
        zziw zzv = this.zzpt.zzv();
        zzv.zzaa().zza(new zzjb(zzv, zzv.zzx().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zzpt.zzt().onActivitySaveInstanceState(activity, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhj(zzgp zzgpVar, zzgo zzgoVar) {
        this(zzgpVar);
    }
}
