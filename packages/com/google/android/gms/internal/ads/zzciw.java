package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzciw<AdT> implements zzcga<AdT> {
    protected abstract zzddi<AdT> zza(zzcwe zzcweVar, Bundle bundle);

    @Override // com.google.android.gms.internal.ads.zzcga
    public final boolean zza(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        return !TextUtils.isEmpty(zzcvrVar.zzgjh.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final zzddi<AdT> zzb(zzcvz zzcvzVar, zzcvr zzcvrVar) {
        String optString = zzcvrVar.zzgjh.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzcwe zzcweVar = zzcvzVar.zzgka.zzfga;
        zzcwg zzgf = new zzcwg().zzg(zzcweVar.zzgkg).zzd(zzcweVar.zzbll).zzc(zzcweVar.zzgke).zzgf(zzcweVar.zzgkh).zzc(zzcweVar.zzgkf).zzb(zzcweVar.zzgki).zzc(zzcweVar.zzgkj).zzb(zzcweVar.zzdeh).zzb(zzcweVar.zzgkk).zzb(zzcweVar.zzgkl).zzgf(optString);
        Bundle zzm = zzm(zzcweVar.zzgkg.zzcce);
        Bundle zzm2 = zzm(zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzm2.putInt("gw", 1);
        String optString2 = zzcvrVar.zzgjh.optString("mad_hac", null);
        if (optString2 != null) {
            zzm2.putString("mad_hac", optString2);
        }
        String optString3 = zzcvrVar.zzgjh.optString("adJson", null);
        if (optString3 != null) {
            zzm2.putString("_ad", optString3);
        }
        zzm2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzcvrVar.zzgjk.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzcvrVar.zzgjk.optString(next, null);
            if (next != null) {
                zzm2.putString(next, optString4);
            }
        }
        zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzm2);
        zzcwe zzane = zzgf.zzg(new zztx(zzcweVar.zzgkg.versionCode, zzcweVar.zzgkg.zzcbx, zzm2, zzcweVar.zzgkg.zzcby, zzcweVar.zzgkg.zzcbz, zzcweVar.zzgkg.zzcca, zzcweVar.zzgkg.zzabj, zzcweVar.zzgkg.zzbkg, zzcweVar.zzgkg.zzccb, zzcweVar.zzgkg.zzccc, zzcweVar.zzgkg.zzng, zzcweVar.zzgkg.zzccd, zzm, zzcweVar.zzgkg.zzccf, zzcweVar.zzgkg.zzccg, zzcweVar.zzgkg.zzcch, zzcweVar.zzgkg.zzcci, zzcweVar.zzgkg.zzccj, zzcweVar.zzgkg.zzcck, zzcweVar.zzgkg.zzabk, zzcweVar.zzgkg.zzabl)).zzane();
        Bundle bundle = new Bundle();
        zzcvt zzcvtVar = zzcvzVar.zzgkb.zzgjy;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzcvtVar.zzdcb));
        bundle2.putInt("refresh_interval", zzcvtVar.zzgju);
        bundle2.putString("gws_query_id", zzcvtVar.zzbzn);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzcvzVar.zzgka.zzfga.zzgkh;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzcvrVar.zzdcu);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzcvrVar.zzdby));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzcvrVar.zzdbz));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzcvrVar.zzdks));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzcvrVar.zzgjc));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzcvrVar.zzdlf));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzcvrVar.zzdlg));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzcvrVar.zzgjb));
        bundle3.putString("transaction_id", zzcvrVar.zzddf);
        bundle3.putString("valid_from_timestamp", zzcvrVar.zzddg);
        bundle3.putBoolean("is_closable_area_disabled", zzcvrVar.zzble);
        if (zzcvrVar.zzdle != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcvrVar.zzdle.zzdnv);
            bundle4.putString("rb_type", zzcvrVar.zzdle.type);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zza(zzane, bundle);
    }

    private static Bundle zzm(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
