package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdkg extends zzdqw<zzdkg, zza> implements zzdsi {
    private static volatile zzdsp<zzdkg> zzdv;
    private static final zzdkg zzgyz;
    private String zzgyx = "";
    private zzdjt zzgyy;

    private zzdkg() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdkg, zza> implements zzdsi {
        private zza() {
            super(zzdkg.zzgyz);
        }

        /* synthetic */ zza(zzdkh zzdkhVar) {
            this();
        }
    }

    public final String zzavf() {
        return this.zzgyx;
    }

    public final zzdjt zzavg() {
        zzdjt zzdjtVar = this.zzgyy;
        return zzdjtVar == null ? zzdjt.zzaua() : zzdjtVar;
    }

    public static zzdkg zzbs(zzdpm zzdpmVar) throws zzdrg {
        return (zzdkg) zzdqw.zza(zzgyz, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdkh.zzdi[i - 1]) {
            case 1:
                return new zzdkg();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgyz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzgyx", "zzgyy"});
            case 4:
                return zzgyz;
            case 5:
                zzdsp<zzdkg> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdkg.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgyz);
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

    public static zzdkg zzavh() {
        return zzgyz;
    }

    static {
        zzdkg zzdkgVar = new zzdkg();
        zzgyz = zzdkgVar;
        zzdqw.zza(zzdkg.class, zzdkgVar);
    }
}
