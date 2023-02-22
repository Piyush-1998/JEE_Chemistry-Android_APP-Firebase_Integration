package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcvo implements zzcms<zzbyz> {
    private final /* synthetic */ zzcvl zzgiw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvo(zzcvl zzcvlVar) {
        this.zzgiw = zzcvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzalq() {
        synchronized (this.zzgiw) {
            this.zzgiw.zzgil = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final /* synthetic */ void onSuccess(zzbyz zzbyzVar) {
        zzbyz zzbyzVar2;
        zzbyz zzbyzVar3 = zzbyzVar;
        synchronized (this.zzgiw) {
            this.zzgiw.zzgil = zzbyzVar3;
            zzbyzVar2 = this.zzgiw.zzgil;
            zzbyzVar2.zzafa();
        }
    }
}
