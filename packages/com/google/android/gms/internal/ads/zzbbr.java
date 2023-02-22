package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbbr implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzeeh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbr(JsPromptResult jsPromptResult) {
        this.zzeeh = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeeh.cancel();
    }
}
