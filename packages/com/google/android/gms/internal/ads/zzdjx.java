package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdjx extends zzdqw<zzdjx, zzb> implements zzdsi {
    private static volatile zzdsp<zzdjx> zzdv;
    private static final zzdjx zzgyj;
    private int zzgyh;
    private zzdrd<zza> zzgyi = zzazw();

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw<zza, C0010zza> implements zzdsi {
        private static volatile zzdsp<zza> zzdv;
        private static final zza zzgyn;
        private int zzgya;
        private zzdjn zzgyk;
        private int zzgyl;
        private int zzgym;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzdjx$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0010zza extends zzdqw.zza<zza, C0010zza> implements zzdsi {
            private C0010zza() {
                super(zza.zzgyn);
            }

            public final C0010zza zzb(zzdjn zzdjnVar) {
                zzazn();
                ((zza) this.zzhkp).zza(zzdjnVar);
                return this;
            }

            public final C0010zza zzb(zzdjr zzdjrVar) {
                zzazn();
                ((zza) this.zzhkp).zza(zzdjrVar);
                return this;
            }

            public final C0010zza zzeu(int i) {
                zzazn();
                ((zza) this.zzhkp).zzes(i);
                return this;
            }

            public final C0010zza zzb(zzdkj zzdkjVar) {
                zzazn();
                ((zza) this.zzhkp).zza(zzdkjVar);
                return this;
            }

            /* synthetic */ C0010zza(zzdjw zzdjwVar) {
                this();
            }
        }

        public final boolean zzaun() {
            return this.zzgyk != null;
        }

        public final zzdjn zzauo() {
            zzdjn zzdjnVar = this.zzgyk;
            return zzdjnVar == null ? zzdjn.zzaty() : zzdjnVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzdjn zzdjnVar) {
            if (zzdjnVar == null) {
                throw null;
            }
            this.zzgyk = zzdjnVar;
        }

        public final zzdjr zzaps() {
            zzdjr zzeo = zzdjr.zzeo(this.zzgyl);
            return zzeo == null ? zzdjr.UNRECOGNIZED : zzeo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzdjr zzdjrVar) {
            if (zzdjrVar == null) {
                throw null;
            }
            this.zzgyl = zzdjrVar.zzab();
        }

        public final int zzaup() {
            return this.zzgym;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzes(int i) {
            this.zzgym = i;
        }

        public final zzdkj zzapt() {
            zzdkj zzez = zzdkj.zzez(this.zzgya);
            return zzez == null ? zzdkj.UNRECOGNIZED : zzez;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzdkj zzdkjVar) {
            if (zzdkjVar == null) {
                throw null;
            }
            this.zzgya = zzdkjVar.zzab();
        }

        public static C0010zza zzauq() {
            return zzgyn.zzazt();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdqw
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzdjw.zzdi[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0010zza(null);
                case 3:
                    return zza(zzgyn, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzgyk", "zzgyl", "zzgym", "zzgya"});
                case 4:
                    return zzgyn;
                case 5:
                    zzdsp<zza> zzdspVar = zzdv;
                    if (zzdspVar == null) {
                        synchronized (zza.class) {
                            zzdspVar = zzdv;
                            if (zzdspVar == null) {
                                zzdspVar = new zzdqw.zzc<>(zzgyn);
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
            zzgyn = zzaVar;
            zzdqw.zza(zza.class, zzaVar);
        }
    }

    private zzdjx() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzdqw.zza<zzdjx, zzb> implements zzdsi {
        private zzb() {
            super(zzdjx.zzgyj);
        }

        public final zzb zzet(int i) {
            zzazn();
            ((zzdjx) this.zzhkp).zzer(i);
            return this;
        }

        public final zzb zzb(zza zzaVar) {
            zzazn();
            ((zzdjx) this.zzhkp).zza(zzaVar);
            return this;
        }

        /* synthetic */ zzb(zzdjw zzdjwVar) {
            this();
        }
    }

    public final int zzaui() {
        return this.zzgyh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzer(int i) {
        this.zzgyh = i;
    }

    public final List<zza> zzauj() {
        return this.zzgyi;
    }

    public final int zzauk() {
        return this.zzgyi.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        if (zzaVar == null) {
            throw null;
        }
        if (!this.zzgyi.zzaxi()) {
            this.zzgyi = zzdqw.zza(this.zzgyi);
        }
        this.zzgyi.add(zzaVar);
    }

    public static zzdjx zzm(byte[] bArr) throws zzdrg {
        return (zzdjx) zzdqw.zza(zzgyj, bArr);
    }

    public static zzb zzaul() {
        return zzgyj.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdjw.zzdi[i - 1]) {
            case 1:
                return new zzdjx();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzgyj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzgyh", "zzgyi", zza.class});
            case 4:
                return zzgyj;
            case 5:
                zzdsp<zzdjx> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzdjx.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgyj);
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
        zzdjx zzdjxVar = new zzdjx();
        zzgyj = zzdjxVar;
        zzdqw.zza(zzdjx.class, zzdjxVar);
    }
}
