package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzajd implements zzaez {
    private final /* synthetic */ zzaiy zzdbj;
    private final zzaia zzdbm;
    private final zzaxv<O> zzdbn;

    public zzajd(zzaiy zzaiyVar, zzaia zzaiaVar, zzaxv<O> zzaxvVar) {
        this.zzdbj = zzaiyVar;
        this.zzdbm = zzaiaVar;
        this.zzdbn = zzaxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzc(JSONObject jSONObject) {
        zzair zzairVar;
        try {
            try {
                zzaxv<O> zzaxvVar = this.zzdbn;
                zzairVar = this.zzdbj.zzdbe;
                zzaxvVar.set(zzairVar.zzd(jSONObject));
                this.zzdbm.release();
            } catch (IllegalStateException unused) {
                this.zzdbm.release();
            } catch (JSONException e) {
                this.zzdbn.setException(e);
                this.zzdbm.release();
            }
        } catch (Throwable th) {
            this.zzdbm.release();
            throw th;
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
        } finally {
            this.zzdbm.release();
        }
    }
}
