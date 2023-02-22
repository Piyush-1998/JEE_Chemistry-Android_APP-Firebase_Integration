package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbrl extends zzbpm<VideoController.VideoLifecycleCallbacks> {
    private boolean zzehn;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbrl(Set<zzbqs<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void onVideoPause() {
        zza(zzbrk.zzfgz);
    }

    public final void onVideoEnd() {
        zza(zzbrn.zzfgz);
    }

    public final synchronized void onVideoStart() {
        zza(zzbrm.zzfgz);
        this.zzehn = true;
    }

    public final synchronized void onVideoPlay() {
        if (!this.zzehn) {
            zza(zzbrp.zzfgz);
            this.zzehn = true;
        }
        zza(zzbro.zzfgz);
    }
}
