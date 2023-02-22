package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdji extends zzdqw<zzdji, zza> implements zzdsi {
    private static volatile zzdsp<zzdji> zzdv;
    private static final zzdji zzgxe;
    private int zzgtt;
    private zzdpm zzgub = zzdpm.zzhgb;
    private zzdjm zzgxd;

    private zzdji() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdji, zza> implements zzdsi {
        private zza() {
            super(zzdji.zzgxe);
        }

        public final zza zzem(int i) {
            zzazn();
            ((zzdji) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzc(zzdjm zzdjmVar) {
            zzazn();
            ((zzdji) this.zzhkp).zzb(zzdjmVar);
            return this;
        }

        public final zza zzbm(zzdpm zzdpmVar) {
            zzazn();
            ((zzdji) this.zzhkp).zzw(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdjh zzdjhVar) {
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

    public final zzdjm zzatk() {
        zzdjm zzdjmVar = this.zzgxd;
        return zzdjmVar == null ? zzdjm.zzats() : zzdjmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzdjm zzdjmVar) {
        if (zzdjmVar == null) {
            throw null;
        }
        this.zzgxd = zzdjmVar;
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

    public static zzdji zzbk(zzdpm zzdpmVar) throws zzdrg {
        return (zzdji) zzdqw.zza(zzgxe, zzdpmVar);
    }

    public static zza zzatl() {
        return zzgxe.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjh.zzdi[i - 1]) {
            case 1:
                return new zzdji();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgxe, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgtt", "zzgxd", "zzgub"});
            case 4:
                return zzgxe;
            case 5:
                zzdsp<zzdji> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdji.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgxe);
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

    public static zzdji zzatm() {
        return zzgxe;
    }

    static {
        zzdji zzdjiVar = new zzdji();
        zzgxe = zzdjiVar;
        zzdqw.zza(zzdji.class, zzdjiVar);
    }
}
