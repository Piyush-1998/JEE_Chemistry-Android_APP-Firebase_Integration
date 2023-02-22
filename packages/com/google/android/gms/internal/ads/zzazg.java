package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzazg implements SensorEventListener {
    private final SensorManager zzdzb;
    private final Display zzdzd;
    private float[] zzdzg;
    private Handler zzdzh;
    private zzazi zzdzi;
    private final float[] zzdze = new float[9];
    private final float[] zzdzf = new float[9];
    private final Object zzdzc = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazg(Context context) {
        this.zzdzb = (SensorManager) context.getSystemService("sensor");
        this.zzdzd = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void start() {
        if (this.zzdzh != null) {
            return;
        }
        Sensor defaultSensor = this.zzdzb.getDefaultSensor(11);
        if (defaultSensor == null) {
            zzaug.zzes("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzdac zzdacVar = new zzdac(handlerThread.getLooper());
        this.zzdzh = zzdacVar;
        if (this.zzdzb.registerListener(this, defaultSensor, 0, zzdacVar)) {
            return;
        }
        zzaug.zzes("SensorManager.registerListener failed.");
        stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void stop() {
        if (this.zzdzh == null) {
            return;
        }
        this.zzdzb.unregisterListener(this);
        this.zzdzh.post(new zzazf(this));
        this.zzdzh = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzazi zzaziVar) {
        this.zzdzi = zzaziVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzdzc) {
            if (this.zzdzg == null) {
                this.zzdzg = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zzdze, fArr);
        int rotation = this.zzdzd.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zzdze, 2, 129, this.zzdzf);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zzdze, 129, 130, this.zzdzf);
        } else if (rotation == 3) {
            SensorManager.remapCoordinateSystem(this.zzdze, 130, 1, this.zzdzf);
        } else {
            System.arraycopy(this.zzdze, 0, this.zzdzf, 0, 9);
        }
        zzk(1, 3);
        zzk(2, 6);
        zzk(5, 7);
        synchronized (this.zzdzc) {
            System.arraycopy(this.zzdzf, 0, this.zzdzg, 0, 9);
        }
        zzazi zzaziVar = this.zzdzi;
        if (zzaziVar != null) {
            zzaziVar.zzst();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(float[] fArr) {
        synchronized (this.zzdzc) {
            if (this.zzdzg == null) {
                return false;
            }
            System.arraycopy(this.zzdzg, 0, fArr, 0, this.zzdzg.length);
            return true;
        }
    }

    private final void zzk(int i, int i2) {
        float[] fArr = this.zzdzf;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }
}
