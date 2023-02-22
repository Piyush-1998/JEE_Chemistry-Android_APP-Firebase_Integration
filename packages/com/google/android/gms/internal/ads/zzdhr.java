package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdhr extends zzdqw<zzdhr, zza> implements zzdsi {
    private static volatile zzdsp<zzdhr> zzdv;
    private static final zzdhr zzguy;
    private int zzgud;

    private zzdhr() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdhr, zza> implements zzdsi {
        private zza() {
            super(zzdhr.zzguy);
        }

        /* synthetic */ zza(zzdhs zzdhsVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzgud;
    }

    public static zzdhr zzak(zzdpm zzdpmVar) throws zzdrg {
        return (zzdhr) zzdqw.zza(zzguy, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdhs.zzdi[i - 1]) {
            case 1:
                return new zzdhr();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzguy, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzgud"});
            case 4:
                return zzguy;
            case 5:
                zzdsp<zzdhr> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdhr.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzguy);
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
        zzdhr zzdhrVar = new zzdhr();
        zzguy = zzdhrVar;
        zzdqw.zza(zzdhr.class, zzdhrVar);
    }
}
