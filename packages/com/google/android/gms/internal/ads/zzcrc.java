package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrc implements zzcru<zzcqz> {
    private final ScheduledExecutorService zzffn;
    private final zzcwe zzfga;
    private final zzddl zzfoa;
    private final zzclp zzgae;
    private String zzgdm;
    private final zzclr zzgft;
    private final Context zzlk;

    public zzcrc(zzddl zzddlVar, ScheduledExecutorService scheduledExecutorService, String str, zzclr zzclrVar, Context context, zzcwe zzcweVar, zzclp zzclpVar) {
        this.zzfoa = zzddlVar;
        this.zzffn = scheduledExecutorService;
        this.zzgdm = str;
        this.zzgft = zzclrVar;
        this.zzlk = context;
        this.zzfga = zzcweVar;
        this.zzgae = zzclpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcqz> zzalv() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcmi)).booleanValue()) {
            return zzdcy.zzb(this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcrb
                private final zzcrc zzgfs;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgfs = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzgfs.zzamf();
                }
            }), new zzdcj(this) { // from class: com.google.android.gms.internal.ads.zzcre
                private final zzcrc zzgfs;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgfs = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdcj
                public final zzddi zzf(Object obj) {
                    return this.zzgfs.zzh((List) obj);
                }
            }, this.zzfoa);
        }
        return zzdcy.zzah(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zzcqz zzg(List list) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((zzddi) it.next()).get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzcqz(jSONArray.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, zzaxv zzaxvVar, Bundle bundle, List list) {
        try {
            this.zzgae.zzgb(str);
            zzamd zzgc = this.zzgae.zzgc(str);
            if (zzgc == null) {
                throw new Exception("Missing Adapter.");
            }
            zzgc.zza(ObjectWrapper.wrap(this.zzlk), this.zzgdm, bundle, (Bundle) list.get(0), this.zzfga.zzbll, new zzclx(str, zzgc, zzaxvVar));
        } catch (Throwable th) {
            zzaxvVar.setException(new Exception("Error calling adapter"));
            String valueOf = String.valueOf(str);
            zzaug.zzc(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddi zzh(final List list) throws Exception {
        return zzdcy.zzh(list).zza(new Callable(list) { // from class: com.google.android.gms.internal.ads.zzcrg
            private final List zzgfv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfv = list;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcrc.zzg(this.zzgfv);
            }
        }, this.zzfoa);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ List zzamf() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : this.zzgft.zzs(this.zzgdm, this.zzfga.zzgkh).entrySet()) {
            final String key = entry.getKey();
            final List<Bundle> value = entry.getValue();
            final zzaxv zzaxvVar = new zzaxv();
            final Bundle bundle = this.zzfga.zzgkg.zzcce != null ? this.zzfga.zzgkg.zzcce.getBundle(key) : null;
            arrayList.add(zzdcy.zza(zzaxvVar, ((Long) zzuv.zzon().zzd(zzza.zzcmh)).longValue(), TimeUnit.MILLISECONDS, this.zzffn));
            this.zzfoa.execute(new Runnable(this, key, zzaxvVar, bundle, value) { // from class: com.google.android.gms.internal.ads.zzcrd
                private final String zzcyz;
                private final zzaxv zzftc;
                private final List zzftw;
                private final zzcrc zzgfs;
                private final Bundle zzgfu;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgfs = this;
                    this.zzcyz = key;
                    this.zzftc = zzaxvVar;
                    this.zzgfu = bundle;
                    this.zzftw = value;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgfs.zza(this.zzcyz, this.zzftc, this.zzgfu, this.zzftw);
                }
            });
        }
        return arrayList;
    }
}
