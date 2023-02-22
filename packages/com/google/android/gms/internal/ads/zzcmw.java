package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcmw implements zzdcz<zzbkk> {
    private final /* synthetic */ zzcms zzgdg;
    private final /* synthetic */ zzbtl zzgdh;
    private final /* synthetic */ zzcmu zzgdi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmw(zzcmu zzcmuVar, zzcms zzcmsVar, zzbtl zzbtlVar) {
        this.zzgdi = zzcmuVar;
        this.zzgdg = zzcmsVar;
        this.zzgdh = zzbtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        this.zzgdh.zzacb().onAdFailedToLoad(zzccu.zzd(th));
        zzcwj.zzc(th, "NativeAdLoader.onFailure");
        this.zzgdg.zzalq();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbkk zzbkkVar) {
        zzbkk zzbkkVar2 = zzbkkVar;
        synchronized (this.zzgdi) {
            this.zzgdg.onSuccess(zzbkkVar2);
        }
    }
}
