package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdkc extends zzdqw<zzdkc, zza> implements zzdsi {
    private static volatile zzdsp<zzdkc> zzdv;
    private static final zzdkc zzgyu;
    private String zzgyt = "";

    private zzdkc() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdkc, zza> implements zzdsi {
        private zza() {
            super(zzdkc.zzgyu);
        }

        /* synthetic */ zza(zzdkd zzdkdVar) {
            this();
        }
    }

    public final String zzauz() {
        return this.zzgyt;
    }

    public static zzdkc zzbq(zzdpm zzdpmVar) throws zzdrg {
        return (zzdkc) zzdqw.zza(zzgyu, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdkd.zzdi[i - 1]) {
            case 1:
                return new zzdkc();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgyu, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzgyt"});
            case 4:
                return zzgyu;
            case 5:
                zzdsp<zzdkc> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdkc.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgyu);
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

    public static zzdkc zzava() {
        return zzgyu;
    }

    static {
        zzdkc zzdkcVar = new zzdkc();
        zzgyu = zzdkcVar;
        zzdqw.zza(zzdkc.class, zzdkcVar);
    }
}
