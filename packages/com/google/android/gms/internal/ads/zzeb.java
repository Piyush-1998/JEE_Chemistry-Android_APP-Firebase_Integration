package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzeb implements Runnable {
    private final /* synthetic */ zzdx zzyj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeb(zzdx zzdxVar) {
        this.zzyj = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzza.initialize(this.zzyj.zzlk);
    }
}
