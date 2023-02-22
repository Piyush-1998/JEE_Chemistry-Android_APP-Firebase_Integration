package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzjo implements zzjj {
    private final /* synthetic */ zzjm zzaqr;

    private zzjo(zzjm zzjmVar) {
        this.zzaqr = zzjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final int zzag(int i) {
        return zzjm.zzag(i);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final boolean zzah(int i) {
        return zzjm.zzah(i);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzd(int i, long j, long j2) throws zzgv {
        this.zzaqr.zzd(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzai(int i) throws zzgv {
        this.zzaqr.zzai(i);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzc(int i, long j) throws zzgv {
        this.zzaqr.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zza(int i, double d) throws zzgv {
        this.zzaqr.zza(i, d);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zza(int i, String str) throws zzgv {
        this.zzaqr.zza(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zza(int i, int i2, zziv zzivVar) throws IOException, InterruptedException {
        this.zzaqr.zza(i, i2, zzivVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjo(zzjm zzjmVar, zzjl zzjlVar) {
        this(zzjmVar);
    }
}
