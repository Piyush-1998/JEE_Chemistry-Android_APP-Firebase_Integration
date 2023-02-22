package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbph implements zzdwb<zzbpf> {
    private final zzdwo<Set<zzbqs<AppEventListener>>> zzfed;

    private zzbph(zzdwo<Set<zzbqs<AppEventListener>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbph zzp(zzdwo<Set<zzbqs<AppEventListener>>> zzdwoVar) {
        return new zzbph(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbpf(this.zzfed.get());
    }
}
