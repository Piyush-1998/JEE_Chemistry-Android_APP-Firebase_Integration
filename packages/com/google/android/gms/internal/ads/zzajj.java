package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzajj<I, O> implements zzdcj<I, O> {
    private final zzair<O> zzdbe;
    private final zzaiq<I> zzdbf;
    private final String zzdbg;
    private final zzddi<zzail> zzdbl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajj(zzddi<zzail> zzddiVar, String str, zzaiq<I> zzaiqVar, zzair<O> zzairVar) {
        this.zzdbl = zzddiVar;
        this.zzdbg = str;
        this.zzdbf = zzaiqVar;
        this.zzdbe = zzairVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final zzddi<O> zzf(final I i) throws Exception {
        return zzdcy.zzb(this.zzdbl, new zzdcj(this, i) { // from class: com.google.android.gms.internal.ads.zzaji
            private final zzajj zzdbo;
            private final Object zzdbp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdbo = this;
                this.zzdbp = i;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzdbo.zza(this.zzdbp, (zzail) obj);
            }
        }, zzaxn.zzdwn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(Object obj, zzail zzailVar) throws Exception {
        zzaxv zzaxvVar = new zzaxv();
        com.google.android.gms.ads.internal.zzq.zzkj();
        String zzvm = zzaul.zzvm();
        zzaea.zzcxs.zza(zzvm, new zzajl(this, zzaxvVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", zzvm);
        jSONObject.put("args", this.zzdbf.zzj(obj));
        zzailVar.zza(this.zzdbg, jSONObject);
        return zzaxvVar;
    }
}
