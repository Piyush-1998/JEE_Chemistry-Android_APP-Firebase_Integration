package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdjj extends zzdqw<zzdjj, zza> implements zzdsi {
    private static volatile zzdsp<zzdjj> zzdv;
    private static final zzdjj zzgxf;
    private int zzgud;
    private zzdjm zzgxd;

    private zzdjj() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdjj, zza> implements zzdsi {
        private zza() {
            super(zzdjj.zzgxf);
        }

        /* synthetic */ zza(zzdjk zzdjkVar) {
            this();
        }
    }

    public final zzdjm zzatk() {
        zzdjm zzdjmVar = this.zzgxd;
        return zzdjmVar == null ? zzdjm.zzats() : zzdjmVar;
    }

    public final int getKeySize() {
        return this.zzgud;
    }

    public static zzdjj zzbl(zzdpm zzdpmVar) throws zzdrg {
        return (zzdjj) zzdqw.zza(zzgxf, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjk.zzdi[i - 1]) {
            case 1:
                return new zzdjj();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgxf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgxd", "zzgud"});
            case 4:
                return zzgxf;
            case 5:
                zzdsp<zzdjj> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdjj.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgxf);
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

    public static zzdjj zzato() {
        return zzgxf;
    }

    static {
        zzdjj zzdjjVar = new zzdjj();
        zzgxf = zzdjjVar;
        zzdqw.zza(zzdjj.class, zzdjjVar);
    }
}
