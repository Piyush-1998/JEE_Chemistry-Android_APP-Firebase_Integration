package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class zzfn {
    private static final zzel zzacw = zzel.zztp();
    private zzdp zzajm;
    private volatile zzgi zzajn;
    private volatile zzdp zzajo;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfn) {
            zzfn zzfnVar = (zzfn) obj;
            zzgi zzgiVar = this.zzajn;
            zzgi zzgiVar2 = zzfnVar.zzajn;
            if (zzgiVar == null && zzgiVar2 == null) {
                return zzrs().equals(zzfnVar.zzrs());
            }
            if (zzgiVar == null || zzgiVar2 == null) {
                if (zzgiVar != null) {
                    return zzgiVar.equals(zzfnVar.zzh(zzgiVar.zzuh()));
                }
                return zzh(zzgiVar2.zzuh()).equals(zzgiVar2);
            }
            return zzgiVar.equals(zzgiVar2);
        }
        return false;
    }

    private final zzgi zzh(zzgi zzgiVar) {
        if (this.zzajn == null) {
            synchronized (this) {
                if (this.zzajn == null) {
                    try {
                        this.zzajn = zzgiVar;
                        this.zzajo = zzdp.zzadh;
                    } catch (zzfi unused) {
                        this.zzajn = zzgiVar;
                        this.zzajo = zzdp.zzadh;
                    }
                }
            }
        }
        return this.zzajn;
    }

    public final zzgi zzi(zzgi zzgiVar) {
        zzgi zzgiVar2 = this.zzajn;
        this.zzajm = null;
        this.zzajo = null;
        this.zzajn = zzgiVar;
        return zzgiVar2;
    }

    public final int zzuk() {
        if (this.zzajo != null) {
            return this.zzajo.size();
        }
        if (this.zzajn != null) {
            return this.zzajn.zzuk();
        }
        return 0;
    }

    public final zzdp zzrs() {
        if (this.zzajo != null) {
            return this.zzajo;
        }
        synchronized (this) {
            if (this.zzajo != null) {
                return this.zzajo;
            }
            if (this.zzajn == null) {
                this.zzajo = zzdp.zzadh;
            } else {
                this.zzajo = this.zzajn.zzrs();
            }
            return this.zzajo;
        }
    }
}
