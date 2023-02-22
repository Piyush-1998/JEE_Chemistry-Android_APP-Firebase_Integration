package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbuw implements zzdwb<zzbuu> {
    private final zzdwo<JSONObject> zzetu;
    private final zzdwo<zzcvr> zzfcp;

    public zzbuw(zzdwo<zzcvr> zzdwoVar, zzdwo<JSONObject> zzdwoVar2) {
        this.zzfcp = zzdwoVar;
        this.zzetu = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbuu(this.zzfcp.get(), this.zzetu.get());
    }
}
