package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzawt extends BroadcastReceiver {
    private final /* synthetic */ zzawu zzdvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawt(zzawu zzawuVar) {
        this.zzdvf = zzawuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzdvf.zzc(context, intent);
    }
}
