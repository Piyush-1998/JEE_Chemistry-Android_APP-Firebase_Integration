package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhj {
    private final Handler handler;
    private final zzhg zzahe;

    public zzhj(Handler handler, zzhg zzhgVar) {
        this.handler = zzhgVar != null ? (Handler) zznr.checkNotNull(handler) : null;
        this.zzahe = zzhgVar;
    }

    public final void zzc(zzil zzilVar) {
        if (this.zzahe != null) {
            this.handler.post(new zzhi(this, zzilVar));
        }
    }

    public final void zzb(String str, long j, long j2) {
        if (this.zzahe != null) {
            this.handler.post(new zzhl(this, str, j, j2));
        }
    }

    public final void zzc(zzgo zzgoVar) {
        if (this.zzahe != null) {
            this.handler.post(new zzhk(this, zzgoVar));
        }
    }

    public final void zzb(int i, long j, long j2) {
        if (this.zzahe != null) {
            this.handler.post(new zzhn(this, i, j, j2));
        }
    }

    public final void zzd(zzil zzilVar) {
        if (this.zzahe != null) {
            this.handler.post(new zzhm(this, zzilVar));
        }
    }

    public final void zzr(int i) {
        if (this.zzahe != null) {
            this.handler.post(new zzhp(this, i));
        }
    }
}
