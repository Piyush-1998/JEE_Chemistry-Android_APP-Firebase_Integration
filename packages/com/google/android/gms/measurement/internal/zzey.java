package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzey implements Runnable {
    private final /* synthetic */ zzfj zzmu;
    private final /* synthetic */ zzef zzmv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzey(zzez zzezVar, zzfj zzfjVar, zzef zzefVar) {
        this.zzmu = zzfjVar;
        this.zzmv = zzefVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzmu.zzht() == null) {
            this.zzmv.zzgk().zzao("Install Referrer Reporter is null");
            return;
        }
        zzeu zzht = this.zzmu.zzht();
        zzht.zzj.zzm();
        zzht.zzat(zzht.zzj.getContext().getPackageName());
    }
}
