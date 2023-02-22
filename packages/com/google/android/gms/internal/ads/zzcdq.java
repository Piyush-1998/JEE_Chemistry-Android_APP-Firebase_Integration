package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcdq implements zzdcz<zzcvz> {
    private final /* synthetic */ zzcdr zzfum;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdq(zzcdr zzcdrVar) {
        this.zzfum = zzcdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzcvz zzcvzVar) {
        zzbox zzboxVar;
        zzboxVar = this.zzfum.zzfun;
        zzboxVar.zza(zzcvzVar);
    }
}
