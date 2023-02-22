package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzod implements zznv {
    private boolean started;
    private zzgu zzadh = zzgu.zzafz;
    private long zzbgr;
    private long zzbgs;

    public final void start() {
        if (this.started) {
            return;
        }
        this.zzbgs = SystemClock.elapsedRealtime();
        this.started = true;
    }

    public final void stop() {
        if (this.started) {
            zzef(zzfj());
            this.started = false;
        }
    }

    public final void zzef(long j) {
        this.zzbgr = j;
        if (this.started) {
            this.zzbgs = SystemClock.elapsedRealtime();
        }
    }

    public final void zza(zznv zznvVar) {
        zzef(zznvVar.zzfj());
        this.zzadh = zznvVar.zzfc();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final long zzfj() {
        long zzdo;
        long j = this.zzbgr;
        if (this.started) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzbgs;
            if (this.zzadh.zzaga == 1.0f) {
                zzdo = zzga.zzdh(elapsedRealtime);
            } else {
                zzdo = this.zzadh.zzdo(elapsedRealtime);
            }
            return j + zzdo;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzgu zzb(zzgu zzguVar) {
        if (this.started) {
            zzef(zzfj());
        }
        this.zzadh = zzguVar;
        return zzguVar;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzgu zzfc() {
        return this.zzadh;
    }
}
