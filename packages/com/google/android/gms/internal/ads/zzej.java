package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzej implements Runnable {
    private final /* synthetic */ zzeg zzzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzej(zzeg zzegVar) {
        this.zzzq = zzegVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzzq.zzct();
    }
}
