package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzahj implements Runnable {
    private final /* synthetic */ String zzczl;
    private final /* synthetic */ zzahc zzczm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahj(zzahc zzahcVar, String str) {
        this.zzczm = zzahcVar;
        this.zzczl = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbw zzbbwVar;
        zzbbwVar = this.zzczm.zzczi;
        zzbbwVar.loadData(this.zzczl, "text/html", "UTF-8");
    }
}
