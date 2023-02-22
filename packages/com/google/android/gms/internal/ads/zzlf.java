package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzlf implements zzmg {
    private final zzmg[] zzazr;

    public zzlf(zzmg[] zzmgVarArr) {
        this.zzazr = zzmgVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final long zzgz() {
        long j = Long.MAX_VALUE;
        for (zzmg zzmgVar : this.zzazr) {
            long zzgz = zzmgVar.zzgz();
            if (zzgz != Long.MIN_VALUE) {
                j = Math.min(j, zzgz);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final boolean zzdy(long j) {
        zzmg[] zzmgVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzgz = zzgz();
            if (zzgz == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzmg zzmgVar : this.zzazr) {
                if (zzmgVar.zzgz() == zzgz) {
                    z |= zzmgVar.zzdy(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
