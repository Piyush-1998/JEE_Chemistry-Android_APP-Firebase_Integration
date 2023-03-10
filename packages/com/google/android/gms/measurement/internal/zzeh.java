package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzeh {
    private final int priority;
    private final /* synthetic */ zzef zzkf;
    private final boolean zzks;
    private final boolean zzkt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeh(zzef zzefVar, int i, boolean z, boolean z2) {
        this.zzkf = zzefVar;
        this.priority = i;
        this.zzks = z;
        this.zzkt = z2;
    }

    public final void zzao(String str) {
        this.zzkf.zza(this.priority, this.zzks, this.zzkt, str, null, null, null);
    }

    public final void zza(String str, Object obj) {
        this.zzkf.zza(this.priority, this.zzks, this.zzkt, str, obj, null, null);
    }

    public final void zza(String str, Object obj, Object obj2) {
        this.zzkf.zza(this.priority, this.zzks, this.zzkt, str, obj, obj2, null);
    }

    public final void zza(String str, Object obj, Object obj2, Object obj3) {
        this.zzkf.zza(this.priority, this.zzks, this.zzkt, str, obj, obj2, obj3);
    }
}
