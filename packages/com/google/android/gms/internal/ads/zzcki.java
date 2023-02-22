package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcki extends zzaqs {
    private final /* synthetic */ zzboo zzfzy;
    private final /* synthetic */ zzbmv zzfzz;
    private final /* synthetic */ zzbnr zzgaa;
    private final /* synthetic */ zzbrc zzgab;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcki(zzcke zzckeVar, zzboo zzbooVar, zzbmv zzbmvVar, zzbnr zzbnrVar, zzbrc zzbrcVar) {
        this.zzfzy = zzbooVar;
        this.zzfzz = zzbmvVar;
        this.zzgaa = zzbnrVar;
        this.zzgab = zzbrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzai(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzaj(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzb(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzak(IObjectWrapper iObjectWrapper) {
        this.zzfzy.zzsj();
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzam(IObjectWrapper iObjectWrapper) {
        this.zzfzy.zzsi();
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzan(IObjectWrapper iObjectWrapper) {
        this.zzfzz.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzao(IObjectWrapper iObjectWrapper) {
        this.zzgaa.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zza(IObjectWrapper iObjectWrapper, zzaqt zzaqtVar) {
        this.zzgab.zza(zzaqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzal(IObjectWrapper iObjectWrapper) {
        this.zzgab.zzra();
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final void zzap(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzgaa.onRewardedVideoCompleted();
    }
}
