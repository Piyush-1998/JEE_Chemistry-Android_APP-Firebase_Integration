package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzayl implements Runnable {
    private final /* synthetic */ zzayh zzdxr;
    private final /* synthetic */ String zzdxt;
    private final /* synthetic */ String zzdxu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayl(zzayh zzayhVar, String str, String str2) {
        this.zzdxr = zzayhVar;
        this.zzdxt = str;
        this.zzdxu = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayr zzayrVar;
        zzayr zzayrVar2;
        zzayrVar = this.zzdxr.zzdxp;
        if (zzayrVar != null) {
            zzayrVar2 = this.zzdxr.zzdxp;
            zzayrVar2.zzn(this.zzdxt, this.zzdxu);
        }
    }
}
