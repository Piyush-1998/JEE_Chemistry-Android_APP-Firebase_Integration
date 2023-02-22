package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzlm implements Runnable {
    private final /* synthetic */ zzli zzazs;
    private final /* synthetic */ IOException zzbay;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlm(zzli zzliVar, IOException iOException) {
        this.zzazs = zzliVar;
        this.zzbay = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlp zzlpVar;
        zzlpVar = this.zzazs.zzazu;
        zzlpVar.zzb(this.zzbay);
    }
}
