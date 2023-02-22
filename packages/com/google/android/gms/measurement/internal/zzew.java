package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;

/* loaded from: classes.dex */
final class zzew implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzf zzmq;
    private final /* synthetic */ ServiceConnection zzmr;
    private final /* synthetic */ zzex zzms;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzew(zzex zzexVar, com.google.android.gms.internal.measurement.zzf zzfVar, ServiceConnection serviceConnection) {
        this.zzms = zzexVar;
        this.zzmq = zzfVar;
        this.zzmr = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzeu zzeuVar = this.zzms.zzmt;
        str = this.zzms.packageName;
        com.google.android.gms.internal.measurement.zzf zzfVar = this.zzmq;
        ServiceConnection serviceConnection = this.zzmr;
        Bundle zza = zzeuVar.zza(str, zzfVar);
        zzeuVar.zzj.zzaa().zzo();
        if (zza != null) {
            long j = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzeuVar.zzj.zzab().zzgk().zzao("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzeuVar.zzj.zzab().zzgk().zzao("No referrer defined in install referrer response");
                } else {
                    zzeuVar.zzj.zzab().zzgs().zza("InstallReferrer API result", string);
                    zzjs zzz = zzeuVar.zzj.zzz();
                    String valueOf = String.valueOf(string);
                    Bundle zza2 = zzz.zza(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (zza2 == null) {
                        zzeuVar.zzj.zzab().zzgk().zzao("No campaign params defined in install referrer result");
                    } else {
                        String string2 = zza2.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j2 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzeuVar.zzj.zzab().zzgk().zzao("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zza2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzeuVar.zzj.zzac().zzlp.get()) {
                            zzeuVar.zzj.zzae();
                            zzeuVar.zzj.zzab().zzgs().zzao("Campaign has already been logged");
                        } else {
                            zzeuVar.zzj.zzac().zzlp.set(j);
                            zzeuVar.zzj.zzae();
                            zzeuVar.zzj.zzab().zzgs().zza("Logging Install Referrer campaign from sdk with ", "referrer API");
                            zza2.putString("_cis", "referrer API");
                            zzeuVar.zzj.zzq().logEvent("auto", "_cmp", zza2);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzeuVar.zzj.getContext(), serviceConnection);
        }
    }
}
