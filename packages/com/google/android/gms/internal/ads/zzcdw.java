package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcdw {
    private final Executor executor;
    private final zzcwe zzfga;
    private final zzaxl zzfut;
    private final Context zzlk;

    public zzcdw(Context context, zzaxl zzaxlVar, zzcwe zzcweVar, Executor executor) {
        this.zzlk = context;
        this.zzfut = zzaxlVar;
        this.zzfga = zzcweVar;
        this.executor = executor;
    }

    public final zzddi<zzcvz> zzaki() {
        final zzaip zza = com.google.android.gms.ads.internal.zzq.zzkw().zzb(this.zzlk, this.zzfut).zza("google.afma.response.normalize", zzais.zzday, zzais.zzday);
        final zztr zztrVar = this.zzfga.zzgkg.zzcck;
        return zzdcy.zzb(zzdcy.zzb(zzdcy.zzb(zzdcy.zzah(""), new zzdcj(this, zztrVar) { // from class: com.google.android.gms.internal.ads.zzcdz
            private final zzcdw zzfuv;
            private final zztr zzfuw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuv = this;
                this.zzfuw = zztrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                zztr zztrVar2 = this.zzfuw;
                String str = (String) obj;
                String str2 = zztrVar2.zzcbt;
                String str3 = zztrVar2.zzcbu;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str2);
                jSONObject2.put("base_url", "");
                jSONObject2.put("signals", new JSONObject(str3));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return zzdcy.zzah(jSONObject);
            }
        }, this.executor), new zzdcj(zza) { // from class: com.google.android.gms.internal.ads.zzcdy
            private final zzaip zzfuu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuu = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfuu.zzi((JSONObject) obj);
            }
        }, this.executor), new zzdcj(this) { // from class: com.google.android.gms.internal.ads.zzceb
            private final zzcdw zzfuv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuv = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfuv.zzn((JSONObject) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzn(JSONObject jSONObject) throws Exception {
        return zzdcy.zzah(new zzcvz(new zzcvy(this.zzfga), zzcvx.zza(new StringReader(jSONObject.toString()))));
    }
}
