package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdjt extends zzdqw<zzdjt, zza> implements zzdsi {
    private static volatile zzdsp<zzdjt> zzdv;
    private static final zzdjt zzgyb;
    private String zzgxj = "";
    private zzdpm zzgxk = zzdpm.zzhgb;
    private int zzgya;

    private zzdjt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdjt, zza> implements zzdsi {
        private zza() {
            super(zzdjt.zzgyb);
        }

        /* synthetic */ zza(zzdjs zzdjsVar) {
            this();
        }
    }

    public final String zzatu() {
        return this.zzgxj;
    }

    public final zzdpm zzatv() {
        return this.zzgxk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjs.zzdi[i - 1]) {
            case 1:
                return new zzdjt();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgyb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgxj", "zzgxk", "zzgya"});
            case 4:
                return zzgyb;
            case 5:
                zzdsp<zzdjt> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdjt.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgyb);
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

    public static zzdjt zzaua() {
        return zzgyb;
    }

    static {
        zzdjt zzdjtVar = new zzdjt();
        zzgyb = zzdjtVar;
        zzdqw.zza(zzdjt.class, zzdjtVar);
    }
}
