package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcef extends zzaox {
    private final /* synthetic */ zzcec zzfvc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcef(zzcec zzcecVar) {
        this.zzfvc = zzcecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzfvc.zzdbn.set(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void zza(zzavq zzavqVar) {
        this.zzfvc.zzdbn.setException(new zzavp(zzavqVar.zzdtw, zzavqVar.errorCode));
    }
}
