package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjb implements Runnable {
    private final /* synthetic */ long zzcd;
    private final /* synthetic */ zziw zzsi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjb(zziw zziwVar, long j) {
        this.zzsi = zziwVar;
        this.zzcd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzsi.zzaa(this.zzcd);
    }
}
