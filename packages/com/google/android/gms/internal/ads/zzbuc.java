package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbuc implements zzdwb<zzpe> {
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<String> zzfcr;

    public zzbuc(zzdwo<zzaxl> zzdwoVar, zzdwo<String> zzdwoVar2) {
        this.zzfcq = zzdwoVar;
        this.zzfcr = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        com.google.android.gms.ads.internal.zzq.zzkj();
        return (zzpe) zzdwh.zza(new zzpe(zzaul.zzvm(), this.zzfcq.get(), this.zzfcr.get(), new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
