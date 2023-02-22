package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdha extends zzdqw<zzdha, zza> implements zzdsi {
    private static volatile zzdsp<zzdha> zzdv;
    private static final zzdha zzgum;
    private int zzgud;
    private zzdhb zzguk;

    private zzdha() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdha, zza> implements zzdsi {
        private zza() {
            super(zzdha.zzgum);
        }

        /* synthetic */ zza(zzdgz zzdgzVar) {
            this();
        }
    }

    public final zzdhb zzaqt() {
        zzdhb zzdhbVar = this.zzguk;
        return zzdhbVar == null ? zzdhb.zzara() : zzdhbVar;
    }

    public final int getKeySize() {
        return this.zzgud;
    }

    public static zzdha zzac(zzdpm zzdpmVar) throws zzdrg {
        return (zzdha) zzdqw.zza(zzgum, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdgz.zzdi[i - 1]) {
            case 1:
                return new zzdha();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgum, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzguk", "zzgud"});
            case 4:
                return zzgum;
            case 5:
                zzdsp<zzdha> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdha.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgum);
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

    public static zzdha zzaqx() {
        return zzgum;
    }

    static {
        zzdha zzdhaVar = new zzdha();
        zzgum = zzdhaVar;
        zzdqw.zza(zzdha.class, zzdhaVar);
    }
}
