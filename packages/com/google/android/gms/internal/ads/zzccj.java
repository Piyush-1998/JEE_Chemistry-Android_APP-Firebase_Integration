package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzccj {
    private final Executor executor;
    private final zzaxl zzblh;
    private final Context zzcfz;
    private final Executor zzfbx;
    private final ScheduledExecutorService zzfcx;
    private final WeakReference<Context> zzfsx;
    private final zzchm zzfsy;
    private final zzcbt zzfsz;
    private boolean zzfst = false;
    private boolean zzfsu = false;
    private final zzaxv<Boolean> zzfsw = new zzaxv<>();
    private Map<String, zzafr> zzfta = new ConcurrentHashMap();
    private final long zzfsv = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();

    public zzccj(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, zzchm zzchmVar, ScheduledExecutorService scheduledExecutorService, zzcbt zzcbtVar, zzaxl zzaxlVar) {
        this.zzfsy = zzchmVar;
        this.zzcfz = context;
        this.zzfsx = weakReference;
        this.executor = executor2;
        this.zzfcx = scheduledExecutorService;
        this.zzfbx = executor;
        this.zzfsz = zzcbtVar;
        this.zzblh = zzaxlVar;
        zza("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public final void zzb(final zzafu zzafuVar) {
        this.zzfsw.addListener(new Runnable(this, zzafuVar) { // from class: com.google.android.gms.internal.ads.zzcci
            private final zzccj zzfsr;
            private final zzafu zzfss;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsr = this;
                this.zzfss = zzafuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfsr.zzc(this.zzfss);
            }
        }, this.zzfbx);
    }

    public final void zzaka() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmo)).booleanValue()) {
            if (!((Boolean) zzuv.zzon().zzd(zzza.zzcmq)).booleanValue()) {
                if (this.zzblh.zzdwf >= ((Integer) zzuv.zzon().zzd(zzza.zzcmp)).intValue()) {
                    if (this.zzfst) {
                        return;
                    }
                    synchronized (this) {
                        if (this.zzfst) {
                            return;
                        }
                        this.zzfsz.zzajx();
                        this.zzfsw.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzccl
                            private final zzccj zzfsr;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzfsr = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzfsr.zzakf();
                            }
                        }, this.executor);
                        this.zzfst = true;
                        zzddi<String> zzakc = zzakc();
                        this.zzfcx.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzccn
                            private final zzccj zzfsr;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzfsr = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzfsr.zzake();
                            }
                        }, ((Long) zzuv.zzon().zzd(zzza.zzcms)).longValue(), TimeUnit.SECONDS);
                        zzdcy.zza(zzakc, new zzccq(this), this.executor);
                        return;
                    }
                }
            }
        }
        zza("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zzfsw.set(false);
    }

    public final List<zzafr> zzakb() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzfta.keySet()) {
            zzafr zzafrVar = this.zzfta.get(str);
            arrayList.add(new zzafr(str, zzafrVar.zzcyo, zzafrVar.zzcyp, zzafrVar.description));
        }
        return arrayList;
    }

    private final synchronized zzddi<String> zzakc() {
        String zzun = com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzve().zzun();
        if (!TextUtils.isEmpty(zzun)) {
            return zzdcy.zzah(zzun);
        }
        final zzaxv zzaxvVar = new zzaxv();
        com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzb(new Runnable(this, zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzcck
            private final zzccj zzfsr;
            private final zzaxv zzftb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsr = this;
                this.zzftb = zzaxvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfsr.zza(this.zzftb);
            }
        });
        return zzaxvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzga(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final zzaxv zzaxvVar = new zzaxv();
                zzddi zza = zzdcy.zza(zzaxvVar, ((Long) zzuv.zzon().zzd(zzza.zzcmr)).longValue(), TimeUnit.SECONDS, this.zzfcx);
                this.zzfsz.zzfy(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
                Iterator<String> it = keys;
                zza.addListener(new Runnable(this, obj, zzaxvVar, next, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzccm
                    private final Object zzdbp;
                    private final String zzfqz;
                    private final zzccj zzfsr;
                    private final zzaxv zzftc;
                    private final long zzftd;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsr = this;
                        this.zzdbp = obj;
                        this.zzftc = zzaxvVar;
                        this.zzfqz = next;
                        this.zzftd = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzfsr.zza(this.zzdbp, this.zzftc, this.zzfqz, this.zzftd);
                    }
                }, this.executor);
                arrayList.add(zza);
                final zzccs zzccsVar = new zzccs(this, obj, next, elapsedRealtime, zzaxvVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzagb(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                zza(next, false, "", 0);
                try {
                    try {
                        final zzcwm zze = this.zzfsy.zze(next, new JSONObject());
                        this.zzfbx.execute(new Runnable(this, zze, zzccsVar, arrayList2, next) { // from class: com.google.android.gms.internal.ads.zzcco
                            private final String zzeft;
                            private final zzccj zzfsr;
                            private final zzcwm zzfte;
                            private final zzaft zzftf;
                            private final List zzftg;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzfsr = this;
                                this.zzfte = zze;
                                this.zzftf = zzccsVar;
                                this.zzftg = arrayList2;
                                this.zzeft = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzfsr.zza(this.zzfte, this.zzftf, this.zzftg, this.zzeft);
                            }
                        });
                    } catch (RemoteException e) {
                        zzaxi.zzc("", e);
                    }
                } catch (zzcwh unused2) {
                    zzccsVar.onInitializationFailed("Failed to create Adapter.");
                }
                keys = it;
            }
            zzdcy.zzh(arrayList).zza(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzccp
                private final zzccj zzfsr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfsr = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzfsr.zzakd();
                }
            }, this.executor);
        } catch (JSONException e2) {
            zzaug.zza("Malformed CLD response", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, boolean z, String str2, int i) {
        this.zzfta.put(str, new zzafr(str, z, i, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcwm zzcwmVar, zzaft zzaftVar, List list, String str) {
        try {
            try {
                Context context = this.zzfsx.get();
                if (context == null) {
                    context = this.zzcfz;
                }
                zzcwmVar.zza(context, zzaftVar, list);
            } catch (RemoteException e) {
                zzaxi.zzc("", e);
            }
        } catch (zzcwh unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzaftVar.onInitializationFailed(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzakd() throws Exception {
        this.zzfsw.set(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzaxv zzaxvVar, String str, long j) {
        synchronized (obj) {
            if (!zzaxvVar.isDone()) {
                zza(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - j));
                this.zzfsz.zzr(str, "timeout");
                zzaxvVar.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzake() {
        synchronized (this) {
            if (this.zzfsu) {
                return;
            }
            zza("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - this.zzfsv));
            this.zzfsw.setException(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final zzaxv zzaxvVar) {
        this.executor.execute(new Runnable(this, zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzccr
            private final zzccj zzfsr;
            private final zzaxv zzftb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsr = this;
                this.zzftb = zzaxvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzaxv zzaxvVar2 = this.zzftb;
                String zzun = com.google.android.gms.ads.internal.zzq.zzkn().zzuh().zzve().zzun();
                if (!TextUtils.isEmpty(zzun)) {
                    zzaxvVar2.set(zzun);
                } else {
                    zzaxvVar2.setException(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzakf() {
        this.zzfsz.zzajy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzafu zzafuVar) {
        try {
            zzafuVar.zzc(zzakb());
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }
}
