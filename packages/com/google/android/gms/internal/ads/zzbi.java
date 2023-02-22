package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbi {

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw<zza, C0005zza> implements zzdsi {
        private static final zza zzdu;
        private static volatile zzdsp<zza> zzdv;
        private int zzdj;
        private long zzdl;
        private long zzdp;
        private long zzdq;
        private long zzds;
        private String zzdk = "";
        private String zzdm = "";
        private String zzdn = "";
        private String zzdo = "";
        private String zzdr = "";
        private String zzdt = "";

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbi$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0005zza extends zzdqw.zza<zza, C0005zza> implements zzdsi {
            private C0005zza() {
                super(zza.zzdu);
            }

            public final C0005zza zzi(String str) {
                zzazn();
                ((zza) this.zzhkp).zzm(str);
                return this;
            }

            public final C0005zza zzc(long j) {
                zzazn();
                ((zza) this.zzhkp).zzd(j);
                return this;
            }

            public final C0005zza zzj(String str) {
                zzazn();
                ((zza) this.zzhkp).zzn(str);
                return this;
            }

            public final C0005zza zzk(String str) {
                zzazn();
                ((zza) this.zzhkp).zzo(str);
                return this;
            }

            public final C0005zza zzl(String str) {
                zzazn();
                ((zza) this.zzhkp).zzp(str);
                return this;
            }

            /* synthetic */ C0005zza(zzbh zzbhVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzm(String str) {
            if (str == null) {
                throw null;
            }
            this.zzdj |= 1;
            this.zzdk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzdj |= 2;
            this.zzdl = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzn(String str) {
            if (str == null) {
                throw null;
            }
            this.zzdj |= 4;
            this.zzdm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo(String str) {
            if (str == null) {
                throw null;
            }
            this.zzdj |= 8;
            this.zzdn = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp(String str) {
            if (str == null) {
                throw null;
            }
            this.zzdj |= 16;
            this.zzdo = str;
        }

        public static C0005zza zzr() {
            return zzdu.zzazt();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbh.zzdi[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0005zza(null);
                case 3:
                    return zza(zzdu, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t", new Object[]{"zzdj", "zzdk", "zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt"});
                case 4:
                    return zzdu;
                case 5:
                    zzdsp<zza> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zza.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzdu);
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
            zzdu = zzaVar;
            zzdqw.zza(zza.class, zzaVar);
        }
    }
}
