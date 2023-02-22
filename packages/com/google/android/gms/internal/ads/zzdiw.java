package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdiw extends zzdqw<zzdiw, zza> implements zzdsi {
    private static volatile zzdsp<zzdiw> zzdv;
    private static final zzdiw zzgwl;
    private int zzguh;
    private int zzgwj;
    private zzdpm zzgwk = zzdpm.zzhgb;

    private zzdiw() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdiw, zza> implements zzdsi {
        private zza() {
            super(zzdiw.zzgwl);
        }

        /* synthetic */ zza(zzdiv zzdivVar) {
            this();
        }
    }

    public final zzdjb zzatb() {
        zzdjb zzej = zzdjb.zzej(this.zzgwj);
        return zzej == null ? zzdjb.UNRECOGNIZED : zzej;
    }

    public final zzdjg zzaqp() {
        zzdjg zzel = zzdjg.zzel(this.zzguh);
        return zzel == null ? zzdjg.UNRECOGNIZED : zzel;
    }

    public final zzdpm zzatc() {
        return this.zzgwk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdiv.zzdi[i - 1]) {
            case 1:
                return new zzdiw();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgwl, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzgwj", "zzguh", "zzgwk"});
            case 4:
                return zzgwl;
            case 5:
                zzdsp<zzdiw> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdiw.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgwl);
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

    public static zzdiw zzatd() {
        return zzgwl;
    }

    static {
        zzdiw zzdiwVar = new zzdiw();
        zzgwl = zzdiwVar;
        zzdqw.zza(zzdiw.class, zzdiwVar);
    }
}
