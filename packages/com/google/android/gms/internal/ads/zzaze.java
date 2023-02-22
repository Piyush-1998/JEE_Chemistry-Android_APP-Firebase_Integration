package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaze {
    private long zzdyz;
    private final long zzdyy = TimeUnit.MILLISECONDS.toNanos(((Long) zzuv.zzon().zzd(zzza.zzchq)).longValue());
    private boolean zzdza = true;

    public final void zzww() {
        this.zzdza = true;
    }

    public final void zza(SurfaceTexture surfaceTexture, zzayr zzayrVar) {
        if (zzayrVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzdza || Math.abs(timestamp - this.zzdyz) >= this.zzdyy) {
            this.zzdza = false;
            this.zzdyz = timestamp;
            zzaul.zzdsu.post(new zzazd(this, zzayrVar));
        }
    }
}
