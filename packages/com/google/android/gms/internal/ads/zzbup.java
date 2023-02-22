package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbup {
    private zzabh zzcwp;

    public zzbup(zzbuh zzbuhVar) {
        this.zzcwp = zzbuhVar;
    }

    public final synchronized zzabh zzqx() {
        return this.zzcwp;
    }

    public final synchronized void zza(zzabh zzabhVar) {
        this.zzcwp = zzabhVar;
    }
}
