package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzavl implements Runnable {
    final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzdto;
    private final /* synthetic */ boolean zzdtp;
    private final /* synthetic */ boolean zzdtq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavl(zzavm zzavmVar, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzdto = str;
        this.zzdtp = z;
        this.zzdtq = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context);
        builder.setMessage(this.zzdto);
        if (this.zzdtp) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.zzdtq) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzavo(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
