package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcl extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcl(zzcj zzcjVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzcm.zzrl();
    }
}
