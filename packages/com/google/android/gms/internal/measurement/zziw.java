package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zziw {
    protected volatile int zzaow = -1;

    public abstract zziw zza(zzil zzilVar) throws IOException;

    public void zza(zzio zzioVar) throws IOException {
    }

    protected int zzqy() {
        return 0;
    }

    public final int zzuk() {
        int zzqy = zzqy();
        this.zzaow = zzqy;
        return zzqy;
    }

    public String toString() {
        return zziv.zzb(this);
    }

    @Override // 
    /* renamed from: zzxb */
    public zziw clone() throws CloneNotSupportedException {
        return (zziw) super.clone();
    }
}
