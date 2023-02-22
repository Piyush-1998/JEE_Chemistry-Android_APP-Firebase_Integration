package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzb implements Runnable {
    private final /* synthetic */ String zzbb;
    private final /* synthetic */ long zzcb;
    private final /* synthetic */ zza zzcc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(zza zzaVar, String str, long j) {
        this.zzcc = zzaVar;
        this.zzbb = str;
        this.zzcb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcc.zzb(this.zzbb, this.zzcb);
    }
}
