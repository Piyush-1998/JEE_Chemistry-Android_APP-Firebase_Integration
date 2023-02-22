package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaia extends zzayc<zzail> {
    private final Object lock = new Object();
    private final zzaie zzdaj;
    private boolean zzdak;

    public zzaia(zzaie zzaieVar) {
        this.zzdaj = zzaieVar;
    }

    public final void release() {
        synchronized (this.lock) {
            if (this.zzdak) {
                return;
            }
            this.zzdak = true;
            zza(new zzaid(this), new zzaya());
            zza(new zzaic(this), new zzaif(this));
        }
    }
}
