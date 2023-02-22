package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcvi implements zzcms<zzbyz> {
    private final /* synthetic */ zzcvf zzgir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvi(zzcvf zzcvfVar) {
        this.zzgir = zzcvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzalq() {
        synchronized (this.zzgir) {
            this.zzgir.zzgil = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final /* synthetic */ void onSuccess(zzbyz zzbyzVar) {
        zzbyz zzbyzVar2;
        zzbyz zzbyzVar3 = zzbyzVar;
        synchronized (this.zzgir) {
            this.zzgir.zzgil = zzbyzVar3;
            zzbyzVar2 = this.zzgir.zzgil;
            zzbyzVar2.zzafa();
        }
    }
}
