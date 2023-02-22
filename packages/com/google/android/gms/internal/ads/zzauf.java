package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzauf extends zzdac {
    public zzauf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "AdMobHandler.handleMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzb(Message message) {
        try {
            super.zzb(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzq.zzkj();
            zzaul.zza(com.google.android.gms.ads.internal.zzq.zzkn().getApplicationContext(), th);
            throw th;
        }
    }
}
