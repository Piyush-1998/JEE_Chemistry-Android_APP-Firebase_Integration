package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzdut;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzarv implements zzasi {
    private static List<Future<Void>> zzdog = Collections.synchronizedList(new ArrayList());
    private final zzasd zzdlj;
    private final zzdve zzdoh;
    private final LinkedHashMap<String, zzdvh> zzdoi;
    private final zzask zzdol;
    private boolean zzdom;
    private final zzasj zzdon;
    private final Context zzlk;
    private final List<String> zzdoj = new ArrayList();
    private final List<String> zzdok = new ArrayList();
    private final Object lock = new Object();
    private HashSet<String> zzdoo = new HashSet<>();
    private boolean zzdop = false;
    private boolean zzdoq = false;
    private boolean zzdor = false;

    public zzarv(Context context, zzaxl zzaxlVar, zzasd zzasdVar, String str, zzask zzaskVar) {
        Preconditions.checkNotNull(zzasdVar, "SafeBrowsing config is not present.");
        this.zzlk = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdoi = new LinkedHashMap<>();
        this.zzdol = zzaskVar;
        this.zzdlj = zzasdVar;
        for (String str2 : zzasdVar.zzdpa) {
            this.zzdoo.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzdoo.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzdve zzdveVar = new zzdve();
        zzdveVar.zzhvf = zzdut.zzb.zzg.OCTAGON_AD;
        zzdveVar.url = str;
        zzdveVar.zzhvh = str;
        zzdut.zzb.C0013zzb.zza zzbcn = zzdut.zzb.C0013zzb.zzbcn();
        if (this.zzdlj.zzdow != null) {
            zzbcn.zzhn(this.zzdlj.zzdow);
        }
        zzdveVar.zzhvj = (zzdut.zzb.C0013zzb) ((zzdqw) zzbcn.zzazr());
        zzdut.zzb.zzi.zza zzbm = zzdut.zzb.zzi.zzbcx().zzbm(Wrappers.packageManager(this.zzlk).isCallerInstantApp());
        if (zzaxlVar.zzblz != null) {
            zzbm.zzhq(zzaxlVar.zzblz);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzlk);
        if (apkVersion > 0) {
            zzbm.zzfo(apkVersion);
        }
        zzdveVar.zzhvt = (zzdut.zzb.zzi) ((zzdqw) zzbm.zzazr());
        this.zzdoh = zzdveVar;
        this.zzdon = new zzasj(this.zzlk, this.zzdlj.zzdpd, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zzdu(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final zzasd zztm() {
        return this.zzdlj;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzdq(String str) {
        synchronized (this.lock) {
            this.zzdoh.zzhvl = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zztn() {
        return PlatformVersion.isAtLeastKitKat() && this.zzdlj.zzdoy && !this.zzdoq;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzj(View view) {
        if (this.zzdlj.zzdoy && !this.zzdoq) {
            com.google.android.gms.ads.internal.zzq.zzkj();
            Bitmap zzl = zzaul.zzl(view);
            if (zzl == null) {
                zzasf.zzdv("Failed to capture the webview bitmap.");
                return;
            }
            this.zzdoq = true;
            zzaul.zzc(new zzasa(this, zzl));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zza(String str, Map<String, String> map, int i) {
        synchronized (this.lock) {
            if (i == 3) {
                this.zzdor = true;
            }
            if (this.zzdoi.containsKey(str)) {
                if (i == 3) {
                    this.zzdoi.get(str).zzhwi = zzdut.zzb.zzh.zza.zzhj(i);
                }
                return;
            }
            zzdvh zzdvhVar = new zzdvh();
            zzdvhVar.zzhwi = zzdut.zzb.zzh.zza.zzhj(i);
            zzdvhVar.zzhwc = Integer.valueOf(this.zzdoi.size());
            zzdvhVar.url = str;
            zzdvhVar.zzhwd = new zzdvg();
            if (this.zzdoo.size() > 0 && map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.zzdoo.contains(key.toLowerCase(Locale.ENGLISH))) {
                        arrayList.add((zzdut.zzb.zzc) ((zzdqw) zzdut.zzb.zzc.zzbcp().zzdd(zzdpm.zzhh(key)).zzde(zzdpm.zzhh(value)).zzazr()));
                    }
                }
                zzdut.zzb.zzc[] zzcVarArr = new zzdut.zzb.zzc[arrayList.size()];
                arrayList.toArray(zzcVarArr);
                zzdvhVar.zzhwd.zzhvx = zzcVarArr;
            }
            this.zzdoi.put(str, zzdvhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzdr(String str) {
        synchronized (this.lock) {
            this.zzdoj.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzds(String str) {
        synchronized (this.lock) {
            this.zzdok.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final String[] zza(String[] strArr) {
        return (String[]) this.zzdon.zzb(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzto() {
        this.zzdop = true;
    }

    private final zzdvh zzdt(String str) {
        zzdvh zzdvhVar;
        synchronized (this.lock) {
            zzdvhVar = this.zzdoi.get(str);
        }
        return zzdvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zztp() {
        synchronized (this.lock) {
            zzddi zzb = zzdcy.zzb(this.zzdol.zza(this.zzlk, this.zzdoi.keySet()), new zzdcj(this) { // from class: com.google.android.gms.internal.ads.zzary
                private final zzarv zzdot;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdot = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdcj
                public final zzddi zzf(Object obj) {
                    return this.zzdot.zzh((Map) obj);
                }
            }, zzaxn.zzdwn);
            zzddi zza = zzdcy.zza(zzb, 10L, TimeUnit.SECONDS, zzaxn.zzdwl);
            zzdcy.zza(zzb, new zzarz(this, zza), zzaxn.zzdwn);
            zzdog.add(zza);
        }
    }

    private final zzddi<Void> zztq() {
        zzddi<Void> zzb;
        zzdvh[] zzdvhVarArr;
        if (!((this.zzdom && this.zzdlj.zzdpc) || (this.zzdor && this.zzdlj.zzdpb) || (!this.zzdom && this.zzdlj.zzdoz))) {
            return zzdcy.zzah(null);
        }
        synchronized (this.lock) {
            this.zzdoh.zzhvk = new zzdvh[this.zzdoi.size()];
            this.zzdoi.values().toArray(this.zzdoh.zzhvk);
            this.zzdoh.zzhvu = (String[]) this.zzdoj.toArray(new String[0]);
            this.zzdoh.zzhvv = (String[]) this.zzdok.toArray(new String[0]);
            if (zzasf.isEnabled()) {
                String str = this.zzdoh.url;
                String str2 = this.zzdoh.zzhvl;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzdvh zzdvhVar : this.zzdoh.zzhvk) {
                    sb2.append("    [");
                    sb2.append(zzdvhVar.zzhwj.length);
                    sb2.append("] ");
                    sb2.append(zzdvhVar.url);
                }
                zzasf.zzdv(sb2.toString());
            }
            zzddi<String> zza = new zzavy(this.zzlk).zza(1, this.zzdlj.zzdox, null, zzdus.zzb(this.zzdoh));
            if (zzasf.isEnabled()) {
                zza.addListener(new zzasc(this), zzaxn.zzdwi);
            }
            zzb = zzdcy.zzb(zza, zzarx.zzdos, zzaxn.zzdwn);
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzh(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.lock) {
                            int length = optJSONArray.length();
                            zzdvh zzdt = zzdt(str);
                            if (zzdt == null) {
                                String valueOf = String.valueOf(str);
                                zzasf.zzdv(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                zzdt.zzhwj = new String[length];
                                for (int i = 0; i < length; i++) {
                                    zzdt.zzhwj[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                this.zzdom = (length > 0) | this.zzdom;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzuv.zzon().zzd(zzza.zzcpj)).booleanValue()) {
                    zzaug.zzb("Failed to get SafeBrowsing metadata", e);
                }
                return zzdcy.zzi(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzdom) {
            synchronized (this.lock) {
                this.zzdoh.zzhvf = zzdut.zzb.zzg.OCTAGON_AD_SB_MATCH;
            }
        }
        return zztq();
    }
}
