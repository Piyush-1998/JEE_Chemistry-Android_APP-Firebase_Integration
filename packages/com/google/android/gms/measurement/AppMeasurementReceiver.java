package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzez;
import com.google.android.gms.measurement.internal.zzfa;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzfa {
    private zzez zzn;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zzn == null) {
            this.zzn = new zzez(this);
        }
        this.zzn.onReceive(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfa
    public final void doStartService(Context context, Intent intent) {
        startWakefulService(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfa
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }
}
