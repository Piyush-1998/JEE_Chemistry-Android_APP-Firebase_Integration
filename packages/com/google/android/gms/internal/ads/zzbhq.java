package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhq implements zzdwb<zzpe> {
    private final zzdwo<JSONObject> zzetw;
    private final zzdwo<zzcvr> zzfcp;
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<String> zzfcr;

    private zzbhq(zzdwo<zzcvr> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<JSONObject> zzdwoVar3, zzdwo<String> zzdwoVar4) {
        this.zzfcp = zzdwoVar;
        this.zzfcq = zzdwoVar2;
        this.zzetw = zzdwoVar3;
        this.zzfcr = zzdwoVar4;
    }

    public static zzbhq zza(zzdwo<zzcvr> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<JSONObject> zzdwoVar3, zzdwo<String> zzdwoVar4) {
        return new zzbhq(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        this.zzfcp.get();
        zzaxl zzaxlVar = this.zzfcq.get();
        JSONObject jSONObject = this.zzetw.get();
        String str = this.zzfcr.get();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzq.zzkj();
        return (zzpe) zzdwh.zza(new zzpe(zzaul.zzvm(), zzaxlVar, str, jSONObject, false, equals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
