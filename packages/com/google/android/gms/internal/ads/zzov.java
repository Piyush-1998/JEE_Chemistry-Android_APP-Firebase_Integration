package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzov {
    private final Handler handler;
    private final zzow zzbjf;

    public zzov(Handler handler, zzow zzowVar) {
        this.handler = zzowVar != null ? (Handler) zznr.checkNotNull(handler) : null;
        this.zzbjf = zzowVar;
    }

    public final void zzc(zzil zzilVar) {
        if (this.zzbjf != null) {
            this.handler.post(new zzoy(this, zzilVar));
        }
    }

    public final void zzb(String str, long j, long j2) {
        if (this.zzbjf != null) {
            this.handler.post(new zzox(this, str, j, j2));
        }
    }

    public final void zzc(zzgo zzgoVar) {
        if (this.zzbjf != null) {
            this.handler.post(new zzpa(this, zzgoVar));
        }
    }

    public final void zze(int i, long j) {
        if (this.zzbjf != null) {
            this.handler.post(new zzoz(this, i, j));
        }
    }

    public final void zza(int i, int i2, int i3, float f) {
        if (this.zzbjf != null) {
            this.handler.post(new zzpc(this, i, i2, i3, f));
        }
    }

    public final void zza(Surface surface) {
        if (this.zzbjf != null) {
            this.handler.post(new zzpb(this, surface));
        }
    }

    public final void zzd(zzil zzilVar) {
        if (this.zzbjf != null) {
            this.handler.post(new zzpd(this, zzilVar));
        }
    }
}
