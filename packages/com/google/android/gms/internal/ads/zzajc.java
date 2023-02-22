package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzajc {
    private zzahn zzdbk;
    private zzddi<zzail> zzdbl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajc(zzahn zzahnVar) {
        this.zzdbk = zzahnVar;
    }

    private final void zzrm() {
        if (this.zzdbl == null) {
            final zzaxv zzaxvVar = new zzaxv();
            this.zzdbl = zzaxvVar;
            this.zzdbk.zzb((zzdf) null).zza(new zzaxz(zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzajf
                private final zzaxv zzbrt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbrt = zzaxvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzaxz
                public final void zzh(Object obj) {
                    this.zzbrt.set((zzail) obj);
                }
            }, new zzaxx(zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzaje
                private final zzaxv zzbrt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbrt = zzaxvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzaxx
                public final void run() {
                    this.zzbrt.setException(new zzaim("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> zzajj<I, O> zzb(String str, zzaiq<I> zzaiqVar, zzair<O> zzairVar) {
        zzrm();
        return new zzajj<>(this.zzdbl, str, zzaiqVar, zzairVar);
    }

    public final void zzc(final String str, final zzaer<? super zzail> zzaerVar) {
        zzrm();
        this.zzdbl = zzdcy.zzb(this.zzdbl, new zzdcj(str, zzaerVar) { // from class: com.google.android.gms.internal.ads.zzajh
            private final zzaer zzczd;
            private final String zzczh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczh = str;
                this.zzczd = zzaerVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                zzail zzailVar = (zzail) obj;
                zzailVar.zza(this.zzczh, this.zzczd);
                return zzdcy.zzah(zzailVar);
            }
        }, zzaxn.zzdwn);
    }

    public final void zzd(final String str, final zzaer<? super zzail> zzaerVar) {
        this.zzdbl = zzdcy.zzb(this.zzdbl, new zzdal(str, zzaerVar) { // from class: com.google.android.gms.internal.ads.zzajg
            private final zzaer zzczd;
            private final String zzczh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczh = str;
                this.zzczd = zzaerVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj) {
                zzail zzailVar = (zzail) obj;
                zzailVar.zzb(this.zzczh, this.zzczd);
                return zzailVar;
            }
        }, zzaxn.zzdwn);
    }
}
