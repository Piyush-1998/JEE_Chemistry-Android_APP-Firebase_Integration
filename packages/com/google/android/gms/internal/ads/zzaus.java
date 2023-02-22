package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzaus extends BroadcastReceiver {
    private final /* synthetic */ zzaul zzdta;

    private zzaus(zzaul zzaulVar) {
        this.zzdta = zzaulVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzaul.zza(this.zzdta, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzaul.zza(this.zzdta, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaus(zzaul zzaulVar, zzauo zzauoVar) {
        this(zzaulVar);
    }
}
