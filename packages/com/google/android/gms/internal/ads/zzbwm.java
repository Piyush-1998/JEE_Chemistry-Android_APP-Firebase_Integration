package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbwm {
    private final zzddl zzfoa;
    private final zzbwq zzfob;
    private final zzbxb zzfoc;

    public zzbwm(zzddl zzddlVar, zzbwq zzbwqVar, zzbxb zzbxbVar) {
        this.zzfoa = zzddlVar;
        this.zzfob = zzbwqVar;
        this.zzfoc = zzbxbVar;
    }

    public final zzddi<zzbur> zza(final zzcvz zzcvzVar, final zzcvr zzcvrVar, final JSONObject jSONObject) {
        zzddi zzb;
        final zzddi zzd = this.zzfoa.zzd(new Callable(this, zzcvzVar, zzcvrVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzbwp
            private final zzcvr zzfea;
            private final zzbwm zzfod;
            private final zzcvz zzfom;
            private final JSONObject zzfon;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfod = this;
                this.zzfom = zzcvzVar;
                this.zzfea = zzcvrVar;
                this.zzfon = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcvz zzcvzVar2 = this.zzfom;
                zzcvr zzcvrVar2 = this.zzfea;
                JSONObject jSONObject2 = this.zzfon;
                zzbur zzburVar = new zzbur();
                zzburVar.zzdg(jSONObject2.optInt("template_id", -1));
                zzburVar.zzfr(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzburVar.zzfs(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzcwe zzcweVar = zzcvzVar2.zzgka.zzfga;
                if (!zzcweVar.zzgki.contains(Integer.toString(zzburVar.zzahp()))) {
                    int zzahp = zzburVar.zzahp();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(zzahp);
                    throw new zzcjh(sb.toString(), 0);
                }
                if (zzburVar.zzahp() == 3) {
                    if (zzburVar.getCustomTemplateId() == null) {
                        throw new zzcjh("No custom template id for custom template ad response.", 0);
                    }
                    if (!zzcweVar.zzgkj.contains(zzburVar.getCustomTemplateId())) {
                        throw new zzcjh("Unexpected custom template id in the response.", 0);
                    }
                }
                zzburVar.setStarRating(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (zzcvrVar2.zzdnj) {
                    com.google.android.gms.ads.internal.zzq.zzkj();
                    String zzvp = zzaul.zzvp();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzvp).length() + 3 + String.valueOf(optString).length());
                    sb2.append(zzvp);
                    sb2.append(" : ");
                    sb2.append(optString);
                    optString = sb2.toString();
                }
                zzburVar.zzo("headline", optString);
                zzburVar.zzo("body", jSONObject2.optString("body", null));
                zzburVar.zzo("call_to_action", jSONObject2.optString("call_to_action", null));
                zzburVar.zzo("store", jSONObject2.optString("store", null));
                zzburVar.zzo("price", jSONObject2.optString("price", null));
                zzburVar.zzo("advertiser", jSONObject2.optString("advertiser", null));
                return zzburVar;
            }
        });
        final zzddi<List<zzaau>> zzd2 = this.zzfob.zzd(jSONObject, "images");
        final zzddi<zzaau> zzc = this.zzfob.zzc(jSONObject, "secondary_image");
        final zzddi<zzaau> zzc2 = this.zzfob.zzc(jSONObject, "app_icon");
        final zzddi<zzaat> zze = this.zzfob.zze(jSONObject, "attribution");
        final zzddi<zzbbw> zzl = this.zzfob.zzl(jSONObject);
        final zzbwq zzbwqVar = this.zzfob;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzb = zzdcy.zzah(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzb = zzdcy.zzah(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzb = zzdcy.zzah(null);
                } else {
                    zzb = zzdcy.zzb(zzdcy.zzah(null), new zzdcj(zzbwqVar, optString) { // from class: com.google.android.gms.internal.ads.zzbwu
                        private final String zzcyz;
                        private final zzbwq zzfou;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfou = zzbwqVar;
                            this.zzcyz = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdcj
                        public final zzddi zzf(Object obj) {
                            return this.zzfou.zzb(this.zzcyz, obj);
                        }
                    }, zzaxn.zzdwm);
                }
            }
        }
        final zzddi zzddiVar = zzb;
        final zzddi<List<zzbxc>> zzg = this.zzfoc.zzg(jSONObject, "custom_assets");
        return zzdcy.zza(zzd, zzd2, zzc, zzc2, zze, zzl, zzddiVar, zzg).zza(new Callable(this, zzd, zzd2, zzc2, zzc, zze, jSONObject, zzl, zzddiVar, zzg) { // from class: com.google.android.gms.internal.ads.zzbwo
            private final zzddi zzffr;
            private final zzbwm zzfod;
            private final zzddi zzfoe;
            private final zzddi zzfof;
            private final zzddi zzfog;
            private final zzddi zzfoh;
            private final JSONObject zzfoi;
            private final zzddi zzfoj;
            private final zzddi zzfok;
            private final zzddi zzfol;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfod = this;
                this.zzfoe = zzd;
                this.zzffr = zzd2;
                this.zzfof = zzc2;
                this.zzfog = zzc;
                this.zzfoh = zze;
                this.zzfoi = jSONObject;
                this.zzfoj = zzl;
                this.zzfok = zzddiVar;
                this.zzfol = zzg;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzddi zzddiVar2 = this.zzfoe;
                zzddi zzddiVar3 = this.zzffr;
                zzddi zzddiVar4 = this.zzfof;
                zzddi zzddiVar5 = this.zzfog;
                zzddi zzddiVar6 = this.zzfoh;
                JSONObject jSONObject2 = this.zzfoi;
                zzddi zzddiVar7 = this.zzfoj;
                zzddi zzddiVar8 = this.zzfok;
                zzddi zzddiVar9 = this.zzfol;
                zzbur zzburVar = (zzbur) zzddiVar2.get();
                zzburVar.setImages((List) zzddiVar3.get());
                zzburVar.zza((zzabi) zzddiVar4.get());
                zzburVar.zzb((zzabi) zzddiVar5.get());
                zzburVar.zza((zzaba) zzddiVar6.get());
                zzburVar.zzf(zzbwq.zzi(jSONObject2));
                zzburVar.zza(zzbwq.zzj(jSONObject2));
                zzbbw zzbbwVar = (zzbbw) zzddiVar7.get();
                if (zzbbwVar != null) {
                    zzburVar.zzi(zzbbwVar);
                    zzburVar.zzaa(zzbbwVar.getView());
                    zzburVar.zzb(zzbbwVar.zzxl());
                }
                zzbbw zzbbwVar2 = (zzbbw) zzddiVar8.get();
                if (zzbbwVar2 != null) {
                    zzburVar.zzj(zzbbwVar2);
                }
                for (zzbxc zzbxcVar : (List) zzddiVar9.get()) {
                    int i = zzbxcVar.type;
                    if (i == 1) {
                        zzburVar.zzo(zzbxcVar.zzce, zzbxcVar.zzfpa);
                    } else if (i == 2) {
                        zzburVar.zza(zzbxcVar.zzce, zzbxcVar.zzfpb);
                    }
                }
                return zzburVar;
            }
        }, this.zzfoa);
    }
}
