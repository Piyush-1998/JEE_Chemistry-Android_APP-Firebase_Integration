package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbrr implements zzdwb<zzbrl> {
    private final zzdwo<Set<zzbqs<VideoController.VideoLifecycleCallbacks>>> zzfed;

    private zzbrr(zzdwo<Set<zzbqs<VideoController.VideoLifecycleCallbacks>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbrr zzt(zzdwo<Set<zzbqs<VideoController.VideoLifecycleCallbacks>>> zzdwoVar) {
        return new zzbrr(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbrl(this.zzfed.get());
    }
}
