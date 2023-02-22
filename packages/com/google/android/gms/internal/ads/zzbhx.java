package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhx implements zzpj {
    private final Clock zzbmp;
    private zzbbw zzczi;
    private final zzbhi zzfbu;
    private final Executor zzfbx;
    private boolean zzbsc = false;
    private boolean zzfcw = false;
    private zzbhm zzfbz = new zzbhm();

    public zzbhx(Executor executor, zzbhi zzbhiVar, Clock clock) {
        this.zzfbx = executor;
        this.zzfbu = zzbhiVar;
        this.zzbmp = clock;
    }

    private final void zzael() {
        try {
            final JSONObject zzj = this.zzfbu.zzj(this.zzfbz);
            if (this.zzczi != null) {
                this.zzfbx.execute(new Runnable(this, zzj) { // from class: com.google.android.gms.internal.ads.zzbhw
                    private final JSONObject zzfch;
                    private final zzbhx zzfcv;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfcv = this;
                        this.zzfch = zzj;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzfcv.zzh(this.zzfch);
                    }
                });
            }
        } catch (JSONException e) {
            zzaug.zza("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zza(zzpk zzpkVar) {
        this.zzfbz.zzbnp = this.zzfcw ? false : zzpkVar.zzbnp;
        this.zzfbz.timestamp = this.zzbmp.elapsedRealtime();
        this.zzfbz.zzfcg = zzpkVar;
        if (this.zzbsc) {
            zzael();
        }
    }

    public final void zzg(zzbbw zzbbwVar) {
        this.zzczi = zzbbwVar;
    }

    public final void disable() {
        this.zzbsc = false;
    }

    public final void enable() {
        this.zzbsc = true;
        zzael();
    }

    public final void zzax(boolean z) {
        this.zzfcw = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(JSONObject jSONObject) {
        this.zzczi.zza("AFMA_updateActiveView", jSONObject);
    }
}
