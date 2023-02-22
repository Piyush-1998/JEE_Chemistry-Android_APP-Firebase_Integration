package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchm {
    private final AtomicReference<zzajx> zzfyg = new AtomicReference<>();

    public final void zzb(zzajx zzajxVar) {
        this.zzfyg.compareAndSet(null, zzajxVar);
    }

    public final zzcwm zze(String str, JSONObject jSONObject) throws zzcwh {
        zzajy zzf;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzf = new zzakt(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zzf = new zzakt(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzf = new zzakt(new zzamt());
            } else {
                zzf = zzf(str, jSONObject);
            }
            return new zzcwm(zzf);
        } catch (Throwable th) {
            throw new zzcwh(th);
        }
    }

    public final zzamd zzdd(String str) throws RemoteException {
        return zzaku().zzdd(str);
    }

    public final boolean zzakt() {
        return this.zzfyg.get() != null;
    }

    private final zzajy zzf(String str, JSONObject jSONObject) throws RemoteException {
        zzajx zzaku = zzaku();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (zzaku.zzda(jSONObject.getString("class_name"))) {
                    return zzaku.zzcz("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return zzaku.zzcz("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                zzaug.zzc("Invalid custom event.", e);
            }
        }
        return zzaku.zzcz(str);
    }

    private final zzajx zzaku() throws RemoteException {
        zzajx zzajxVar = this.zzfyg.get();
        if (zzajxVar != null) {
            return zzajxVar;
        }
        zzaug.zzeu("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
