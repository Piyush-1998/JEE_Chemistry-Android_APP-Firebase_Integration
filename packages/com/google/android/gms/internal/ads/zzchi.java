package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchi implements zzdcz<zzbio> {
    private final /* synthetic */ zzchh zzfyd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchi(zzchh zzchhVar) {
        this.zzfyd = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        zzbmz zzbmzVar;
        zzbmzVar = this.zzfyd.zzfht;
        zzbmzVar.onAdFailedToLoad(zzccu.zzd(th));
        zzcwj.zzc(th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbio zzbioVar) {
        zzbioVar.zzafa();
    }
}
