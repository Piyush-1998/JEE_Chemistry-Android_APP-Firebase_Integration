package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcmn implements zzdcz<zzbrs> {
    private final /* synthetic */ zzbso zzgcv;
    private final /* synthetic */ zzcmk zzgcw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmn(zzcmk zzcmkVar, zzbso zzbsoVar) {
        this.zzgcw = zzcmkVar;
        this.zzgcv = zzbsoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        synchronized (this.zzgcw) {
            this.zzgcw.zzgbz = null;
            this.zzgcv.zzacb().onAdFailedToLoad(zzccu.zzd(th));
            zzcwj.zzc(th, "InterstitialAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbrs zzbrsVar) {
        zzbrs zzbrsVar2 = zzbrsVar;
        synchronized (this.zzgcw) {
            this.zzgcw.zzgbz = null;
            this.zzgcw.zzgcp = zzbrsVar2;
            zzbrsVar2.zzafa();
        }
    }
}
