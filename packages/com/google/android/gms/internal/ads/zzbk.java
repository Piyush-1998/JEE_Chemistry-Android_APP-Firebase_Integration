package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbk {

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw<zza, C0006zza> implements zzdsi {
        private static volatile zzdsp<zza> zzdv;
        private static final zza zzdy;
        private int zzdj;
        private zzb zzdw;
        private zzc zzdx;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbk$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0006zza extends zzdqw.zza<zza, C0006zza> implements zzdsi {
            private C0006zza() {
                super(zza.zzdy);
            }

            /* synthetic */ C0006zza(zzbj zzbjVar) {
                this();
            }
        }

        public final boolean zzt() {
            return (this.zzdj & 1) != 0;
        }

        public final zzb zzu() {
            zzb zzbVar = this.zzdw;
            return zzbVar == null ? zzb.zzz() : zzbVar;
        }

        public final boolean zzv() {
            return (this.zzdj & 2) != 0;
        }

        public final zzc zzw() {
            zzc zzcVar = this.zzdx;
            return zzcVar == null ? zzc.zzaf() : zzcVar;
        }

        public static zza zza(byte[] bArr, zzdqj zzdqjVar) throws zzdrg {
            return (zza) zzdqw.zza(zzdy, bArr, zzdqjVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzdi[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0006zza(null);
                case 3:
                    return zza(zzdy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzdw", "zzdx"});
                case 4:
                    return zzdy;
                case 5:
                    zzdsp<zza> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zza.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzdy);
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
            zzdy = zzaVar;
            zzdqw.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzdqw<zzb, zza> implements zzdsi {
        private static volatile zzdsp<zzb> zzdv;
        private static final zzb zzea;
        private int zzdj;
        private int zzdz = 2;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzb, zza> implements zzdsi {
            private zza() {
                super(zzb.zzea);
            }

            /* synthetic */ zza(zzbj zzbjVar) {
                this();
            }
        }

        public final zzbm zzy() {
            zzbm zze = zzbm.zze(this.zzdz);
            return zze == null ? zzbm.ENUM_SIGNAL_SOURCE_ADSHIELD : zze;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzdi[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzea, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"zzdj", "zzdz", zzbm.zzac()});
                case 4:
                    return zzea;
                case 5:
                    zzdsp<zzb> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzb.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzea);
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

        public static zzb zzz() {
            return zzea;
        }

        static {
            zzb zzbVar = new zzb();
            zzea = zzbVar;
            zzdqw.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzc extends zzdqw<zzc, zza> implements zzdsi {
        private static volatile zzdsp<zzc> zzdv;
        private static final zzc zzeo;
        private int zzdj;
        private String zzei = "";
        private String zzej = "";
        private String zzek = "";
        private String zzel = "";
        private String zzem = "";
        private String zzen = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzdqw.zza<zzc, zza> implements zzdsi {
            private zza() {
                super(zzc.zzeo);
            }

            /* synthetic */ zza(zzbj zzbjVar) {
                this();
            }
        }

        public final String zzad() {
            return this.zzei;
        }

        public final String zzae() {
            return this.zzen;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzdi[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzeo, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", new Object[]{"zzdj", "zzei", "zzej", "zzek", "zzel", "zzem", "zzen"});
                case 4:
                    return zzeo;
                case 5:
                    zzdsp<zzc> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zzc.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzeo);
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

        public static zzc zzaf() {
            return zzeo;
        }

        static {
            zzc zzcVar = new zzc();
            zzeo = zzcVar;
            zzdqw.zza(zzc.class, zzcVar);
        }
    }
}
