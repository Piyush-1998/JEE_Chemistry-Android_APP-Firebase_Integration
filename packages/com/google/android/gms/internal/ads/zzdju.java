package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdju extends zzdqw<zzdju, zza> implements zzdsi {
    private static volatile zzdsp<zzdju> zzdv;
    private static final zzdju zzgyg;
    private int zzgyd;
    private boolean zzgye;
    private String zzgyc = "";
    private String zzgxj = "";
    private String zzgyf = "";

    private zzdju() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdju, zza> implements zzdsi {
        private zza() {
            super(zzdju.zzgyg);
        }

        public final zza zzgz(String str) {
            zzazn();
            ((zzdju) this.zzhkp).zzgx(str);
            return this;
        }

        public final zza zzha(String str) {
            zzazn();
            ((zzdju) this.zzhkp).zzgv(str);
            return this;
        }

        public final zza zzeq(int i) {
            zzazn();
            ((zzdju) this.zzhkp).zzep(0);
            return this;
        }

        public final zza zzbg(boolean z) {
            zzazn();
            ((zzdju) this.zzhkp).zzbf(true);
            return this;
        }

        public final zza zzhb(String str) {
            zzazn();
            ((zzdju) this.zzhkp).zzgy(str);
            return this;
        }

        /* synthetic */ zza(zzdjv zzdjvVar) {
            this();
        }
    }

    public final String zzauc() {
        return this.zzgyc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgx(String str) {
        if (str == null) {
            throw null;
        }
        this.zzgyc = str;
    }

    public final String zzatu() {
        return this.zzgxj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgv(String str) {
        if (str == null) {
            throw null;
        }
        this.zzgxj = str;
    }

    public final int zzaud() {
        return this.zzgyd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzep(int i) {
        this.zzgyd = i;
    }

    public final boolean zzaue() {
        return this.zzgye;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbf(boolean z) {
        this.zzgye = z;
    }

    public final String zzauf() {
        return this.zzgyf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgy(String str) {
        if (str == null) {
            throw null;
        }
        this.zzgyf = str;
    }

    public static zza zzaug() {
        return zzgyg.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjv.zzdi[i - 1]) {
            case 1:
                return new zzdju();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgyg, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzgyc", "zzgxj", "zzgyd", "zzgye", "zzgyf"});
            case 4:
                return zzgyg;
            case 5:
                zzdsp<zzdju> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdju.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgyg);
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
        zzdju zzdjuVar = new zzdju();
        zzgyg = zzdjuVar;
        zzdqw.zza(zzdju.class, zzdjuVar);
    }
}
