package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzanc implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzana zzdge;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanc(zzana zzanaVar) {
        this.zzdge = zzanaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdge.zzdn("User canceled the download.");
    }
}
