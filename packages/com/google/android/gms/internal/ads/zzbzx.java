package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbzx implements zzani {
    private final /* synthetic */ zzbzn zzfqu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzx(zzbzn zzbznVar) {
        this.zzfqu = zzbznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzani
    public final void zza(int i, int i2, int i3, int i4) {
        zzbnr zzbnrVar;
        zzbnrVar = this.zzfqu.zzffv;
        zzbnrVar.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzani
    public final void zzsl() {
        zzbnr zzbnrVar;
        zzbnrVar = this.zzfqu.zzffv;
        zzbnrVar.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzani
    public final void zzsm() {
        zzbpb zzbpbVar;
        zzbpbVar = this.zzfqu.zzfqr;
        zzbpbVar.zzafe();
    }
}
