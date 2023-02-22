package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzanf {
    private final boolean zzdgh;
    private final boolean zzdgi;
    private final boolean zzdgj;
    private final boolean zzdgk;
    private final boolean zzdgl;

    private zzanf(zzanh zzanhVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z = zzanhVar.zzdgh;
        this.zzdgh = z;
        z2 = zzanhVar.zzdgi;
        this.zzdgi = z2;
        z3 = zzanhVar.zzdgj;
        this.zzdgj = z3;
        z4 = zzanhVar.zzdgk;
        this.zzdgk = z4;
        z5 = zzanhVar.zzdgl;
        this.zzdgl = z5;
    }

    public final JSONObject toJson() {
        try {
            return new JSONObject().put("sms", this.zzdgh).put("tel", this.zzdgi).put("calendar", this.zzdgj).put("storePicture", this.zzdgk).put("inlineVideo", this.zzdgl);
        } catch (JSONException e) {
            zzaug.zzc("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
