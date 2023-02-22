package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcig implements zzcih<zzbuj> {
    private final zzddl zzfoa;
    private final zzbtl zzfyt;
    private final zzbwm zzfyu;

    public zzcig(zzbtl zzbtlVar, zzddl zzddlVar, zzbwm zzbwmVar) {
        this.zzfyt = zzbtlVar;
        this.zzfoa = zzddlVar;
        this.zzfyu = zzbwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return (zzcvrVar.zzgje == null || zzcvrVar.zzgje.zzfjj == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<List<zzddi<zzbuj>>> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar) {
        zzddi<zzbyh> zzanf = this.zzfyt.zzacc().zzanf();
        this.zzfyt.zzacc().zza(zzanf);
        return zzdcy.zzb(zzdcy.zzb(zzanf, new zzdcj(this, zzcvrVar) { // from class: com.google.android.gms.internal.ads.zzcij
            private final zzcvr zzfym;
            private final zzcig zzfyv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyv = this;
                this.zzfym = zzcvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfyv.zza(this.zzfym, (zzbyh) obj);
            }
        }, this.zzfoa), new zzdcj(this, zzcvzVar, zzcvrVar) { // from class: com.google.android.gms.internal.ads.zzcii
            private final zzcvr zzfea;
            private final zzcvz zzfom;
            private final zzcig zzfyv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyv = this;
                this.zzfom = zzcvzVar;
                this.zzfea = zzcvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfyv.zza(this.zzfom, this.zzfea, (JSONArray) obj);
            }
        }, this.zzfoa);
    }

    private final zzddi<zzbuj> zzb(final zzcvz zzcvzVar, final zzcvr zzcvrVar, final JSONObject jSONObject) {
        final zzddi<zzbyh> zzanf = this.zzfyt.zzacc().zzanf();
        final zzddi<zzbur> zza = this.zzfyu.zza(zzcvzVar, zzcvrVar, jSONObject);
        return zzdcy.zza(zzanf, zza).zza(new Callable(this, zza, zzanf, zzcvzVar, zzcvrVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcin
            private final zzddi zzffr;
            private final zzddi zzfoe;
            private final zzcvz zzfyo;
            private final zzcig zzfyv;
            private final zzcvr zzfyw;
            private final JSONObject zzfyx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyv = this;
                this.zzfoe = zza;
                this.zzffr = zzanf;
                this.zzfyo = zzcvzVar;
                this.zzfyw = zzcvrVar;
                this.zzfyx = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzfyv.zza(this.zzfoe, this.zzffr, this.zzfyo, this.zzfyw, this.zzfyx);
            }
        }, this.zzfoa);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbuj zza(zzddi zzddiVar, zzddi zzddiVar2, zzcvz zzcvzVar, zzcvr zzcvrVar, JSONObject jSONObject) throws Exception {
        zzbur zzburVar = (zzbur) zzddiVar.get();
        zzbyh zzbyhVar = (zzbyh) zzddiVar2.get();
        zzbut zza = this.zzfyt.zza(new zzbla(zzcvzVar, zzcvrVar, null), new zzbvd(zzburVar), new zzbtx(jSONObject, zzbyhVar));
        zza.zzacm().zzajf();
        zza.zzacn().zzb(zzbyhVar);
        zza.zzaco().zzl(zzburVar.zzahu());
        return zza.zzacl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(zzcvz zzcvzVar, zzcvr zzcvrVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzdcy.zzi(new zzccu(3));
        }
        if (zzcvzVar.zzgka.zzfga.zzgdf > 1) {
            int length = jSONArray.length();
            this.zzfyt.zzacc().zzdj(Math.min(length, zzcvzVar.zzgka.zzfga.zzgdf));
            ArrayList arrayList = new ArrayList(zzcvzVar.zzgka.zzfga.zzgdf);
            for (int i = 0; i < zzcvzVar.zzgka.zzfga.zzgdf; i++) {
                if (i < length) {
                    arrayList.add(zzb(zzcvzVar, zzcvrVar, jSONArray.getJSONObject(i)));
                } else {
                    arrayList.add(zzdcy.zzi(new zzccu(3)));
                }
            }
            return zzdcy.zzah(arrayList);
        }
        return zzdcy.zzb(zzb(zzcvzVar, zzcvrVar, jSONArray.getJSONObject(0)), zzcik.zzdos, this.zzfoa);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zza(zzcvr zzcvrVar, zzbyh zzbyhVar) throws Exception {
        JSONObject zza = zzawg.zza("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzcvrVar.zzgje.zzfjj);
        jSONObject.put("sdk_params", zza);
        return zzdcy.zzb(zzbyhVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject), zzcil.zzbkv, this.zzfoa);
    }
}
