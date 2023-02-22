package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyh {
    private final zzbcb zzbmi;
    private final zzaxl zzdio;
    private final zzdf zzegb;
    private final Executor zzfbx;
    private final com.google.android.gms.ads.internal.zza zzfop;
    private final zzbym zzfpp = new zzbym(null);
    private final zzaex zzfpq = new zzaex();
    private zzddi<zzbbw> zzfpr;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyh(zzbyr zzbyrVar) {
        this.zzlk = zzbyr.zza(zzbyrVar);
        this.zzfbx = zzbyr.zzb(zzbyrVar);
        this.zzegb = zzbyr.zzc(zzbyrVar);
        this.zzdio = zzbyr.zzd(zzbyrVar);
        this.zzfop = zzbyr.zze(zzbyrVar);
        this.zzbmi = zzbyr.zzf(zzbyrVar);
    }

    public final synchronized void zzajg() {
        zzddi<zzbbw> zzb = zzdcy.zzb(zzbcb.zza(this.zzlk, this.zzdio, (String) zzuv.zzon().zzd(zzza.zzcoa), this.zzegb, this.zzfop), new zzdal(this) { // from class: com.google.android.gms.internal.ads.zzbyg
            private final zzbyh zzfpo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpo = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj) {
                return this.zzfpo.zzm((zzbbw) obj);
            }
        }, this.zzfbx);
        this.zzfpr = zzb;
        zzaxr.zza(zzb, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void destroy() {
        if (this.zzfpr == null) {
            return;
        }
        zzdcy.zza(this.zzfpr, new zzbyi(this), this.zzfbx);
        this.zzfpr = null;
    }

    public final synchronized zzddi<JSONObject> zzc(final String str, final JSONObject jSONObject) {
        if (this.zzfpr == null) {
            return zzdcy.zzah(null);
        }
        return zzdcy.zzb(this.zzfpr, new zzdcj(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.zzbyj
            private final String zzcyz;
            private final zzbyh zzfpo;
            private final JSONObject zzfps;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpo = this;
                this.zzcyz = str;
                this.zzfps = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfpo.zza(this.zzcyz, this.zzfps, (zzbbw) obj);
            }
        }, this.zzfbx);
    }

    public final synchronized void zza(String str, zzaer<Object> zzaerVar) {
        if (this.zzfpr == null) {
            return;
        }
        zzdcy.zza(this.zzfpr, new zzbyl(this, str, zzaerVar), this.zzfbx);
    }

    public final synchronized void zzb(String str, zzaer<Object> zzaerVar) {
        if (this.zzfpr == null) {
            return;
        }
        zzdcy.zza(this.zzfpr, new zzbyk(this, str, zzaerVar), this.zzfbx);
    }

    public final synchronized void zza(String str, Map<String, ?> map) {
        if (this.zzfpr == null) {
            return;
        }
        zzdcy.zza(this.zzfpr, new zzbyn(this, str, map), this.zzfbx);
    }

    public final <T> void zza(WeakReference<T> weakReference, String str, zzaer<T> zzaerVar) {
        zza(str, new zzbyq(this, weakReference, str, zzaerVar, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(String str, JSONObject jSONObject, zzbbw zzbbwVar) throws Exception {
        return this.zzfpq.zza(zzbbwVar, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbw zzm(zzbbw zzbbwVar) {
        zzbbwVar.zza("/result", this.zzfpq);
        zzbdg zzzp = zzbbwVar.zzzp();
        zzbym zzbymVar = this.zzfpp;
        zzzp.zza(null, zzbymVar, zzbymVar, zzbymVar, zzbymVar, false, null, new com.google.android.gms.ads.internal.zzc(this.zzlk, null, null), null, null);
        return zzbbwVar;
    }
}
