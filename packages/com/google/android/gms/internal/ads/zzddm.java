package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzddm implements Runnable {
    private final /* synthetic */ Runnable zzgrt;
    private final /* synthetic */ zzddn zzgru;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddm(zzddn zzddnVar, Runnable runnable) {
        this.zzgru = zzddnVar;
        this.zzgrt = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgru.zzgrv = false;
        this.zzgrt.run();
    }
}
