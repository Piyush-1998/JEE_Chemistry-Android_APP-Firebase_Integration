package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzauc {
    private volatile Thread thread;
    private final Runnable zzdry = new zzaub(this);
    private boolean zzdrz = false;

    public abstract void zzsx();

    public final zzddi<?> zzut() {
        return zzaxn.zzdwj.zzf(this.zzdry);
    }
}
