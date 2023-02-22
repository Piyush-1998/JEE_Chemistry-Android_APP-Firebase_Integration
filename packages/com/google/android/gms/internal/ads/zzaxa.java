package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
final class zzaxa extends Thread {
    private final /* synthetic */ String zzduo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxa(zzawx zzawxVar, String str) {
        this.zzduo = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzaxm().zzei(this.zzduo);
    }
}
