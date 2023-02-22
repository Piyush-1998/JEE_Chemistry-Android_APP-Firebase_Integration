package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblb implements zzdcz<zzbkk> {
    private final /* synthetic */ zzdcz zzffs;
    private final /* synthetic */ zzbkv zzfft;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblb(zzbkv zzbkvVar, zzdcz zzdczVar) {
        this.zzfft = zzbkvVar;
        this.zzffs = zzdczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        this.zzfft.zzafn();
        this.zzffs.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbkk zzbkkVar) {
        this.zzfft.zzafn();
        this.zzffs.onSuccess(zzbkkVar);
    }
}
