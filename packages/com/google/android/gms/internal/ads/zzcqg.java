package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqg implements zzcru<zzcqd> {
    private final PackageInfo zzdiv;
    private final zzaui zzdrp;
    private final zzcwe zzfga;
    private final zzddl zzfoa;

    public zzcqg(zzddl zzddlVar, zzcwe zzcweVar, PackageInfo packageInfo, zzaui zzauiVar) {
        this.zzfoa = zzddlVar;
        this.zzfga = zzcweVar;
        this.zzdiv = packageInfo;
        this.zzdrp = zzauiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcqd> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcqf
            private final zzcqg zzgfj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfj = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgfj.zzamc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzfga.zzgkj);
        String str = "landscape";
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcog)).booleanValue() && this.zzfga.zzdeh.versionCode > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzfga.zzdeh.zzbjw;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square" : "portrait" : "landscape" : "any";
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzfga.zzdeh.zzbjv;
        if (i2 == 0) {
            str = "any";
        } else if (i2 == 1) {
            str = "portrait";
        } else if (i2 != 2) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.zzfga.zzdeh.zzbjx);
        bundle.putBoolean("use_custom_mute", this.zzfga.zzdeh.zzbka);
        PackageInfo packageInfo = this.zzdiv;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzdrp.zzvd()) {
            this.zzdrp.zzvj();
            this.zzdrp.zzcm(i3);
        }
        JSONObject zzvi = this.zzdrp.zzvi();
        String jSONArray = (zzvi == null || (optJSONArray = zzvi.optJSONArray(this.zzfga.zzgkh)) == null) ? null : optJSONArray.toString();
        if (!TextUtils.isEmpty(jSONArray)) {
            bundle.putString("native_advanced_settings", jSONArray);
        }
        if (this.zzfga.zzgdf > 1) {
            bundle.putInt("max_num_ads", this.zzfga.zzgdf);
        }
        if (this.zzfga.zzdkl != null) {
            zzagd zzagdVar = this.zzfga.zzdkl;
            int i4 = zzagdVar.zzcyt;
            String str3 = "l";
            if (i4 != 1) {
                if (i4 != 2) {
                    int i5 = zzagdVar.zzcyt;
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Instream ad video aspect ratio ");
                    sb.append(i5);
                    sb.append(" is wrong.");
                    zzaxi.zzes(sb.toString());
                } else {
                    str3 = "p";
                }
            }
            bundle.putString("ia_var", str3);
            bundle.putBoolean("instr", true);
        }
        if (this.zzfga.zzana() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcqd zzamc() throws Exception {
        final ArrayList<String> arrayList = this.zzfga.zzgki;
        if (arrayList == null) {
            return zzcqi.zzgfk;
        }
        if (arrayList.isEmpty()) {
            return zzcqh.zzgfk;
        }
        return new zzcqd(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzcqk
            private final zzcqg zzgfj;
            private final ArrayList zzgfl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfj = this;
                this.zzgfl = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzcrr
            public final void zzr(Bundle bundle) {
                this.zzgfj.zza(this.zzgfl, bundle);
            }
        };
    }
}
