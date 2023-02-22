package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzgk {
    public final int index;
    private final zzgx[] zzacp;
    private final zzmy zzacq;
    public final zzls zzadm;
    public final Object zzadn;
    public final zzmd[] zzado;
    private final boolean[] zzadp;
    public final long zzadq;
    public int zzadr;
    public long zzads;
    public boolean zzadt;
    public boolean zzadu;
    public boolean zzadv;
    public zzgk zzadw;
    public zzna zzadx;
    private final zzgw[] zzady;
    private final zzgs zzadz;
    private final zzlu zzaea;
    private zzna zzaeb;

    public zzgk(zzgx[] zzgxVarArr, zzgw[] zzgwVarArr, long j, zzmy zzmyVar, zzgs zzgsVar, zzlu zzluVar, Object obj, int i, int i2, boolean z, long j2) {
        this.zzacp = zzgxVarArr;
        this.zzady = zzgwVarArr;
        this.zzadq = j;
        this.zzacq = zzmyVar;
        this.zzadz = zzgsVar;
        this.zzaea = zzluVar;
        this.zzadn = zznr.checkNotNull(obj);
        this.index = i;
        this.zzadr = i2;
        this.zzadt = z;
        this.zzads = j2;
        this.zzado = new zzmd[zzgxVarArr.length];
        this.zzadp = new boolean[zzgxVarArr.length];
        this.zzadm = zzluVar.zza(i2, zzgsVar.zzen());
    }

    public final long zzdz() {
        return this.zzadq - this.zzads;
    }

    public final void zzc(int i, boolean z) {
        this.zzadr = i;
        this.zzadt = z;
    }

    public final boolean zzea() {
        if (this.zzadu) {
            return !this.zzadv || this.zzadm.zzhd() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzeb() throws com.google.android.gms.internal.ads.zzgd {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzmy r0 = r6.zzacq
            com.google.android.gms.internal.ads.zzgw[] r1 = r6.zzady
            com.google.android.gms.internal.ads.zzls r2 = r6.zzadm
            com.google.android.gms.internal.ads.zzmk r2 = r2.zzhb()
            com.google.android.gms.internal.ads.zzna r0 = r0.zza(r1, r2)
            com.google.android.gms.internal.ads.zzna r1 = r6.zzaeb
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            goto L28
        L16:
            r4 = 0
        L17:
            com.google.android.gms.internal.ads.zzmv r5 = r0.zzbef
            int r5 = r5.length
            if (r4 >= r5) goto L27
            boolean r5 = r0.zza(r1, r4)
            if (r5 != 0) goto L24
            goto L14
        L24:
            int r4 = r4 + 1
            goto L17
        L27:
            r1 = 1
        L28:
            if (r1 == 0) goto L2b
            return r3
        L2b:
            r6.zzadx = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgk.zzeb():boolean");
    }

    public final long zzb(long j, boolean z) {
        return zza(j, false, new boolean[this.zzacp.length]);
    }

    public final long zza(long j, boolean z, boolean[] zArr) {
        zzmv zzmvVar = this.zzadx.zzbef;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzmvVar.length) {
                break;
            }
            boolean[] zArr2 = this.zzadp;
            if (z || !this.zzadx.zza(this.zzaeb, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zza = this.zzadm.zza(zzmvVar.zzhy(), this.zzadp, this.zzado, zArr, j);
        this.zzaeb = this.zzadx;
        this.zzadv = false;
        int i2 = 0;
        while (true) {
            zzmd[] zzmdVarArr = this.zzado;
            if (i2 < zzmdVarArr.length) {
                if (zzmdVarArr[i2] != null) {
                    zznr.checkState(zzmvVar.zzax(i2) != null);
                    this.zzadv = true;
                } else {
                    zznr.checkState(zzmvVar.zzax(i2) == null);
                }
                i2++;
            } else {
                this.zzadz.zza(this.zzacp, this.zzadx.zzbee, zzmvVar);
                return zza;
            }
        }
    }

    public final void release() {
        try {
            this.zzaea.zzb(this.zzadm);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
