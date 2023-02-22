package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdis extends zzdqw<zzdis, zza> implements zzdsi {
    private static volatile zzdsp<zzdis> zzdv;
    private static final zzdis zzgwh;
    private int zzgtt;
    private zzdpm zzgub = zzdpm.zzhgb;
    private zzdit zzgwg;

    private zzdis() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdis, zza> implements zzdsi {
        private zza() {
            super(zzdis.zzgwh);
        }

        public final zza zzeg(int i) {
            zzazn();
            ((zzdis) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzb(zzdit zzditVar) {
            zzazn();
            ((zzdis) this.zzhkp).zza(zzditVar);
            return this;
        }

        public final zza zzbc(zzdpm zzdpmVar) {
            zzazn();
            ((zzdis) this.zzhkp).zzw(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdir zzdirVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzgtt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzgtt = i;
    }

    public final zzdit zzasv() {
        zzdit zzditVar = this.zzgwg;
        return zzditVar == null ? zzdit.zzasz() : zzditVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdit zzditVar) {
        if (zzditVar == null) {
            throw null;
        }
        this.zzgwg = zzditVar;
    }

    public final zzdpm zzaqj() {
        return this.zzgub;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(zzdpm zzdpmVar) {
        if (zzdpmVar == null) {
            throw null;
        }
        this.zzgub = zzdpmVar;
    }

    public static zzdis zzba(zzdpm zzdpmVar) throws zzdrg {
        return (zzdis) zzdqw.zza(zzgwh, zzdpmVar);
    }

    public static zza zzasw() {
        return zzgwh.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdir.zzdi[i - 1]) {
            case 1:
                return new zzdis();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgwh, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgtt", "zzgwg", "zzgub"});
            case 4:
                return zzgwh;
            case 5:
                zzdsp<zzdis> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdis.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgwh);
                            zzdv = zzdspVar;
                        }
                    }
                }
                return zzdspVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzdis zzdisVar = new zzdis();
        zzgwh = zzdisVar;
        zzdqw.zza(zzdis.class, zzdisVar);
    }
}
