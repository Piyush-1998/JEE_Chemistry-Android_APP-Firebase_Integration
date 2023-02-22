package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcgc {
    private zzbni zzfiv;
    private zzcvr zzfiw;

    public zzcgc(zzcvr zzcvrVar) {
        this.zzfiw = zzcvrVar;
    }

    public final void zzaks() {
        if (this.zzfiv != null && this.zzfiw.zzgjp == 2) {
            this.zzfiv.onAdImpression();
        }
    }

    public final void zza(zzbni zzbniVar) {
        this.zzfiv = zzbniVar;
    }
}
