package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;

/* loaded from: classes.dex */
public final class zzbq {

    /* loaded from: classes.dex */
    public static final class zza extends zzey<zza, C0026zza> implements zzgk {
        private static volatile zzgr<zza> zzuo;
        private static final zza zzwa;
        private int zzue;
        private String zzvy = "";
        private String zzvz = "";

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.zzbq$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0026zza extends zzey.zza<zza, C0026zza> implements zzgk {
            private C0026zza() {
                super(zza.zzwa);
            }

            /* synthetic */ C0026zza(zzbp zzbpVar) {
                this();
            }
        }

        public final String getKey() {
            return this.zzvy;
        }

        public final String getValue() {
            return this.zzvz;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzey
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbp.zzud[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0026zza(null);
                case 3:
                    return zza(zzwa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzue", "zzvy", "zzvz"});
                case 4:
                    return zzwa;
                case 5:
                    zzgr<zza> zzgrVar = zzuo;
                    if (zzgrVar == null) {
                        synchronized (zza.class) {
                            zzgrVar = zzuo;
                            if (zzgrVar == null) {
                                zzgrVar = new zzey.zzc<>(zzwa);
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
            return (zzgr) zzwa.zza(zzey.zzd.zzaij, (Object) null, (Object) null);
        }

        static {
            zza zzaVar = new zza();
            zzwa = zzaVar;
            zzey.zza(zza.class, zzaVar);
        }
    }
}
