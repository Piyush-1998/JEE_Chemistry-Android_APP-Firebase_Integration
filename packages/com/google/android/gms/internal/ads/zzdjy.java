package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdjy extends zzdqw<zzdjy, zza> implements zzdsi {
    private static volatile zzdsp<zzdjy> zzdv;
    private static final zzdjy zzgyp;
    private int zzgyh;
    private zzdrd<zzb> zzgyo = zzazw();

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzdqw<zzb, zza> implements zzdsi {
        private static volatile zzdsp<zzb> zzdv;
        private static final zzb zzgyq;
        private String zzgxj = "";
        private int zzgya;
        private int zzgyl;
        private int zzgym;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzb, zza> implements zzdsi {
            private zza() {
                super(zzb.zzgyq);
            }

            public final zza zzhc(String str) {
                zzazn();
                ((zzb) this.zzhkp).zzgv(str);
                return this;
            }

            public final zza zzc(zzdjr zzdjrVar) {
                zzazn();
                ((zzb) this.zzhkp).zza(zzdjrVar);
                return this;
            }

            public final zza zzew(int i) {
                zzazn();
                ((zzb) this.zzhkp).zzes(i);
                return this;
            }

            public final zza zzc(zzdkj zzdkjVar) {
                zzazn();
                ((zzb) this.zzhkp).zza(zzdkjVar);
                return this;
            }

            /* synthetic */ zza(zzdjz zzdjzVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzgv(String str) {
            if (str == null) {
                throw null;
            }
            this.zzgxj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzdjr zzdjrVar) {
            if (zzdjrVar == null) {
                throw null;
            }
            this.zzgyl = zzdjrVar.zzab();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzes(int i) {
            this.zzgym = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzdkj zzdkjVar) {
            if (zzdkjVar == null) {
                throw null;
            }
            this.zzgya = zzdkjVar.zzab();
        }

        public static zza zzauu() {
            return zzgyq.zzazt();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzdjz.zzdi[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzgyq, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzgxj", "zzgyl", "zzgym", "zzgya"});
                case 4:
                    return zzgyq;
                case 5:
                    zzdsp<zzb> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzb.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzgyq);
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
            zzb zzbVar = new zzb();
            zzgyq = zzbVar;
            zzdqw.zza(zzb.class, zzbVar);
        }
    }

    private zzdjy() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzdjy, zza> implements zzdsi {
        private zza() {
            super(zzdjy.zzgyp);
        }

        public final zza zzev(int i) {
            zzazn();
            ((zzdjy) this.zzhkp).zzer(i);
            return this;
        }

        public final zza zzb(zzb zzbVar) {
            zzazn();
            ((zzdjy) this.zzhkp).zza(zzbVar);
            return this;
        }

        /* synthetic */ zza(zzdjz zzdjzVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzer(int i) {
        this.zzgyh = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        if (zzbVar == null) {
            throw null;
        }
        if (!this.zzgyo.zzaxi()) {
            this.zzgyo = zzdqw.zza(this.zzgyo);
        }
        this.zzgyo.add(zzbVar);
    }

    public static zza zzaus() {
        return zzgyp.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjz.zzdi[i - 1]) {
            case 1:
                return new zzdjy();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgyp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzgyh", "zzgyo", zzb.class});
            case 4:
                return zzgyp;
            case 5:
                zzdsp<zzdjy> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdjy.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgyp);
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
        zzdjy zzdjyVar = new zzdjy();
        zzgyp = zzdjyVar;
        zzdqw.zza(zzdjy.class, zzdjyVar);
    }
}
