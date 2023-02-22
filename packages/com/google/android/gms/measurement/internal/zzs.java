package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzs extends zzgf {
    private Boolean zzeb;
    private zzu zzec;
    private Boolean zzed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(zzfj zzfjVar) {
        super(zzfjVar);
        this.zzec = zzv.zzee;
        zzak.zza(zzfjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzu zzuVar) {
        this.zzec = zzuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzbm() {
        return zzak.zzgf.get(null);
    }

    public final int zzi(String str) {
        return zzb(str, zzak.zzgt);
    }

    public final long zzao() {
        zzae();
        return 16250L;
    }

    public final boolean zzbn() {
        if (this.zzed == null) {
            synchronized (this) {
                if (this.zzed == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzed = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzed == null) {
                        this.zzed = Boolean.TRUE;
                        zzab().zzgk().zzao("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzed.booleanValue();
    }

    public final long zza(String str, zzdu<Long> zzduVar) {
        if (str == null) {
            return zzduVar.get(null).longValue();
        }
        String zzb = this.zzec.zzb(str, zzduVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzduVar.get(null).longValue();
        }
        try {
            return zzduVar.get(Long.valueOf(Long.parseLong(zzb))).longValue();
        } catch (NumberFormatException unused) {
            return zzduVar.get(null).longValue();
        }
    }

    public final int zzb(String str, zzdu<Integer> zzduVar) {
        if (str == null) {
            return zzduVar.get(null).intValue();
        }
        String zzb = this.zzec.zzb(str, zzduVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzduVar.get(null).intValue();
        }
        try {
            return zzduVar.get(Integer.valueOf(Integer.parseInt(zzb))).intValue();
        } catch (NumberFormatException unused) {
            return zzduVar.get(null).intValue();
        }
    }

    public final double zzc(String str, zzdu<Double> zzduVar) {
        if (str == null) {
            return zzduVar.get(null).doubleValue();
        }
        String zzb = this.zzec.zzb(str, zzduVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzduVar.get(null).doubleValue();
        }
        try {
            return zzduVar.get(Double.valueOf(Double.parseDouble(zzb))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzduVar.get(null).doubleValue();
        }
    }

    public final boolean zzd(String str, zzdu<Boolean> zzduVar) {
        if (str == null) {
            return zzduVar.get(null).booleanValue();
        }
        String zzb = this.zzec.zzb(str, zzduVar.getKey());
        if (TextUtils.isEmpty(zzb)) {
            return zzduVar.get(null).booleanValue();
        }
        return zzduVar.get(Boolean.valueOf(Boolean.parseBoolean(zzb))).booleanValue();
    }

    public final boolean zze(String str, zzdu<Boolean> zzduVar) {
        return zzd(str, zzduVar);
    }

    public final boolean zza(zzdu<Boolean> zzduVar) {
        return zzd(null, zzduVar);
    }

    private final Bundle zzbo() {
        try {
            if (getContext().getPackageManager() == null) {
                zzab().zzgk().zzao("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(getContext()).getApplicationInfo(getContext().getPackageName(), 128);
            if (applicationInfo == null) {
                zzab().zzgk().zzao("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            zzab().zzgk().zza("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzj(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzbo = zzbo();
        if (zzbo == null) {
            zzab().zzgk().zzao("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (zzbo.containsKey(str)) {
            return Boolean.valueOf(zzbo.getBoolean(str));
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> zzk(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzbo()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.zzef r4 = r3.zzab()
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzgk()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zzao(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzef r0 = r3.zzab()
            com.google.android.gms.measurement.internal.zzeh r0 = r0.zzgk()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zza(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzs.zzk(java.lang.String):java.util.List");
    }

    public final boolean zzbp() {
        zzae();
        Boolean zzj = zzj("firebase_analytics_collection_deactivated");
        return zzj != null && zzj.booleanValue();
    }

    public final Boolean zzbq() {
        zzae();
        return zzj("firebase_analytics_collection_enabled");
    }

    public final Boolean zzbr() {
        zzm();
        Boolean zzj = zzj("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(zzj == null || zzj.booleanValue());
    }

    public static long zzbs() {
        return zzak.zzhi.get(null).longValue();
    }

    public static long zzbt() {
        return zzak.zzgi.get(null).longValue();
    }

    public final String zzbu() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (ClassNotFoundException e) {
            zzab().zzgk().zza("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            zzab().zzgk().zza("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            zzab().zzgk().zza("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            zzab().zzgk().zza("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public static boolean zzbv() {
        return zzak.zzge.get(null).booleanValue();
    }

    public final boolean zzl(String str) {
        return "1".equals(this.zzec.zzb(str, "gaia_collection_enabled"));
    }

    public final boolean zzm(String str) {
        return "1".equals(this.zzec.zzb(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzn(String str) {
        return zzd(str, zzak.zzhs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo(String str) {
        return zzd(str, zzak.zzhm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzp(String str) {
        zzdu<String> zzduVar = zzak.zzhn;
        if (str == null) {
            return zzduVar.get(null);
        }
        return zzduVar.get(this.zzec.zzb(str, zzduVar.getKey()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq(String str) {
        return zzd(str, zzak.zzht);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzr(String str) {
        return zzd(str, zzak.zzhu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzs(String str) {
        return zzd(str, zzak.zzhv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzt(String str) {
        return zzd(str, zzak.zzhx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzbw() {
        if (this.zzeb == null) {
            Boolean zzj = zzj("app_measurement_lite");
            this.zzeb = zzj;
            if (zzj == null) {
                this.zzeb = false;
            }
        }
        return this.zzeb.booleanValue() || !this.zzj.zzia();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzu(String str) {
        return zzd(str, zzak.zzhw);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbx() {
        return zzak.zzhy.get(null).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzv(String str) {
        return zzd(str, zzak.zzhz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw(String str) {
        return zzd(str, zzak.zzia);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzx(String str) {
        return zzd(str, zzak.zzib);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzy(String str) {
        return zzd(str, zzak.zzic);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzz(String str) {
        return zzd(str, zzak.zzih);
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzac zzw() {
        return super.zzw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ Clock zzx() {
        return super.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzed zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzjs zzz() {
        return super.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzfc zzaa() {
        return super.zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzef zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzeo zzac() {
        return super.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzs zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzr zzae() {
        return super.zzae();
    }
}
