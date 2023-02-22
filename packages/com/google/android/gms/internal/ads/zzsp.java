package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzsp {

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw<zza, zzb> implements zzdsi {
        private static final zza zzbui;
        private static volatile zzdsp<zza> zzdv;
        private zzdrd<C0019zza> zzbuh = zzazw();

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzsp$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0019zza extends zzdqw<C0019zza, C0020zza> implements zzdsi {
            private static final C0019zza zzbug;
            private static volatile zzdsp<C0019zza> zzdv;
            private int zzbud;
            private zzd zzbue;
            private zze zzbuf;
            private int zzdj;

            private C0019zza() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzsp$zza$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0020zza extends zzdqw.zza<C0019zza, C0020zza> implements zzdsi {
                private C0020zza() {
                    super(C0019zza.zzbug);
                }

                /* synthetic */ C0020zza(zzso zzsoVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzso.zzdi[i - 1]) {
                    case 1:
                        return new C0019zza();
                    case 2:
                        return new C0020zza(null);
                    case 3:
                        return zza(zzbug, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzbud", zzc.zzac(), "zzbue", "zzbuf"});
                    case 4:
                        return zzbug;
                    case 5:
                        zzdsp<C0019zza> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (C0019zza.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzbug);
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
                C0019zza c0019zza = new C0019zza();
                zzbug = c0019zza;
                zzdqw.zza(C0019zza.class, c0019zza);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzdra {
            UNSPECIFIED(0),
            IN_MEMORY(1);
            
            private static final zzdqz<zzc> zzeg = new zzsq();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zzc zzbr(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return IN_MEMORY;
                }
                return UNSPECIFIED;
            }

            public static zzdrc zzac() {
                return zzsr.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzd extends zzdqw<zzd, C0021zza> implements zzdsi {
            private static final zzd zzbuo;
            private static volatile zzdsp<zzd> zzdv;
            private boolean zzbum;
            private int zzbun;
            private int zzdj;

            private zzd() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzsp$zza$zzd$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0021zza extends zzdqw.zza<zzd, C0021zza> implements zzdsi {
                private C0021zza() {
                    super(zzd.zzbuo);
                }

                /* synthetic */ C0021zza(zzso zzsoVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzso.zzdi[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new C0021zza(null);
                    case 3:
                        return zza(zzbuo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u000b\u0001", new Object[]{"zzdj", "zzbum", "zzbun"});
                    case 4:
                        return zzbuo;
                    case 5:
                        zzdsp<zzd> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zzd.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzbuo);
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
                zzd zzdVar = new zzd();
                zzbuo = zzdVar;
                zzdqw.zza(zzd.class, zzdVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zze extends zzdqw<zze, C0022zza> implements zzdsi {
            private static final zze zzbur;
            private static volatile zzdsp<zze> zzdv;
            private int zzbun;
            private boolean zzbup;
            private boolean zzbuq;
            private int zzdj;

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzsp$zza$zze$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0022zza extends zzdqw.zza<zze, C0022zza> implements zzdsi {
                private C0022zza() {
                    super(zze.zzbur);
                }

                /* synthetic */ C0022zza(zzso zzsoVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzso.zzdi[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0022zza(null);
                    case 3:
                        return zza(zzbur, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u000b\u0002", new Object[]{"zzdj", "zzbup", "zzbuq", "zzbun"});
                    case 4:
                        return zzbur;
                    case 5:
                        zzdsp<zze> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zze.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzbur);
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
                zze zzeVar = new zze();
                zzbur = zzeVar;
                zzdqw.zza(zze.class, zzeVar);
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzdqw.zza<zza, zzb> implements zzdsi {
            private zzb() {
                super(zza.zzbui);
            }

            /* synthetic */ zzb(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzbui, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbuh", C0019zza.class});
                case 4:
                    return zzbui;
                case 5:
                    zzdsp<zza> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zza.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbui);
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
            zza zzaVar = new zza();
            zzbui = zzaVar;
            zzdqw.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzdqw<zzb, C0023zzb> implements zzdsi {
        private static final zzb zzbuu;
        private static volatile zzdsp<zzb> zzdv;
        private int zzbus;
        private zzm zzbut;
        private int zzdj;

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zza implements zzdra {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            
            private static final zzdqz<zza> zzeg = new zzss();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zza zzbs(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzdrc zzac() {
                return zzst.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zza(int i) {
                this.value = i;
            }
        }

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzsp$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0023zzb extends zzdqw.zza<zzb, C0023zzb> implements zzdsi {
            private C0023zzb() {
                super(zzb.zzbuu);
            }

            /* synthetic */ C0023zzb(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0023zzb(null);
                case 3:
                    return zza(zzbuu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzbus", zza.zzac(), "zzbut"});
                case 4:
                    return zzbuu;
                case 5:
                    zzdsp<zzb> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzb.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbuu);
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
            zzbuu = zzbVar;
            zzdqw.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzc extends zzdqw<zzc, zza> implements zzdsi {
        private static final zzc zzbvk;
        private static volatile zzdsp<zzc> zzdv;
        private String zzbvh = "";
        private zzdrd<zzb> zzbvi = zzazw();
        private int zzbvj;
        private int zzdj;

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzc, zza> implements zzdsi {
            private zza() {
                super(zzc.zzbvk);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbvk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"zzdj", "zzbvh", "zzbvi", zzb.class, "zzbvj", zzsv.zzac()});
                case 4:
                    return zzbvk;
                case 5:
                    zzdsp<zzc> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzc.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbvk);
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
            zzc zzcVar = new zzc();
            zzbvk = zzcVar;
            zzdqw.zza(zzc.class, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzd extends zzdqw<zzd, zza> implements zzdsi {
        private static final zzd zzbvr;
        private static volatile zzdsp<zzd> zzdv;
        private int zzbvl;
        private zzo zzbvm;
        private zzo zzbvn;
        private zzo zzbvo;
        private zzdrd<zzo> zzbvp = zzazw();
        private int zzbvq;
        private int zzdj;

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzd, zza> implements zzdsi {
            private zza() {
                super(zzd.zzbvr);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbvr, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"zzdj", "zzbvl", "zzbvm", "zzbvn", "zzbvo", "zzbvp", zzo.class, "zzbvq"});
                case 4:
                    return zzbvr;
                case 5:
                    zzdsp<zzd> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzd.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbvr);
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
            zzd zzdVar = new zzd();
            zzbvr = zzdVar;
            zzdqw.zza(zzd.class, zzdVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zze extends zzdqw<zze, zza> implements zzdsi {
        private static final zze zzbwa;
        private static volatile zzdsp<zze> zzdv;
        private int zzbvx;
        private zzo zzbvz;
        private int zzdj;
        private String zzbvw = "";
        private zzdrb zzbvy = zzazv();

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zze, zza> implements zzdsi {
            private zza() {
                super(zze.zzbwa);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbwa, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", new Object[]{"zzdj", "zzbvw", "zzbvx", zzsv.zzac(), "zzbvy", "zzbvz"});
                case 4:
                    return zzbwa;
                case 5:
                    zzdsp<zze> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zze.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbwa);
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
            zze zzeVar = new zze();
            zzbwa = zzeVar;
            zzdqw.zza(zze.class, zzeVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzf extends zzdqw<zzf, zza> implements zzdsi {
        private static final zzf zzbwc;
        private static volatile zzdsp<zzf> zzdv;
        private zzdrb zzbvy = zzazv();
        private int zzbwb;
        private int zzdj;

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzf, zza> implements zzdsi {
            private zza() {
                super(zzf.zzbwc);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbwc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzdj", "zzbwb", zzsv.zzac(), "zzbvy"});
                case 4:
                    return zzbwc;
                case 5:
                    zzdsp<zzf> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzf.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbwc);
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
            zzbwc = zzfVar;
            zzdqw.zza(zzf.class, zzfVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzg extends zzdqw<zzg, zza> implements zzdsi {
        private static final zzg zzbwf;
        private static volatile zzdsp<zzg> zzdv;
        private zzo zzbvz;
        private int zzbwb;
        private zze zzbwd;
        private zzdrd<zzn> zzbwe = zzazw();
        private int zzdj;

        private zzg() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzg, zza> implements zzdsi {
            private zza() {
                super(zzg.zzbwf);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbwf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", new Object[]{"zzdj", "zzbwd", "zzbwe", zzn.class, "zzbwb", zzsv.zzac(), "zzbvz"});
                case 4:
                    return zzbwf;
                case 5:
                    zzdsp<zzg> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzg.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbwf);
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
            zzg zzgVar = new zzg();
            zzbwf = zzgVar;
            zzdqw.zza(zzg.class, zzgVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzh extends zzdqw<zzh, zzb> implements zzdsi {
        private static final zzh zzbwh;
        private static volatile zzdsp<zzh> zzdv;
        private int zzbus;
        private int zzbwg;
        private int zzdj;

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zza implements zzdra {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            
            private static final zzdqz<zza> zzeg = new zzsy();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zza zzbu(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                return null;
                            }
                            return LTE;
                        }
                        return THREE_G;
                    }
                    return TWO_G;
                }
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }

            public static zzdrc zzac() {
                return zzsx.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zza(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzdra {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            
            private static final zzdqz<zzc> zzeg = new zzsz();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zzc zzbv(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return WIFI;
                    }
                    return CELL;
                }
                return NETWORKTYPE_UNSPECIFIED;
            }

            public static zzdrc zzac() {
                return zzta.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        private zzh() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzdqw.zza<zzh, zzb> implements zzdsi {
            private zzb() {
                super(zzh.zzbwh);
            }

            public final zzb zzb(zzc zzcVar) {
                zzazn();
                ((zzh) this.zzhkp).zza(zzcVar);
                return this;
            }

            public final zzb zzb(zza zzaVar) {
                zzazn();
                ((zzh) this.zzhkp).zza(zzaVar);
                return this;
            }

            /* synthetic */ zzb(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzc zzcVar) {
            if (zzcVar == null) {
                throw null;
            }
            this.zzdj |= 1;
            this.zzbus = zzcVar.zzab();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zza zzaVar) {
            if (zzaVar == null) {
                throw null;
            }
            this.zzdj |= 2;
            this.zzbwg = zzaVar.zzab();
        }

        public static zzb zzna() {
            return zzbwh.zzazt();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzbwh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzdj", "zzbus", zzc.zzac(), "zzbwg", zza.zzac()});
                case 4:
                    return zzbwh;
                case 5:
                    zzdsp<zzh> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzh.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbwh);
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
            zzh zzhVar = new zzh();
            zzbwh = zzhVar;
            zzdqw.zza(zzh.class, zzhVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzi extends zzdqw<zzi, zza> implements zzdsi {
        private static final zzi zzbwt;
        private static volatile zzdsp<zzi> zzdv;
        private int zzbwr;
        private zzo zzbws;
        private int zzdj;

        private zzi() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzi, zza> implements zzdsi {
            private zza() {
                super(zzi.zzbwt);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbwt, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzbwr", zzsv.zzac(), "zzbws"});
                case 4:
                    return zzbwt;
                case 5:
                    zzdsp<zzi> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzi.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbwt);
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
            zzbwt = zziVar;
            zzdqw.zza(zzi.class, zziVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzj extends zzdqw<zzj, zzb> implements zzdsi {
        private static final zzj zzbwz;
        private static volatile zzdsp<zzj> zzdv;
        private int zzbwu;
        private int zzbwv;
        private long zzbww;
        private long zzbwy;
        private int zzdj;
        private zzdrd<zza> zzbuh = zzazw();
        private String zzdk = "";
        private String zzbwx = "";

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw<zza, C0024zza> implements zzdsi {
            private static final zzdre<Integer, zzb.zza> zzbxf = new zztb();
            private static final zza zzbxn;
            private static volatile zzdsp<zza> zzdv;
            private long zzbxa;
            private int zzbxb;
            private long zzbxc;
            private long zzbxd;
            private zzdrb zzbxe = zzazv();
            private zzh zzbxg;
            private int zzbxh;
            private int zzbxi;
            private int zzbxj;
            private int zzbxk;
            private int zzbxl;
            private int zzbxm;
            private int zzdj;

            private zza() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzsp$zzj$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0024zza extends zzdqw.zza<zza, C0024zza> implements zzdsi {
                private C0024zza() {
                    super(zza.zzbxn);
                }

                public final C0024zza zzeo(long j) {
                    zzazn();
                    ((zza) this.zzhkp).setTimestamp(j);
                    return this;
                }

                public final C0024zza zzf(zzsv zzsvVar) {
                    zzazn();
                    ((zza) this.zzhkp).zza(zzsvVar);
                    return this;
                }

                public final C0024zza zzep(long j) {
                    zzazn();
                    ((zza) this.zzhkp).zzek(j);
                    return this;
                }

                public final C0024zza zzeq(long j) {
                    zzazn();
                    ((zza) this.zzhkp).zzel(j);
                    return this;
                }

                public final C0024zza zzd(Iterable<? extends zzb.zza> iterable) {
                    zzazn();
                    ((zza) this.zzhkp).zzb(iterable);
                    return this;
                }

                public final C0024zza zzb(zzh zzhVar) {
                    zzazn();
                    ((zza) this.zzhkp).zza(zzhVar);
                    return this;
                }

                public final C0024zza zzg(zzsv zzsvVar) {
                    zzazn();
                    ((zza) this.zzhkp).zzb(zzsvVar);
                    return this;
                }

                public final C0024zza zzh(zzsv zzsvVar) {
                    zzazn();
                    ((zza) this.zzhkp).zzc(zzsvVar);
                    return this;
                }

                public final C0024zza zzi(zzsv zzsvVar) {
                    zzazn();
                    ((zza) this.zzhkp).zzd(zzsvVar);
                    return this;
                }

                public final C0024zza zzcb(int i) {
                    zzazn();
                    ((zza) this.zzhkp).zzby(i);
                    return this;
                }

                public final C0024zza zzj(zzsv zzsvVar) {
                    zzazn();
                    ((zza) this.zzhkp).zze(zzsvVar);
                    return this;
                }

                public final C0024zza zzb(zzc zzcVar) {
                    zzazn();
                    ((zza) this.zzhkp).zza(zzcVar);
                    return this;
                }

                /* synthetic */ C0024zza(zzso zzsoVar) {
                    this();
                }
            }

            public final long getTimestamp() {
                return this.zzbxa;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setTimestamp(long j) {
                this.zzdj |= 1;
                this.zzbxa = j;
            }

            public final zzsv zznf() {
                zzsv zzbt = zzsv.zzbt(this.zzbxb);
                return zzbt == null ? zzsv.ENUM_FALSE : zzbt;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzsv zzsvVar) {
                if (zzsvVar == null) {
                    throw null;
                }
                this.zzdj |= 2;
                this.zzbxb = zzsvVar.zzab();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzek(long j) {
                this.zzdj |= 4;
                this.zzbxc = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzel(long j) {
                this.zzdj |= 8;
                this.zzbxd = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzb(Iterable<? extends zzb.zza> iterable) {
                if (!this.zzbxe.zzaxi()) {
                    this.zzbxe = zzdqw.zza(this.zzbxe);
                }
                for (zzb.zza zzaVar : iterable) {
                    this.zzbxe.zzgp(zzaVar.zzab());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzh zzhVar) {
                if (zzhVar == null) {
                    throw null;
                }
                this.zzbxg = zzhVar;
                this.zzdj |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzb(zzsv zzsvVar) {
                if (zzsvVar == null) {
                    throw null;
                }
                this.zzdj |= 32;
                this.zzbxh = zzsvVar.zzab();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzc(zzsv zzsvVar) {
                if (zzsvVar == null) {
                    throw null;
                }
                this.zzdj |= 64;
                this.zzbxi = zzsvVar.zzab();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzd(zzsv zzsvVar) {
                if (zzsvVar == null) {
                    throw null;
                }
                this.zzdj |= 128;
                this.zzbxj = zzsvVar.zzab();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzby(int i) {
                this.zzdj |= 256;
                this.zzbxk = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zze(zzsv zzsvVar) {
                if (zzsvVar == null) {
                    throw null;
                }
                this.zzdj |= 512;
                this.zzbxl = zzsvVar.zzab();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzc zzcVar) {
                if (zzcVar == null) {
                    throw null;
                }
                this.zzdj |= 1024;
                this.zzbxm = zzcVar.zzab();
            }

            public static zza zzg(byte[] bArr) throws zzdrg {
                return (zza) zzdqw.zza(zzbxn, bArr);
            }

            public static C0024zza zzng() {
                return zzbxn.zzazt();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdqw
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzso.zzdi[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0024zza(null);
                    case 3:
                        return zza(zzbxn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u001e\u0006\t\u0004\u0007\f\u0005\b\f\u0006\t\f\u0007\n\u0004\b\u000b\f\t\f\f\n", new Object[]{"zzdj", "zzbxa", "zzbxb", zzsv.zzac(), "zzbxc", "zzbxd", "zzbxe", zzb.zza.zzac(), "zzbxg", "zzbxh", zzsv.zzac(), "zzbxi", zzsv.zzac(), "zzbxj", zzsv.zzac(), "zzbxk", "zzbxl", zzsv.zzac(), "zzbxm", zzc.zzac()});
                    case 4:
                        return zzbxn;
                    case 5:
                        zzdsp<zza> zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            synchronized (zza.class) {
                                zzdspVar = zzdv;
                                if (zzdspVar == null) {
                                    zzdspVar = new zzdqw.zzc<>(zzbxn);
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
                zza zzaVar = new zza();
                zzbxn = zzaVar;
                zzdqw.zza(zza.class, zzaVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzdra {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);
            
            private static final zzdqz<zzc> zzeg = new zztc();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zzc zzcc(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        return null;
                                    }
                                    return SUSPENDED;
                                }
                                return DISCONNECTED;
                            }
                            return DISCONNECTING;
                        }
                        return CONNECTED;
                    }
                    return CONNECTING;
                }
                return UNSPECIFIED;
            }

            public static zzdrc zzac() {
                return zztd.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        private zzj() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzdqw.zza<zzj, zzb> implements zzdsi {
            private zzb() {
                super(zzj.zzbwz);
            }

            public final zzb zzc(Iterable<? extends zza> iterable) {
                zzazn();
                ((zzj) this.zzhkp).zza(iterable);
                return this;
            }

            public final zzb zzbz(int i) {
                zzazn();
                ((zzj) this.zzhkp).zzbw(i);
                return this;
            }

            public final zzb zzca(int i) {
                zzazn();
                ((zzj) this.zzhkp).zzbx(i);
                return this;
            }

            public final zzb zzem(long j) {
                zzazn();
                ((zzj) this.zzhkp).zzei(j);
                return this;
            }

            public final zzb zzbv(String str) {
                zzazn();
                ((zzj) this.zzhkp).zzm(str);
                return this;
            }

            public final zzb zzbw(String str) {
                zzazn();
                ((zzj) this.zzhkp).zzbu(str);
                return this;
            }

            public final zzb zzen(long j) {
                zzazn();
                ((zzj) this.zzhkp).zzej(j);
                return this;
            }

            /* synthetic */ zzb(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends zza> iterable) {
            if (!this.zzbuh.zzaxi()) {
                this.zzbuh = zzdqw.zza(this.zzbuh);
            }
            zzdpf.zza(iterable, this.zzbuh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbw(int i) {
            this.zzdj |= 1;
            this.zzbwu = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbx(int i) {
            this.zzdj |= 2;
            this.zzbwv = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzei(long j) {
            this.zzdj |= 4;
            this.zzbww = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzm(String str) {
            if (str == null) {
                throw null;
            }
            this.zzdj |= 8;
            this.zzdk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbu(String str) {
            if (str == null) {
                throw null;
            }
            this.zzdj |= 16;
            this.zzbwx = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzej(long j) {
            this.zzdj |= 32;
            this.zzbwy = j;
        }

        public static zzb zznd() {
            return zzbwz.zzazt();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzbwz, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0002\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005", new Object[]{"zzdj", "zzbuh", zza.class, "zzbwu", "zzbwv", "zzbww", "zzdk", "zzbwx", "zzbwy"});
                case 4:
                    return zzbwz;
                case 5:
                    zzdsp<zzj> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzj.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbwz);
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
            zzj zzjVar = new zzj();
            zzbwz = zzjVar;
            zzdqw.zza(zzj.class, zzjVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzk extends zzdqw<zzk, zza> implements zzdsi {
        private static final zzk zzbyg;
        private static volatile zzdsp<zzk> zzdv;
        private int zzbxv = 1000;
        private int zzbxw = 1000;
        private int zzbxx;
        private int zzbxy;
        private int zzbxz;
        private int zzbya;
        private int zzbyb;
        private int zzbyc;
        private int zzbyd;
        private int zzbye;
        private zzl zzbyf;
        private int zzdj;

        private zzk() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzk, zza> implements zzdsi {
            private zza() {
                super(zzk.zzbyg);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbyg, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", new Object[]{"zzdj", "zzbxv", zzsv.zzac(), "zzbxw", zzsv.zzac(), "zzbxx", "zzbxy", "zzbxz", "zzbya", "zzbyb", "zzbyc", "zzbyd", "zzbye", "zzbyf"});
                case 4:
                    return zzbyg;
                case 5:
                    zzdsp<zzk> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzk.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbyg);
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
            zzk zzkVar = new zzk();
            zzbyg = zzkVar;
            zzdqw.zza(zzk.class, zzkVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzl extends zzdqw<zzl, zza> implements zzdsi {
        private static final zzl zzbyj;
        private static volatile zzdsp<zzl> zzdv;
        private int zzbyh;
        private int zzbyi;
        private int zzdj;

        private zzl() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzl, zza> implements zzdsi {
            private zza() {
                super(zzl.zzbyj);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbyj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzbyh", "zzbyi"});
                case 4:
                    return zzbyj;
                case 5:
                    zzdsp<zzl> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzl.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbyj);
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
            zzl zzlVar = new zzl();
            zzbyj = zzlVar;
            zzdqw.zza(zzl.class, zzlVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzm extends zzdqw<zzm, zza> implements zzdsi {
        private static final zzm zzbym;
        private static volatile zzdsp<zzm> zzdv;
        private int zzbyk;
        private int zzbyl;
        private int zzdj;

        private zzm() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzm, zza> implements zzdsi {
            private zza() {
                super(zzm.zzbym);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbym, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzbyk", "zzbyl"});
                case 4:
                    return zzbym;
                case 5:
                    zzdsp<zzm> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzm.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbym);
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
            zzm zzmVar = new zzm();
            zzbym = zzmVar;
            zzdqw.zza(zzm.class, zzmVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzn extends zzdqw<zzn, zza> implements zzdsi {
        private static final zzn zzbyn;
        private static volatile zzdsp<zzn> zzdv;
        private String zzbvw = "";
        private int zzbvx;
        private zzo zzbvz;
        private int zzdj;

        private zzn() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzn, zza> implements zzdsi {
            private zza() {
                super(zzn.zzbyn);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbyn, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzbvw", "zzbvx", zzsv.zzac(), "zzbvz"});
                case 4:
                    return zzbyn;
                case 5:
                    zzdsp<zzn> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzn.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbyn);
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
            zzn zznVar = new zzn();
            zzbyn = zznVar;
            zzdqw.zza(zzn.class, zznVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzo extends zzdqw<zzo, zza> implements zzdsi {
        private static final zzo zzbyq;
        private static volatile zzdsp<zzo> zzdv;
        private int zzbyo;
        private int zzbyp;
        private int zzdj;

        private zzo() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzo, zza> implements zzdsi {
            private zza() {
                super(zzo.zzbyq);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbyq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzbyo", "zzbyp"});
                case 4:
                    return zzbyq;
                case 5:
                    zzdsp<zzo> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzo.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbyq);
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
            zzo zzoVar = new zzo();
            zzbyq = zzoVar;
            zzdqw.zza(zzo.class, zzoVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzp extends zzdqw<zzp, zza> implements zzdsi {
        private static final zzp zzbyt;
        private static volatile zzdsp<zzp> zzdv;
        private int zzbwb = 1000;
        private zzq zzbyr;
        private zzo zzbys;
        private int zzdj;

        private zzp() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzp, zza> implements zzdsi {
            private zza() {
                super(zzp.zzbyt);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbyt, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzbwb", zzsv.zzac(), "zzbyr", "zzbys"});
                case 4:
                    return zzbyt;
                case 5:
                    zzdsp<zzp> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzp.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbyt);
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
            zzp zzpVar = new zzp();
            zzbyt = zzpVar;
            zzdqw.zza(zzp.class, zzpVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzq extends zzdqw<zzq, zzb> implements zzdsi {
        private static final zzq zzbyv;
        private static volatile zzdsp<zzq> zzdv;
        private int zzbyu;
        private int zzdj;

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public enum zza implements zzdra {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            
            private static final zzdqz<zza> zzeg = new zztf();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzdra
            public final int zzab() {
                return this.value;
            }

            public static zza zzcd(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return ANDROID_TARGET_API_TOO_LOW;
                        }
                        return CACHE_LOAD_FAILED;
                    }
                    return OPENGL_RENDERING_FAILED;
                }
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }

            public static zzdrc zzac() {
                return zzte.zzep;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zza(int i) {
                this.value = i;
            }
        }

        private zzq() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzdqw.zza<zzq, zzb> implements zzdsi {
            private zzb() {
                super(zzq.zzbyv);
            }

            /* synthetic */ zzb(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzbyv, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzdj", "zzbyu", zza.zzac()});
                case 4:
                    return zzbyv;
                case 5:
                    zzdsp<zzq> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzq.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbyv);
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
            zzq zzqVar = new zzq();
            zzbyv = zzqVar;
            zzdqw.zza(zzq.class, zzqVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzr extends zzdqw<zzr, zza> implements zzdsi {
        private static final zzr zzbze;
        private static volatile zzdsp<zzr> zzdv;
        private int zzbwb = 1000;
        private zzq zzbyr;
        private int zzbzb;
        private int zzbzc;
        private int zzbzd;
        private int zzdj;

        private zzr() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzr, zza> implements zzdsi {
            private zza() {
                super(zzr.zzbze);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbze, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"zzdj", "zzbwb", zzsv.zzac(), "zzbyr", "zzbzb", "zzbzc", "zzbzd"});
                case 4:
                    return zzbze;
                case 5:
                    zzdsp<zzr> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzr.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbze);
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
            zzr zzrVar = new zzr();
            zzbze = zzrVar;
            zzdqw.zza(zzr.class, zzrVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzs extends zzdqw<zzs, zza> implements zzdsi {
        private static final zzs zzbzf;
        private static volatile zzdsp<zzs> zzdv;
        private int zzbwb = 1000;
        private zzq zzbyr;
        private zzo zzbys;
        private int zzdj;

        private zzs() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzs, zza> implements zzdsi {
            private zza() {
                super(zzs.zzbzf);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbzf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzbwb", zzsv.zzac(), "zzbyr", "zzbys"});
                case 4:
                    return zzbzf;
                case 5:
                    zzdsp<zzs> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzs.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbzf);
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
            zzs zzsVar = new zzs();
            zzbzf = zzsVar;
            zzdqw.zza(zzs.class, zzsVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzt extends zzdqw<zzt, zza> implements zzdsi {
        private static final zzt zzbzh;
        private static volatile zzdsp<zzt> zzdv;
        private int zzbwb = 1000;
        private zzq zzbyr;
        private int zzbzb;
        private int zzbzc;
        private int zzbzd;
        private long zzbzg;
        private int zzdj;

        private zzt() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzt, zza> implements zzdsi {
            private zza() {
                super(zzt.zzbzh);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0003\u0005", new Object[]{"zzdj", "zzbwb", zzsv.zzac(), "zzbyr", "zzbzb", "zzbzc", "zzbzd", "zzbzg"});
                case 4:
                    return zzbzh;
                case 5:
                    zzdsp<zzt> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzt.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbzh);
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
            zzt zztVar = new zzt();
            zzbzh = zztVar;
            zzdqw.zza(zzt.class, zztVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzu extends zzdqw<zzu, zza> implements zzdsi {
        private static final zzu zzbzi;
        private static volatile zzdsp<zzu> zzdv;
        private int zzbwb = 1000;
        private zzq zzbyr;
        private zzo zzbys;
        private int zzdj;

        private zzu() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzu, zza> implements zzdsi {
            private zza() {
                super(zzu.zzbzi);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzbwb", zzsv.zzac(), "zzbyr", "zzbys"});
                case 4:
                    return zzbzi;
                case 5:
                    zzdsp<zzu> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzu.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbzi);
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
            zzu zzuVar = new zzu();
            zzbzi = zzuVar;
            zzdqw.zza(zzu.class, zzuVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzv extends zzdqw<zzv, zza> implements zzdsi {
        private static final zzv zzbzj;
        private static volatile zzdsp<zzv> zzdv;
        private int zzbwb = 1000;
        private zzq zzbyr;
        private int zzdj;

        private zzv() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzv, zza> implements zzdsi {
            private zza() {
                super(zzv.zzbzj);
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbzj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzbwb", zzsv.zzac(), "zzbyr"});
                case 4:
                    return zzbzj;
                case 5:
                    zzdsp<zzv> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzv.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbzj);
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
            zzv zzvVar = new zzv();
            zzbzj = zzvVar;
            zzdqw.zza(zzv.class, zzvVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzw extends zzdqw<zzw, zza> implements zzdsi {
        private static final zzw zzbzm;
        private static volatile zzdsp<zzw> zzdv;
        private boolean zzbzk;
        private int zzbzl;
        private int zzdj;

        private zzw() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzw, zza> implements zzdsi {
            private zza() {
                super(zzw.zzbzm);
            }

            public final boolean zznu() {
                return ((zzw) this.zzhkp).zznu();
            }

            public final zza zzp(boolean z) {
                zzazn();
                ((zzw) this.zzhkp).zzq(z);
                return this;
            }

            public final zza zzce(int i) {
                zzazn();
                ((zzw) this.zzhkp).zzcf(i);
                return this;
            }

            /* synthetic */ zza(zzso zzsoVar) {
                this();
            }
        }

        public final boolean zznu() {
            return this.zzbzk;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzq(boolean z) {
            this.zzdj |= 1;
            this.zzbzk = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcf(int i) {
            this.zzdj |= 2;
            this.zzbzl = i;
        }

        public static zza zznv() {
            return zzbzm.zzazt();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzso.zzdi[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzbzm, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzbzk", "zzbzl"});
                case 4:
                    return zzbzm;
                case 5:
                    zzdsp<zzw> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzw.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzbzm);
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
            zzw zzwVar = new zzw();
            zzbzm = zzwVar;
            zzdqw.zza(zzw.class, zzwVar);
        }
    }
}
