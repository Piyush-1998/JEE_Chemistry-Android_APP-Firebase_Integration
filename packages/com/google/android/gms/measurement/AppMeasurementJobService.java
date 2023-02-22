package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzit;
import com.google.android.gms.measurement.internal.zzix;

/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements zzix {
    private zzit<AppMeasurementJobService> zzm;

    private final zzit<AppMeasurementJobService> zze() {
        if (this.zzm == null) {
            this.zzm = new zzit<>(this);
        }
        return this.zzm;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final void zza(Intent intent) {
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zze().onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zze().onDestroy();
        super.onDestroy();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return zze().onStartJob(jobParameters);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zze().onUnbind(intent);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zze().onRebind(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final void zza(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
