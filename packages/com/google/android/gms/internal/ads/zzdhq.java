package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdhq extends zzdqw<zzdhq, zza> implements zzdsi {
    private static volatile zzdsp<zzdhq> zzdv;
    private static final zzdhq zzgux;
    private int zzgtt;
    private zzdpm zzgub = zzdpm.zzhgb;

    private zzdhq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdhq, zza> implements zzdsi {
        private zza() {
            super(zzdhq.zzgux);
        }

        public final zza zzdz(int i) {
            zzazn();
            ((zzdhq) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzal(zzdpm zzdpmVar) {
            zzazn();
            ((zzdhq) this.zzhkp).zzw(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdhp zzdhpVar) {
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

    public static zzdhq zzaj(zzdpm zzdpmVar) throws zzdrg {
        return (zzdhq) zzdqw.zza(zzgux, zzdpmVar);
    }

    public static zza zzaro() {
        return zzgux.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdhp.zzdi[i - 1]) {
            case 1:
                return new zzdhq();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgux, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgtt", "zzgub"});
            case 4:
                return zzgux;
            case 5:
                zzdsp<zzdhq> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdhq.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgux);
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
        zzdhq zzdhqVar = new zzdhq();
        zzgux = zzdhqVar;
        zzdqw.zza(zzdhq.class, zzdhqVar);
    }
}
