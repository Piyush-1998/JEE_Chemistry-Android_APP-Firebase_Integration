package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvp {
    private final Clock zzbmp;
    private final Object lock = new Object();
    private volatile int zzgix = zzcvs.zzgjq;
    private volatile long zzdri = 0;

    public zzcvp(Clock clock) {
        this.zzbmp = clock;
    }

    private final void zzq(int i, int i2) {
        zzamw();
        long currentTimeMillis = this.zzbmp.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzgix != i) {
                return;
            }
            this.zzgix = i2;
            if (this.zzgix == zzcvs.zzgjs) {
                this.zzdri = currentTimeMillis;
            }
        }
    }

    private final void zzamw() {
        long currentTimeMillis = this.zzbmp.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzgix == zzcvs.zzgjs) {
                if (this.zzdri + ((Long) zzuv.zzon().zzd(zzza.zzcsl)).longValue() <= currentTimeMillis) {
                    this.zzgix = zzcvs.zzgjq;
                }
            }
        }
    }

    public final void zzbd(boolean z) {
        if (z) {
            zzq(zzcvs.zzgjq, zzcvs.zzgjr);
        } else {
            zzq(zzcvs.zzgjr, zzcvs.zzgjq);
        }
    }

    public final boolean zzamx() {
        boolean z;
        synchronized (this.lock) {
            zzamw();
            z = this.zzgix == zzcvs.zzgjr;
        }
        return z;
    }

    public final boolean zzamy() {
        boolean z;
        synchronized (this.lock) {
            zzamw();
            z = this.zzgix == zzcvs.zzgjs;
        }
        return z;
    }

    public final void zzud() {
        zzq(zzcvs.zzgjr, zzcvs.zzgjs);
    }
}
