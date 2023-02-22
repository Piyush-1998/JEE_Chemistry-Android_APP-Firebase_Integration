package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzna {
    public final zzmk zzbee;
    public final zzmv zzbef;
    public final Object zzbeg;
    public final zzgz[] zzbeh;

    public zzna(zzmk zzmkVar, zzmv zzmvVar, Object obj, zzgz[] zzgzVarArr) {
        this.zzbee = zzmkVar;
        this.zzbef = zzmvVar;
        this.zzbeg = obj;
        this.zzbeh = zzgzVarArr;
    }

    public final boolean zza(zzna zznaVar, int i) {
        return zznaVar != null && zzof.zza(this.zzbef.zzax(i), zznaVar.zzbef.zzax(i)) && zzof.zza(this.zzbeh[i], zznaVar.zzbeh[i]);
    }
}
