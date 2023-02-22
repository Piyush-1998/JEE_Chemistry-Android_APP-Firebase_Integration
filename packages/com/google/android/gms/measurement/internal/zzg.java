package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzg extends zzd {
    private boolean zzdh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(zzfj zzfjVar) {
        super(zzfjVar);
        this.zzj.zzb(this);
    }

    protected abstract boolean zzbk();

    protected void zzbl() {
    }

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
        if (zzbk()) {
            return;
        }
        this.zzj.zzid();
        this.zzdh = true;
    }

    public final void zzbj() {
        if (this.zzdh) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbl();
        this.zzj.zzid();
        this.zzdh = true;
    }
}
