package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdlc extends zzdqw<zzdlc, zza> implements zzdsi {
    private static volatile zzdsp<zzdlc> zzdv;
    private static final zzdlc zzhaj;
    private int zzgtt;
    private zzdpm zzgub = zzdpm.zzhgb;

    private zzdlc() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdlc, zza> implements zzdsi {
        private zza() {
            super(zzdlc.zzhaj);
        }

        public final zza zzfe(int i) {
            zzazn();
            ((zzdlc) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzcy(zzdpm zzdpmVar) {
            zzazn();
            ((zzdlc) this.zzhkp).zzw(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdld zzdldVar) {
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

    public static zzdlc zzcv(zzdpm zzdpmVar) throws zzdrg {
        return (zzdlc) zzdqw.zza(zzhaj, zzdpmVar);
    }

    public static zza zzaws() {
        return zzhaj.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdld.zzdi[i - 1]) {
            case 1:
                return new zzdlc();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhaj, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgtt", "zzgub"});
            case 4:
                return zzhaj;
            case 5:
                zzdsp<zzdlc> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdlc.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzhaj);
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
        zzdlc zzdlcVar = new zzdlc();
        zzhaj = zzdlcVar;
        zzdqw.zza(zzdlc.class, zzdlcVar);
    }
}
