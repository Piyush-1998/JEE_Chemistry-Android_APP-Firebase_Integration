package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzatw {
    private final Object lock;
    private volatile int zzdrh;
    private volatile long zzdri;

    private zzatw() {
        this.lock = new Object();
        this.zzdrh = zzatv.zzdrd;
        this.zzdri = 0L;
    }

    public final void zzud() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzdrh == zzatv.zzdrf) {
                if (this.zzdri + ((Long) zzuv.zzon().zzd(zzza.zzcsl)).longValue() <= currentTimeMillis) {
                    this.zzdrh = zzatv.zzdrd;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzdrh != 2) {
                return;
            }
            this.zzdrh = 3;
            if (this.zzdrh == zzatv.zzdrf) {
                this.zzdri = currentTimeMillis2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzatw(zzatt zzattVar) {
        this();
    }
}
