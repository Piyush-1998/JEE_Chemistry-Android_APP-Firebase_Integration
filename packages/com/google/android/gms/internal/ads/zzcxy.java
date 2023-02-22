package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxy<O> {
    private final E zzgll;
    private final String zzglm;
    private final List<zzddi<?>> zzglq;
    final /* synthetic */ zzcxs zzglr;
    private final zzddi<?> zzglu;
    private final zzddi<O> zzglv;

    private zzcxy(zzcxs zzcxsVar, E e, String str, zzddi<?> zzddiVar, List<zzddi<?>> list, zzddi<O> zzddiVar2) {
        this.zzglr = zzcxsVar;
        this.zzgll = e;
        this.zzglm = str;
        this.zzglu = zzddiVar;
        this.zzglq = list;
        this.zzglv = zzddiVar2;
    }

    public final zzcxy<O> zzgi(String str) {
        return new zzcxy<>(this.zzglr, this.zzgll, str, this.zzglu, this.zzglq, this.zzglv);
    }

    public final <O2> zzcxy<O2> zzb(final zzcxn<O, O2> zzcxnVar) {
        return zza(new zzdcj(zzcxnVar) { // from class: com.google.android.gms.internal.ads.zzcxx
            private final zzcxn zzglt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglt = zzcxnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return zzdcy.zzah(this.zzglt.apply(obj));
            }
        });
    }

    public final <O2> zzcxy<O2> zza(zzdcj<O, O2> zzdcjVar) {
        zzddl zzddlVar;
        zzddlVar = this.zzglr.zzfoa;
        return zza(zzdcjVar, zzddlVar);
    }

    private final <O2> zzcxy<O2> zza(zzdcj<O, O2> zzdcjVar, Executor executor) {
        return new zzcxy<>(this.zzglr, this.zzgll, this.zzglm, this.zzglu, this.zzglq, zzdcy.zzb(this.zzglv, zzdcjVar, executor));
    }

    public final <O2> zzcxy<O2> zzb(final zzddi<O2> zzddiVar) {
        return zza(new zzdcj(zzddiVar) { // from class: com.google.android.gms.internal.ads.zzcya
            private final zzddi zzfov;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfov = zzddiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return this.zzfov;
            }
        }, zzaxn.zzdwn);
    }

    public final <T extends Throwable> zzcxy<O> zza(Class<T> cls, final zzcxn<T, O> zzcxnVar) {
        return zza(cls, new zzdcj(zzcxnVar) { // from class: com.google.android.gms.internal.ads.zzcxz
            private final zzcxn zzglt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglt = zzcxnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcj
            public final zzddi zzf(Object obj) {
                return zzdcy.zzah(this.zzglt.apply((Throwable) obj));
            }
        });
    }

    public final <T extends Throwable> zzcxy<O> zza(Class<T> cls, zzdcj<T, O> zzdcjVar) {
        zzddl zzddlVar;
        zzcxs zzcxsVar = this.zzglr;
        E e = this.zzgll;
        String str = this.zzglm;
        zzddi<?> zzddiVar = this.zzglu;
        List<zzddi<?>> list = this.zzglq;
        zzddi<O> zzddiVar2 = this.zzglv;
        zzddlVar = zzcxsVar.zzfoa;
        return new zzcxy<>(zzcxsVar, e, str, zzddiVar, list, zzdcy.zzb(zzddiVar2, cls, zzdcjVar, zzddlVar));
    }

    public final zzcxy<O> zza(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzcxs zzcxsVar = this.zzglr;
        E e = this.zzgll;
        String str = this.zzglm;
        zzddi<?> zzddiVar = this.zzglu;
        List<zzddi<?>> list = this.zzglq;
        zzddi<O> zzddiVar2 = this.zzglv;
        scheduledExecutorService = zzcxsVar.zzfcx;
        return new zzcxy<>(zzcxsVar, e, str, zzddiVar, list, zzdcy.zza(zzddiVar2, j, timeUnit, scheduledExecutorService));
    }

    public final zzcxp<E, O> zzant() {
        zzcye zzcyeVar;
        E e = this.zzgll;
        String str = this.zzglm;
        if (str == null) {
            str = this.zzglr.zzv(e);
        }
        final zzcxp<E, O> zzcxpVar = new zzcxp<>(e, str, this.zzglv);
        zzcyeVar = this.zzglr.zzglp;
        zzcyeVar.zza(zzcxpVar);
        this.zzglu.addListener(new Runnable(this, zzcxpVar) { // from class: com.google.android.gms.internal.ads.zzcyc
            private final zzcxy zzgly;
            private final zzcxp zzglz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgly = this;
                this.zzglz = zzcxpVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcye zzcyeVar2;
                zzcxy zzcxyVar = this.zzgly;
                zzcxp zzcxpVar2 = this.zzglz;
                zzcyeVar2 = zzcxyVar.zzglr.zzglp;
                zzcyeVar2.zzb(zzcxpVar2);
            }
        }, zzaxn.zzdwn);
        zzdcy.zza(zzcxpVar, new zzcyb(this, zzcxpVar), zzaxn.zzdwn);
        return zzcxpVar;
    }

    public final zzcxy<O> zzw(E e) {
        return this.zzglr.zza((zzcxs) e, (zzddi) zzant());
    }
}
