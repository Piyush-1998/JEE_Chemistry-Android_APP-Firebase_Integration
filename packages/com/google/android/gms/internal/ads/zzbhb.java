package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhb implements zzbnm {
    private final zzcwm zzfbf;

    public zzbhb(zzcwm zzcwmVar) {
        this.zzfbf = zzcwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbu(Context context) {
        try {
            this.zzfbf.pause();
        } catch (zzcwh e) {
            zzaug.zzd("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbv(Context context) {
        try {
            this.zzfbf.resume();
            if (context != null) {
                this.zzfbf.onContextChanged(context);
            }
        } catch (zzcwh e) {
            zzaug.zzd("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbw(Context context) {
        try {
            this.zzfbf.destroy();
        } catch (zzcwh e) {
            zzaug.zzd("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
