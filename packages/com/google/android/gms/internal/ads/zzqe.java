package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzqe implements ValueCallback<String> {
    private final /* synthetic */ zzqb zzbqc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqe(zzqb zzqbVar) {
        this.zzbqc = zzqbVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        this.zzbqc.zzbpy.zza(this.zzbqc.zzbpv, this.zzbqc.zzbpw, str, this.zzbqc.zzbpx);
    }
}
