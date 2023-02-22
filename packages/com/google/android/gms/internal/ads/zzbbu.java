package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbbu implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzeeh;
    private final /* synthetic */ EditText zzeej;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbu(JsPromptResult jsPromptResult, EditText editText) {
        this.zzeeh = jsPromptResult;
        this.zzeej = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeeh.confirm(this.zzeej.getText().toString());
    }
}
