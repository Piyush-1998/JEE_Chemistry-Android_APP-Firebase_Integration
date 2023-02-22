package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@Deprecated
/* loaded from: classes.dex */
public class zzayc<T> {
    private final zzaxv<T> zzdwv = new zzaxv<>();
    private final AtomicInteger zzdww = new AtomicInteger(0);

    public zzayc() {
        zzdcy.zza(this.zzdwv, new zzayb(this), zzaxn.zzdwn);
    }

    @Deprecated
    public final void zza(zzaxz<T> zzaxzVar, zzaxx zzaxxVar) {
        zzdcy.zza(this.zzdwv, new zzaye(this, zzaxzVar, zzaxxVar), zzaxn.zzdwn);
    }

    @Deprecated
    public final void zzm(T t) {
        this.zzdwv.set(t);
    }

    @Deprecated
    public final void reject() {
        this.zzdwv.setException(new Exception());
    }

    @Deprecated
    public final int getStatus() {
        return this.zzdww.get();
    }
}
