package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;
import com.google.android.gms.internal.ads.zzdqw.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdqw<MessageType extends zzdqw<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdpf<MessageType, BuilderType> {
    private static Map<Object, zzdqw<?, ?>> zzhkt = new ConcurrentHashMap();
    protected zzdtq zzhkr = zzdtq.zzbbx();
    private int zzhks = -1;

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static class zzc<T extends zzdqw<T, ?>> extends zzdph<T> {
        private final T zzhko;

        public zzc(T t) {
            this.zzhko = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public enum zzd {
        public static final int zzhkv = 1;
        public static final int zzhkw = 2;
        public static final int zzhkx = 3;
        public static final int zzhky = 4;
        public static final int zzhkz = 5;
        public static final int zzhla = 6;
        public static final int zzhlb = 7;
        public static final int zzhld = 1;
        public static final int zzhle = 2;
        public static final int zzhlg = 1;
        public static final int zzhlh = 2;
        private static final /* synthetic */ int[] zzhlc = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzhlf = {1, 2};
        private static final /* synthetic */ int[] zzhli = {1, 2};

        public static int[] zzbaa() {
            return (int[]) zzhlc.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static class zze<ContainingType extends zzdsg, Type> extends zzdqh<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzdqw<MessageType, BuilderType> implements zzdsi {
        protected zzdqm<Object> zzhku = zzdqm.zzazc();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzdqm<Object> zzazz() {
            if (this.zzhku.isImmutable()) {
                this.zzhku = (zzdqm) this.zzhku.clone();
            }
            return this.zzhku;
        }
    }

    public String toString() {
        return zzdsh.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzhfq != 0) {
            return this.zzhfq;
        }
        this.zzhfq = zzdsr.zzbbf().zzax(this).hashCode(this);
        return this.zzhfq;
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    public static abstract class zza<MessageType extends zzdqw<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdpe<MessageType, BuilderType> {
        private final MessageType zzhko;
        protected MessageType zzhkp;
        private boolean zzhkq = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public zza(MessageType messagetype) {
            this.zzhko = messagetype;
            this.zzhkp = (MessageType) messagetype.zza(zzd.zzhky, null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void zzazn() {
            if (this.zzhkq) {
                MessageType messagetype = (MessageType) this.zzhkp.zza(zzd.zzhky, null, null);
                zza(messagetype, this.zzhkp);
                this.zzhkp = messagetype;
                this.zzhkq = false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdsi
        public final boolean isInitialized() {
            return zzdqw.zza(this.zzhkp, false);
        }

        @Override // com.google.android.gms.internal.ads.zzdsf
        /* renamed from: zzazo */
        public MessageType zzazq() {
            if (this.zzhkq) {
                return this.zzhkp;
            }
            MessageType messagetype = this.zzhkp;
            zzdsr.zzbbf().zzax(messagetype).zzak(messagetype);
            this.zzhkq = true;
            return this.zzhkp;
        }

        @Override // com.google.android.gms.internal.ads.zzdsf
        /* renamed from: zzazp */
        public final MessageType zzazr() {
            MessageType messagetype = (MessageType) zzazq();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzdto(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzazn();
            zza(this.zzhkp, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzdsr.zzbbf().zzax(messagetype).zzf(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzdqj zzdqjVar) throws zzdrg {
            zzazn();
            try {
                zzdsr.zzbbf().zzax(this.zzhkp).zza(this.zzhkp, bArr, 0, i2 + 0, new zzdpl(zzdqjVar));
                return this;
            } catch (zzdrg e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzdrg.zzbac();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.ads.zzdpe
        /* renamed from: zzb */
        public final BuilderType zza(zzdpy zzdpyVar, zzdqj zzdqjVar) throws IOException {
            zzazn();
            try {
                zzdsr.zzbbf().zzax(this.zzhkp).zza(this.zzhkp, zzdqd.zza(zzdpyVar), zzdqjVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzdpe
        protected final /* synthetic */ zzdpe zza(zzdpf zzdpfVar) {
            return zza((zza<MessageType, BuilderType>) ((zzdqw) zzdpfVar));
        }

        @Override // com.google.android.gms.internal.ads.zzdpe
        public final /* synthetic */ zzdpe zza(byte[] bArr, int i, int i2, zzdqj zzdqjVar) throws zzdrg {
            return zzb(bArr, 0, i2, zzdqjVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdpe
        public final /* synthetic */ zzdpe zzaxf() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.ads.zzdsi
        public final /* synthetic */ zzdsg zzazs() {
            return this.zzhko;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzdpe
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzhko.zza(zzd.zzhkz, null, null);
            zzaVar.zza((zza) ((zzdqw) zzazq()));
            return zzaVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzdqw) zza(zzd.zzhla, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return zzdsr.zzbbf().zzax(this).equals(this, (zzdqw) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzdqw<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzazt() {
        return (BuilderType) zza(zzd.zzhkz, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.zzdpf
    final int zzaxh() {
        return this.zzhks;
    }

    @Override // com.google.android.gms.internal.ads.zzdpf
    final void zzfi(int i) {
        this.zzhks = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzb(zzdqf zzdqfVar) throws IOException {
        zzdsr.zzbbf().zzax(this).zza(this, zzdqg.zza(zzdqfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final int zzazu() {
        if (this.zzhks == -1) {
            this.zzhks = zzdsr.zzbbf().zzax(this).zzau(this);
        }
        return this.zzhks;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzdqw<?, ?>> T zzf(Class<T> cls) {
        zzdqw<?, ?> zzdqwVar = zzhkt.get(cls);
        if (zzdqwVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzdqwVar = zzhkt.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzdqwVar == null) {
            zzdqwVar = (T) ((zzdqw) zzdtt.zzj(cls)).zza(zzd.zzhla, (Object) null, (Object) null);
            if (zzdqwVar == null) {
                throw new IllegalStateException();
            }
            zzhkt.put(cls, zzdqwVar);
        }
        return (T) zzdqwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdqw<?, ?>> void zza(Class<T> cls, T t) {
        zzhkt.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzdsg zzdsgVar, String str, Object[] objArr) {
        return new zzdst(zzdsgVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends zzdqw<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzd.zzhkv, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzaw = zzdsr.zzbbf().zzax(t).zzaw(t);
        if (z) {
            t.zza(zzd.zzhkw, zzaw ? t : null, null);
        }
        return zzaw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzdrb zzazv() {
        return zzdqy.zzbab();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzdrb zza(zzdrb zzdrbVar) {
        int size = zzdrbVar.size();
        return zzdrbVar.zzgo(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzdrd<E> zzazw() {
        return zzdsu.zzbbi();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzdrd<E> zza(zzdrd<E> zzdrdVar) {
        int size = zzdrdVar.size();
        return zzdrdVar.zzfl(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzdqw<T, ?>> T zza(T t, zzdpy zzdpyVar, zzdqj zzdqjVar) throws zzdrg {
        T t2 = (T) t.zza(zzd.zzhky, null, null);
        try {
            zzdsv zzax = zzdsr.zzbbf().zzax(t2);
            zzax.zza(t2, zzdqd.zza(zzdpyVar), zzdqjVar);
            zzax.zzak(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzdrg) {
                throw ((zzdrg) e.getCause());
            }
            throw new zzdrg(e.getMessage()).zzo(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzdrg) {
                throw ((zzdrg) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzdqw<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzdqj zzdqjVar) throws zzdrg {
        T t2 = (T) t.zza(zzd.zzhky, null, null);
        try {
            zzdsv zzax = zzdsr.zzbbf().zzax(t2);
            zzax.zza(t2, bArr, 0, i2, new zzdpl(zzdqjVar));
            zzax.zzak(t2);
            if (t2.zzhfq == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzdrg) {
                throw ((zzdrg) e.getCause());
            }
            throw new zzdrg(e.getMessage()).zzo(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzdrg.zzbac().zzo(t2);
        }
    }

    private static <T extends zzdqw<T, ?>> T zzb(T t) throws zzdrg {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new zzdrg(new zzdto(t).getMessage()).zzo(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdqw<T, ?>> T zza(T t, zzdpm zzdpmVar) throws zzdrg {
        return (T) zzb(zzb(zza(t, zzdpmVar, zzdqj.zzaza())));
    }

    private static <T extends zzdqw<T, ?>> T zza(T t, zzdpm zzdpmVar, zzdqj zzdqjVar) throws zzdrg {
        try {
            zzdpy zzaxp = zzdpmVar.zzaxp();
            T t2 = (T) zza(t, zzaxp, zzdqjVar);
            try {
                zzaxp.zzfp(0);
                return t2;
            } catch (zzdrg e) {
                throw e.zzo(t2);
            }
        } catch (zzdrg e2) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdqw<T, ?>> T zza(T t, byte[] bArr) throws zzdrg {
        return (T) zzb(zza(t, bArr, 0, bArr.length, zzdqj.zzaza()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdqw<T, ?>> T zza(T t, byte[] bArr, zzdqj zzdqjVar) throws zzdrg {
        return (T) zzb(zza(t, bArr, 0, bArr.length, zzdqjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final /* synthetic */ zzdsf zzazx() {
        zza zzaVar = (zza) zza(zzd.zzhkz, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final /* synthetic */ zzdsf zzazy() {
        return (zza) zza(zzd.zzhkz, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final /* synthetic */ zzdsg zzazs() {
        return (zzdqw) zza(zzd.zzhla, (Object) null, (Object) null);
    }
}
