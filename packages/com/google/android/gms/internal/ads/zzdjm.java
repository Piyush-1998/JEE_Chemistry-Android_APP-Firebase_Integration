package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdjm extends zzdqw<zzdjm, zza> implements zzdsi {
    private static volatile zzdsp<zzdjm> zzdv;
    private static final zzdjm zzgxi;
    private int zzgxg;
    private int zzgxh;

    private zzdjm() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdjm, zza> implements zzdsi {
        private zza() {
            super(zzdjm.zzgxi);
        }

        /* synthetic */ zza(zzdjl zzdjlVar) {
            this();
        }
    }

    public final zzdjg zzatq() {
        zzdjg zzel = zzdjg.zzel(this.zzgxg);
        return zzel == null ? zzdjg.UNRECOGNIZED : zzel;
    }

    public final int zzatr() {
        return this.zzgxh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjl.zzdi[i - 1]) {
            case 1:
                return new zzdjm();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgxi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzgxg", "zzgxh"});
            case 4:
                return zzgxi;
            case 5:
                zzdsp<zzdjm> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdjm.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgxi);
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

    public static zzdjm zzats() {
        return zzgxi;
    }

    static {
        zzdjm zzdjmVar = new zzdjm();
        zzgxi = zzdjmVar;
        zzdqw.zza(zzdjm.class, zzdjmVar);
    }
}
