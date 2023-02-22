package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class zzcm<T> {
    private final String name;
    private final zzct zzaaz;
    private final T zzaba;
    private volatile int zzabc;
    private volatile T zzjq;
    private static final Object zzaax = new Object();
    private static Context zzob = null;
    private static boolean zzaay = false;
    private static final AtomicInteger zzabb = new AtomicInteger();

    public static void zzr(Context context) {
        synchronized (zzaax) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzob != context) {
                synchronized (zzca.class) {
                    zzca.zzaah.clear();
                }
                synchronized (zzcs.class) {
                    zzcs.zzabd.clear();
                }
                synchronized (zzcj.class) {
                    zzcj.zzaau = null;
                }
                zzabb.incrementAndGet();
                zzob = context;
            }
        }
    }

    abstract T zzc(Object obj);

    public static void zzrl() {
        zzabb.incrementAndGet();
    }

    private zzcm(zzct zzctVar, String str, T t) {
        Uri uri;
        this.zzabc = -1;
        uri = zzctVar.zzabh;
        if (uri == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzaaz = zzctVar;
        this.name = str;
        this.zzaba = t;
    }

    private final String zzdg(String str) {
        if (str == null || !str.isEmpty()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(this.name);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.name;
    }

    public final String zzrm() {
        String str;
        str = this.zzaaz.zzabj;
        return zzdg(str);
    }

    public final T get() {
        int i = zzabb.get();
        if (this.zzabc < i) {
            synchronized (this) {
                if (this.zzabc < i) {
                    if (zzob == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    T zzrn = zzrn();
                    if (zzrn == null && (zzrn = zzro()) == null) {
                        zzrn = this.zzaba;
                    }
                    this.zzjq = zzrn;
                    this.zzabc = i;
                }
            }
        }
        return this.zzjq;
    }

    @Nullable
    private final T zzrn() {
        Uri uri;
        zzce zze;
        Object zzdd;
        Uri uri2;
        Uri uri3;
        String str = (String) zzcj.zzp(zzob).zzdd("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && zzbz.zzzw.matcher(str).matches())) {
            uri = this.zzaaz.zzabh;
            if (uri != null) {
                Context context = zzob;
                uri2 = this.zzaaz.zzabh;
                if (zzck.zza(context, uri2)) {
                    ContentResolver contentResolver = zzob.getContentResolver();
                    uri3 = this.zzaaz.zzabh;
                    zze = zzca.zza(contentResolver, uri3);
                } else {
                    zze = null;
                }
            } else {
                zze = zzcs.zze(zzob, null);
            }
            if (zze != null && (zzdd = zze.zzdd(zzrm())) != null) {
                return zzc(zzdd);
            }
        } else if (Log.isLoggable("PhenotypeFlag", 3)) {
            String valueOf = String.valueOf(zzrm());
            Log.d("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        }
        return null;
    }

    @Nullable
    private final T zzro() {
        String str;
        zzcj zzp = zzcj.zzp(zzob);
        str = this.zzaaz.zzabi;
        Object zzdd = zzp.zzdd(zzdg(str));
        if (zzdd != null) {
            return zzc(zzdd);
        }
        return null;
    }

    public static zzcm<Long> zza(zzct zzctVar, String str, long j) {
        return new zzcp(zzctVar, str, Long.valueOf(j));
    }

    public static zzcm<Boolean> zza(zzct zzctVar, String str, boolean z) {
        return new zzco(zzctVar, str, Boolean.valueOf(z));
    }

    public static zzcm<Double> zza(zzct zzctVar, String str, double d) {
        return new zzcr(zzctVar, str, Double.valueOf(d));
    }

    public static zzcm<String> zza(zzct zzctVar, String str, String str2) {
        return new zzcq(zzctVar, str, str2);
    }

    public /* synthetic */ zzcm(zzct zzctVar, String str, Object obj, zzcp zzcpVar) {
        this(zzctVar, str, obj);
    }
}
