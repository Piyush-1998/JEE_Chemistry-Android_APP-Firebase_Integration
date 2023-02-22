package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbwi implements zzdwb<zzbqs<VideoController.VideoLifecycleCallbacks>> {
    private final zzdwo<zzbyv> zzfcs;
    private final zzdwo<Executor> zzfdx;
    private final zzbwc zzfnv;

    public zzbwi(zzbwc zzbwcVar, zzdwo<zzbyv> zzdwoVar, zzdwo<Executor> zzdwoVar2) {
        this.zzfnv = zzbwcVar;
        this.zzfcs = zzdwoVar;
        this.zzfdx = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqs) zzdwh.zza(new zzbqs(this.zzfcs.get(), this.zzfdx.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
