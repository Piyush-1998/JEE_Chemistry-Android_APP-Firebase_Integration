package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaub implements Runnable {
    private final /* synthetic */ zzauc zzdrx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaub(zzauc zzaucVar) {
        this.zzdrx = zzaucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdrx.thread = Thread.currentThread();
        this.zzdrx.zzsx();
    }
}
