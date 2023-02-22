package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzays implements Runnable {
    private final /* synthetic */ zzayh zzdxr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzays(zzayh zzayhVar) {
        this.zzdxr = zzayhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayr zzayrVar;
        zzayr zzayrVar2;
        zzayrVar = this.zzdxr.zzdxp;
        if (zzayrVar != null) {
            zzayrVar2 = this.zzdxr.zzdxp;
            zzayrVar2.onPaused();
        }
    }
}
