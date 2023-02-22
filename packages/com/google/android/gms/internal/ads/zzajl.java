package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzajl implements zzaez {
    private final zzaxv<O> zzdbn;
    private final /* synthetic */ zzajj zzdbq;

    public zzajl(zzajj zzajjVar, zzaxv<O> zzaxvVar) {
        this.zzdbq = zzajjVar;
        this.zzdbn = zzaxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzc(JSONObject jSONObject) {
        zzair zzairVar;
        try {
            zzaxv<O> zzaxvVar = this.zzdbn;
            zzairVar = this.zzdbq.zzdbe;
            zzaxvVar.set(zzairVar.zzd(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzdbn.setException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.zzdbn.setException(new zzaim());
            } else {
                this.zzdbn.setException(new zzaim(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
