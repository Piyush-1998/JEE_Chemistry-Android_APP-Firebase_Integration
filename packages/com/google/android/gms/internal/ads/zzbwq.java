package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbwq {
    private final Executor executor;
    private final zzaxl zzblk;
    private final zzaay zzdeh;
    private final zzsd zzeen;
    private final zzdf zzegb;
    private final ScheduledExecutorService zzffn;
    private final zzbwl zzfoo;
    private final com.google.android.gms.ads.internal.zza zzfop;
    private final zzbxe zzfoq;
    private final Context zzlk;

    public zzbwq(Context context, zzbwl zzbwlVar, zzdf zzdfVar, zzaxl zzaxlVar, com.google.android.gms.ads.internal.zza zzaVar, zzsd zzsdVar, Executor executor, zzcwe zzcweVar, zzbxe zzbxeVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzlk = context;
        this.zzfoo = zzbwlVar;
        this.zzegb = zzdfVar;
        this.zzblk = zzaxlVar;
        this.zzfop = zzaVar;
        this.zzeen = zzsdVar;
        this.executor = executor;
        this.zzdeh = zzcweVar.zzdeh;
        this.zzfoq = zzbxeVar;
        this.zzffn = scheduledExecutorService;
    }

    public static List<zzxk> zzi(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzxk zzk = zzk(optJSONArray.optJSONObject(i));
            if (zzk != null) {
                arrayList.add(zzk);
            }
        }
        return arrayList;
    }

    public static zzxk zzj(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzk(optJSONObject);
    }

    private static zzxk zzk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzxk(optString, optString2);
    }

    public final zzddi<zzaau> zzc(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONObject(str), this.zzdeh.zzcvz);
    }

    public final zzddi<List<zzaau>> zzd(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONArray(str), this.zzdeh.zzcvz, this.zzdeh.zzbjx);
    }

    private final zzddi<List<zzaau>> zza(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzdcy.zzah(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zza(jSONArray.optJSONObject(i), z));
        }
        return zzdcy.zzb(zzdcy.zzg(arrayList), zzbwt.zzdos, this.executor);
    }

    private final zzddi<zzaau> zza(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzdcy.zzah(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzdcy.zzah(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzdcy.zzah(new zzaau(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zza(jSONObject.optBoolean("require"), zzdcy.zzb(this.zzfoo.zza(optString, optDouble, optBoolean), new zzdal(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.zzbws
            private final String zzczh;
            private final int zzdtl;
            private final int zzdtm;
            private final double zzfot;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczh = optString;
                this.zzfot = optDouble;
                this.zzdtl = optInt;
                this.zzdtm = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj) {
                String str = this.zzczh;
                return new zzaau(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzfot, this.zzdtl, this.zzdtm);
            }
        }, this.executor), (Object) null);
    }

    public final zzddi<zzaat> zze(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzdcy.zzah(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zza(optJSONObject.optBoolean("require"), zzdcy.zzb(zza(optJSONArray, false, true), new zzdal(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.zzbwv
            private final JSONObject zzfch;
            private final zzbwq zzfou;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfou = this;
                this.zzfch = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj) {
                return this.zzfou.zza(this.zzfch, (List) obj);
            }
        }, this.executor), (Object) null);
    }

    private static Integer zzf(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final zzddi<zzbbw> zzl(JSONObject jSONObject) {
        JSONObject zza = zzawg.zza(jSONObject, "html_containers", "instream");
        if (zza == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzdcy.zzah(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzaug.zzeu("Required field 'vast_xml' is missing");
                return zzdcy.zzah(null);
            }
            return zza(zzdcy.zza(this.zzfoq.zzm(optJSONObject), ((Integer) zzuv.zzon().zzd(zzza.zzcoe)).intValue(), TimeUnit.SECONDS, this.zzffn), (Object) null);
        }
        return zza(zza.optBoolean("require"), this.zzfoq.zzp(zza.optString("base_url"), zza.optString("html")), (Object) null);
    }

    private static <T> zzddi<T> zza(zzddi<T> zzddiVar, T t) {
        return zzdcy.zzb(zzddiVar, Exception.class, new zzdcj(null) { // from class: com.google.android.gms.internal.ads.zzbwx
            private final Object zzfow;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfow = r1;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                Object obj2 = this.zzfow;
                zzaug.zza("Error during loading assets.", (Exception) obj);
                return zzdcy.zzah(obj2);
            }
        }, zzaxn.zzdwn);
    }

    private static <T> zzddi<T> zza(boolean z, final zzddi<T> zzddiVar, T t) {
        if (z) {
            return zzdcy.zzb(zzddiVar, new zzdcj(zzddiVar) { // from class: com.google.android.gms.internal.ads.zzbww
                private final zzddi zzfov;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfov = zzddiVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdcj
                public final zzddi zzf(Object obj) {
                    return obj != null ? this.zzfov : zzdcy.zzi(new zzcjh("Retrieve required value in native ad response failed.", 0));
                }
            }, zzaxn.zzdwn);
        }
        return zza(zzddiVar, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzb(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzq.zzkk();
        zzbbw zza = zzbcb.zza(this.zzlk, zzbdj.zzaar(), "native-omid", false, false, this.zzegb, this.zzblk, null, null, this.zzfop, this.zzeen, null, false);
        final zzaxw zzl = zzaxw.zzl(zza);
        zza.zzzp().zza(new zzbdf(zzl) { // from class: com.google.android.gms.internal.ads.zzbwz
            private final zzaxw zzefu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzefu = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbdf
            public final void zzad(boolean z) {
                this.zzefu.zzwp();
            }
        });
        zza.loadData(str, "text/html", "UTF-8");
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzaat zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzf = zzf(jSONObject, "bg_color");
        Integer zzf2 = zzf(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzaat(optString, list, zzf, zzf2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzdeh.zzbjy, optBoolean);
    }
}
