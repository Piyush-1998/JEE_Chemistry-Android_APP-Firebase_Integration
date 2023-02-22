package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzahi implements Runnable {
    private final /* synthetic */ zzahc zzczm;
    private final /* synthetic */ String zzczo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahi(zzahc zzahcVar, String str) {
        this.zzczm = zzahcVar;
        this.zzczo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbw zzbbwVar;
        zzbbwVar = this.zzczm.zzczi;
        zzbbwVar.loadUrl(this.zzczo);
    }
}
