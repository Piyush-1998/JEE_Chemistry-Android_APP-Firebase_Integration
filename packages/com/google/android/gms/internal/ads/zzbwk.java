package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbwk implements zzdal<zzo, Bitmap> {
    private final /* synthetic */ double zzfnw;
    private final /* synthetic */ boolean zzfnx;
    private final /* synthetic */ zzbwl zzfny;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwk(zzbwl zzbwlVar, double d, boolean z) {
        this.zzfny = zzbwlVar;
        this.zzfnw = d;
        this.zzfnx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ Bitmap apply(zzo zzoVar) {
        Bitmap zza;
        zza = this.zzfny.zza(zzoVar.data, this.zzfnw, this.zzfnx);
        return zza;
    }
}
