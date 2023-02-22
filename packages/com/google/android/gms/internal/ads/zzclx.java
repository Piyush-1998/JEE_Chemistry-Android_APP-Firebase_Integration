package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclx extends zzamh {
    private final String zzcyn;
    private final zzamd zzgbl;
    private zzaxv<JSONObject> zzgbm;
    private final JSONObject zzgbn;
    private boolean zzgbo;

    public zzclx(String str, zzamd zzamdVar, zzaxv<JSONObject> zzaxvVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzgbn = jSONObject;
        this.zzgbo = false;
        this.zzgbm = zzaxvVar;
        this.zzcyn = str;
        this.zzgbl = zzamdVar;
        try {
            jSONObject.put("adapter_version", zzamdVar.zzsg().toString());
            this.zzgbn.put("sdk_version", this.zzgbl.zzsh().toString());
            this.zzgbn.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzcyn);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final synchronized void zzdi(String str) throws RemoteException {
        if (this.zzgbo) {
            return;
        }
        if (str == null) {
            onFailure("Adapter returned null signals");
            return;
        }
        try {
            this.zzgbn.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzgbm.set(this.zzgbn);
        this.zzgbo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final synchronized void onFailure(String str) throws RemoteException {
        if (this.zzgbo) {
            return;
        }
        try {
            this.zzgbn.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzgbm.set(this.zzgbn);
        this.zzgbo = true;
    }
}
