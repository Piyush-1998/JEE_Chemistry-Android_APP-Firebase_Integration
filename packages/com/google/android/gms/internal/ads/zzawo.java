package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzawo {
    private long zzdva;
    private long zzdvb = Long.MIN_VALUE;
    private final Object lock = new Object();

    public zzawo(long j) {
        this.zzdva = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
            if (this.zzdvb + this.zzdva > elapsedRealtime) {
                return false;
            }
            this.zzdvb = elapsedRealtime;
            return true;
        }
    }

    public final void zzev(long j) {
        synchronized (this.lock) {
            this.zzdva = j;
        }
    }
}
