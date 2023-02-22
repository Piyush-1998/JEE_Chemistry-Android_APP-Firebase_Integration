package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgp extends zzg {
    protected zzhj zzpu;
    private zzgk zzpv;
    private final Set<zzgn> zzpw;
    private boolean zzpx;
    private final AtomicReference<String> zzpy;
    protected boolean zzpz;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgp(zzfj zzfjVar) {
        super(zzfjVar);
        this.zzpw = new CopyOnWriteArraySet();
        this.zzpz = true;
        this.zzpy = new AtomicReference<>();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzbk() {
        return false;
    }

    public final void zzif() {
        if (getContext().getApplicationContext() instanceof Application) {
            ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzpu);
        }
    }

    public final Boolean zzig() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzaa().zza(atomicReference, 15000L, "boolean test flag value", new zzgo(this, atomicReference));
    }

    public final String zzih() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzaa().zza(atomicReference, 15000L, "String test flag value", new zzgy(this, atomicReference));
    }

    public final Long zzii() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzaa().zza(atomicReference, 15000L, "long test flag value", new zzha(this, atomicReference));
    }

    public final Integer zzij() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzaa().zza(atomicReference, 15000L, "int test flag value", new zzhd(this, atomicReference));
    }

    public final Double zzik() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzaa().zza(atomicReference, 15000L, "double test flag value", new zzhc(this, atomicReference));
    }

    public final void setMeasurementEnabled(boolean z) {
        zzbi();
        zzm();
        zzaa().zza(new zzhf(this, z));
    }

    public final void zza(boolean z) {
        zzbi();
        zzm();
        zzaa().zza(new zzhe(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(boolean z) {
        zzo();
        zzm();
        zzbi();
        zzab().zzgr().zza("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzac().setMeasurementEnabled(z);
        zzil();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzil() {
        if (zzad().zze(zzr().zzag(), zzak.zzik)) {
            zzo();
            String zzho = zzac().zzlx.zzho();
            if (zzho != null) {
                if ("unset".equals(zzho)) {
                    zza("app", "_npa", (Object) null, zzx().currentTimeMillis());
                } else {
                    zza("app", "_npa", Long.valueOf("true".equals(zzho) ? 1L : 0L), zzx().currentTimeMillis());
                }
            }
        }
        if (this.zzj.isEnabled() && this.zzpz) {
            zzab().zzgr().zzao("Recording app launch after enabling measurement for the first time (FE)");
            zzim();
            return;
        }
        zzab().zzgr().zzao("Updating Scion state (FE)");
        zzs().zzip();
    }

    public final void setMinimumSessionDuration(long j) {
        zzm();
        zzaa().zza(new zzhh(this, j));
    }

    public final void setSessionTimeoutDuration(long j) {
        zzm();
        zzaa().zza(new zzhg(this, j));
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z) {
        logEvent(str, str2, bundle, false, true, zzx().currentTimeMillis());
    }

    public final void logEvent(String str, String str2, Bundle bundle) {
        logEvent(str, str2, bundle, true, true, zzx().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, String str2, Bundle bundle) {
        zzm();
        zzo();
        zza(str, str2, zzx().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzm();
        zzo();
        zza(str, str2, j, bundle, true, this.zzpv == null || zzjs.zzbq(str2), false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgp.zza(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzm();
        zzb(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.zzpv == null || zzjs.zzbq(str2), !z, null);
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzaa().zza(new zzgr(this, str, str2, j, zzjs.zzh(bundle), z, z2, z3, str3));
    }

    public final void zzb(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzx().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        if (z) {
            i = zzz().zzbm(str2);
        } else {
            zzjs zzz = zzz();
            if (zzz.zzp("user property", str2)) {
                if (!zzz.zza("user property", zzgl.zzpp, str2)) {
                    i = 15;
                } else if (zzz.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            zzz();
            this.zzj.zzz().zza(i, "_ev", zzjs.zza(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int zzc = zzz().zzc(str2, obj);
            if (zzc != 0) {
                zzz();
                String zza = zzjs.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    r0 = String.valueOf(obj).length();
                }
                this.zzj.zzz().zza(zzc, "_ev", zza, r0);
                return;
            }
            Object zzd = zzz().zzd(str2, obj);
            if (zzd != null) {
                zza(str3, str2, j, zzd);
            }
        } else {
            zza(str3, str2, j, (Object) null);
        }
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzaa().zza(new zzgq(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzo()
            r8.zzm()
            r8.zzbi()
            com.google.android.gms.measurement.internal.zzs r0 = r8.zzad()
            com.google.android.gms.measurement.internal.zzdy r1 = r8.zzr()
            java.lang.String r1 = r1.zzag()
            com.google.android.gms.measurement.internal.zzdu<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzak.zzik
            boolean r0 = r0.zze(r1, r2)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L7a
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L7a
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L6a
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L6a
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L4c
            r4 = r2
            goto L4e
        L4c:
            r4 = 0
        L4e:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.zzeo r0 = r8.zzac()
            com.google.android.gms.measurement.internal.zzev r0 = r0.zzlx
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L65
            java.lang.String r11 = "true"
        L65:
            r0.zzau(r11)
            r6 = r10
            goto L78
        L6a:
            if (r11 != 0) goto L7a
            com.google.android.gms.measurement.internal.zzeo r10 = r8.zzac()
            com.google.android.gms.measurement.internal.zzev r10 = r10.zzlx
            java.lang.String r0 = "unset"
            r10.zzau(r0)
            r6 = r11
        L78:
            r3 = r1
            goto L7c
        L7a:
            r3 = r10
            r6 = r11
        L7c:
            com.google.android.gms.measurement.internal.zzfj r10 = r8.zzj
            boolean r10 = r10.isEnabled()
            if (r10 != 0) goto L92
            com.google.android.gms.measurement.internal.zzef r9 = r8.zzab()
            com.google.android.gms.measurement.internal.zzeh r9 = r9.zzgr()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zzao(r10)
            return
        L92:
            com.google.android.gms.measurement.internal.zzfj r10 = r8.zzj
            boolean r10 = r10.zzie()
            if (r10 != 0) goto L9b
            return
        L9b:
            com.google.android.gms.measurement.internal.zzef r10 = r8.zzab()
            com.google.android.gms.measurement.internal.zzeh r10 = r10.zzgr()
            com.google.android.gms.measurement.internal.zzed r11 = r8.zzy()
            java.lang.String r11 = r11.zzaj(r3)
            java.lang.String r0 = "Setting user property (FE)"
            r10.zza(r0, r11, r6)
            com.google.android.gms.measurement.internal.zzjn r10 = new com.google.android.gms.measurement.internal.zzjn
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzhv r9 = r8.zzs()
            r9.zzb(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgp.zza(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final List<zzjn> zzh(boolean z) {
        zzm();
        zzbi();
        zzab().zzgr().zzao("Fetching user attributes (FE)");
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzj.zzaa().zza(new zzgt(this, atomicReference, z));
                try {
                    atomicReference.wait(5000L);
                } catch (InterruptedException e) {
                    zzab().zzgn().zza("Interrupted waiting for get user properties", e);
                }
            }
            List<zzjn> list = (List) atomicReference.get();
            if (list == null) {
                zzab().zzgn().zzao("Timed out waiting for get user properties");
                return Collections.emptyList();
            }
            return list;
        }
    }

    public final String zzi() {
        zzm();
        return this.zzpy.get();
    }

    public final String zzy(long j) {
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot retrieve app instance id from analytics worker thread");
            return null;
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot retrieve app instance id from main thread");
            return null;
        } else {
            long elapsedRealtime = zzx().elapsedRealtime();
            String zzz = zzz(120000L);
            long elapsedRealtime2 = zzx().elapsedRealtime() - elapsedRealtime;
            return (zzz != null || elapsedRealtime2 >= 120000) ? zzz : zzz(120000 - elapsedRealtime2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbg(String str) {
        this.zzpy.set(str);
    }

    private final String zzz(long j) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            zzaa().zza(new zzgs(this, atomicReference));
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzab().zzgn().zzao("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (String) atomicReference.get();
    }

    public final void resetAnalyticsData(long j) {
        zzbg(null);
        zzaa().zza(new zzgv(this, j));
    }

    public final void zzim() {
        zzo();
        zzm();
        zzbi();
        if (this.zzj.zzie()) {
            zzs().zzim();
            this.zzpz = false;
            String zzhh = zzac().zzhh();
            if (TextUtils.isEmpty(zzhh)) {
                return;
            }
            zzw().zzbi();
            if (zzhh.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", zzhh);
            logEvent("auto", "_ou", bundle);
        }
    }

    public final void zza(zzgk zzgkVar) {
        zzgk zzgkVar2;
        zzo();
        zzm();
        zzbi();
        if (zzgkVar != null && zzgkVar != (zzgkVar2 = this.zzpv)) {
            Preconditions.checkState(zzgkVar2 == null, "EventInterceptor already set.");
        }
        this.zzpv = zzgkVar;
    }

    public final void zza(zzgn zzgnVar) {
        zzm();
        zzbi();
        Preconditions.checkNotNull(zzgnVar);
        if (this.zzpw.add(zzgnVar)) {
            return;
        }
        zzab().zzgn().zzao("OnEventListener already registered");
    }

    public final void zzb(zzgn zzgnVar) {
        zzm();
        zzbi();
        Preconditions.checkNotNull(zzgnVar);
        if (this.zzpw.remove(zzgnVar)) {
            return;
        }
        zzab().zzgn().zzao("OnEventListener had not been registered");
    }

    public final void setConditionalUserProperty(Bundle bundle) {
        setConditionalUserProperty(bundle, zzx().currentTimeMillis());
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzm();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzab().zzgn().zzao("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zza(bundle2, j);
    }

    public final void zzd(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("app_id"));
        zzl();
        zza(new Bundle(bundle), zzx().currentTimeMillis());
    }

    private final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzgg.zza(bundle, "app_id", String.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgg.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (zzz().zzbm(string) != 0) {
            zzab().zzgk().zza("Invalid conditional user property name", zzy().zzal(string));
        } else if (zzz().zzc(string, obj) != 0) {
            zzab().zzgk().zza("Invalid conditional user property value", zzy().zzal(string), obj);
        } else {
            Object zzd = zzz().zzd(string, obj);
            if (zzd == null) {
                zzab().zzgk().zza("Unable to normalize conditional user property value", zzy().zzal(string), obj);
                return;
            }
            zzgg.zza(bundle, zzd);
            long j2 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
                zzab().zzgk().zza("Invalid conditional user property timeout", zzy().zzal(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            if (j3 > 15552000000L || j3 < 1) {
                zzab().zzgk().zza("Invalid conditional user property time to live", zzy().zzal(string), Long.valueOf(j3));
            } else {
                zzaa().zza(new zzgx(this, bundle));
            }
        }
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzm();
        zza((String) null, str, str2, bundle);
    }

    public final void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        zzl();
        zza(str, str2, str3, bundle);
    }

    private final void zza(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zzx().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str3 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str3);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzaa().zza(new zzgw(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(Bundle bundle) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        if (!this.zzj.isEnabled()) {
            zzab().zzgr().zzao("Conditional property not sent since collection is disabled");
            return;
        }
        zzjn zzjnVar = new zzjn(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        try {
            zzai zza = zzz().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0L, true, false);
            zzs().zzd(new zzq(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), zzjnVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzz().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0L, true, false), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zza, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzz().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Bundle bundle) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!this.zzj.isEnabled()) {
            zzab().zzgr().zzao("Conditional property not cleared since collection is disabled");
            return;
        }
        try {
            zzs().zzd(new zzq(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), new zzjn(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), 0L, null, null), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzz().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final ArrayList<Bundle> zzn(String str, String str2) {
        zzm();
        return zze(null, str, str2);
    }

    public final ArrayList<Bundle> zzd(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzl();
        return zze(str, str2, str3);
    }

    private final ArrayList<Bundle> zze(String str, String str2, String str3) {
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzj.zzaa().zza(new zzgz(this, atomicReference, str, str2, str3));
                try {
                    atomicReference.wait(5000L);
                } catch (InterruptedException e) {
                    zzab().zzgn().zza("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List list = (List) atomicReference.get();
            if (list == null) {
                zzab().zzgn().zza("Timed out waiting for get conditional user properties", str);
                return new ArrayList<>();
            }
            return zzjs.zzd(list);
        }
    }

    public final Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        zzm();
        return zzb((String) null, str, str2, z);
    }

    public final Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        zzl();
        return zzb(str, str2, str3, z);
    }

    private final Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        if (zzaa().zzhp()) {
            zzab().zzgk().zzao("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzr.isMainThread()) {
            zzab().zzgk().zzao("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.zzj.zzaa().zza(new zzhb(this, atomicReference, str, str2, str3, z));
                try {
                    atomicReference.wait(5000L);
                } catch (InterruptedException e) {
                    zzab().zzgn().zza("Interrupted waiting for get user properties", e);
                }
            }
            List<zzjn> list = (List) atomicReference.get();
            if (list == null) {
                zzab().zzgn().zzao("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzjn zzjnVar : list) {
                arrayMap.put(zzjnVar.name, zzjnVar.getValue());
            }
            return arrayMap;
        }
    }

    public final String getCurrentScreenName() {
        zzhr zzio = this.zzj.zzt().zzio();
        if (zzio != null) {
            return zzio.zzqu;
        }
        return null;
    }

    public final String getCurrentScreenClass() {
        zzhr zzio = this.zzj.zzt().zzio();
        if (zzio != null) {
            return zzio.zzqv;
        }
        return null;
    }

    public final String getGmpAppId() {
        if (this.zzj.zzhx() != null) {
            return this.zzj.zzhx();
        }
        try {
            return GoogleServices.getGoogleAppId();
        } catch (IllegalStateException e) {
            this.zzj.zzab().zzgk().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzgp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzdy zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhv zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhq zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzeb zzu() {
        return super.zzu();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziw zzv() {
        return super.zzv();
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
