package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzfj implements zzgh {
    private static volatile zzfj zzoa;
    private final Clock zzac;
    private final long zzdr;
    private final zzr zzfv;
    private final Context zzob;
    private final String zzoc;
    private final String zzod;
    private final zzs zzoe;
    private final zzeo zzof;
    private final zzef zzog;
    private final zzfc zzoh;
    private final zziw zzoi;
    private final zzjs zzoj;
    private final zzed zzok;
    private final zzhq zzol;
    private final zzgp zzom;
    private final zza zzon;
    private final zzhl zzoo;
    private zzeb zzop;
    private zzhv zzoq;
    private zzac zzor;
    private zzdy zzos;
    private zzeu zzot;
    private Boolean zzou;
    private long zzov;
    private volatile Boolean zzow;
    private Boolean zzox;
    private Boolean zzoy;
    private int zzoz;
    private final boolean zzt;
    private final String zzv;
    private boolean zzdh = false;
    private AtomicInteger zzpa = new AtomicInteger(0);

    private zzfj(zzgm zzgmVar) {
        boolean z = false;
        Preconditions.checkNotNull(zzgmVar);
        zzr zzrVar = new zzr(zzgmVar.zzob);
        this.zzfv = zzrVar;
        zzak.zza(zzrVar);
        this.zzob = zzgmVar.zzob;
        this.zzv = zzgmVar.zzv;
        this.zzoc = zzgmVar.zzoc;
        this.zzod = zzgmVar.zzod;
        this.zzt = zzgmVar.zzt;
        this.zzow = zzgmVar.zzow;
        com.google.android.gms.internal.measurement.zzx zzxVar = zzgmVar.zzpr;
        if (zzxVar != null && zzxVar.zzw != null) {
            Object obj = zzxVar.zzw.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzox = (Boolean) obj;
            }
            Object obj2 = zzxVar.zzw.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzoy = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzcm.zzr(this.zzob);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzac = defaultClock;
        this.zzdr = defaultClock.currentTimeMillis();
        this.zzoe = new zzs(this);
        zzeo zzeoVar = new zzeo(this);
        zzeoVar.initialize();
        this.zzof = zzeoVar;
        zzef zzefVar = new zzef(this);
        zzefVar.initialize();
        this.zzog = zzefVar;
        zzjs zzjsVar = new zzjs(this);
        zzjsVar.initialize();
        this.zzoj = zzjsVar;
        zzed zzedVar = new zzed(this);
        zzedVar.initialize();
        this.zzok = zzedVar;
        this.zzon = new zza(this);
        zzhq zzhqVar = new zzhq(this);
        zzhqVar.initialize();
        this.zzol = zzhqVar;
        zzgp zzgpVar = new zzgp(this);
        zzgpVar.initialize();
        this.zzom = zzgpVar;
        zziw zziwVar = new zziw(this);
        zziwVar.initialize();
        this.zzoi = zziwVar;
        zzhl zzhlVar = new zzhl(this);
        zzhlVar.initialize();
        this.zzoo = zzhlVar;
        zzfc zzfcVar = new zzfc(this);
        zzfcVar.initialize();
        this.zzoh = zzfcVar;
        if (zzgmVar.zzpr != null && zzgmVar.zzpr.zzs != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.zzob.getApplicationContext() instanceof Application) {
            zzgp zzq = zzq();
            if (zzq.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.getContext().getApplicationContext();
                if (zzq.zzpu == null) {
                    zzq.zzpu = new zzhj(zzq, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zzpu);
                    application.registerActivityLifecycleCallbacks(zzq.zzpu);
                    zzq.zzab().zzgs().zzao("Registered activity lifecycle callback");
                }
            }
        } else {
            zzab().zzgn().zzao("Application context is not an Application");
        }
        this.zzoh.zza(new zzfl(this, zzgmVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzgm zzgmVar) {
        String concat;
        zzeh zzehVar;
        zzaa().zzo();
        zzs.zzbm();
        zzac zzacVar = new zzac(this);
        zzacVar.initialize();
        this.zzor = zzacVar;
        zzdy zzdyVar = new zzdy(this, zzgmVar.zzs);
        zzdyVar.initialize();
        this.zzos = zzdyVar;
        zzeb zzebVar = new zzeb(this);
        zzebVar.initialize();
        this.zzop = zzebVar;
        zzhv zzhvVar = new zzhv(this);
        zzhvVar.initialize();
        this.zzoq = zzhvVar;
        this.zzoj.zzbj();
        this.zzof.zzbj();
        this.zzot = new zzeu(this);
        this.zzos.zzbj();
        zzab().zzgq().zza("App measurement is starting up, version", Long.valueOf(this.zzoe.zzao()));
        zzab().zzgq().zzao("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzag = zzdyVar.zzag();
        if (TextUtils.isEmpty(this.zzv)) {
            if (zzz().zzbr(zzag)) {
                zzehVar = zzab().zzgq();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzeh zzgq = zzab().zzgq();
                String valueOf = String.valueOf(zzag);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzehVar = zzgq;
            }
            zzehVar.zzao(concat);
        }
        zzab().zzgr().zzao("Debug-level message logging enabled");
        if (this.zzoz != this.zzpa.get()) {
            zzab().zzgk().zza("Not all components initialized", Integer.valueOf(this.zzoz), Integer.valueOf(this.zzpa.get()));
        }
        this.zzdh = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void start() {
        zzaa().zzo();
        if (zzac().zzlj.get() == 0) {
            zzac().zzlj.set(this.zzac.currentTimeMillis());
        }
        if (Long.valueOf(zzac().zzlo.get()).longValue() == 0) {
            zzab().zzgs().zza("Persisting first open", Long.valueOf(this.zzdr));
            zzac().zzlo.set(this.zzdr);
        }
        if (!zzie()) {
            if (isEnabled()) {
                if (!zzz().zzbp("android.permission.INTERNET")) {
                    zzab().zzgk().zzao("App is missing INTERNET permission");
                }
                if (!zzz().zzbp("android.permission.ACCESS_NETWORK_STATE")) {
                    zzab().zzgk().zzao("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zzob).isCallerInstantApp() && !this.zzoe.zzbw()) {
                    if (!zzez.zzl(this.zzob)) {
                        zzab().zzgk().zzao("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzjs.zzb(this.zzob, false)) {
                        zzab().zzgk().zzao("AppMeasurementService not registered/enabled");
                    }
                }
                zzab().zzgk().zzao("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzr().getGmpAppId()) || !TextUtils.isEmpty(zzr().zzah())) {
                zzz();
                if (zzjs.zza(zzr().getGmpAppId(), zzac().zzhc(), zzr().zzah(), zzac().zzhd())) {
                    zzab().zzgq().zzao("Rechecking which service to use due to a GMP App Id change");
                    zzac().zzhf();
                    zzu().resetAnalyticsData();
                    this.zzoq.disconnect();
                    this.zzoq.zzis();
                    zzac().zzlo.set(this.zzdr);
                    zzac().zzlq.zzau(null);
                }
                zzac().zzar(zzr().getGmpAppId());
                zzac().zzas(zzr().zzah());
            }
            zzq().zzbg(zzac().zzlq.zzho());
            if (!TextUtils.isEmpty(zzr().getGmpAppId()) || !TextUtils.isEmpty(zzr().zzah())) {
                boolean isEnabled = isEnabled();
                if (!zzac().zzhj() && !this.zzoe.zzbp()) {
                    zzac().zzf(!isEnabled);
                }
                if (isEnabled) {
                    zzq().zzim();
                }
                zzs().zza(new AtomicReference<>());
            }
        }
        zzac().zzly.set(this.zzoe.zza(zzak.zziu));
        zzac().zzlz.set(this.zzoe.zza(zzak.zziv));
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final zzr zzae() {
        return this.zzfv;
    }

    public final zzs zzad() {
        return this.zzoe;
    }

    public final zzeo zzac() {
        zza((zzgf) this.zzof);
        return this.zzof;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final zzef zzab() {
        zza((zzge) this.zzog);
        return this.zzog;
    }

    public final zzef zzhs() {
        zzef zzefVar = this.zzog;
        if (zzefVar == null || !zzefVar.isInitialized()) {
            return null;
        }
        return this.zzog;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final zzfc zzaa() {
        zza((zzge) this.zzoh);
        return this.zzoh;
    }

    public final zziw zzv() {
        zza((zzg) this.zzoi);
        return this.zzoi;
    }

    public final zzeu zzht() {
        return this.zzot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfc zzhu() {
        return this.zzoh;
    }

    public final zzgp zzq() {
        zza((zzg) this.zzom);
        return this.zzom;
    }

    public final zzjs zzz() {
        zza((zzgf) this.zzoj);
        return this.zzoj;
    }

    public final zzed zzy() {
        zza((zzgf) this.zzok);
        return this.zzok;
    }

    public final zzeb zzu() {
        zza((zzg) this.zzop);
        return this.zzop;
    }

    private final zzhl zzhv() {
        zza((zzge) this.zzoo);
        return this.zzoo;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final Context getContext() {
        return this.zzob;
    }

    public final boolean zzhw() {
        return TextUtils.isEmpty(this.zzv);
    }

    public final String zzhx() {
        return this.zzv;
    }

    public final String zzhy() {
        return this.zzoc;
    }

    public final String zzhz() {
        return this.zzod;
    }

    public final boolean zzia() {
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final Clock zzx() {
        return this.zzac;
    }

    public final zzhq zzt() {
        zza((zzg) this.zzol);
        return this.zzol;
    }

    public final zzhv zzs() {
        zza((zzg) this.zzoq);
        return this.zzoq;
    }

    public final zzac zzw() {
        zza((zzge) this.zzor);
        return this.zzor;
    }

    public final zzdy zzr() {
        zza((zzg) this.zzos);
        return this.zzos;
    }

    public final zza zzp() {
        zza zzaVar = this.zzon;
        if (zzaVar != null) {
            return zzaVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzfj zza(Context context, String str, String str2, Bundle bundle) {
        return zza(context, new com.google.android.gms.internal.measurement.zzx(0L, 0L, true, null, null, null, bundle));
    }

    public static zzfj zza(Context context, com.google.android.gms.internal.measurement.zzx zzxVar) {
        if (zzxVar != null && (zzxVar.origin == null || zzxVar.zzv == null)) {
            zzxVar = new com.google.android.gms.internal.measurement.zzx(zzxVar.zzr, zzxVar.zzs, zzxVar.zzt, zzxVar.zzu, null, null, zzxVar.zzw);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzoa == null) {
            synchronized (zzfj.class) {
                if (zzoa == null) {
                    zzoa = new zzfj(new zzgm(context, zzxVar));
                }
            }
        } else if (zzxVar != null && zzxVar.zzw != null && zzxVar.zzw.containsKey("dataCollectionDefaultEnabled")) {
            zzoa.zza(zzxVar.zzw.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zzoa;
    }

    private final void zzbi() {
        if (!this.zzdh) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    private static void zza(zzge zzgeVar) {
        if (zzgeVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzgeVar.isInitialized()) {
            return;
        }
        String valueOf = String.valueOf(zzgeVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void zza(zzg zzgVar) {
        if (zzgVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzgVar.isInitialized()) {
            return;
        }
        String valueOf = String.valueOf(zzgVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void zza(zzgf zzgfVar) {
        if (zzgfVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        this.zzow = Boolean.valueOf(z);
    }

    public final boolean zzib() {
        return this.zzow != null && this.zzow.booleanValue();
    }

    public final boolean isEnabled() {
        boolean z;
        zzaa().zzo();
        zzbi();
        if (this.zzoe.zza(zzak.zzil)) {
            if (this.zzoe.zzbp()) {
                return false;
            }
            Boolean bool = this.zzoy;
            if (bool == null || !bool.booleanValue()) {
                Boolean zzhg = zzac().zzhg();
                if (zzhg != null) {
                    return zzhg.booleanValue();
                }
                Boolean zzbq = this.zzoe.zzbq();
                if (zzbq != null) {
                    return zzbq.booleanValue();
                }
                Boolean bool2 = this.zzox;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                    return false;
                }
                if (!this.zzoe.zza(zzak.zzig) || this.zzow == null) {
                    return true;
                }
                return this.zzow.booleanValue();
            }
            return false;
        } else if (this.zzoe.zzbp()) {
            return false;
        } else {
            Boolean zzbq2 = this.zzoe.zzbq();
            if (zzbq2 != null) {
                z = zzbq2.booleanValue();
            } else {
                z = !GoogleServices.isMeasurementExplicitlyDisabled();
                if (z && this.zzow != null && zzak.zzig.get(null).booleanValue()) {
                    z = this.zzow.booleanValue();
                }
            }
            return zzac().zze(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzic() {
        Long valueOf = Long.valueOf(zzac().zzlo.get());
        if (valueOf.longValue() == 0) {
            return this.zzdr;
        }
        return Math.min(this.zzdr, valueOf.longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzge zzgeVar) {
        this.zzoz++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzg zzgVar) {
        this.zzoz++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzid() {
        this.zzpa.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzie() {
        zzbi();
        zzaa().zzo();
        Boolean bool = this.zzou;
        if (bool == null || this.zzov == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzac.elapsedRealtime() - this.zzov) > 1000)) {
            this.zzov = this.zzac.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzz().zzbp("android.permission.INTERNET") && zzz().zzbp("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzob).isCallerInstantApp() || this.zzoe.zzbw() || (zzez.zzl(this.zzob) && zzjs.zzb(this.zzob, false))));
            this.zzou = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzz().zzr(zzr().getGmpAppId(), zzr().zzah()) && TextUtils.isEmpty(zzr().zzah())) {
                    z = false;
                }
                this.zzou = Boolean.valueOf(z);
            }
        }
        return this.zzou.booleanValue();
    }

    public final void zza(final com.google.android.gms.internal.measurement.zzp zzpVar) {
        zzaa().zzo();
        zza((zzge) zzhv());
        String zzag = zzr().zzag();
        Pair<String, Boolean> zzap = zzac().zzap(zzag);
        if (!this.zzoe.zzbr().booleanValue() || ((Boolean) zzap.second).booleanValue()) {
            zzab().zzgr().zzao("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            zzz().zzb(zzpVar, "");
        } else if (!zzhv().zzgv()) {
            zzab().zzgn().zzao("Network is not available for Deferred Deep Link request. Skipping");
            zzz().zzb(zzpVar, "");
        } else {
            URL zza = zzz().zza(zzr().zzad().zzao(), zzag, (String) zzap.first);
            zzhl zzhv = zzhv();
            zzhk zzhkVar = new zzhk(this, zzpVar) { // from class: com.google.android.gms.measurement.internal.zzfi
                private final zzfj zzny;
                private final com.google.android.gms.internal.measurement.zzp zznz;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzny = this;
                    this.zznz = zzpVar;
                }

                @Override // com.google.android.gms.measurement.internal.zzhk
                public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
                    this.zzny.zza(this.zznz, str, i, th, bArr, map);
                }
            };
            zzhv.zzo();
            zzhv.zzbi();
            Preconditions.checkNotNull(zza);
            Preconditions.checkNotNull(zzhkVar);
            zzhv.zzaa().zzb(new zzhn(zzhv, zzag, zza, null, null, zzhkVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzp zzpVar, String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzab().zzgn().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            zzz().zzb(zzpVar, "");
        } else if (bArr.length == 0) {
            zzz().zzb(zzpVar, "");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                zzjs zzz = zzz();
                zzz.zzm();
                if (TextUtils.isEmpty(optString) || (queryIntentActivities = zzz.getContext().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    zzab().zzgn().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    zzz().zzb(zzpVar, "");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("deeplink", optString);
                bundle.putString("gclid", optString2);
                this.zzom.logEvent("auto", "_cmp", bundle);
                zzz().zzb(zzpVar, optString);
            } catch (JSONException e) {
                zzab().zzgk().zza("Failed to parse the Deferred Deep Link response. exception", e);
                zzz().zzb(zzpVar, "");
            }
        }
    }
}
