package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdhb extends zzdqw<zzdhb, zza> implements zzdsi {
    private static volatile zzdsp<zzdhb> zzdv;
    private static final zzdhb zzguo;
    private int zzgun;

    private zzdhb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdhb, zza> implements zzdsi {
        private zza() {
            super(zzdhb.zzguo);
        }

        /* synthetic */ zza(zzdhc zzdhcVar) {
            this();
        }
    }

    public final int zzaqz() {
        return this.zzgun;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdhc.zzdi[i - 1]) {
            case 1:
                return new zzdhb();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzguo, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzgun"});
            case 4:
                return zzguo;
            case 5:
                zzdsp<zzdhb> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdhb.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzguo);
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

    public static zzdhb zzara() {
        return zzguo;
    }

    static {
        zzdhb zzdhbVar = new zzdhb();
        zzguo = zzdhbVar;
        zzdqw.zza(zzdhb.class, zzdhbVar);
    }
}
