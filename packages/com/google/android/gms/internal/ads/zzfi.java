package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzfi implements Runnable {
    private final /* synthetic */ zzfj zzaai;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfi(zzfj zzfjVar) {
        this.zzaai = zzfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaai.zzcy();
    }
}
