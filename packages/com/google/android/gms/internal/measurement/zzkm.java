package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzkm implements zzkj {
    private static final zzcm<Boolean> zzary;
    private static final zzcm<Boolean> zzarz;

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final boolean zzzf() {
        return zzary.get().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final boolean zzzg() {
        return zzarz.get().booleanValue();
    }

    static {
        zzct zzctVar = new zzct(zzcn.zzdh("com.google.android.gms.measurement"));
        zzary = zzctVar.zzb("measurement.collection.efficient_engagement_reporting_enabled", false);
        zzarz = zzctVar.zzb("measurement.collection.redundant_engagement_removal_enabled", false);
    }
}
