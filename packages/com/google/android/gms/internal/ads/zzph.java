package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzph extends BroadcastReceiver {
    private final /* synthetic */ zzpf zzbnv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzph(zzpf zzpfVar) {
        this.zzbnv = zzpfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzbnv.zzbm(3);
    }
}
