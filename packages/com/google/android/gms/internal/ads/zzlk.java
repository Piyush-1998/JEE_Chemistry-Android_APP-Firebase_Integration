package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzlk implements Runnable {
    private final /* synthetic */ zzli zzazs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlk(zzli zzliVar) {
        this.zzazs = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzlr zzlrVar;
        z = this.zzazs.zzaei;
        if (z) {
            return;
        }
        zzlrVar = this.zzazs.zzbaf;
        zzlrVar.zza((zzlr) this.zzazs);
    }
}
