package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.zzavd;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzj extends RelativeLayout {
    private zzavd zzdhs;
    boolean zzdht;

    public zzj(Context context, String str, String str2) {
        super(context);
        zzavd zzavdVar = new zzavd(context, str);
        this.zzdhs = zzavdVar;
        zzavdVar.zzr(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdht) {
            return false;
        }
        this.zzdhs.zzd(motionEvent);
        return false;
    }
}
