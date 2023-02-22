package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
abstract class zzdcf {
    private static final Logger zzgqc = Logger.getLogger(zzdcf.class.getName());
    private static final zza zzgqw;
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    static abstract class zza {
        private zza() {
        }

        abstract void zza(zzdcf zzdcfVar, Set<Throwable> set, Set<Throwable> set2);

        abstract int zzd(zzdcf zzdcfVar);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    static final class zzb extends zza {
        private zzb() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdcf.zza
        final void zza(zzdcf zzdcfVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (zzdcfVar) {
                if (zzdcfVar.seenExceptions == null) {
                    zzdcfVar.seenExceptions = set2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdcf.zza
        final int zzd(zzdcf zzdcfVar) {
            int i;
            synchronized (zzdcfVar) {
                zzdcf.zzb(zzdcfVar);
                i = zzdcfVar.remaining;
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdcf(int i) {
        this.remaining = i;
    }

    abstract void zzg(Set<Throwable> set);

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    static final class zzc extends zza {
        private final AtomicReferenceFieldUpdater<zzdcf, Set<Throwable>> zzgra;
        private final AtomicIntegerFieldUpdater<zzdcf> zzgrb;

        zzc(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.zzgra = atomicReferenceFieldUpdater;
            this.zzgrb = atomicIntegerFieldUpdater;
        }

        @Override // com.google.android.gms.internal.ads.zzdcf.zza
        final void zza(zzdcf zzdcfVar, Set<Throwable> set, Set<Throwable> set2) {
            this.zzgra.compareAndSet(zzdcfVar, null, set2);
        }

        @Override // com.google.android.gms.internal.ads.zzdcf.zza
        final int zzd(zzdcf zzdcfVar) {
            return this.zzgrb.decrementAndGet(zzdcfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> zzape() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzg(newSetFromMap);
            zzgqw.zza(this, null, newSetFromMap);
            return this.seenExceptions;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzapf() {
        return zzgqw.zzd(this);
    }

    static /* synthetic */ int zzb(zzdcf zzdcfVar) {
        int i = zzdcfVar.remaining;
        zzdcfVar.remaining = i - 1;
        return i;
    }

    static {
        zza zzbVar;
        Throwable th;
        try {
            zzbVar = new zzc(AtomicReferenceFieldUpdater.newUpdater(zzdcf.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzdcf.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzbVar = new zzb();
            th = th2;
        }
        zzgqw = zzbVar;
        if (th != null) {
            zzgqc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
