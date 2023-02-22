package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazl implements Runnable {
    private boolean zzbpd = false;
    private zzayw zzdyw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazl(zzayw zzaywVar) {
        this.zzdyw = zzaywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbpd) {
            return;
        }
        this.zzdyw.zzxd();
        zzxv();
    }

    public final void pause() {
        this.zzbpd = true;
        this.zzdyw.zzxd();
    }

    public final void resume() {
        this.zzbpd = false;
        zzxv();
    }

    private final void zzxv() {
        zzaul.zzdsu.removeCallbacks(this);
        zzaul.zzdsu.postDelayed(this, 250L);
    }
}
