package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzit;
import com.google.android.gms.measurement.internal.zzix;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements zzix {
    private zzit<AppMeasurementService> zzm;

    private final zzit<AppMeasurementService> zze() {
        if (this.zzm == null) {
            this.zzm = new zzit<>(this);
        }
        return this.zzm;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return zze().onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return zze().onBind(intent);
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
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final void zza(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final void zza(Intent intent) {
        AppMeasurementReceiver.completeWakefulIntent(intent);
    }
}
