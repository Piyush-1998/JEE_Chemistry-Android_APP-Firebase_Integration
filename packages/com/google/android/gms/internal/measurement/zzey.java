package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzey.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzey<MessageType extends zzey<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdf<MessageType, BuilderType> {
    private static Map<Object, zzey<?, ?>> zzaib = new ConcurrentHashMap();
    protected zzhs zzahz = zzhs.zzwq();
    private int zzaia = -1;

    /* loaded from: classes.dex */
    public enum zzd {
        public static final int zzaid = 1;
        public static final int zzaie = 2;
        public static final int zzaif = 3;
        public static final int zzaig = 4;
        public static final int zzaih = 5;
        public static final int zzaii = 6;
        public static final int zzaij = 7;
        public static final int zzail = 1;
        public static final int zzaim = 2;
        public static final int zzaio = 1;
        public static final int zzaip = 2;
        private static final /* synthetic */ int[] zzaik = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzain = {1, 2};
        private static final /* synthetic */ int[] zzaiq = {1, 2};

        public static int[] zzur() {
            return (int[]) zzaik.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class zze<ContainingType extends zzgi, Type> extends zzek<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzey<MessageType, BuilderType> implements zzgk {
        protected zzeo<Object> zzaic = zzeo.zztr();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzeo<Object> zzuq() {
            if (this.zzaic.isImmutable()) {
                this.zzaic = (zzeo) this.zzaic.clone();
            }
            return this.zzaic;
        }
    }

    /* loaded from: classes.dex */
    public static class zzc<T extends zzey<T, ?>> extends zzdg<T> {
        private final T zzahw;

        public zzc(T t) {
            this.zzahw = t;
        }

        @Override // com.google.android.gms.internal.measurement.zzgr
        public final /* synthetic */ Object zzc(zzeb zzebVar, zzel zzelVar) throws zzfi {
            return zzey.zza(this.zzahw, zzebVar, zzelVar);
        }
    }

    public String toString() {
        return zzgj.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzact != 0) {
            return this.zzact;
        }
        this.zzact = zzgt.zzvy().zzw(this).hashCode(this);
        return this.zzact;
    }

    /* loaded from: classes.dex */
    public static abstract class zza<MessageType extends zzey<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdh<MessageType, BuilderType> {
        private final MessageType zzahw;
        protected MessageType zzahx;
        private boolean zzahy = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public zza(MessageType messagetype) {
            this.zzahw = messagetype;
            this.zzahx = (MessageType) messagetype.zza(zzd.zzaig, null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void zzuc() {
            if (this.zzahy) {
                MessageType messagetype = (MessageType) this.zzahx.zza(zzd.zzaig, null, null);
                zza(messagetype, this.zzahx);
                this.zzahx = messagetype;
                this.zzahy = false;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzgk
        public final boolean isInitialized() {
            return zzey.zza(this.zzahx, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzgh
        /* renamed from: zzud */
        public MessageType zzuf() {
            if (this.zzahy) {
                return this.zzahx;
            }
            this.zzahx.zzry();
            this.zzahy = true;
            return this.zzahx;
        }

        @Override // com.google.android.gms.internal.measurement.zzgh
        /* renamed from: zzue */
        public final MessageType zzug() {
            MessageType messagetype = (MessageType) zzuf();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzhq(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzuc();
            zza(this.zzahx, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzgt.zzvy().zzw(messagetype).zzc(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzel zzelVar) throws zzfi {
            zzuc();
            try {
                zzgt.zzvy().zzw(this.zzahx).zza(this.zzahx, bArr, 0, i2 + 0, new zzdk(zzelVar));
                return this;
            } catch (zzfi e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzfi.zzut();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzdh
        /* renamed from: zzb */
        public final BuilderType zza(zzeb zzebVar, zzel zzelVar) throws IOException {
            zzuc();
            try {
                zzgt.zzvy().zzw(this.zzahx).zza(this.zzahx, zzec.zza(zzebVar), zzelVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdh
        protected final /* synthetic */ zzdh zza(zzdf zzdfVar) {
            return zza((zza<MessageType, BuilderType>) ((zzey) zzdfVar));
        }

        @Override // com.google.android.gms.internal.measurement.zzdh
        public final /* synthetic */ zzdh zza(byte[] bArr, int i, int i2, zzel zzelVar) throws zzfi {
            return zzb(bArr, 0, i2, zzelVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzdh
        public final /* synthetic */ zzdh zzru() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzgk
        public final /* synthetic */ zzgi zzuh() {
            return this.zzahw;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdh
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzahw.zza(zzd.zzaih, null, null);
            zzaVar.zza((zza) ((zzey) zzuf()));
            return zzaVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzey) zza(zzd.zzaii, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return zzgt.zzvy().zzw(this).equals(this, (zzey) obj);
        }
        return false;
    }

    protected final void zzry() {
        zzgt.zzvy().zzw(this).zzj(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzey<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzui() {
        return (BuilderType) zza(zzd.zzaih, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgk
    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzuj() {
        BuilderType buildertype = (BuilderType) zza(zzd.zzaih, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf
    final int zzrt() {
        return this.zzaia;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf
    final void zzam(int i) {
        this.zzaia = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzgi
    public final void zzb(zzee zzeeVar) throws IOException {
        zzgt.zzvy().zzf(getClass()).zza(this, zzei.zza(zzeeVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzgi
    public final int zzuk() {
        if (this.zzaia == -1) {
            this.zzaia = zzgt.zzvy().zzw(this).zzt(this);
        }
        return this.zzaia;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzey<?, ?>> T zzd(Class<T> cls) {
        zzey<?, ?> zzeyVar = zzaib.get(cls);
        if (zzeyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeyVar = zzaib.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzeyVar == null) {
            zzeyVar = (T) ((zzey) zzhv.zzh(cls)).zza(zzd.zzaii, (Object) null, (Object) null);
            if (zzeyVar == null) {
                throw new IllegalStateException();
            }
            zzaib.put(cls, zzeyVar);
        }
        return (T) zzeyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzey<?, ?>> void zza(Class<T> cls, T t) {
        zzaib.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzgi zzgiVar, String str, Object[] objArr) {
        return new zzgv(zzgiVar, str, objArr);
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

    protected static final <T extends zzey<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzd.zzaid, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzv = zzgt.zzvy().zzw(t).zzv(t);
        if (z) {
            t.zza(zzd.zzaie, zzv ? t : null, null);
        }
        return zzv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfd zzul() {
        return zzfa.zzus();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfg zzum() {
        return zzfw.zzvk();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfg zza(zzfg zzfgVar) {
        int size = zzfgVar.size();
        return zzfgVar.zzbv(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzff<E> zzun() {
        return zzgw.zzwb();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzff<E> zza(zzff<E> zzffVar) {
        int size = zzffVar.size();
        return zzffVar.zzap(size == 0 ? 10 : size << 1);
    }

    static <T extends zzey<T, ?>> T zza(T t, zzeb zzebVar, zzel zzelVar) throws zzfi {
        T t2 = (T) t.zza(zzd.zzaig, null, null);
        try {
            zzgt.zzvy().zzw(t2).zza(t2, zzec.zza(zzebVar), zzelVar);
            t2.zzry();
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzfi) {
                throw ((zzfi) e.getCause());
            }
            throw new zzfi(e.getMessage()).zzg(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzfi) {
                throw ((zzfi) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzey<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzel zzelVar) throws zzfi {
        T t2 = (T) t.zza(zzd.zzaig, null, null);
        try {
            zzgt.zzvy().zzw(t2).zza(t2, bArr, 0, i2, new zzdk(zzelVar));
            t2.zzry();
            if (t2.zzact == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzfi) {
                throw ((zzfi) e.getCause());
            }
            throw new zzfi(e.getMessage()).zzg(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzfi.zzut().zzg(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzey<T, ?>> T zza(T t, byte[] bArr, zzel zzelVar) throws zzfi {
        T t2 = (T) zza(t, bArr, 0, bArr.length, zzelVar);
        if (t2 == null || t2.isInitialized()) {
            return t2;
        }
        throw new zzfi(new zzhq(t2).getMessage()).zzg(t2);
    }

    @Override // com.google.android.gms.internal.measurement.zzgi
    public final /* synthetic */ zzgh zzuo() {
        zza zzaVar = (zza) zza(zzd.zzaih, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgi
    public final /* synthetic */ zzgh zzup() {
        return (zza) zza(zzd.zzaih, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgk
    public final /* synthetic */ zzgi zzuh() {
        return (zzey) zza(zzd.zzaii, (Object) null, (Object) null);
    }
}
