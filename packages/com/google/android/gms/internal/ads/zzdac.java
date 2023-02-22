package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public class zzdac extends Handler {
    private static volatile zzdaf zzgok;

    public zzdac() {
    }

    public zzdac(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zzb(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(Message message) {
        super.dispatchMessage(message);
    }
}
