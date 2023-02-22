package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzamx implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzamu zzdfn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamx(zzamu zzamuVar) {
        this.zzdfn = zzamuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent createIntent = this.zzdfn.createIntent();
        com.google.android.gms.ads.internal.zzq.zzkj();
        context = this.zzdfn.zzlk;
        zzaul.zza(context, createIntent);
    }
}
