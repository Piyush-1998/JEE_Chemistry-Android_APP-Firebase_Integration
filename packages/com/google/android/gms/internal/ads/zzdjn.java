package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdjn extends zzdqw<zzdjn, zza> implements zzdsi {
    private static volatile zzdsp<zzdjn> zzdv;
    private static final zzdjn zzgxm;
    private String zzgxj = "";
    private zzdpm zzgxk = zzdpm.zzhgb;
    private int zzgxl;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public enum zzb implements zzdra {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzdqz<zzb> zzeg = new zzdjp();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzdra
        public final int zzab() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static zzb zzen(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zzab());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        zzb(int i) {
            this.value = i;
        }
    }

    private zzdjn() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdjn, zza> implements zzdsi {
        private zza() {
            super(zzdjn.zzgxm);
        }

        public final zza zzgw(String str) {
            zzazn();
            ((zzdjn) this.zzhkp).zzgv(str);
            return this;
        }

        public final zza zzbo(zzdpm zzdpmVar) {
            zzazn();
            ((zzdjn) this.zzhkp).zzbn(zzdpmVar);
            return this;
        }

        public final zza zzb(zzb zzbVar) {
            zzazn();
            ((zzdjn) this.zzhkp).zza(zzbVar);
            return this;
        }

        /* synthetic */ zza(zzdjo zzdjoVar) {
            this();
        }
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

    public final zzdpm zzatv() {
        return this.zzgxk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbn(zzdpm zzdpmVar) {
        if (zzdpmVar == null) {
            throw null;
        }
        this.zzgxk = zzdpmVar;
    }

    public final zzb zzatw() {
        zzb zzen = zzb.zzen(this.zzgxl);
        return zzen == null ? zzb.UNRECOGNIZED : zzen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        if (zzbVar == null) {
            throw null;
        }
        this.zzgxl = zzbVar.zzab();
    }

    public static zza zzatx() {
        return zzgxm.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjo.zzdi[i - 1]) {
            case 1:
                return new zzdjn();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgxm, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgxj", "zzgxk", "zzgxl"});
            case 4:
                return zzgxm;
            case 5:
                zzdsp<zzdjn> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdjn.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgxm);
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

    public static zzdjn zzaty() {
        return zzgxm;
    }

    static {
        zzdjn zzdjnVar = new zzdjn();
        zzgxm = zzdjnVar;
        zzdqw.zza(zzdjn.class, zzdjnVar);
    }
}
