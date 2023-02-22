package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbad implements zzgs {
    private int zzbfh;
    private final zzni zzecc;
    private long zzecd;
    private long zzece;
    private long zzecf;
    private long zzecg;
    private boolean zzech;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbad() {
        this(15000, 30000, 2500L, 5000L);
    }

    private zzbad(int i, int i2, long j, long j2) {
        this.zzecc = new zzni(true, 65536);
        this.zzecd = 15000000L;
        this.zzece = 30000000L;
        this.zzecf = 2500000L;
        this.zzecg = 5000000L;
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zzel() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zza(zzgx[] zzgxVarArr, zzmk zzmkVar, zzmv zzmvVar) {
        this.zzbfh = 0;
        for (int i = 0; i < zzgxVarArr.length; i++) {
            if (zzmvVar.zzax(i) != null) {
                this.zzbfh += zzof.zzbk(zzgxVarArr[i].getTrackType());
            }
        }
        this.zzecc.zzba(this.zzbfh);
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void onStopped() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zzem() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final zznc zzen() {
        return this.zzecc;
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final synchronized boolean zzc(long j, boolean z) {
        long j2;
        j2 = z ? this.zzecg : this.zzecf;
        return j2 <= 0 || j >= j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final synchronized boolean zzdn(long j) {
        boolean z;
        char c;
        z = false;
        if (j > this.zzece) {
            c = 0;
        } else {
            c = j < this.zzecd ? (char) 2 : (char) 1;
        }
        boolean z2 = this.zzecc.zzid() >= this.zzbfh;
        if (c == 2 || (c == 1 && this.zzech && !z2)) {
            z = true;
        }
        this.zzech = z;
        return z;
    }

    public final synchronized void zzcz(int i) {
        this.zzecd = i * 1000;
    }

    public final synchronized void zzda(int i) {
        this.zzece = i * 1000;
    }

    public final synchronized void zzcu(int i) {
        this.zzecf = i * 1000;
    }

    public final synchronized void zzcv(int i) {
        this.zzecg = i * 1000;
    }

    private final void zzj(boolean z) {
        this.zzbfh = 0;
        this.zzech = false;
        if (z) {
            this.zzecc.reset();
        }
    }
}
