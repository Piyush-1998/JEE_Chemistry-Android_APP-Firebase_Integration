package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaiy<I, O> implements zzaip<I, O> {
    private final zzahn zzdbd;
    private final zzair<O> zzdbe;
    private final zzaiq<I> zzdbf;
    private final String zzdbg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiy(zzahn zzahnVar, String str, zzaiq<I> zzaiqVar, zzair<O> zzairVar) {
        this.zzdbd = zzahnVar;
        this.zzdbg = str;
        this.zzdbf = zzaiqVar;
        this.zzdbe = zzairVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaip
    public final zzddi<O> zzi(I i) {
        zzaxv zzaxvVar = new zzaxv();
        zzaia zzb = this.zzdbd.zzb((zzdf) null);
        zzb.zza(new zzajb(this, zzb, i, zzaxvVar), new zzaja(this, zzaxvVar, zzb));
        return zzaxvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaia zzaiaVar, zzail zzailVar, I i, zzaxv<O> zzaxvVar) {
        try {
            com.google.android.gms.ads.internal.zzq.zzkj();
            String zzvm = zzaul.zzvm();
            zzaea.zzcxs.zza(zzvm, new zzajd(this, zzaiaVar, zzaxvVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zzvm);
            jSONObject.put("args", this.zzdbf.zzj(i));
            zzailVar.zza(this.zzdbg, jSONObject);
        } catch (Exception e) {
            try {
                zzaxvVar.setException(e);
                zzaug.zzc("Unable to invokeJavascript", e);
            } finally {
                zzaiaVar.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final zzddi<O> zzf(I i) throws Exception {
        return zzi(i);
    }
}
