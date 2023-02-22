package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdhe extends zzdqw<zzdhe, zza> implements zzdsi {
    private static volatile zzdsp<zzdhe> zzdv;
    private static final zzdhe zzguq;
    private int zzgtt;
    private zzdpm zzgub = zzdpm.zzhgb;
    private zzdhi zzgup;

    private zzdhe() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdhe, zza> implements zzdsi {
        private zza() {
            super(zzdhe.zzguq);
        }

        public final zza zzdx(int i) {
            zzazn();
            ((zzdhe) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzb(zzdhi zzdhiVar) {
            zzazn();
            ((zzdhe) this.zzhkp).zza(zzdhiVar);
            return this;
        }

        public final zza zzaf(zzdpm zzdpmVar) {
            zzazn();
            ((zzdhe) this.zzhkp).zzw(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdhd zzdhdVar) {
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

    public final zzdhi zzarc() {
        zzdhi zzdhiVar = this.zzgup;
        return zzdhiVar == null ? zzdhi.zzarg() : zzdhiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdhi zzdhiVar) {
        if (zzdhiVar == null) {
            throw null;
        }
        this.zzgup = zzdhiVar;
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

    public static zzdhe zzad(zzdpm zzdpmVar) throws zzdrg {
        return (zzdhe) zzdqw.zza(zzguq, zzdpmVar);
    }

    public static zza zzard() {
        return zzguq.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdhd.zzdi[i - 1]) {
            case 1:
                return new zzdhe();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzguq, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgtt", "zzgup", "zzgub"});
            case 4:
                return zzguq;
            case 5:
                zzdsp<zzdhe> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdhe.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzguq);
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
        zzdhe zzdheVar = new zzdhe();
        zzguq = zzdheVar;
        zzdqw.zza(zzdhe.class, zzdheVar);
    }
}
