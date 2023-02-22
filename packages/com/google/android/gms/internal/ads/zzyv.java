package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzyv {
    private final Collection<zzyp<?>> zzcft = new ArrayList();
    private final Collection<zzyp<String>> zzcfu = new ArrayList();
    private final Collection<zzyp<String>> zzcfv = new ArrayList();

    public final void zza(zzyp zzypVar) {
        this.zzcft.add(zzypVar);
    }

    public final void zzb(zzyp<String> zzypVar) {
        this.zzcfu.add(zzypVar);
    }

    public final void zzc(zzyp<String> zzypVar) {
        this.zzcfv.add(zzypVar);
    }

    public final void zza(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzyp<?> zzypVar : this.zzcft) {
            if (zzypVar.getSource() == 1) {
                zzypVar.zza(editor, zzypVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzaxi.zzes("Flag Json is null.");
        }
    }

    public final List<String> zzpr() {
        ArrayList arrayList = new ArrayList();
        for (zzyp<String> zzypVar : this.zzcfu) {
            String str = (String) zzuv.zzon().zzd(zzypVar);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<String> zzps() {
        List<String> zzpr = zzpr();
        for (zzyp<String> zzypVar : this.zzcfv) {
            String str = (String) zzuv.zzon().zzd(zzypVar);
            if (str != null) {
                zzpr.add(str);
            }
        }
        return zzpr;
    }
}
