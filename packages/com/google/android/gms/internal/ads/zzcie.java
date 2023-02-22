package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcie implements zzcge<zzcwm, zzchk> {
    private final zzchm zzfsy;

    public zzcie(zzchm zzchmVar) {
        this.zzfsy = zzchmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzcgf<zzcwm, zzchk> zzd(String str, JSONObject jSONObject) throws zzcwh {
        zzcwm zze = this.zzfsy.zze(str, jSONObject);
        if (zze == null) {
            return null;
        }
        return new zzcgf<>(zze, new zzchk(), str);
    }
}
