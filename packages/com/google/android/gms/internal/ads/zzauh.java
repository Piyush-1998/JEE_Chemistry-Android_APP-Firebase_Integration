package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzauh implements zzaui {
    private SharedPreferences zzcfy;
    private boolean zzdsa;
    private zzddi<?> zzdsc;
    private SharedPreferences.Editor zzdse;
    private String zzdsg;
    private String zzdsh;
    private final Object lock = new Object();
    private final List<Runnable> zzdsb = new ArrayList();
    private zzpz zzdsd = null;
    private boolean zzdsf = false;
    private boolean zzdjb = true;
    private boolean zzdjo = false;
    private String zzdjr = "";
    private long zzdsi = 0;
    private long zzdsj = 0;
    private long zzdsk = 0;
    private int zzdsl = -1;
    private int zzdsm = 0;
    private Set<String> zzdsn = Collections.emptySet();
    private JSONObject zzdso = new JSONObject();
    private boolean zzdla = true;
    private boolean zzdll = true;
    private String zzdsp = null;
    private int zzdsq = -1;

    public final void zza(final Context context, String str, boolean z) {
        final String concat;
        synchronized (this.lock) {
            if (this.zzcfy != null) {
                return;
            }
            if (str == null) {
                concat = "admob";
            } else {
                String valueOf = String.valueOf(str);
                concat = valueOf.length() != 0 ? "admob__".concat(valueOf) : new String("admob__");
            }
            this.zzdsc = zzaxn.zzdwi.zzf(new Runnable(this, context, concat) { // from class: com.google.android.gms.internal.ads.zzauk
                private final Context zzcfb;
                private final String zzdbt;
                private final zzauh zzdsr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdsr = this;
                    this.zzcfb = context;
                    this.zzdbt = concat;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdsr.zzp(this.zzcfb, this.zzdbt);
                }
            });
            this.zzdsa = z;
        }
    }

    private final void zzuv() {
        zzddi<?> zzddiVar = this.zzdsc;
        if (zzddiVar == null || zzddiVar.isDone()) {
            return;
        }
        try {
            this.zzdsc.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zzaug.zzd("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            zzaug.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzaug.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            zzaug.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final Bundle zzuw() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.lock) {
            bundle.putBoolean("use_https", this.zzdjb);
            bundle.putBoolean("content_url_opted_out", this.zzdla);
            bundle.putBoolean("content_vertical_opted_out", this.zzdll);
            bundle.putBoolean("auto_collect_location", this.zzdjo);
            bundle.putInt("version_code", this.zzdsm);
            bundle.putStringArray("never_pool_slots", (String[]) this.zzdsn.toArray(new String[0]));
            bundle.putString("app_settings_json", this.zzdjr);
            bundle.putLong("app_settings_last_update_ms", this.zzdsi);
            bundle.putLong("app_last_background_time_ms", this.zzdsj);
            bundle.putInt("request_in_session_count", this.zzdsl);
            bundle.putLong("first_ad_req_time_ms", this.zzdsk);
            bundle.putString("native_advanced_settings", this.zzdso.toString());
            bundle.putString("display_cutout", this.zzdsp);
            bundle.putInt("app_measurement_npa", this.zzdsq);
            if (this.zzdsg != null) {
                bundle.putString("content_url_hashes", this.zzdsg);
            }
            if (this.zzdsh != null) {
                bundle.putString("content_vertical_hashes", this.zzdsh);
            }
        }
        return bundle;
    }

    private final void zzc(Bundle bundle) {
        zzaxn.zzdwi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzauj
            private final zzauh zzdsr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdsr = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdsr.zzux();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final zzpz zzux() {
        if (this.zzdsa && PlatformVersion.isAtLeastIceCreamSandwich()) {
            if (zzuy() && zzva()) {
                return null;
            }
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcin)).booleanValue()) {
                synchronized (this.lock) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.zzdsd == null) {
                        this.zzdsd = new zzpz();
                    }
                    this.zzdsd.zzlu();
                    zzaug.zzet("start fetching content...");
                    return this.zzdsd;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzah(boolean z) {
        zzuv();
        synchronized (this.lock) {
            if (this.zzdla == z) {
                return;
            }
            this.zzdla = z;
            if (this.zzdse != null) {
                this.zzdse.putBoolean("content_url_opted_out", z);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzdla);
            bundle.putBoolean("content_vertical_opted_out", this.zzdll);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final boolean zzuy() {
        boolean z;
        zzuv();
        synchronized (this.lock) {
            z = this.zzdla;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzdz(String str) {
        zzuv();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzdsg)) {
                    this.zzdsg = str;
                    if (this.zzdse != null) {
                        this.zzdse.putString("content_url_hashes", str);
                        this.zzdse.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    zzc(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final String zzuz() {
        String str;
        zzuv();
        synchronized (this.lock) {
            str = this.zzdsg;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzai(boolean z) {
        zzuv();
        synchronized (this.lock) {
            if (this.zzdll == z) {
                return;
            }
            this.zzdll = z;
            if (this.zzdse != null) {
                this.zzdse.putBoolean("content_vertical_opted_out", z);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzdla);
            bundle.putBoolean("content_vertical_opted_out", this.zzdll);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final boolean zzva() {
        boolean z;
        zzuv();
        synchronized (this.lock) {
            z = this.zzdll;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzea(String str) {
        zzuv();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzdsh)) {
                    this.zzdsh = str;
                    if (this.zzdse != null) {
                        this.zzdse.putString("content_vertical_hashes", str);
                        this.zzdse.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    zzc(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final String zzvb() {
        String str;
        zzuv();
        synchronized (this.lock) {
            str = this.zzdsh;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzaj(boolean z) {
        zzuv();
        synchronized (this.lock) {
            if (this.zzdjo == z) {
                return;
            }
            this.zzdjo = z;
            if (this.zzdse != null) {
                this.zzdse.putBoolean("auto_collect_location", z);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final boolean zzvc() {
        boolean z;
        zzuv();
        synchronized (this.lock) {
            z = this.zzdjo;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzcm(int i) {
        zzuv();
        synchronized (this.lock) {
            if (this.zzdsm == i) {
                return;
            }
            this.zzdsm = i;
            if (this.zzdse != null) {
                this.zzdse.putInt("version_code", i);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final int zzvd() {
        int i;
        zzuv();
        synchronized (this.lock) {
            i = this.zzdsm;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzeb(String str) {
        zzuv();
        synchronized (this.lock) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis();
            this.zzdsi = currentTimeMillis;
            if (str != null && !str.equals(this.zzdjr)) {
                this.zzdjr = str;
                if (this.zzdse != null) {
                    this.zzdse.putString("app_settings_json", str);
                    this.zzdse.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzdse.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", str);
                bundle.putLong("app_settings_last_update_ms", currentTimeMillis);
                zzc(bundle);
                for (Runnable runnable : this.zzdsb) {
                    runnable.run();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final zzats zzve() {
        zzats zzatsVar;
        zzuv();
        synchronized (this.lock) {
            zzatsVar = new zzats(this.zzdjr, this.zzdsi);
        }
        return zzatsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzb(Runnable runnable) {
        this.zzdsb.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzet(long j) {
        zzuv();
        synchronized (this.lock) {
            if (this.zzdsj == j) {
                return;
            }
            this.zzdsj = j;
            if (this.zzdse != null) {
                this.zzdse.putLong("app_last_background_time_ms", j);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final long zzvf() {
        long j;
        zzuv();
        synchronized (this.lock) {
            j = this.zzdsj;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzcn(int i) {
        zzuv();
        synchronized (this.lock) {
            if (this.zzdsl == i) {
                return;
            }
            this.zzdsl = i;
            if (this.zzdse != null) {
                this.zzdse.putInt("request_in_session_count", i);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final int zzvg() {
        int i;
        zzuv();
        synchronized (this.lock) {
            i = this.zzdsl;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzeu(long j) {
        zzuv();
        synchronized (this.lock) {
            if (this.zzdsk == j) {
                return;
            }
            this.zzdsk = j;
            if (this.zzdse != null) {
                this.zzdse.putLong("first_ad_req_time_ms", j);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final long zzvh() {
        long j;
        zzuv();
        synchronized (this.lock) {
            j = this.zzdsk;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzc(String str, String str2, boolean z) {
        zzuv();
        synchronized (this.lock) {
            JSONArray optJSONArray = this.zzdso.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzdso.put(str, optJSONArray);
            } catch (JSONException e) {
                zzaug.zzd("Could not update native advanced settings", e);
            }
            if (this.zzdse != null) {
                this.zzdse.putString("native_advanced_settings", this.zzdso.toString());
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.zzdso.toString());
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final JSONObject zzvi() {
        JSONObject jSONObject;
        zzuv();
        synchronized (this.lock) {
            jSONObject = this.zzdso;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzvj() {
        zzuv();
        synchronized (this.lock) {
            this.zzdso = new JSONObject();
            if (this.zzdse != null) {
                this.zzdse.remove("native_advanced_settings");
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final String zzvk() {
        String str;
        zzuv();
        synchronized (this.lock) {
            str = this.zzdsp;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzec(String str) {
        zzuv();
        synchronized (this.lock) {
            if (TextUtils.equals(this.zzdsp, str)) {
                return;
            }
            this.zzdsp = str;
            if (this.zzdse != null) {
                this.zzdse.putString("display_cutout", str);
                this.zzdse.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("display_cutout", str);
            zzc(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.lock) {
            this.zzcfy = sharedPreferences;
            this.zzdse = edit;
            if (PlatformVersion.isAtLeastM() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.zzdsf = z;
            this.zzdjb = this.zzcfy.getBoolean("use_https", this.zzdjb);
            this.zzdla = this.zzcfy.getBoolean("content_url_opted_out", this.zzdla);
            this.zzdsg = this.zzcfy.getString("content_url_hashes", this.zzdsg);
            this.zzdjo = this.zzcfy.getBoolean("auto_collect_location", this.zzdjo);
            this.zzdll = this.zzcfy.getBoolean("content_vertical_opted_out", this.zzdll);
            this.zzdsh = this.zzcfy.getString("content_vertical_hashes", this.zzdsh);
            this.zzdsm = this.zzcfy.getInt("version_code", this.zzdsm);
            this.zzdjr = this.zzcfy.getString("app_settings_json", this.zzdjr);
            this.zzdsi = this.zzcfy.getLong("app_settings_last_update_ms", this.zzdsi);
            this.zzdsj = this.zzcfy.getLong("app_last_background_time_ms", this.zzdsj);
            this.zzdsl = this.zzcfy.getInt("request_in_session_count", this.zzdsl);
            this.zzdsk = this.zzcfy.getLong("first_ad_req_time_ms", this.zzdsk);
            this.zzdsn = this.zzcfy.getStringSet("never_pool_slots", this.zzdsn);
            this.zzdsp = this.zzcfy.getString("display_cutout", this.zzdsp);
            this.zzdsq = this.zzcfy.getInt("app_measurement_npa", this.zzdsq);
            try {
                this.zzdso = new JSONObject(this.zzcfy.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzaug.zzd("Could not convert native advanced settings to json object", e);
            }
            zzc(zzuw());
        }
    }
}
