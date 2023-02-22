package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdjc extends zzdqw<zzdjc, zza> implements zzdsi {
    private static volatile zzdsp<zzdjc> zzdv;
    private static final zzdjc zzgwv;

    private zzdjc() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdjc, zza> implements zzdsi {
        private zza() {
            super(zzdjc.zzgwv);
        }

        /* synthetic */ zza(zzdje zzdjeVar) {
            this();
        }
    }

    public static zzdjc zzbj(zzdpm zzdpmVar) throws zzdrg {
        return (zzdjc) zzdqw.zza(zzgwv, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdje.zzdi[i - 1]) {
            case 1:
                return new zzdjc();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgwv, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzgwv;
            case 5:
                zzdsp<zzdjc> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdjc.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgwv);
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
        zzdjc zzdjcVar = new zzdjc();
        zzgwv = zzdjcVar;
        zzdqw.zza(zzdjc.class, zzdjcVar);
    }
}
