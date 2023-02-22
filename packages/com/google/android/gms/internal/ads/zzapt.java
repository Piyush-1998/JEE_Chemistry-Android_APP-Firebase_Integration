package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzapt implements zzapi {
    private zzaip<JSONObject, JSONObject> zzdnr;
    private zzaip<JSONObject, JSONObject> zzdns;

    public zzapt(Context context) {
        this.zzdns = com.google.android.gms.ads.internal.zzq.zzkw().zza(context, zzaxl.zzwo()).zza("google.afma.request.getAdDictionary", zzais.zzday, zzais.zzday);
        this.zzdnr = com.google.android.gms.ads.internal.zzq.zzkw().zza(context, zzaxl.zzwo()).zza("google.afma.sdkConstants.getSdkConstants", zzais.zzday, zzais.zzday);
    }

    @Override // com.google.android.gms.internal.ads.zzapi
    public final zzaip<JSONObject, JSONObject> zztc() {
        return this.zzdnr;
    }
}
