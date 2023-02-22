package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbbn implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzeeg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbn(JsResult jsResult) {
        this.zzeeg = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzeeg.cancel();
    }
}
