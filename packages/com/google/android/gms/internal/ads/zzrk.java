package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrk implements Runnable {
    private final /* synthetic */ zzrh zzbrg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrk(zzrh zzrhVar) {
        this.zzbrg = zzrhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbrg.disconnect();
    }
}
