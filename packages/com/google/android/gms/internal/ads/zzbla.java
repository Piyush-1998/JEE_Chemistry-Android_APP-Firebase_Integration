package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbla {
    private final zzcvz zzels;
    private final zzcvr zzfbi;
    private final String zzffi;

    public zzbla(zzcvz zzcvzVar, zzcvr zzcvrVar, String str) {
        this.zzels = zzcvzVar;
        this.zzfbi = zzcvrVar;
        this.zzffi = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzcvz zzafp() {
        return this.zzels;
    }

    public final zzcvr zzafq() {
        return this.zzfbi;
    }

    public final String zzafr() {
        return this.zzffi;
    }
}
