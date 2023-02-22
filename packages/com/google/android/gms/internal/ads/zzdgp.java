package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdgp extends zzdqw<zzdgp, zza> implements zzdsi {
    private static volatile zzdsp<zzdgp> zzdv;
    private static final zzdgp zzgtz;
    private zzdha zzgtx;
    private zzdjj zzgty;

    private zzdgp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdgp, zza> implements zzdsi {
        private zza() {
            super(zzdgp.zzgtz);
        }

        /* synthetic */ zza(zzdgq zzdgqVar) {
            this();
        }
    }

    public final zzdha zzaqf() {
        zzdha zzdhaVar = this.zzgtx;
        return zzdhaVar == null ? zzdha.zzaqx() : zzdhaVar;
    }

    public final zzdjj zzaqg() {
        zzdjj zzdjjVar = this.zzgty;
        return zzdjjVar == null ? zzdjj.zzato() : zzdjjVar;
    }

    public static zzdgp zzv(zzdpm zzdpmVar) throws zzdrg {
        return (zzdgp) zzdqw.zza(zzgtz, zzdpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdgq.zzdi[i - 1]) {
            case 1:
                return new zzdgp();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgtz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzgtx", "zzgty"});
            case 4:
                return zzgtz;
            case 5:
                zzdsp<zzdgp> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdgp.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgtz);
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
        zzdgp zzdgpVar = new zzdgp();
        zzgtz = zzdgpVar;
        zzdqw.zza(zzdgp.class, zzdgpVar);
    }
}
