package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdkf extends zzdqw<zzdkf, zza> implements zzdsi {
    private static volatile zzdsp<zzdkf> zzdv;
    private static final zzdkf zzgyw;
    private int zzgtt;
    private zzdkg zzgyv;

    private zzdkf() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdkf, zza> implements zzdsi {
        private zza() {
            super(zzdkf.zzgyw);
        }

        public final zza zzey(int i) {
            zzazn();
            ((zzdkf) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzb(zzdkg zzdkgVar) {
            zzazn();
            ((zzdkf) this.zzhkp).zza(zzdkgVar);
            return this;
        }

        /* synthetic */ zza(zzdke zzdkeVar) {
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

    public final zzdkg zzavc() {
        zzdkg zzdkgVar = this.zzgyv;
        return zzdkgVar == null ? zzdkg.zzavh() : zzdkgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdkg zzdkgVar) {
        if (zzdkgVar == null) {
            throw null;
        }
        this.zzgyv = zzdkgVar;
    }

    public static zzdkf zzbr(zzdpm zzdpmVar) throws zzdrg {
        return (zzdkf) zzdqw.zza(zzgyw, zzdpmVar);
    }

    public static zza zzavd() {
        return zzgyw.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdke.zzdi[i - 1]) {
            case 1:
                return new zzdkf();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgyw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgtt", "zzgyv"});
            case 4:
                return zzgyw;
            case 5:
                zzdsp<zzdkf> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdkf.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgyw);
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
        zzdkf zzdkfVar = new zzdkf();
        zzgyw = zzdkfVar;
        zzdqw.zza(zzdkf.class, zzdkfVar);
    }
}
