package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzamw implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzamu zzdfn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamw(zzamu zzamuVar) {
        this.zzdfn = zzamuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdfn.zzdn("Operation denied by user.");
    }
}
