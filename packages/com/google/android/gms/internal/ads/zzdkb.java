package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdkb extends zzdqw<zzdkb, zza> implements zzdsi {
    private static volatile zzdsp<zzdkb> zzdv;
    private static final zzdkb zzgys;
    private int zzgtt;
    private zzdkc zzgyr;

    private zzdkb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdkb, zza> implements zzdsi {
        private zza() {
            super(zzdkb.zzgys);
        }

        public final zza zzex(int i) {
            zzazn();
            ((zzdkb) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzb(zzdkc zzdkcVar) {
            zzazn();
            ((zzdkb) this.zzhkp).zza(zzdkcVar);
            return this;
        }

        /* synthetic */ zza(zzdka zzdkaVar) {
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

    public final zzdkc zzauw() {
        zzdkc zzdkcVar = this.zzgyr;
        return zzdkcVar == null ? zzdkc.zzava() : zzdkcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdkc zzdkcVar) {
        if (zzdkcVar == null) {
            throw null;
        }
        this.zzgyr = zzdkcVar;
    }

    public static zzdkb zzbp(zzdpm zzdpmVar) throws zzdrg {
        return (zzdkb) zzdqw.zza(zzgys, zzdpmVar);
    }

    public static zza zzaux() {
        return zzgys.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdka.zzdi[i - 1]) {
            case 1:
                return new zzdkb();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgys, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgtt", "zzgyr"});
            case 4:
                return zzgys;
            case 5:
                zzdsp<zzdkb> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdkb.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgys);
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
        zzdkb zzdkbVar = new zzdkb();
        zzgys = zzdkbVar;
        zzdqw.zza(zzdkb.class, zzdkbVar);
    }
}
