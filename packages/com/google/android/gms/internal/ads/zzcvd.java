package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvd implements zzdcz<zzbyz> {
    private final /* synthetic */ zzcms zzgdg;
    private final /* synthetic */ zzcvb zzgih;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvd(zzcvb zzcvbVar, zzcms zzcmsVar) {
        this.zzgih = zzcvbVar;
        this.zzgdg = zzcmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        zzcud zzcudVar;
        synchronized (this.zzgih) {
            zzcudVar = this.zzgih.zzgie;
            ((zzbzc) zzcudVar.zzamt()).zzacb().onAdFailedToLoad(zzccu.zzd(th));
            zzcwj.zzc(th, "RewardedAdLoader.onFailure");
            this.zzgdg.zzalq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbyz zzbyzVar) {
        zzcui zzcuiVar;
        zzbyz zzbyzVar2 = zzbyzVar;
        synchronized (this.zzgih) {
            this.zzgdg.onSuccess(zzbyzVar2);
            zzcuiVar = this.zzgih.zzgid;
            zzcuiVar.onAdMetadataChanged();
        }
    }
}
