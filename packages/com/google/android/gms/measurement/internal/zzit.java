package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzix;

/* loaded from: classes.dex */
public final class zzit<T extends Context & zzix> {
    private final T zzrz;

    public zzit(T t) {
        Preconditions.checkNotNull(t);
        this.zzrz = t;
    }

    public final void onCreate() {
        zzfj zza = zzfj.zza(this.zzrz, (com.google.android.gms.internal.measurement.zzx) null);
        zzef zzab = zza.zzab();
        zza.zzae();
        zzab.zzgs().zzao("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        zzfj zza = zzfj.zza(this.zzrz, (com.google.android.gms.internal.measurement.zzx) null);
        zzef zzab = zza.zzab();
        zza.zzae();
        zzab.zzgs().zzao("Local AppMeasurementService is shutting down");
    }

    public final int onStartCommand(final Intent intent, int i, final int i2) {
        zzfj zza = zzfj.zza(this.zzrz, (com.google.android.gms.internal.measurement.zzx) null);
        final zzef zzab = zza.zzab();
        if (intent == null) {
            zzab.zzgn().zzao("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zza.zzae();
        zzab.zzgs().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zze(new Runnable(this, i2, zzab, intent) { // from class: com.google.android.gms.measurement.internal.zzis
                private final int zzqi;
                private final zzit zzrw;
                private final zzef zzrx;
                private final Intent zzry;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzrw = this;
                    this.zzqi = i2;
                    this.zzrx = zzab;
                    this.zzry = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzrw.zza(this.zzqi, this.zzrx, this.zzry);
                }
            });
        }
        return 2;
    }

    private final void zze(Runnable runnable) {
        zzjg zzm = zzjg.zzm(this.zzrz);
        zzm.zzaa().zza(new zziu(this, zzm, runnable));
    }

    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            zzab().zzgk().zzao("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzfk(zzjg.zzm(this.zzrz));
        }
        zzab().zzgn().zza("onBind received unknown action", action);
        return null;
    }

    public final boolean onUnbind(Intent intent) {
        if (intent == null) {
            zzab().zzgk().zzao("onUnbind called with null intent");
            return true;
        }
        zzab().zzgs().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final boolean onStartJob(final JobParameters jobParameters) {
        zzfj zza = zzfj.zza(this.zzrz, (com.google.android.gms.internal.measurement.zzx) null);
        final zzef zzab = zza.zzab();
        String string = jobParameters.getExtras().getString("action");
        zza.zzae();
        zzab.zzgs().zza("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zze(new Runnable(this, zzab, jobParameters) { // from class: com.google.android.gms.measurement.internal.zziv
                private final zzit zzrw;
                private final zzef zzsc;
                private final JobParameters zzsd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzrw = this;
                    this.zzsc = zzab;
                    this.zzsd = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzrw.zza(this.zzsc, this.zzsd);
                }
            });
            return true;
        }
        return true;
    }

    public final void onRebind(Intent intent) {
        if (intent == null) {
            zzab().zzgk().zzao("onRebind called with null intent");
            return;
        }
        zzab().zzgs().zza("onRebind called. action", intent.getAction());
    }

    private final zzef zzab() {
        return zzfj.zza(this.zzrz, (com.google.android.gms.internal.measurement.zzx) null).zzab();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzef zzefVar, JobParameters jobParameters) {
        zzefVar.zzgs().zzao("AppMeasurementJobService processed last upload request.");
        this.zzrz.zza(jobParameters, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, zzef zzefVar, Intent intent) {
        if (this.zzrz.zza(i)) {
            zzefVar.zzgs().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzab().zzgs().zzao("Completed wakeful intent.");
            this.zzrz.zza(intent);
        }
    }
}
