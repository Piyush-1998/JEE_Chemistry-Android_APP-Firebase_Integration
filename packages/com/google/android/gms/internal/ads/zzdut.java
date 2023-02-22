package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdut {

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw<zza, zzb> implements zzdsi {
        private static volatile zzdsp<zza> zzdv;
        private static final zza zzhsa;
        private int zzdj;
        private int zzhrt;
        private C0011zza zzhru;
        private boolean zzhrx;
        private boolean zzhry;
        private byte zzhrz = 2;
        private zzdpm zzhrv = zzdpm.zzhgb;
        private zzdpm zzhrw = zzdpm.zzhgb;

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzdut$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0011zza extends zzdqw<C0011zza, C0012zza> implements zzdsi {
            private static volatile zzdsp<C0011zza> zzdv;
            private static final C0011zza zzhsf;
            private int zzdj;
            private String zzhsb = "";
            private String zzhsc = "";
            private String zzhsd = "";
            private int zzhse;

            private C0011zza() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzdut$zza$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0012zza extends zzdqw.zza<C0011zza, C0012zza> implements zzdsi {
                private C0012zza() {
                    super(C0011zza.zzhsf);
                }

                /* synthetic */ C0012zza(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new C0011zza();
                    case 2:
                        return new C0012zza(null);
                    case 3:
                        return zza(zzhsf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", new Object[]{"zzdj", "zzhsb", "zzhsc", "zzhsd", "zzhse"});
                    case 4:
                        return zzhsf;
                    case 5:
                        zzdsp<C0011zza> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (C0011zza.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhsf);
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
                C0011zza c0011zza = new C0011zza();
                zzhsf = c0011zza;
                zzdqw.zza(C0011zza.class, c0011zza);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzdra {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            
            private static final zzdqz<zzc> zzeg = new zzdux();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zzc zzhg(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return DANGEROUS_HOST;
                            }
                            return POTENTIALLY_UNWANTED;
                        }
                        return UNKNOWN;
                    }
                    return DANGEROUS;
                }
                return SAFE;
            }

            public static zzdrc zzac() {
                return zzduw.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzdqw.zza<zza, zzb> implements zzdsi {
            private zzb() {
                super(zza.zzhsa);
            }

            /* synthetic */ zzb(zzduv zzduvVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzduv.zzdi[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzhsa, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzdj", "zzhrt", zzc.zzac(), "zzhru", "zzhrv", "zzhrw", "zzhrx", "zzhry"});
                case 4:
                    return zzhsa;
                case 5:
                    zzdsp<zza> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zza.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzhsa);
                                zzdv = zzdspVar;
                            }
                        }
                    }
                    return zzdspVar;
                case 6:
                    return Byte.valueOf(this.zzhrz);
                case 7:
                    this.zzhrz = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zzaVar = new zza();
            zzhsa = zzaVar;
            zzdqw.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzdqw<zzb, zza> implements zzdsi {
        private static volatile zzdsp<zzb> zzdv;
        private static final zzb zzhtb;
        private int zzbus;
        private int zzdj;
        private int zzhsm;
        private C0013zzb zzhsp;
        private zzf zzhss;
        private boolean zzhst;
        private boolean zzhsw;
        private boolean zzhsx;
        private zzi zzhsy;
        private byte zzhrz = 2;
        private String zzhsc = "";
        private String zzhsn = "";
        private String zzhso = "";
        private zzdrd<zzh> zzhsq = zzazw();
        private String zzhsr = "";
        private zzdrd<String> zzhsu = zzdqw.zzazw();
        private String zzhsv = "";
        private zzdpm zzhrv = zzdpm.zzhgb;
        private zzdrd<String> zzhsz = zzdqw.zzazw();
        private zzdrd<String> zzhta = zzdqw.zzazw();

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0013zzb extends zzdqw<C0013zzb, zza> implements zzdsi {
            private static volatile zzdsp<C0013zzb> zzdv;
            private static final C0013zzb zzhtd;
            private int zzdj;
            private String zzhtc = "";

            private C0013zzb() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zzb$zza */
            /* loaded from: classes.dex */
            public static final class zza extends zzdqw.zza<C0013zzb, zza> implements zzdsi {
                private zza() {
                    super(C0013zzb.zzhtd);
                }

                public final zza zzhn(String str) {
                    zzazn();
                    ((C0013zzb) this.zzhkp).zzho(str);
                    return this;
                }

                /* synthetic */ zza(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzho(String str) {
                if (str == null) {
                    throw null;
                }
                this.zzdj |= 1;
                this.zzhtc = str;
            }

            public static zza zzbcn() {
                return zzhtd.zzazt();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new C0013zzb();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzhtd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdj", "zzhtc"});
                    case 4:
                        return zzhtd;
                    case 5:
                        zzdsp<C0013zzb> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (C0013zzb.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhtd);
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
                C0013zzb c0013zzb = new C0013zzb();
                zzhtd = c0013zzb;
                zzdqw.zza(C0013zzb.class, c0013zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzc extends zzdqw<zzc, zza> implements zzdsi {
            private static volatile zzdsp<zzc> zzdv;
            private static final zzc zzhtf;
            private int zzdj;
            private byte zzhrz = 2;
            private zzdpm zzhte = zzdpm.zzhgb;
            private zzdpm zzgxk = zzdpm.zzhgb;

            private zzc() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzdqw.zza<zzc, zza> implements zzdsi {
                private zza() {
                    super(zzc.zzhtf);
                }

                public final zza zzdd(zzdpm zzdpmVar) {
                    zzazn();
                    ((zzc) this.zzhkp).zzdf(zzdpmVar);
                    return this;
                }

                public final zza zzde(zzdpm zzdpmVar) {
                    zzazn();
                    ((zzc) this.zzhkp).zzbn(zzdpmVar);
                    return this;
                }

                /* synthetic */ zza(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdf(zzdpm zzdpmVar) {
                if (zzdpmVar == null) {
                    throw null;
                }
                this.zzdj |= 1;
                this.zzhte = zzdpmVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzbn(zzdpm zzdpmVar) {
                if (zzdpmVar == null) {
                    throw null;
                }
                this.zzdj |= 2;
                this.zzgxk = zzdpmVar;
            }

            public static zza zzbcp() {
                return zzhtf.zzazt();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzhtf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", new Object[]{"zzdj", "zzhte", "zzgxk"});
                    case 4:
                        return zzhtf;
                    case 5:
                        zzdsp<zzc> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zzc.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhtf);
                                    zzdv = zzdspVar;
                                }
                            }
                        }
                        return zzdspVar;
                    case 6:
                        return Byte.valueOf(this.zzhrz);
                    case 7:
                        this.zzhrz = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzhtf = zzcVar;
                zzdqw.zza(zzc.class, zzcVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzd extends zzdqw<zzd, zza> implements zzdsi {
            private static volatile zzdsp<zzd> zzdv;
            private static final zzd zzhtl;
            private int zzdj;
            private C0014zzb zzhtg;
            private int zzhtk;
            private byte zzhrz = 2;
            private zzdrd<zzc> zzhth = zzazw();
            private zzdpm zzhti = zzdpm.zzhgb;
            private zzdpm zzhtj = zzdpm.zzhgb;

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zzd$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0014zzb extends zzdqw<C0014zzb, zza> implements zzdsi {
                private static volatile zzdsp<C0014zzb> zzdv;
                private static final C0014zzb zzhtp;
                private int zzdj;
                private zzdpm zzhtm = zzdpm.zzhgb;
                private zzdpm zzhtn = zzdpm.zzhgb;
                private zzdpm zzhto = zzdpm.zzhgb;

                private C0014zzb() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zzd$zzb$zza */
                /* loaded from: classes.dex */
                public static final class zza extends zzdqw.zza<C0014zzb, zza> implements zzdsi {
                    private zza() {
                        super(C0014zzb.zzhtp);
                    }

                    /* synthetic */ zza(zzduv zzduvVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzdqw
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzduv.zzdi[i - 1]) {
                        case 1:
                            return new C0014zzb();
                        case 2:
                            return new zza(null);
                        case 3:
                            return zza(zzhtp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzhtm", "zzhtn", "zzhto"});
                        case 4:
                            return zzhtp;
                        case 5:
                            zzdsp<C0014zzb> zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                synchronized (C0014zzb.class) {
                                    zzdspVar = zzdv;
                                    if (zzdspVar == null) {
                                        zzdspVar = new zzdqw.zzc<>(zzhtp);
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
                    C0014zzb c0014zzb = new C0014zzb();
                    zzhtp = c0014zzb;
                    zzdqw.zza(C0014zzb.class, c0014zzb);
                }
            }

            private zzd() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzdqw.zza<zzd, zza> implements zzdsi {
                private zza() {
                    super(zzd.zzhtl);
                }

                /* synthetic */ zza(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzhtl, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", new Object[]{"zzdj", "zzhtg", "zzhth", zzc.class, "zzhti", "zzhtj", "zzhtk"});
                    case 4:
                        return zzhtl;
                    case 5:
                        zzdsp<zzd> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zzd.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhtl);
                                    zzdv = zzdspVar;
                                }
                            }
                        }
                        return zzdspVar;
                    case 6:
                        return Byte.valueOf(this.zzhrz);
                    case 7:
                        this.zzhrz = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzd zzdVar = new zzd();
                zzhtl = zzdVar;
                zzdqw.zza(zzd.class, zzdVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zze extends zzdqw<zze, zza> implements zzdsi {
            private static volatile zzdsp<zze> zzdv;
            private static final zze zzhts;
            private int zzdj;
            private int zzhtk;
            private C0015zzb zzhtq;
            private byte zzhrz = 2;
            private zzdrd<zzc> zzhth = zzazw();
            private zzdpm zzhti = zzdpm.zzhgb;
            private zzdpm zzhtj = zzdpm.zzhgb;
            private zzdpm zzhtr = zzdpm.zzhgb;

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zze$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0015zzb extends zzdqw<C0015zzb, zza> implements zzdsi {
                private static volatile zzdsp<C0015zzb> zzdv;
                private static final C0015zzb zzhtv;
                private int zzdj;
                private int zzhtt;
                private zzdpm zzhtu = zzdpm.zzhgb;
                private zzdpm zzhto = zzdpm.zzhgb;

                private C0015zzb() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zze$zzb$zza */
                /* loaded from: classes.dex */
                public static final class zza extends zzdqw.zza<C0015zzb, zza> implements zzdsi {
                    private zza() {
                        super(C0015zzb.zzhtv);
                    }

                    /* synthetic */ zza(zzduv zzduvVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzdqw
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzduv.zzdi[i - 1]) {
                        case 1:
                            return new C0015zzb();
                        case 2:
                            return new zza(null);
                        case 3:
                            return zza(zzhtv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzhtt", "zzhtu", "zzhto"});
                        case 4:
                            return zzhtv;
                        case 5:
                            zzdsp<C0015zzb> zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                synchronized (C0015zzb.class) {
                                    zzdspVar = zzdv;
                                    if (zzdspVar == null) {
                                        zzdspVar = new zzdqw.zzc<>(zzhtv);
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
                    C0015zzb c0015zzb = new C0015zzb();
                    zzhtv = c0015zzb;
                    zzdqw.zza(C0015zzb.class, c0015zzb);
                }
            }

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzdqw.zza<zze, zza> implements zzdsi {
                private zza() {
                    super(zze.zzhts);
                }

                /* synthetic */ zza(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzhts, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", new Object[]{"zzdj", "zzhtq", "zzhth", zzc.class, "zzhti", "zzhtj", "zzhtk", "zzhtr"});
                    case 4:
                        return zzhts;
                    case 5:
                        zzdsp<zze> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zze.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhts);
                                    zzdv = zzdspVar;
                                }
                            }
                        }
                        return zzdspVar;
                    case 6:
                        return Byte.valueOf(this.zzhrz);
                    case 7:
                        this.zzhrz = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zze zzeVar = new zze();
                zzhts = zzeVar;
                zzdqw.zza(zze.class, zzeVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzf extends zzdqw<zzf, zza> implements zzdsi {
            private static volatile zzdsp<zzf> zzdv;
            private static final zzf zzhty;
            private int zzbus;
            private int zzdj;
            private String zzhtw = "";
            private zzdpm zzhtx = zzdpm.zzhgb;

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zzf$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public enum EnumC0016zzb implements zzdra {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                
                private static final zzdqz<EnumC0016zzb> zzeg = new zzduy();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzdra
                public final int zzab() {
                    return this.value;
                }

                public static EnumC0016zzb zzhh(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            return null;
                        }
                        return TYPE_CREATIVE;
                    }
                    return TYPE_UNKNOWN;
                }

                public static zzdrc zzac() {
                    return zzduz.zzep;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                EnumC0016zzb(int i) {
                    this.value = i;
                }
            }

            private zzf() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzdqw.zza<zzf, zza> implements zzdsi {
                private zza() {
                    super(zzf.zzhty);
                }

                /* synthetic */ zza(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzhty, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzbus", EnumC0016zzb.zzac(), "zzhtw", "zzhtx"});
                    case 4:
                        return zzhty;
                    case 5:
                        zzdsp<zzf> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zzf.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhty);
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
                zzf zzfVar = new zzf();
                zzhty = zzfVar;
                zzdqw.zza(zzf.class, zzfVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zzg implements zzdra {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            
            private static final zzdqz<zzg> zzeg = new zzdvb();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zzg zzhi(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static zzdrc zzac() {
                return zzdva.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzg(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzh extends zzdqw<zzh, C0017zzb> implements zzdsi {
            private static volatile zzdsp<zzh> zzdv;
            private static final zzh zzhva;
            private int zzdj;
            private int zzhus;
            private zzd zzhut;
            private zze zzhuu;
            private int zzhuv;
            private int zzhuy;
            private byte zzhrz = 2;
            private String zzhsc = "";
            private zzdrb zzhuw = zzazv();
            private String zzhux = "";
            private zzdrd<String> zzhuz = zzdqw.zzazw();

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* loaded from: classes.dex */
            public enum zza implements zzdra {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                
                private static final zzdqz<zza> zzeg = new zzdvd();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzdra
                public final int zzab() {
                    return this.value;
                }

                public static zza zzhj(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    return null;
                                }
                                return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                            }
                            return AD_RESOURCE_POST_CLICK;
                        }
                        return AD_RESOURCE_CREATIVE;
                    }
                    return AD_RESOURCE_UNKNOWN;
                }

                public static zzdrc zzac() {
                    return zzdvc.zzep;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                zza(int i) {
                    this.value = i;
                }
            }

            private zzh() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzdut$zzb$zzh$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0017zzb extends zzdqw.zza<zzh, C0017zzb> implements zzdsi {
                private C0017zzb() {
                    super(zzh.zzhva);
                }

                /* synthetic */ C0017zzb(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C0017zzb(null);
                    case 3:
                        return zza(zzhva, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", new Object[]{"zzdj", "zzhus", "zzhsc", "zzhut", "zzhuu", "zzhuv", "zzhuw", "zzhux", "zzhuy", zza.zzac(), "zzhuz"});
                    case 4:
                        return zzhva;
                    case 5:
                        zzdsp<zzh> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zzh.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhva);
                                    zzdv = zzdspVar;
                                }
                            }
                        }
                        return zzdspVar;
                    case 6:
                        return Byte.valueOf(this.zzhrz);
                    case 7:
                        this.zzhrz = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzh zzhVar = new zzh();
                zzhva = zzhVar;
                zzdqw.zza(zzh.class, zzhVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzi extends zzdqw<zzi, zza> implements zzdsi {
            private static volatile zzdsp<zzi> zzdv;
            private static final zzi zzhve;
            private int zzdj;
            private String zzhvb = "";
            private long zzhvc;
            private boolean zzhvd;

            private zzi() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzdqw.zza<zzi, zza> implements zzdsi {
                private zza() {
                    super(zzi.zzhve);
                }

                public final zza zzhq(String str) {
                    zzazn();
                    ((zzi) this.zzhkp).zzhp(str);
                    return this;
                }

                public final zza zzfo(long j) {
                    zzazn();
                    ((zzi) this.zzhkp).zzfn(j);
                    return this;
                }

                public final zza zzbm(boolean z) {
                    zzazn();
                    ((zzi) this.zzhkp).zzbl(z);
                    return this;
                }

                /* synthetic */ zza(zzduv zzduvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzhp(String str) {
                if (str == null) {
                    throw null;
                }
                this.zzdj |= 1;
                this.zzhvb = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzfn(long j) {
                this.zzdj |= 2;
                this.zzhvc = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzbl(boolean z) {
                this.zzdj |= 4;
                this.zzhvd = z;
            }

            public static zza zzbcx() {
                return zzhve.zzazt();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzduv.zzdi[i - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzhve, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", new Object[]{"zzdj", "zzhvb", "zzhvc", "zzhvd"});
                    case 4:
                        return zzhve;
                    case 5:
                        zzdsp<zzi> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zzi.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzhve);
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
                zzi zziVar = new zzi();
                zzhve = zziVar;
                zzdqw.zza(zzi.class, zziVar);
            }
        }

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzb, zza> implements zzdsi {
            private zza() {
                super(zzb.zzhtb);
            }

            /* synthetic */ zza(zzduv zzduvVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzduv.zzdi[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzhtb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", new Object[]{"zzdj", "zzhsc", "zzhsn", "zzhso", "zzhsq", zzh.class, "zzhst", "zzhsu", "zzhsv", "zzhsw", "zzhsx", "zzbus", zzg.zzac(), "zzhsm", zza.zzc.zzac(), "zzhsp", "zzhsr", "zzhss", "zzhrv", "zzhsy", "zzhsz", "zzhta"});
                case 4:
                    return zzhtb;
                case 5:
                    zzdsp<zzb> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzb.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzhtb);
                                zzdv = zzdspVar;
                            }
                        }
                    }
                    return zzdspVar;
                case 6:
                    return Byte.valueOf(this.zzhrz);
                case 7:
                    this.zzhrz = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzhtb = zzbVar;
            zzdqw.zza(zzb.class, zzbVar);
        }
    }
}
