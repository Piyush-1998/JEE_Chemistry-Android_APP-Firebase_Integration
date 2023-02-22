package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbha implements zzbnb {
    private final zzcvt zzfbc;
    private final zzcvz zzfbd;
    private final zzcyp zzfbe;

    public zzbha(zzcvz zzcvzVar, zzcyp zzcypVar) {
        this.zzfbd = zzcvzVar;
        this.zzfbe = zzcypVar;
        this.zzfbc = zzcvzVar.zzgkb.zzgjy;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void onAdFailedToLoad(int i) {
        this.zzfbe.zza(this.zzfbd, null, this.zzfbc.zzdcb);
    }
}
