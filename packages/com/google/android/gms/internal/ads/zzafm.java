package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafm implements Runnable {
    private final /* synthetic */ zzafl zzcym;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafm(zzafl zzaflVar) {
        this.zzcym = zzaflVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcym.disconnect();
    }
}
