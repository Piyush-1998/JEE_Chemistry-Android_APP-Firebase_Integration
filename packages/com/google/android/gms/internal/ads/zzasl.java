package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzasl {
    private final AtomicReference<ThreadPoolExecutor> zzdph = new AtomicReference<>(null);
    private final Object zzdpi = new Object();
    private String zzdpj = null;
    private String zzdpk = null;
    private final AtomicBoolean zzdpl = new AtomicBoolean(false);
    private final AtomicInteger zzdpm = new AtomicInteger(-1);
    private final AtomicReference<Object> zzdpn = new AtomicReference<>(null);
    private final AtomicReference<Object> zzdpo = new AtomicReference<>(null);
    private final ConcurrentMap<String, Method> zzdpp = new ConcurrentHashMap(9);
    private final AtomicReference<zzbeb> zzdpq = new AtomicReference<>(null);
    private final BlockingQueue<FutureTask<?>> zzdpr = new ArrayBlockingQueue(20);
    private final Object zzdps = new Object();

    public final boolean zzab(Context context) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcjf)).booleanValue() && !this.zzdpl.get()) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcjp)).booleanValue()) {
                return true;
            }
            if (this.zzdpm.get() == -1) {
                zzuv.zzoj();
                if (!zzawy.zzc(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzuv.zzoj();
                    if (zzawy.zzbk(context)) {
                        zzaug.zzeu("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzdpm.set(0);
                    }
                }
                this.zzdpm.set(1);
            }
            if (this.zzdpm.get() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzac(Context context) {
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcjn)).booleanValue()) {
            if (!((Boolean) zzuv.zzon().zzd(zzza.zzcjm)).booleanValue()) {
                return false;
            }
        }
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcjo)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final void zza(Context context, zzyd zzydVar) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcjs)).booleanValue() && zzab(context) && zzac(context)) {
            synchronized (this.zzdps) {
            }
        }
    }

    public final void zza(Context context, zztx zztxVar) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcjs)).booleanValue() && zzab(context) && zzac(context)) {
            synchronized (this.zzdps) {
            }
        }
    }

    public final void zze(Context context, final String str) {
        if (zzab(context)) {
            if (zzac(context)) {
                zza("beginAdUnitExposure", new zzatb(str) { // from class: com.google.android.gms.internal.ads.zzaso
                    private final String zzczh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzczh = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzatb
                    public final void zzb(zzbeb zzbebVar) {
                        zzbebVar.beginAdUnitExposure(this.zzczh);
                    }
                });
            } else {
                zza(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzf(Context context, final String str) {
        if (zzab(context)) {
            if (zzac(context)) {
                zza("endAdUnitExposure", new zzatb(str) { // from class: com.google.android.gms.internal.ads.zzasr
                    private final String zzczh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzczh = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzatb
                    public final void zzb(zzbeb zzbebVar) {
                        zzbebVar.endAdUnitExposure(this.zzczh);
                    }
                });
            } else {
                zza(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String zzad(Context context) {
        if (zzab(context)) {
            if (zzac(context)) {
                return (String) zza("getCurrentScreenNameOrScreenClass", "", zzasu.zzdpu);
            }
            if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdpn, true)) {
                try {
                    String str = (String) zzm(context, "getCurrentScreenName").invoke(this.zzdpn.get(), new Object[0]);
                    if (str == null) {
                        str = (String) zzm(context, "getCurrentScreenClass").invoke(this.zzdpn.get(), new Object[0]);
                    }
                    return str != null ? str : "";
                } catch (Exception e) {
                    zza(e, "getCurrentScreenName", false);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public final void zzg(final Context context, final String str) {
        if (zzab(context) && (context instanceof Activity)) {
            if (zzac(context)) {
                zza("setScreenName", new zzatb(context, str) { // from class: com.google.android.gms.internal.ads.zzast
                    private final String zzcyz;
                    private final Context zzdpy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdpy = context;
                        this.zzcyz = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzatb
                    public final void zzb(zzbeb zzbebVar) {
                        Context context2 = this.zzdpy;
                        zzbebVar.zzb(ObjectWrapper.wrap(context2), this.zzcyz, context2.getPackageName());
                    }
                });
            } else if (zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzdpo, false)) {
                try {
                    zzn(context, "setCurrentScreen").invoke(this.zzdpo.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception e) {
                    zza(e, "setCurrentScreen", false);
                }
            }
        }
    }

    public final String zzae(Context context) {
        if (zzab(context)) {
            synchronized (this.zzdpi) {
                if (this.zzdpj != null) {
                    return this.zzdpj;
                }
                if (zzac(context)) {
                    this.zzdpj = (String) zza("getGmpAppId", this.zzdpj, zzasw.zzdpu);
                } else {
                    this.zzdpj = (String) zza("getGmpAppId", context);
                }
                return this.zzdpj;
            }
        }
        return null;
    }

    public final String zzaf(final Context context) {
        if (zzab(context)) {
            long longValue = ((Long) zzuv.zzon().zzd(zzza.zzcjk)).longValue();
            if (zzac(context)) {
                try {
                    if (longValue < 0) {
                        return (String) zza("getAppInstanceId", (String) null, zzasv.zzdpu);
                    }
                    return (String) zzts().submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzasy
                        private final zzasl zzdpv;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdpv = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdpv.zztt();
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    return "TIME_OUT";
                } catch (Exception unused2) {
                    return null;
                }
            } else if (longValue < 0) {
                return (String) zza("getAppInstanceId", context);
            } else {
                try {
                    return (String) zzts().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.zzasx
                        private final Context zzcfb;
                        private final zzasl zzdpv;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdpv = this;
                            this.zzcfb = context;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdpv.zzaj(this.zzcfb);
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused3) {
                    return "TIME_OUT";
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String zzag(Context context) {
        if (zzab(context)) {
            if (zzac(context)) {
                Long l = (Long) zza("getAdEventId", (String) null, zzata.zzdpu);
                if (l != null) {
                    return Long.toString(l.longValue());
                }
                return null;
            }
            Object zza = zza("generateEventId", context);
            if (zza != null) {
                return zza.toString();
            }
            return null;
        }
        return null;
    }

    public final String zzah(Context context) {
        if (zzab(context)) {
            synchronized (this.zzdpi) {
                if (this.zzdpk != null) {
                    return this.zzdpk;
                }
                if (zzac(context)) {
                    this.zzdpk = (String) zza("getAppIdOrigin", this.zzdpk, zzasn.zzdpu);
                } else {
                    this.zzdpk = "fa";
                }
                return this.zzdpk;
            }
        }
        return null;
    }

    public final void zzh(Context context, String str) {
        zza(context, "_ac", str, (Bundle) null);
    }

    public final void zzi(Context context, String str) {
        zza(context, "_ai", str, (Bundle) null);
    }

    public final void zzj(Context context, String str) {
        zza(context, "_aq", str, (Bundle) null);
    }

    public final void zzk(Context context, String str) {
        zza(context, "_aa", str, (Bundle) null);
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzab(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("type", str3);
            bundle.putInt(AppMeasurementSdk.ConditionalUserProperty.VALUE, i);
            zza(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzaug.zzdy(sb.toString());
        }
    }

    private final void zza(Context context, final String str, String str2, Bundle bundle) {
        if (zzab(context)) {
            final Bundle zzl = zzl(str2, str);
            if (bundle != null) {
                zzl.putAll(bundle);
            }
            if (zzac(context)) {
                zza("logEventInternal", new zzatb(str, zzl) { // from class: com.google.android.gms.internal.ads.zzasq
                    private final String zzczh;
                    private final Bundle zzdpx;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzczh = str;
                        this.zzdpx = zzl;
                    }

                    @Override // com.google.android.gms.internal.ads.zzatb
                    public final void zzb(zzbeb zzbebVar) {
                        zzbebVar.logEvent("am", this.zzczh, this.zzdpx);
                    }
                });
            } else if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdpn, true)) {
                try {
                    zzai(context).invoke(this.zzdpn.get(), "am", str, zzl);
                } catch (Exception e) {
                    zza(e, "logEventInternal", true);
                }
            }
        }
    }

    private static Bundle zzl(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzaug.zzc(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method zzai(Context context) {
        Method method = this.zzdpp.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.zzdpp.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    private final Method zzl(Context context, String str) {
        Method method = this.zzdpp.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.zzdpp.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzm(Context context, String str) {
        Method method = this.zzdpp.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzdpp.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzn(Context context, String str) {
        Method method = this.zzdpp.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.zzdpp.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final void zza(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdpn, true)) {
            try {
                zzl(context, str2).invoke(this.zzdpn.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzaug.zzdy(sb.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Object zza(String str, Context context) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdpn, true)) {
            try {
                return zzm(context, str).invoke(this.zzdpn.get(), new Object[0]);
            } catch (Exception e) {
                zza(e, str, true);
                return null;
            }
        }
        return null;
    }

    private final void zza(Exception exc, String str, boolean z) {
        if (this.zzdpl.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        zzaug.zzeu(sb.toString());
        if (z) {
            zzaug.zzeu("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zzdpl.set(true);
        }
    }

    private final ThreadPoolExecutor zzts() {
        if (this.zzdph.get() == null) {
            this.zzdph.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzuv.zzon().zzd(zzza.zzcjl)).intValue(), ((Integer) zzuv.zzon().zzd(zzza.zzcjl)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzasz(this)));
        }
        return this.zzdph.get();
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e) {
                zza(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void zza(final String str, final zzatb zzatbVar) {
        synchronized (this.zzdpq) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, zzatbVar, str) { // from class: com.google.android.gms.internal.ads.zzasp
                private final String zzdbt;
                private final zzasl zzdpv;
                private final zzatb zzdpw;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdpv = this;
                    this.zzdpw = zzatbVar;
                    this.zzdbt = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdpv.zza(this.zzdpw, this.zzdbt);
                }
            }, null);
            if (this.zzdpq.get() != null) {
                futureTask.run();
            } else {
                this.zzdpr.offer(futureTask);
            }
        }
    }

    private final <T> T zza(String str, T t, zzatc<T> zzatcVar) {
        synchronized (this.zzdpq) {
            if (this.zzdpq.get() != null) {
                try {
                    return zzatcVar.zza(this.zzdpq.get());
                } catch (Exception e) {
                    zza(e, str, false);
                }
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzatb zzatbVar, String str) {
        if (this.zzdpq.get() != null) {
            try {
                zzatbVar.zzb(this.zzdpq.get());
            } catch (Exception e) {
                zza(e, str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzaj(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zztt() throws Exception {
        return (String) zza("getAppInstanceId", (String) null, zzass.zzdpu);
    }
}
