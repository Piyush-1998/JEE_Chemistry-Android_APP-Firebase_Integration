package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdhf extends zzdqw<zzdhf, zza> implements zzdsi {
    private static volatile zzdsp<zzdhf> zzdv;
    private static final zzdhf zzgur;
    private int zzgud;
    private zzdhi zzgup;

    private zzdhf() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdhf, zza> implements zzdsi {
        private zza() {
            super(zzdhf.zzgur);
        }

        /* synthetic */ zza(zzdhg zzdhgVar) {
            this();
        }
    }

    public final zzdhi zzarc() {
        zzdhi zzdhiVar = this.zzgup;
        return zzdhiVar == null ? zzdhi.zzarg() : zzdhiVar;
    }

    public final int getKeySize() {
        return this.zzgud;
    }

    public static zzdhf zzae(zzdpm zzdpmVar) throws zzdrg {
        return (zzdhf) zzdqw.zza(zzgur, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdhg.zzdi[i - 1]) {
            case 1:
                return new zzdhf();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgur, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgup", "zzgud"});
            case 4:
                return zzgur;
            case 5:
                zzdsp<zzdhf> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdhf.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgur);
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
        zzdhf zzdhfVar = new zzdhf();
        zzgur = zzdhfVar;
        zzdqw.zza(zzdhf.class, zzdhfVar);
    }
}
