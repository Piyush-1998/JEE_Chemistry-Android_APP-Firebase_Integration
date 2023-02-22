package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdik extends zzdqw<zzdik, zza> implements zzdsi {
    private static volatile zzdsp<zzdik> zzdv;
    private static final zzdik zzgvz;
    private zzdjt zzgvy;

    private zzdik() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdik, zza> implements zzdsi {
        private zza() {
            super(zzdik.zzgvz);
        }

        /* synthetic */ zza(zzdim zzdimVar) {
            this();
        }
    }

    public final zzdjt zzasl() {
        zzdjt zzdjtVar = this.zzgvy;
        return zzdjtVar == null ? zzdjt.zzaua() : zzdjtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdim.zzdi[i - 1]) {
            case 1:
                return new zzdik();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgvz, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzgvy"});
            case 4:
                return zzgvz;
            case 5:
                zzdsp<zzdik> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdik.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgvz);
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

    public static zzdik zzasm() {
        return zzgvz;
    }

    static {
        zzdik zzdikVar = new zzdik();
        zzgvz = zzdikVar;
        zzdqw.zza(zzdik.class, zzdikVar);
    }
}
