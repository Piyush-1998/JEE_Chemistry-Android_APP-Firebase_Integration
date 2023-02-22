package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zziu implements zzjb {
    private final int length;
    private final long zzagh;
    private final int[] zzamu;
    private final long[] zzamv;
    private final long[] zzamw;
    private final long[] zzamx;

    public zziu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzamu = iArr;
        this.zzamv = jArr;
        this.zzamw = jArr2;
        this.zzamx = jArr3;
        int length = iArr.length;
        this.length = length;
        if (length > 0) {
            this.zzagh = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.zzagh = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzgc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long getDurationUs() {
        return this.zzagh;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zzdt(long j) {
        return this.zzamv[zzof.zza(this.zzamx, j, true, true)];
    }
}
