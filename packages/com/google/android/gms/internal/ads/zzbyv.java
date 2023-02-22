package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyv extends VideoController.VideoLifecycleCallbacks {
    private final zzbur zzfjl;

    public zzbyv(zzbur zzburVar) {
        this.zzfjl = zzburVar;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzws zza = zza(this.zzfjl);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoStart();
        } catch (RemoteException e) {
            zzaug.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzws zza = zza(this.zzfjl);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoPause();
        } catch (RemoteException e) {
            zzaug.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzws zza = zza(this.zzfjl);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoEnd();
        } catch (RemoteException e) {
            zzaug.zzd("Unable to call onVideoEnd()", e);
        }
    }

    private static zzws zza(zzbur zzburVar) {
        zzwr videoController = zzburVar.getVideoController();
        if (videoController == null) {
            return null;
        }
        try {
            return videoController.zzoz();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
