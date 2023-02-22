package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdit extends zzdqw<zzdit, zza> implements zzdsi {
    private static volatile zzdsp<zzdit> zzdv;
    private static final zzdit zzgwi;
    private int zzgtt;
    private zzdpm zzgvq = zzdpm.zzhgb;
    private zzdpm zzgvr = zzdpm.zzhgb;
    private zzdip zzgwa;

    private zzdit() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdit, zza> implements zzdsi {
        private zza() {
            super(zzdit.zzgwi);
        }

        public final zza zzeh(int i) {
            zzazn();
            ((zzdit) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzc(zzdip zzdipVar) {
            zzazn();
            ((zzdit) this.zzhkp).zzb(zzdipVar);
            return this;
        }

        public final zza zzbd(zzdpm zzdpmVar) {
            zzazn();
            ((zzdit) this.zzhkp).zzau(zzdpmVar);
            return this;
        }

        public final zza zzbe(zzdpm zzdpmVar) {
            zzazn();
            ((zzdit) this.zzhkp).zzav(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdiu zzdiuVar) {
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

    public final zzdip zzaso() {
        zzdip zzdipVar = this.zzgwa;
        return zzdipVar == null ? zzdip.zzast() : zzdipVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzdip zzdipVar) {
        if (zzdipVar == null) {
            throw null;
        }
        this.zzgwa = zzdipVar;
    }

    public final zzdpm zzasg() {
        return this.zzgvq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzau(zzdpm zzdpmVar) {
        if (zzdpmVar == null) {
            throw null;
        }
        this.zzgvq = zzdpmVar;
    }

    public final zzdpm zzash() {
        return this.zzgvr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzav(zzdpm zzdpmVar) {
        if (zzdpmVar == null) {
            throw null;
        }
        this.zzgvr = zzdpmVar;
    }

    public static zzdit zzbb(zzdpm zzdpmVar) throws zzdrg {
        return (zzdit) zzdqw.zza(zzgwi, zzdpmVar);
    }

    public static zza zzasy() {
        return zzgwi.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdiu.zzdi[i - 1]) {
            case 1:
                return new zzdit();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgwi, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzgtt", "zzgwa", "zzgvq", "zzgvr"});
            case 4:
                return zzgwi;
            case 5:
                zzdsp<zzdit> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdit.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgwi);
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

    public static zzdit zzasz() {
        return zzgwi;
    }

    static {
        zzdit zzditVar = new zzdit();
        zzgwi = zzditVar;
        zzdqw.zza(zzdit.class, zzditVar);
    }
}
