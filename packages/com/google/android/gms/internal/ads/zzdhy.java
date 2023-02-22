package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdhy extends zzdqw<zzdhy, zza> implements zzdsi {
    private static volatile zzdsp<zzdhy> zzdv;
    private static final zzdhy zzgvb;
    private int zzgtt;
    private zzdpm zzgub = zzdpm.zzhgb;

    private zzdhy() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdhy, zza> implements zzdsi {
        private zza() {
            super(zzdhy.zzgvb);
        }

        public final zza zzec(int i) {
            zzazn();
            ((zzdhy) this.zzhkp).setVersion(0);
            return this;
        }

        public final zza zzaq(zzdpm zzdpmVar) {
            zzazn();
            ((zzdhy) this.zzhkp).zzw(zzdpmVar);
            return this;
        }

        /* synthetic */ zza(zzdhx zzdhxVar) {
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

    public static zzdhy zzap(zzdpm zzdpmVar) throws zzdrg {
        return (zzdhy) zzdqw.zza(zzgvb, zzdpmVar);
    }

    public static zza zzaru() {
        return zzgvb.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdhx.zzdi[i - 1]) {
            case 1:
                return new zzdhy();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgvb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzgtt", "zzgub"});
            case 4:
                return zzgvb;
            case 5:
                zzdsp<zzdhy> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdhy.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgvb);
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
        zzdhy zzdhyVar = new zzdhy();
        zzgvb = zzdhyVar;
        zzdqw.zza(zzdhy.class, zzdhyVar);
    }
}
