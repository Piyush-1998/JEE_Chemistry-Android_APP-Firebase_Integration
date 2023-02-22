package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcen extends zzaou {
    private final Executor zzfbx;
    private final zzapr zzfvf;
    private final zzaps zzfvg;
    private final zzbgq zzfvh;
    private final Context zzlk;

    public zzcen(Context context, Executor executor, zzapr zzaprVar, zzbgq zzbgqVar, zzaps zzapsVar) {
        zzza.initialize(context);
        this.zzlk = context;
        this.zzfbx = executor;
        this.zzfvf = zzaprVar;
        this.zzfvg = zzapsVar;
        this.zzfvh = zzbgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final zzaon zza(zzaol zzaolVar) throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(zzaol zzaolVar, zzaow zzaowVar) throws RemoteException {
    }

    public final zzddi<InputStream> zzh(zzape zzapeVar) {
        zzaix zza = com.google.android.gms.ads.internal.zzq.zzkw().zza(this.zzlk, zzaxl.zzwo());
        final zzcsm zza2 = this.zzfvh.zza(zzapeVar);
        zzdcj zzdcjVar = new zzdcj(zza2) { // from class: com.google.android.gms.internal.ads.zzcem
            private final zzcsm zzfve;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfve = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfve.zzacs().zzs(com.google.android.gms.ads.internal.zzq.zzkj().zzd((Bundle) obj));
            }
        };
        zzcxn zzcxnVar = zzcep.zzftu;
        zzaip zza3 = zza.zza("AFMA_getAdDictionary", zzais.zzday, zzceo.zzdba);
        zzaip zza4 = zza.zza("google.afma.response.normalize", zzcew.zzfvn, zzais.zzdaz);
        zzcfb zzcfbVar = new zzcfb(this.zzlk, zzapeVar.zzdio.zzblz, this.zzfvf, zzapeVar.zzdjp);
        zzcyg zzacu = zza2.zzacu();
        final zzcxp zzant = zzacu.zza((zzcyg) zzcyd.GMS_SIGNALS, zzdcy.zzah(zzapeVar.zzdma)).zza(zzdcjVar).zzb(zzcxnVar).zzant();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcrs)).booleanValue()) {
            return zzacu.zza((zzcyg) zzcyd.AD_REQUEST, (zzddi) zzant).zza(zza.zza("google.afma.request.getAdResponse", zzais.zzday, zzais.zzday)).zzb(zzcer.zzftu).zzant();
        }
        final zzcxp zzant2 = zzacu.zza((zzcyg) zzcyd.BUILD_URL, (zzddi) zzant).zza(zza3).zzant();
        final zzcxp zzant3 = zzacu.zza((zzcyg) zzcyd.HTTP, zzant2, zzant).zzb(new Callable(zzant, zzant2) { // from class: com.google.android.gms.internal.ads.zzceq
            private final zzddi zzfoe;
            private final zzddi zzfov;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfov = zzant;
                this.zzfoe = zzant2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzcfa((JSONObject) this.zzfov.get(), (zzapk) this.zzfoe.get());
            }
        }).zzb(zzcfbVar).zzant();
        return zzacu.zza((zzcyg) zzcyd.PRE_PROCESS, zzant, zzant2, zzant3).zzb(new Callable(zzant3, zzant, zzant2) { // from class: com.google.android.gms.internal.ads.zzcet
            private final zzddi zzffr;
            private final zzddi zzfoe;
            private final zzddi zzfov;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfov = zzant3;
                this.zzfoe = zzant;
                this.zzffr = zzant2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzcew((zzcfd) this.zzfov.get(), (JSONObject) this.zzfoe.get(), (zzapk) this.zzffr.get());
            }
        }).zza(zza4).zzant();
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(zzape zzapeVar, zzaoy zzaoyVar) {
        zzddi<InputStream> zzh = zzh(zzapeVar);
        zza(zzh, zzaoyVar);
        zzh.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzces
            private final zzcen zzfvi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvi = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfvi.zzakk();
            }
        }, this.zzfbx);
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zzb(zzape zzapeVar, zzaoy zzaoyVar) {
        zzddi<InputStream> zzant;
        zzaix zza = com.google.android.gms.ads.internal.zzq.zzkw().zza(this.zzlk, zzaxl.zzwo());
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcsk)).booleanValue()) {
            zzant = zzdcy.zzi(new Exception("Signal collection disabled."));
        } else {
            zzcsm zza2 = this.zzfvh.zza(zzapeVar);
            final zzcrt<JSONObject> zzact = this.zzfvh.zza(zzapeVar).zzact();
            zzant = zza2.zzacu().zza((zzcyg) zzcyd.GET_SIGNALS, zzdcy.zzah(zzapeVar.zzdma)).zza(new zzdcj(zzact) { // from class: com.google.android.gms.internal.ads.zzcev
                private final zzcrt zzfvj;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfvj = zzact;
                }

                @Override // com.google.android.gms.internal.ads.zzdcj
                public final zzddi zzf(Object obj) {
                    return this.zzfvj.zzs(com.google.android.gms.ads.internal.zzq.zzkj().zzd((Bundle) obj));
                }
            }).zzw(zzcyd.JS_SIGNALS).zza(zza.zza("google.afma.request.getSignals", zzais.zzday, zzais.zzdaz)).zzant();
        }
        zza(zzant, zzaoyVar);
    }

    private final void zza(zzddi<InputStream> zzddiVar, zzaoy zzaoyVar) {
        zzdcy.zza(zzdcy.zzb(zzddiVar, new zzdcj(this) { // from class: com.google.android.gms.internal.ads.zzceu
            private final zzcen zzfvi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvi = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return zzdcy.zzah(zzcwo.zze((InputStream) obj));
            }
        }, zzaxn.zzdwi), new zzcex(this, zzaoyVar), zzaxn.zzdwn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzakk() {
        zzaxr.zza(this.zzfvg.zztj(), "persistFlags");
    }
}
