package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class zzip implements Runnable {
    private final /* synthetic */ ComponentName val$name;
    private final /* synthetic */ zzin zzrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzin zzinVar, ComponentName componentName) {
        this.zzrs = zzinVar;
        this.val$name = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzrs.zzrd.onServiceDisconnected(this.val$name);
    }
}
