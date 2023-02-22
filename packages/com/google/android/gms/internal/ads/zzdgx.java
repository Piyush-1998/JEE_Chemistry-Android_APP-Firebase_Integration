package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdgx extends zzdqw<zzdgx, zza> implements zzdsi {
    private static volatile zzdsp<zzdgx> zzdv;
    private static final zzdgx zzgul;
    private int zzgtt;
    private zzdpm zzgub = zzdpm.zzhgb;
    private zzdhb zzguk;

    private zzdgx() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdgx, zza> implements zzdsi {
        private zza() {
            super(zzdgx.zzgul);
        }

        public final zza zzdw(int i) {
            zzazn();
            ((zzdgx) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzc(zzdhb zzdhbVar) {
            zzazn();
            ((zzdgx) this.zzhkp).zzb(zzdhbVar);
            return this;
        }

        public final zza zzab(zzdpm zzdpmVar) {
            zzazn();
            ((zzdgx) this.zzhkp).zzw(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdgy zzdgyVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzgtt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzgtt = i;
    }

    public final zzdhb zzaqt() {
        zzdhb zzdhbVar = this.zzguk;
        return zzdhbVar == null ? zzdhb.zzara() : zzdhbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzdhb zzdhbVar) {
        if (zzdhbVar == null) {
            throw null;
        }
        this.zzguk = zzdhbVar;
    }

    public final zzdpm zzaqj() {
        return this.zzgub;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(zzdpm zzdpmVar) {
        if (zzdpmVar == null) {
            throw null;
        }
        this.zzgub = zzdpmVar;
    }

    public static zzdgx zzaa(zzdpm zzdpmVar) throws zzdrg {
        return (zzdgx) zzdqw.zza(zzgul, zzdpmVar);
    }

    public static zza zzaqu() {
        return zzgul.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdgy.zzdi[i - 1]) {
            case 1:
                return new zzdgx();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgul, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgtt", "zzguk", "zzgub"});
            case 4:
                return zzgul;
            case 5:
                zzdsp<zzdgx> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdgx.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgul);
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

    public static zzdgx zzaqv() {
        return zzgul;
    }

    static {
        zzdgx zzdgxVar = new zzdgx();
        zzgul = zzdgxVar;
        zzdqw.zza(zzdgx.class, zzdgxVar);
    }
}
