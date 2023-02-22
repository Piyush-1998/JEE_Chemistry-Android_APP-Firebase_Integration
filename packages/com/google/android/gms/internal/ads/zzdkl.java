package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdkl extends zzdqw<zzdkl, zza> implements zzdsi {
    private static volatile zzdsp<zzdkl> zzdv;
    private static final zzdkl zzgzj;
    private String zzgzh = "";
    private zzdrd<zzdju> zzgzi = zzazw();

    private zzdkl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdkl, zza> implements zzdsi {
        private zza() {
            super(zzdkl.zzgzj);
        }

        public final zza zzhe(String str) {
            zzazn();
            ((zzdkl) this.zzhkp).zzhd(str);
            return this;
        }

        public final zza zzb(zzdju zzdjuVar) {
            zzazn();
            ((zzdkl) this.zzhkp).zza(zzdjuVar);
            return this;
        }

        /* synthetic */ zza(zzdkk zzdkkVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzhd(String str) {
        if (str == null) {
            throw null;
        }
        this.zzgzh = str;
    }

    public final List<zzdju> zzavj() {
        return this.zzgzi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdju zzdjuVar) {
        if (zzdjuVar == null) {
            throw null;
        }
        if (!this.zzgzi.zzaxi()) {
            this.zzgzi = zzdqw.zza(this.zzgzi);
        }
        this.zzgzi.add(zzdjuVar);
    }

    public static zza zzavk() {
        return zzgzj.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdkk.zzdi[i - 1]) {
            case 1:
                return new zzdkl();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgzj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzgzh", "zzgzi", zzdju.class});
            case 4:
                return zzgzj;
            case 5:
                zzdsp<zzdkl> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdkl.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgzj);
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
        zzdkl zzdklVar = new zzdkl();
        zzgzj = zzdklVar;
        zzdqw.zza(zzdkl.class, zzdklVar);
    }
}
