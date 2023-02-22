package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzdu<V> {
    private static final Object zzjo = new Object();
    private final String zzjj;
    private final zzdv<V> zzjk;
    private final V zzjl;
    private final V zzjm;
    private final Object zzjn;
    private volatile V zzjp;
    private volatile V zzjq;

    private zzdu(String str, V v, V v2, zzdv<V> zzdvVar) {
        this.zzjn = new Object();
        this.zzjp = null;
        this.zzjq = null;
        this.zzjj = str;
        this.zzjl = v;
        this.zzjm = v2;
        this.zzjk = zzdvVar;
    }

    public final String getKey() {
        return this.zzjj;
    }

    public final V get(V v) {
        synchronized (this.zzjn) {
        }
        if (v != null) {
            return v;
        }
        if (zzak.zzfv == null) {
            return this.zzjl;
        }
        zzr zzrVar = zzak.zzfv;
        synchronized (zzjo) {
            if (zzr.isMainThread()) {
                return this.zzjq == null ? this.zzjl : this.zzjq;
            } else if (zzr.isMainThread()) {
                throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
            } else {
                zzr zzrVar2 = zzak.zzfv;
                try {
                    for (zzdu zzduVar : zzak.zzgd()) {
                        synchronized (zzjo) {
                            if (zzr.isMainThread()) {
                                throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                            }
                            zzduVar.zzjq = zzduVar.zzjk != null ? zzduVar.zzjk.get() : null;
                        }
                    }
                } catch (SecurityException e) {
                    zzak.zza(e);
                }
                zzdv<V> zzdvVar = this.zzjk;
                if (zzdvVar == null) {
                    zzr zzrVar3 = zzak.zzfv;
                    return this.zzjl;
                }
                try {
                    return zzdvVar.get();
                } catch (SecurityException e2) {
                    zzak.zza(e2);
                    zzr zzrVar4 = zzak.zzfv;
                    return this.zzjl;
                }
            }
        }
    }
}
