package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzavo implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzavl zzdtv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavo(zzavl zzavlVar) {
        this.zzdtv = zzavlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzq.zzkj();
        zzaul.zza(this.zzdtv.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
