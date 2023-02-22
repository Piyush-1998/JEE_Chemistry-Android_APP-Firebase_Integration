package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbch implements Runnable {
    private final /* synthetic */ zzbci zzefv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbch(zzbci zzbciVar) {
        this.zzefv = zzbciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbw zzbbwVar;
        zzbbwVar = this.zzefv.zzefw;
        zzbbwVar.destroy();
    }
}
