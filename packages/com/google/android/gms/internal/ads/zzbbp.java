package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbbp implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult zzeeg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbp(JsResult jsResult) {
        this.zzeeg = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeeg.confirm();
    }
}
