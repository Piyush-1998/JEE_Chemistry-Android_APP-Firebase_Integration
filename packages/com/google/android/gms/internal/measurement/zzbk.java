package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbk {

    /* loaded from: classes.dex */
    public static final class zza extends zzey<zza, C0025zza> implements zzgk {
        private static final zza zzun;
        private static volatile zzgr<zza> zzuo;
        private int zzue;
        private int zzuf;
        private String zzug = "";
        private zzff<zzb> zzuh = zzun();
        private boolean zzui;
        private zzc zzuj;
        private boolean zzuk;
        private boolean zzul;
        private boolean zzum;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.zzbk$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0025zza extends zzey.zza<zza, C0025zza> implements zzgk {
            private C0025zza() {
                super(zza.zzun);
            }

            public final String zzjz() {
                return ((zza) this.zzahx).zzjz();
            }

            public final C0025zza zzbs(String str) {
                zzuc();
                ((zza) this.zzahx).zzbt(str);
                return this;
            }

            public final int zzka() {
                return ((zza) this.zzahx).zzka();
            }

            public final zzb zze(int i) {
                return ((zza) this.zzahx).zze(i);
            }

            public final C0025zza zza(int i, zzb zzbVar) {
                zzuc();
                ((zza) this.zzahx).zzb(i, zzbVar);
                return this;
            }

            /* synthetic */ C0025zza(zzbj zzbjVar) {
                this();
            }
        }

        public final boolean zzkb() {
            return (this.zzue & 1) != 0;
        }

        public final int getId() {
            return this.zzuf;
        }

        public final String zzjz() {
            return this.zzug;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbt(String str) {
            if (str == null) {
                throw null;
            }
            this.zzue |= 2;
            this.zzug = str;
        }

        public final List<zzb> zzkc() {
            return this.zzuh;
        }

        public final int zzka() {
            return this.zzuh.size();
        }

        public final zzb zze(int i) {
            return this.zzuh.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(int i, zzb zzbVar) {
            if (zzbVar == null) {
                throw null;
            }
            if (!this.zzuh.zzrx()) {
                this.zzuh = zzey.zza(this.zzuh);
            }
            this.zzuh.set(i, zzbVar);
        }

        public final boolean zzkd() {
            return (this.zzue & 8) != 0;
        }

        public final zzc zzke() {
            zzc zzcVar = this.zzuj;
            return zzcVar == null ? zzc.zzle() : zzcVar;
        }

        public final boolean zzkf() {
            return this.zzuk;
        }

        public final boolean zzkg() {
            return this.zzul;
        }

        public final boolean zzkh() {
            return (this.zzue & 64) != 0;
        }

        public final boolean zzki() {
            return this.zzum;
        }

        public static zza zza(byte[] bArr, zzel zzelVar) throws zzfi {
            return (zza) zzey.zza(zzun, bArr, zzelVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzey
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0025zza(null);
                case 3:
                    return zza(zzun, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzue", "zzuf", "zzug", "zzuh", zzb.class, "zzui", "zzuj", "zzuk", "zzul", "zzum"});
                case 4:
                    return zzun;
                case 5:
                    zzgr<zza> zzgrVar = zzuo;
                    if (zzgrVar == null) {
                        synchronized (zza.class) {
                            zzgrVar = zzuo;
                            if (zzgrVar == null) {
                                zzgrVar = new zzey.zzc<>(zzun);
                                zzuo = zzgrVar;
                            }
                        }
                    }
                    return zzgrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzgr<zza> zzkj() {
            return (zzgr) zzun.zza(zzey.zzd.zzaij, (Object) null, (Object) null);
        }

        static {
            zza zzaVar = new zza();
            zzun = zzaVar;
            zzey.zza(zza.class, zzaVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb extends zzey<zzb, zza> implements zzgk {
        private static volatile zzgr<zzb> zzuo;
        private static final zzb zzut;
        private int zzue;
        private zze zzup;
        private zzc zzuq;
        private boolean zzur;
        private String zzus = "";

        private zzb() {
        }

        /* loaded from: classes.dex */
        public static final class zza extends zzey.zza<zzb, zza> implements zzgk {
            private zza() {
                super(zzb.zzut);
            }

            public final zza zzbu(String str) {
                zzuc();
                ((zzb) this.zzahx).zzbv(str);
                return this;
            }

            /* synthetic */ zza(zzbj zzbjVar) {
                this();
            }
        }

        public final boolean zzkl() {
            return (this.zzue & 1) != 0;
        }

        public final zze zzkm() {
            zze zzeVar = this.zzup;
            return zzeVar == null ? zze.zzls() : zzeVar;
        }

        public final boolean zzkn() {
            return (this.zzue & 2) != 0;
        }

        public final zzc zzko() {
            zzc zzcVar = this.zzuq;
            return zzcVar == null ? zzc.zzle() : zzcVar;
        }

        public final boolean zzkp() {
            return (this.zzue & 4) != 0;
        }

        public final boolean zzkq() {
            return this.zzur;
        }

        public final String zzkr() {
            return this.zzus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbv(String str) {
            if (str == null) {
                throw null;
            }
            this.zzue |= 8;
            this.zzus = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzey
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzut, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzue", "zzup", "zzuq", "zzur", "zzus"});
                case 4:
                    return zzut;
                case 5:
                    zzgr<zzb> zzgrVar = zzuo;
                    if (zzgrVar == null) {
                        synchronized (zzb.class) {
                            zzgrVar = zzuo;
                            if (zzgrVar == null) {
                                zzgrVar = new zzey.zzc<>(zzut);
                                zzuo = zzgrVar;
                            }
                        }
                    }
                    return zzgrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzb zzks() {
            return zzut;
        }

        static {
            zzb zzbVar = new zzb();
            zzut = zzbVar;
            zzey.zza(zzb.class, zzbVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc extends zzey<zzc, zza> implements zzgk {
        private static volatile zzgr<zzc> zzuo;
        private static final zzc zzuz;
        private int zzue;
        private int zzuu;
        private boolean zzuv;
        private String zzuw = "";
        private String zzux = "";
        private String zzuy = "";

        /* loaded from: classes.dex */
        public enum zzb implements zzfc {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final zzfb<zzb> zzvf = new zzbl();
            private final int value;

            @Override // com.google.android.gms.internal.measurement.zzfc
            public final int zzlg() {
                return this.value;
            }

            public static zzb zzf(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return BETWEEN;
                            }
                            return EQUAL;
                        }
                        return GREATER_THAN;
                    }
                    return LESS_THAN;
                }
                return UNKNOWN_COMPARISON_TYPE;
            }

            public static zzfe zzlh() {
                return zzbm.zzvk;
            }

            zzb(int i) {
                this.value = i;
            }
        }

        private zzc() {
        }

        /* loaded from: classes.dex */
        public static final class zza extends zzey.zza<zzc, zza> implements zzgk {
            private zza() {
                super(zzc.zzuz);
            }

            /* synthetic */ zza(zzbj zzbjVar) {
                this();
            }
        }

        public final boolean zzku() {
            return (this.zzue & 1) != 0;
        }

        public final zzb zzkv() {
            zzb zzf = zzb.zzf(this.zzuu);
            return zzf == null ? zzb.UNKNOWN_COMPARISON_TYPE : zzf;
        }

        public final boolean zzkw() {
            return (this.zzue & 2) != 0;
        }

        public final boolean zzkx() {
            return this.zzuv;
        }

        public final boolean zzky() {
            return (this.zzue & 4) != 0;
        }

        public final String zzkz() {
            return this.zzuw;
        }

        public final boolean zzla() {
            return (this.zzue & 8) != 0;
        }

        public final String zzlb() {
            return this.zzux;
        }

        public final boolean zzlc() {
            return (this.zzue & 16) != 0;
        }

        public final String zzld() {
            return this.zzuy;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzey
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzuz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzue", "zzuu", zzb.zzlh(), "zzuv", "zzuw", "zzux", "zzuy"});
                case 4:
                    return zzuz;
                case 5:
                    zzgr<zzc> zzgrVar = zzuo;
                    if (zzgrVar == null) {
                        synchronized (zzc.class) {
                            zzgrVar = zzuo;
                            if (zzgrVar == null) {
                                zzgrVar = new zzey.zzc<>(zzuz);
                                zzuo = zzgrVar;
                            }
                        }
                    }
                    return zzgrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzc zzle() {
            return zzuz;
        }

        static {
            zzc zzcVar = new zzc();
            zzuz = zzcVar;
            zzey.zza(zzc.class, zzcVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzd extends zzey<zzd, zza> implements zzgk {
        private static volatile zzgr<zzd> zzuo;
        private static final zzd zzvj;
        private int zzue;
        private int zzuf;
        private boolean zzuk;
        private boolean zzul;
        private boolean zzum;
        private String zzvh = "";
        private zzb zzvi;

        private zzd() {
        }

        /* loaded from: classes.dex */
        public static final class zza extends zzey.zza<zzd, zza> implements zzgk {
            private zza() {
                super(zzd.zzvj);
            }

            public final zza zzbw(String str) {
                zzuc();
                ((zzd) this.zzahx).setPropertyName(str);
                return this;
            }

            /* synthetic */ zza(zzbj zzbjVar) {
                this();
            }
        }

        public final boolean zzkb() {
            return (this.zzue & 1) != 0;
        }

        public final int getId() {
            return this.zzuf;
        }

        public final String getPropertyName() {
            return this.zzvh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setPropertyName(String str) {
            if (str == null) {
                throw null;
            }
            this.zzue |= 2;
            this.zzvh = str;
        }

        public final zzb zzli() {
            zzb zzbVar = this.zzvi;
            return zzbVar == null ? zzb.zzks() : zzbVar;
        }

        public final boolean zzkf() {
            return this.zzuk;
        }

        public final boolean zzkg() {
            return this.zzul;
        }

        public final boolean zzkh() {
            return (this.zzue & 32) != 0;
        }

        public final boolean zzki() {
            return this.zzum;
        }

        public static zzd zzb(byte[] bArr, zzel zzelVar) throws zzfi {
            return (zzd) zzey.zza(zzvj, bArr, zzelVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzey
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzvj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzue", "zzuf", "zzvh", "zzvi", "zzuk", "zzul", "zzum"});
                case 4:
                    return zzvj;
                case 5:
                    zzgr<zzd> zzgrVar = zzuo;
                    if (zzgrVar == null) {
                        synchronized (zzd.class) {
                            zzgrVar = zzuo;
                            if (zzgrVar == null) {
                                zzgrVar = new zzey.zzc<>(zzvj);
                                zzuo = zzgrVar;
                            }
                        }
                    }
                    return zzgrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzgr<zzd> zzkj() {
            return (zzgr) zzvj.zza(zzey.zzd.zzaij, (Object) null, (Object) null);
        }

        static {
            zzd zzdVar = new zzd();
            zzvj = zzdVar;
            zzey.zza(zzd.class, zzdVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class zze extends zzey<zze, zzb> implements zzgk {
        private static volatile zzgr<zze> zzuo;
        private static final zze zzvp;
        private int zzue;
        private int zzvl;
        private boolean zzvn;
        private String zzvm = "";
        private zzff<String> zzvo = zzey.zzun();

        /* loaded from: classes.dex */
        public enum zza implements zzfc {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final zzfb<zza> zzvf = new zzbo();
            private final int value;

            @Override // com.google.android.gms.internal.measurement.zzfc
            public final int zzlg() {
                return this.value;
            }

            public static zza zzh(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzfe zzlh() {
                return zzbn.zzvk;
            }

            zza(int i) {
                this.value = i;
            }
        }

        private zze() {
        }

        /* loaded from: classes.dex */
        public static final class zzb extends zzey.zza<zze, zzb> implements zzgk {
            private zzb() {
                super(zze.zzvp);
            }

            /* synthetic */ zzb(zzbj zzbjVar) {
                this();
            }
        }

        public final boolean zzlk() {
            return (this.zzue & 1) != 0;
        }

        public final zza zzll() {
            zza zzh = zza.zzh(this.zzvl);
            return zzh == null ? zza.UNKNOWN_MATCH_TYPE : zzh;
        }

        public final boolean zzlm() {
            return (this.zzue & 2) != 0;
        }

        public final String zzln() {
            return this.zzvm;
        }

        public final boolean zzlo() {
            return (this.zzue & 4) != 0;
        }

        public final boolean zzlp() {
            return this.zzvn;
        }

        public final List<String> zzlq() {
            return this.zzvo;
        }

        public final int zzlr() {
            return this.zzvo.size();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzey
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbj.zzud[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzvp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzue", "zzvl", zza.zzlh(), "zzvm", "zzvn", "zzvo"});
                case 4:
                    return zzvp;
                case 5:
                    zzgr<zze> zzgrVar = zzuo;
                    if (zzgrVar == null) {
                        synchronized (zze.class) {
                            zzgrVar = zzuo;
                            if (zzgrVar == null) {
                                zzgrVar = new zzey.zzc<>(zzvp);
                                zzuo = zzgrVar;
                            }
                        }
                    }
                    return zzgrVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zze zzls() {
            return zzvp;
        }

        static {
            zze zzeVar = new zze();
            zzvp = zzeVar;
            zzey.zza(zze.class, zzeVar);
        }
    }
}
