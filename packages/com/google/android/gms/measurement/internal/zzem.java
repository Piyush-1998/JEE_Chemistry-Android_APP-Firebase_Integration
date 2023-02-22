package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzem extends BroadcastReceiver {
    private static final String zzky = zzem.class.getName();
    private final zzjg zzkz;
    private boolean zzla;
    private boolean zzlb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzem(zzjg zzjgVar) {
        Preconditions.checkNotNull(zzjgVar);
        this.zzkz = zzjgVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.zzkz.zzjj();
        String action = intent.getAction();
        this.zzkz.zzab().zzgs().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zzgv = this.zzkz.zzjf().zzgv();
            if (this.zzlb != zzgv) {
                this.zzlb = zzgv;
                this.zzkz.zzaa().zza(new zzep(this, zzgv));
                return;
            }
            return;
        }
        this.zzkz.zzab().zzgn().zza("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void zzha() {
        this.zzkz.zzjj();
        this.zzkz.zzaa().zzo();
        if (this.zzla) {
            return;
        }
        this.zzkz.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzlb = this.zzkz.zzjf().zzgv();
        this.zzkz.zzab().zzgs().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzlb));
        this.zzla = true;
    }

    public final void unregister() {
        this.zzkz.zzjj();
        this.zzkz.zzaa().zzo();
        this.zzkz.zzaa().zzo();
        if (this.zzla) {
            this.zzkz.zzab().zzgs().zzao("Unregistering connectivity change receiver");
            this.zzla = false;
            this.zzlb = false;
            try {
                this.zzkz.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zzkz.zzab().zzgk().zza("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
