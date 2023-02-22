package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdtt {
    private static final boolean zzhgx;
    private static final zzd zzhow;
    private static final boolean zzhox;
    static final long zzhoy;
    private static final long zzhoz;
    private static final long zzhpa;
    private static final long zzhpb;
    private static final long zzhpc;
    private static final long zzhpd;
    private static final long zzhpe;
    private static final long zzhpf;
    private static final long zzhpg;
    private static final long zzhph;
    private static final long zzhpi;
    private static final long zzhpj;
    private static final long zzhpk;
    private static final long zzhpl;
    private static final int zzhpm;
    static final boolean zzhpn;
    private static final Logger logger = Logger.getLogger(zzdtt.class.getName());
    private static final Unsafe zzgqj = zzbcc();
    private static final Class<?> zzhft = zzdpj.zzaxm();
    private static final boolean zzhou = zzm(Long.TYPE);
    private static final boolean zzhov = zzm(Integer.TYPE);

    private zzdtt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(long j, byte b) {
            this.zzhpq.putByte(j, b);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final byte zzy(Object obj, long j) {
            return this.zzhpq.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zze(Object obj, long j, byte b) {
            this.zzhpq.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final boolean zzm(Object obj, long j) {
            return this.zzhpq.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zzhpq.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final float zzn(Object obj, long j) {
            return this.zzhpq.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, float f) {
            this.zzhpq.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final double zzo(Object obj, long j) {
            return this.zzhpq.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, double d) {
            this.zzhpq.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzhpq.copyMemory(bArr, zzdtt.zzhoy + j, (Object) null, j2, j3);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final byte zzy(Object obj, long j) {
            if (zzdtt.zzhpn) {
                return zzdtt.zzq(obj, j);
            }
            return zzdtt.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzdtt.zzhpn) {
                zzdtt.zza(obj, j, b);
            } else {
                zzdtt.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzdtt.zzhpn) {
                return zzdtt.zzs(obj, j);
            }
            return zzdtt.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzdtt.zzhpn) {
                zzdtt.zzb(obj, j, z);
            } else {
                zzdtt.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbca() {
        return zzhgx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static abstract class zzd {
        Unsafe zzhpq;

        zzd(Unsafe unsafe) {
            this.zzhpq = unsafe;
        }

        public abstract void zza(long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zza(byte[] bArr, long j, long j2, long j3);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzhpq.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzhpq.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzhpq.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzhpq.putLong(obj, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbcb() {
        return zzhox;
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(long j, byte b) {
            Memory.pokeByte((int) (j & (-1)), b);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final byte zzy(Object obj, long j) {
            if (zzdtt.zzhpn) {
                return zzdtt.zzq(obj, j);
            }
            return zzdtt.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzdtt.zzhpn) {
                zzdtt.zza(obj, j, b);
            } else {
                zzdtt.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzdtt.zzhpn) {
                return zzdtt.zzs(obj, j);
            }
            return zzdtt.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzdtt.zzhpn) {
                zzdtt.zzb(obj, j, z);
            } else {
                zzdtt.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.zzdtt.zzd
        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & (-1)), bArr, (int) j, (int) j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzj(Class<T> cls) {
        try {
            return (T) zzgqj.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzk(Class<?> cls) {
        if (zzhgx) {
            return zzhow.zzhpq.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzl(Class<?> cls) {
        if (zzhgx) {
            return zzhow.zzhpq.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(Object obj, long j) {
        return zzhow.zzk(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Object obj, long j, int i) {
        zzhow.zzb(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzl(Object obj, long j) {
        return zzhow.zzl(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, long j2) {
        zzhow.zza(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzm(Object obj, long j) {
        return zzhow.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, boolean z) {
        zzhow.zza(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzn(Object obj, long j) {
        return zzhow.zzn(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, float f) {
        zzhow.zza(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzo(Object obj, long j) {
        return zzhow.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, double d) {
        zzhow.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Object obj, long j) {
        return zzhow.zzhpq.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, Object obj2) {
        zzhow.zzhpq.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j) {
        return zzhow.zzy(bArr, zzhoy + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, byte b) {
        zzhow.zze(bArr, zzhoy + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, long j2, long j3) {
        zzhow.zza(bArr, j, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long j, byte b) {
        zzhow.zza(j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(ByteBuffer byteBuffer) {
        return zzhow.zzl(byteBuffer, zzhpl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzbcc() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzdtv());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzbcd() {
        Unsafe unsafe = zzgqj;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzdpj.zzaxl()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzbce() {
        Unsafe unsafe = zzgqj;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzbcf() == null) {
                return false;
            }
            if (zzdpj.zzaxl()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzm(Class<?> cls) {
        if (zzdpj.zzaxl()) {
            try {
                Class<?> cls2 = zzhft;
                cls2.getMethod("peekLong", cls, Boolean.TYPE);
                cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
                cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
                cls2.getMethod("peekInt", cls, Boolean.TYPE);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field zzbcf() {
        Field zzb2;
        if (!zzdpj.zzaxl() || (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) == null) {
            Field zzb3 = zzb(Buffer.class, "address");
            if (zzb3 == null || zzb3.getType() != Long.TYPE) {
                return null;
            }
            return zzb3;
        }
        return zzb2;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static {
        zzd zzdVar;
        zzd zzdVar2 = null;
        if (zzgqj != null) {
            if (zzdpj.zzaxl()) {
                if (zzhou) {
                    zzdVar2 = new zzc(zzgqj);
                } else if (zzhov) {
                    zzdVar2 = new zza(zzgqj);
                }
            } else {
                zzdVar2 = new zzb(zzgqj);
            }
        }
        zzhow = zzdVar2;
        zzhox = zzbce();
        zzhgx = zzbcd();
        zzhoy = zzk(byte[].class);
        zzhoz = zzk(boolean[].class);
        zzhpa = zzl(boolean[].class);
        zzhpb = zzk(int[].class);
        zzhpc = zzl(int[].class);
        zzhpd = zzk(long[].class);
        zzhpe = zzl(long[].class);
        zzhpf = zzk(float[].class);
        zzhpg = zzl(float[].class);
        zzhph = zzk(double[].class);
        zzhpi = zzl(double[].class);
        zzhpj = zzk(Object[].class);
        zzhpk = zzl(Object[].class);
        Field zzbcf = zzbcf();
        zzhpl = (zzbcf == null || (zzdVar = zzhow) == null) ? -1L : zzdVar.zzhpq.objectFieldOffset(zzbcf);
        zzhpm = (int) (zzhoy & 7);
        zzhpn = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }
}
