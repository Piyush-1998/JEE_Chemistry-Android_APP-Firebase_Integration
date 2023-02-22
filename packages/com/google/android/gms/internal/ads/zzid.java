package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzid implements zzhu {
    private final /* synthetic */ zzib zzakv;

    private zzid(zzib zzibVar) {
        this.zzakv = zzibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzq(int i) {
        zzib.zza(this.zzakv).zzr(i);
        zzib.zzq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzdx() {
        zzib.zzfn();
        zzib.zza(this.zzakv, true);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzc(int i, long j, long j2) {
        zzib.zza(this.zzakv).zzb(i, j, j2);
        zzib.zza(i, j, j2);
    }
}
