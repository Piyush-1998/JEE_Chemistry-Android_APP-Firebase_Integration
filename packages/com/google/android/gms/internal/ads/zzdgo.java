package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdgo extends zzdqw<zzdgo, zza> implements zzdsi {
    private static volatile zzdsp<zzdgo> zzdv;
    private static final zzdgo zzgtw;
    private int zzgtt;
    private zzdgx zzgtu;
    private zzdji zzgtv;

    private zzdgo() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdgo, zza> implements zzdsi {
        private zza() {
            super(zzdgo.zzgtw);
        }

        public final zza zzdu(int i) {
            zzazn();
            ((zzdgo) this.zzhkp).setVersion(i);
            return this;
        }

        public final zza zzb(zzdgx zzdgxVar) {
            zzazn();
            ((zzdgo) this.zzhkp).zza(zzdgxVar);
            return this;
        }

        public final zza zzb(zzdji zzdjiVar) {
            zzazn();
            ((zzdgo) this.zzhkp).zza(zzdjiVar);
            return this;
        }

        /* synthetic */ zza(zzdgn zzdgnVar) {
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

    public final zzdgx zzaqb() {
        zzdgx zzdgxVar = this.zzgtu;
        return zzdgxVar == null ? zzdgx.zzaqv() : zzdgxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdgx zzdgxVar) {
        if (zzdgxVar == null) {
            throw null;
        }
        this.zzgtu = zzdgxVar;
    }

    public final zzdji zzaqc() {
        zzdji zzdjiVar = this.zzgtv;
        return zzdjiVar == null ? zzdji.zzatm() : zzdjiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdji zzdjiVar) {
        if (zzdjiVar == null) {
            throw null;
        }
        this.zzgtv = zzdjiVar;
    }

    public static zzdgo zzu(zzdpm zzdpmVar) throws zzdrg {
        return (zzdgo) zzdqw.zza(zzgtw, zzdpmVar);
    }

    public static zza zzaqd() {
        return zzgtw.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdgn.zzdi[i - 1]) {
            case 1:
                return new zzdgo();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgtw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzgtt", "zzgtu", "zzgtv"});
            case 4:
                return zzgtw;
            case 5:
                zzdsp<zzdgo> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdgo.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgtw);
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
        zzdgo zzdgoVar = new zzdgo();
        zzgtw = zzdgoVar;
        zzdqw.zza(zzdgo.class, zzdgoVar);
    }
}
