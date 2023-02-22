package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdip extends zzdqw<zzdip, zza> implements zzdsi {
    private static volatile zzdsp<zzdip> zzdv;
    private static final zzdip zzgwf;
    private zzdiw zzgwc;
    private zzdik zzgwd;
    private int zzgwe;

    private zzdip() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdip, zza> implements zzdsi {
        private zza() {
            super(zzdip.zzgwf);
        }

        /* synthetic */ zza(zzdiq zzdiqVar) {
            this();
        }
    }

    public final zzdiw zzasq() {
        zzdiw zzdiwVar = this.zzgwc;
        return zzdiwVar == null ? zzdiw.zzatd() : zzdiwVar;
    }

    public final zzdik zzasr() {
        zzdik zzdikVar = this.zzgwd;
        return zzdikVar == null ? zzdik.zzasm() : zzdikVar;
    }

    public final zzdhz zzass() {
        zzdhz zzeb = zzdhz.zzeb(this.zzgwe);
        return zzeb == null ? zzdhz.UNRECOGNIZED : zzeb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdiq.zzdi[i - 1]) {
            case 1:
                return new zzdip();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgwf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzgwc", "zzgwd", "zzgwe"});
            case 4:
                return zzgwf;
            case 5:
                zzdsp<zzdip> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdip.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgwf);
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

    public static zzdip zzast() {
        return zzgwf;
    }

    static {
        zzdip zzdipVar = new zzdip();
        zzgwf = zzdipVar;
        zzdqw.zza(zzdip.class, zzdipVar);
    }
}
