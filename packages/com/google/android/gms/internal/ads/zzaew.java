package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaew implements zzaez {
    private final /* synthetic */ zzaxv zzcyd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaew(zzaex zzaexVar, zzaxv zzaxvVar) {
        this.zzcyd = zzaxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzc(JSONObject jSONObject) {
        this.zzcyd.set(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void onFailure(String str) {
        this.zzcyd.setException(new zzaim(str));
    }
}
