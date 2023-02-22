package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzayn implements Runnable {
    private final /* synthetic */ zzayh zzdxr;
    private final /* synthetic */ int zzdxv;
    private final /* synthetic */ int zzdxw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayn(zzayh zzayhVar, int i, int i2) {
        this.zzdxr = zzayhVar;
        this.zzdxv = i;
        this.zzdxw = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayr zzayrVar;
        zzayr zzayrVar2;
        zzayrVar = this.zzdxr.zzdxp;
        if (zzayrVar != null) {
            zzayrVar2 = this.zzdxr.zzdxp;
            zzayrVar2.zzj(this.zzdxv, this.zzdxw);
        }
    }
}
