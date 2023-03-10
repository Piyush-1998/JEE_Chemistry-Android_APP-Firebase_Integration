package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class zzex implements ServiceConnection {
    private final String packageName;
    final /* synthetic */ zzeu zzmt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzex(zzeu zzeuVar, String str) {
        this.zzmt = zzeuVar;
        this.packageName = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zzmt.zzj.zzab().zzgn().zzao("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzf zza = com.google.android.gms.internal.measurement.zze.zza(iBinder);
            if (zza == null) {
                this.zzmt.zzj.zzab().zzgn().zzao("Install Referrer Service implementation was not found");
                return;
            }
            this.zzmt.zzj.zzab().zzgq().zzao("Install Referrer Service connected");
            this.zzmt.zzj.zzaa().zza(new zzew(this, zza, this));
        } catch (Exception e) {
            this.zzmt.zzj.zzab().zzgn().zza("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzmt.zzj.zzab().zzgq().zzao("Install Referrer Service disconnected");
    }
}
