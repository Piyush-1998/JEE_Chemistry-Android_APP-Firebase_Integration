package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdio extends zzdqw<zzdio, zza> implements zzdsi {
    private static volatile zzdsp<zzdio> zzdv;
    private static final zzdio zzgwb;
    private zzdip zzgwa;

    private zzdio() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdio, zza> implements zzdsi {
        private zza() {
            super(zzdio.zzgwb);
        }

        /* synthetic */ zza(zzdin zzdinVar) {
            this();
        }
    }

    public final zzdip zzaso() {
        zzdip zzdipVar = this.zzgwa;
        return zzdipVar == null ? zzdip.zzast() : zzdipVar;
    }

    public static zzdio zzaz(zzdpm zzdpmVar) throws zzdrg {
        return (zzdio) zzdqw.zza(zzgwb, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdin.zzdi[i - 1]) {
            case 1:
                return new zzdio();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgwb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzgwa"});
            case 4:
                return zzgwb;
            case 5:
                zzdsp<zzdio> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdio.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgwb);
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
        zzdio zzdioVar = new zzdio();
        zzgwb = zzdioVar;
        zzdqw.zza(zzdio.class, zzdioVar);
    }
}
