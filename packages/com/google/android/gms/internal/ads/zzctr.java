package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctr implements zzdwb<ApplicationInfo> {
    private final zzctp zzghp;

    public zzctr(zzctp zzctpVar) {
        this.zzghp = zzctpVar;
    }

    public static ApplicationInfo zzb(zzctp zzctpVar) {
        return (ApplicationInfo) zzdwh.zza(zzctpVar.zzamq(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzb(this.zzghp);
    }
}
