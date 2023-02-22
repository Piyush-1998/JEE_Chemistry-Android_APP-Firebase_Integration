package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbuu extends zzbuv {
    private final boolean zzdcl;
    private final boolean zzdcm;
    private final boolean zzdlo;
    private final JSONObject zzflv;
    private final boolean zzflw;

    public zzbuu(zzcvr zzcvrVar, JSONObject jSONObject) {
        super(zzcvrVar);
        boolean z = false;
        this.zzflv = zzawg.zza(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzdcm = zzawg.zza(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzdcl = zzawg.zza(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zzdlo = zzawg.zza(false, jSONObject, "enable_omid");
        if (jSONObject != null && jSONObject.optJSONObject("overlay") != null) {
            z = true;
        }
        this.zzflw = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final JSONObject zzaia() {
        JSONObject jSONObject = this.zzflv;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zzflx.zzdky);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final boolean zzaib() {
        return this.zzflw;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final boolean zzaic() {
        return this.zzdcm;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final boolean zzahl() {
        return this.zzdlo;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final boolean zzaid() {
        return this.zzdcl;
    }
}
