package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzjh extends zzje {
    private boolean zzdh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjh(zzjg zzjgVar) {
        super(zzjgVar);
        this.zzkz.zzb(this);
    }

    protected abstract boolean zzbk();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isInitialized() {
        return this.zzdh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbi() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void initialize() {
        if (this.zzdh) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbk();
        this.zzkz.zzjs();
        this.zzdh = true;
    }
}
