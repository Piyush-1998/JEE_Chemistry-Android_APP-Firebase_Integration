package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzje extends zzgf implements zzgh {
    protected final zzjg zzkz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzje(zzjg zzjgVar) {
        super(zzjgVar.zzjt());
        Preconditions.checkNotNull(zzjgVar);
        this.zzkz = zzjgVar;
    }

    public zzfd zzgz() {
        return this.zzkz.zzgz();
    }

    public zzx zzgy() {
        return this.zzkz.zzgy();
    }

    public zzp zzgx() {
        return this.zzkz.zzgx();
    }

    public zzjo zzgw() {
        return this.zzkz.zzgw();
    }
}
