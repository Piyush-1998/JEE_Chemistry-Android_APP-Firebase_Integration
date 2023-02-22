package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzawu {
    private boolean zzdvi;
    private Context zzzc;
    private boolean zzye = false;
    private final Map<BroadcastReceiver, IntentFilter> zzdvh = new WeakHashMap();
    private final BroadcastReceiver zzdvg = new zzawt(this);

    public final synchronized void initialize(Context context) {
        if (this.zzye) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.zzzc = applicationContext;
        if (applicationContext == null) {
            this.zzzc = context;
        }
        zzza.initialize(this.zzzc);
        this.zzdvi = ((Boolean) zzuv.zzon().zzd(zzza.zzcok)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzzc.registerReceiver(this.zzdvg, intentFilter);
        this.zzye = true;
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.zzdvi) {
            this.zzdvh.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.zzdvi) {
            this.zzdvh.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzc(Context context, Intent intent) {
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.zzdvh.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                entry.getKey().onReceive(context, intent);
            }
        }
    }
}
