package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzahn {
    private final Object lock;
    private int status;
    private final zzaxl zzblk;
    private final String zzczt;
    private zzavr<zzaha> zzczu;
    private zzavr<zzaha> zzczv;
    private zzaie zzczw;
    private final Context zzlk;

    public zzahn(Context context, zzaxl zzaxlVar, String str) {
        this.lock = new Object();
        this.status = 1;
        this.zzczt = str;
        this.zzlk = context.getApplicationContext();
        this.zzblk = zzaxlVar;
        this.zzczu = new zzaib();
        this.zzczv = new zzaib();
    }

    public zzahn(Context context, zzaxl zzaxlVar, String str, zzavr<zzaha> zzavrVar, zzavr<zzaha> zzavrVar2) {
        this(context, zzaxlVar, str);
        this.zzczu = zzavrVar;
        this.zzczv = zzavrVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaie zza(final zzdf zzdfVar) {
        final zzaie zzaieVar = new zzaie(this.zzczv);
        zzaxn.zzdwm.execute(new Runnable(this, zzdfVar, zzaieVar) { // from class: com.google.android.gms.internal.ads.zzahm
            private final zzahn zzczq;
            private final zzdf zzczr;
            private final zzaie zzczs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczq = this;
                this.zzczr = zzdfVar;
                this.zzczs = zzaieVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzczq.zza(this.zzczr, this.zzczs);
            }
        });
        zzaieVar.zza(new zzahw(this, zzaieVar), new zzahz(this, zzaieVar));
        return zzaieVar;
    }

    public final zzaia zzb(zzdf zzdfVar) {
        synchronized (this.lock) {
            synchronized (this.lock) {
                if (this.zzczw != null && this.status == 0) {
                    if (((Boolean) zzuv.zzon().zzd(zzza.zzcgl)).booleanValue()) {
                        this.zzczw.zza(new zzaxz(this) { // from class: com.google.android.gms.internal.ads.zzahp
                            private final zzahn zzczq;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzczq = this;
                            }

                            @Override // com.google.android.gms.internal.ads.zzaxz
                            public final void zzh(Object obj) {
                                this.zzczq.zza((zzaha) obj);
                            }
                        }, zzaho.zzczx);
                    }
                }
            }
            if (this.zzczw != null && this.zzczw.getStatus() != -1) {
                if (this.status == 0) {
                    return this.zzczw.zzrg();
                } else if (this.status == 1) {
                    this.status = 2;
                    zza((zzdf) null);
                    return this.zzczw.zzrg();
                } else if (this.status == 2) {
                    return this.zzczw.zzrg();
                } else {
                    return this.zzczw.zzrg();
                }
            }
            this.status = 2;
            zzaie zza = zza((zzdf) null);
            this.zzczw = zza;
            return zza.zzrg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaha zzahaVar) {
        if (zzahaVar.isDestroyed()) {
            this.status = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdf zzdfVar, final zzaie zzaieVar) {
        final zzaha zzahcVar;
        try {
            Context context = this.zzlk;
            zzaxl zzaxlVar = this.zzblk;
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcjy)).booleanValue()) {
                zzahcVar = new zzagm(context, zzaxlVar);
            } else {
                zzahcVar = new zzahc(context, zzaxlVar, zzdfVar, null);
            }
            zzahcVar.zza(new zzahd(this, zzaieVar, zzahcVar) { // from class: com.google.android.gms.internal.ads.zzahr
                private final zzahn zzczq;
                private final zzaie zzczy;
                private final zzaha zzczz;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzczq = this;
                    this.zzczy = zzaieVar;
                    this.zzczz = zzahcVar;
                }

                @Override // com.google.android.gms.internal.ads.zzahd
                public final void zzre() {
                    zzaul.zzdsu.postDelayed(new Runnable(this.zzczq, this.zzczy, this.zzczz) { // from class: com.google.android.gms.internal.ads.zzahq
                        private final zzahn zzczq;
                        private final zzaie zzczy;
                        private final zzaha zzczz;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzczq = r1;
                            this.zzczy = r2;
                            this.zzczz = r3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzczq.zza(this.zzczy, this.zzczz);
                        }
                    }, zzahy.zzdai);
                }
            });
            zzahcVar.zza("/jsLoaded", new zzahs(this, zzaieVar, zzahcVar));
            zzawn zzawnVar = new zzawn();
            zzahv zzahvVar = new zzahv(this, zzdfVar, zzahcVar, zzawnVar);
            zzawnVar.set(zzahvVar);
            zzahcVar.zza("/requestReload", zzahvVar);
            if (this.zzczt.endsWith(".js")) {
                zzahcVar.zzcq(this.zzczt);
            } else if (this.zzczt.startsWith("<html>")) {
                zzahcVar.zzcr(this.zzczt);
            } else {
                zzahcVar.zzcs(this.zzczt);
            }
            zzaul.zzdsu.postDelayed(new zzahu(this, zzaieVar, zzahcVar), zzahy.zzdah);
        } catch (Throwable th) {
            zzaug.zzc("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzq.zzkn().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzaieVar.reject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaie zzaieVar, zzaha zzahaVar) {
        synchronized (this.lock) {
            if (zzaieVar.getStatus() != -1 && zzaieVar.getStatus() != 1) {
                zzaieVar.reject();
                zzddl zzddlVar = zzaxn.zzdwm;
                zzahaVar.getClass();
                zzddlVar.execute(zzaht.zzb(zzahaVar));
                zzaug.zzdy("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
