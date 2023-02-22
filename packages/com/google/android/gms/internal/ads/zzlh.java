package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzlh implements Runnable {
    private final /* synthetic */ zzli zzazs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlh(zzli zzliVar) {
        this.zzazs = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzazs.zzhf();
    }
}
