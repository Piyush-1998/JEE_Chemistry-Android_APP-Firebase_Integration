package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdjx;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdey {
    private static final Logger logger = Logger.getLogger(zzdey.class.getName());
    private static final ConcurrentMap<String, zza> zzgsx = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzgsy = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzdef<?>> zzgsz = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzdex<?>> zzgta = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public interface zza {
        zzden<?> zzapw();

        Class<?> zzapx();

        Set<Class<?>> zzapy();

        <P> zzden<P> zzb(Class<P> cls) throws GeneralSecurityException;
    }

    private static synchronized zza zzgs(String str) throws GeneralSecurityException {
        zza zzaVar;
        synchronized (zzdey.class) {
            if (!zzgsx.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzaVar = zzgsx.get(str);
        }
        return zzaVar;
    }

    public static synchronized void zza(String str, zzdef<?> zzdefVar) throws GeneralSecurityException {
        synchronized (zzdey.class) {
            if (zzgsz.containsKey(str.toLowerCase()) && !zzdefVar.getClass().equals(zzgsz.get(str.toLowerCase()).getClass())) {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger2.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
            zzgsz.put(str.toLowerCase(), zzdefVar);
        }
    }

    public static zzdef<?> zzgt(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzdef<?> zzdefVar = zzgsz.get(str.toLowerCase());
        if (zzdefVar == null) {
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        return zzdefVar;
    }

    private static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static synchronized <P> void zza(zzden<P> zzdenVar) throws GeneralSecurityException {
        synchronized (zzdey.class) {
            zza((zzden) zzdenVar, true);
        }
    }

    private static synchronized <P> void zza(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (zzdey.class) {
            if (zzgsx.containsKey(str)) {
                zza zzaVar = zzgsx.get(str);
                if (!zzaVar.zzapx().equals(cls)) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger2.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzaVar.zzapx().getName(), cls.getName()));
                } else if (!z || zzgsy.get(str).booleanValue()) {
                } else {
                    String valueOf2 = String.valueOf(str);
                    throw new GeneralSecurityException(valueOf2.length() != 0 ? "New keys are already disallowed for key type ".concat(valueOf2) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    public static synchronized <P> void zza(zzden<P> zzdenVar, boolean z) throws GeneralSecurityException {
        synchronized (zzdey.class) {
            if (zzdenVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String keyType = zzdenVar.getKeyType();
            zza(keyType, zzdenVar.getClass(), z);
            if (!zzgsx.containsKey(keyType)) {
                zzgsx.put(keyType, new zzdfa(zzdenVar));
            }
            zzgsy.put(keyType, Boolean.valueOf(z));
        }
    }

    public static synchronized <P> void zza(zzdex<P> zzdexVar) throws GeneralSecurityException {
        synchronized (zzdey.class) {
            if (zzdexVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> zzapo = zzdexVar.zzapo();
            if (zzgta.containsKey(zzapo)) {
                zzdex<?> zzdexVar2 = zzgta.get(zzapo);
                if (!zzdexVar.getClass().equals(zzdexVar2.getClass())) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(zzapo.toString());
                    logger2.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzapo.getName(), zzdexVar2.getClass().getName(), zzdexVar.getClass().getName()));
                }
            }
            zzgta.put(zzapo, zzdexVar);
        }
    }

    private static zzden<?> zzgu(String str) throws GeneralSecurityException {
        return zzgs(str).zzapw();
    }

    private static <P> zzden<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zza zzgs = zzgs(str);
        if (cls == null) {
            return (zzden<P>) zzgs.zzapw();
        }
        if (zzgs.zzapy().contains(cls)) {
            return zzgs.zzb(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzgs.zzapx());
        Set<Class<?>> zzapy = zzgs.zzapy();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : zzapy) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static synchronized zzdjn zza(zzdjt zzdjtVar) throws GeneralSecurityException {
        zzdjn zzr;
        synchronized (zzdey.class) {
            zzden<?> zzgu = zzgu(zzdjtVar.zzatu());
            if (zzgsy.get(zzdjtVar.zzatu()).booleanValue()) {
                zzr = zzgu.zzr(zzdjtVar.zzatv());
            } else {
                String valueOf = String.valueOf(zzdjtVar.zzatu());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzr;
    }

    public static synchronized zzdsg zzb(zzdjt zzdjtVar) throws GeneralSecurityException {
        zzdsg zzq;
        synchronized (zzdey.class) {
            zzden<?> zzgu = zzgu(zzdjtVar.zzatu());
            if (zzgsy.get(zzdjtVar.zzatu()).booleanValue()) {
                zzq = zzgu.zzq(zzdjtVar.zzatv());
            } else {
                String valueOf = String.valueOf(zzdjtVar.zzatu());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzq;
    }

    public static synchronized zzdsg zza(String str, zzdsg zzdsgVar) throws GeneralSecurityException {
        zzdsg zzb;
        synchronized (zzdey.class) {
            zzden zza2 = zza(str, (Class) null);
            if (zzgsy.get(str).booleanValue()) {
                zzb = zza2.zzb(zzdsgVar);
            } else {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzb;
    }

    public static <P> P zza(String str, zzdsg zzdsgVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, (Class) checkNotNull(cls)).zza(zzdsgVar);
    }

    private static <P> P zza(String str, zzdpm zzdpmVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, cls).zzp(zzdpmVar);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, zzdpm.zzy(bArr), (Class) checkNotNull(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> zzdev<P> zza(zzdep zzdepVar, zzden<P> zzdenVar, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) checkNotNull(cls);
        zzdfb.zzd(zzdepVar.zzapq());
        zzdev<P> zzdevVar = (zzdev<P>) zzdev.zza(cls2);
        for (zzdjx.zza zzaVar : zzdepVar.zzapq().zzauj()) {
            if (zzaVar.zzaps() == zzdjr.ENABLED) {
                zzdeu zza2 = zzdevVar.zza(zza(zzaVar.zzauo().zzatu(), zzaVar.zzauo().zzatv(), cls2), zzaVar);
                if (zzaVar.zzaup() == zzdepVar.zzapq().zzaui()) {
                    zzdevVar.zza(zza2);
                }
            }
        }
        return zzdevVar;
    }

    public static <P> P zza(zzdev<P> zzdevVar) throws GeneralSecurityException {
        zzdex<?> zzdexVar = zzgta.get(zzdevVar.zzapo());
        if (zzdexVar == null) {
            String valueOf = String.valueOf(zzdevVar.zzapo().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        return (P) zzdexVar.zza(zzdevVar);
    }
}
