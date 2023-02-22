package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazd implements Runnable {
    private final /* synthetic */ zzayr zzdyx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazd(zzaze zzazeVar, zzayr zzayrVar) {
        this.zzdyx = zzayrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdyx.zzwz();
    }
}
