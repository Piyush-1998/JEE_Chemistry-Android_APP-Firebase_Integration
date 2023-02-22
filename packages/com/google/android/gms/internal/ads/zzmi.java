package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzmi extends zzgy {
    private static final Object zzbcx = new Object();
    private final boolean zzags;
    private final boolean zzagt;
    private final long zzbcy;
    private final long zzbcz;
    private final long zzbda;
    private final long zzbdb;

    public zzmi(long j, boolean z) {
        this(j, j, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final int zzep() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final int zzeq() {
        return 1;
    }

    private zzmi(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.zzbcy = j;
        this.zzbcz = j2;
        this.zzbda = 0L;
        this.zzbdb = 0L;
        this.zzags = z;
        this.zzagt = false;
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final zzhd zza(int i, zzhd zzhdVar, boolean z, long j) {
        zznr.zzc(i, 0, 1);
        boolean z2 = this.zzags;
        long j2 = this.zzbcz;
        zzhdVar.zzagg = null;
        zzhdVar.zzagq = -9223372036854775807L;
        zzhdVar.zzagr = -9223372036854775807L;
        zzhdVar.zzags = z2;
        zzhdVar.zzagt = false;
        zzhdVar.zzagw = 0L;
        zzhdVar.zzagh = j2;
        zzhdVar.zzagu = 0;
        zzhdVar.zzagv = 0;
        zzhdVar.zzagx = 0L;
        return zzhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final zzha zza(int i, zzha zzhaVar, boolean z) {
        zznr.zzc(i, 0, 1);
        Object obj = z ? zzbcx : null;
        return zzhaVar.zza(obj, obj, 0, this.zzbcy, 0L, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final int zzc(Object obj) {
        return zzbcx.equals(obj) ? 0 : -1;
    }
}
