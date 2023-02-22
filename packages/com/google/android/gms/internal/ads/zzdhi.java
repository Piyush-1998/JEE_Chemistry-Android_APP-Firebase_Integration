package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdhi extends zzdqw<zzdhi, zza> implements zzdsi {
    private static volatile zzdsp<zzdhi> zzdv;
    private static final zzdhi zzgus;
    private int zzgun;

    private zzdhi() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdhi, zza> implements zzdsi {
        private zza() {
            super(zzdhi.zzgus);
        }

        /* synthetic */ zza(zzdhh zzdhhVar) {
            this();
        }
    }

    public final int zzaqz() {
        return this.zzgun;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdhh.zzdi[i - 1]) {
            case 1:
                return new zzdhi();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgus, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzgun"});
            case 4:
                return zzgus;
            case 5:
                zzdsp<zzdhi> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdhi.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgus);
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

    public static zzdhi zzarg() {
        return zzgus;
    }

    static {
        zzdhi zzdhiVar = new zzdhi();
        zzgus = zzdhiVar;
        zzdqw.zza(zzdhi.class, zzdhiVar);
    }
}
