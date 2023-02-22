package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbbs implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzeeh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbs(JsPromptResult jsPromptResult) {
        this.zzeeh = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzeeh.cancel();
    }
}
