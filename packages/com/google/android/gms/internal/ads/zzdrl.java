package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public class zzdrl {
    private static final zzdqj zzhfs = zzdqj.zzaza();
    private zzdpm zzhme;
    private volatile zzdsg zzhmf;
    private volatile zzdpm zzhmg;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdrl) {
            zzdrl zzdrlVar = (zzdrl) obj;
            zzdsg zzdsgVar = this.zzhmf;
            zzdsg zzdsgVar2 = zzdrlVar.zzhmf;
            if (zzdsgVar == null && zzdsgVar2 == null) {
                return zzaxg().equals(zzdrlVar.zzaxg());
            }
            if (zzdsgVar == null || zzdsgVar2 == null) {
                if (zzdsgVar != null) {
                    return zzdsgVar.equals(zzdrlVar.zzp(zzdsgVar.zzazs()));
                }
                return zzp(zzdsgVar2.zzazs()).equals(zzdsgVar2);
            }
            return zzdsgVar.equals(zzdsgVar2);
        }
        return false;
    }

    private final zzdsg zzp(zzdsg zzdsgVar) {
        if (this.zzhmf == null) {
            synchronized (this) {
                if (this.zzhmf == null) {
                    try {
                        this.zzhmf = zzdsgVar;
                        this.zzhmg = zzdpm.zzhgb;
                    } catch (zzdrg unused) {
                        this.zzhmf = zzdsgVar;
                        this.zzhmg = zzdpm.zzhgb;
                    }
                }
            }
        }
        return this.zzhmf;
    }

    public final zzdsg zzq(zzdsg zzdsgVar) {
        zzdsg zzdsgVar2 = this.zzhmf;
        this.zzhme = null;
        this.zzhmg = null;
        this.zzhmf = zzdsgVar;
        return zzdsgVar2;
    }

    public final int zzazu() {
        if (this.zzhmg != null) {
            return this.zzhmg.size();
        }
        if (this.zzhmf != null) {
            return this.zzhmf.zzazu();
        }
        return 0;
    }

    public final zzdpm zzaxg() {
        if (this.zzhmg != null) {
            return this.zzhmg;
        }
        synchronized (this) {
            if (this.zzhmg != null) {
                return this.zzhmg;
            }
            if (this.zzhmf == null) {
                this.zzhmg = zzdpm.zzhgb;
            } else {
                this.zzhmg = this.zzhmf.zzaxg();
            }
            return this.zzhmg;
        }
    }
}
