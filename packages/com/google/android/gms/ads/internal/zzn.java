package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzn implements View.OnTouchListener {
    private final /* synthetic */ zzl zzblj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzl zzlVar) {
        this.zzblj = zzlVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzdf zzdfVar;
        zzdf zzdfVar2;
        zzdfVar = this.zzblj.zzblq;
        if (zzdfVar != null) {
            zzdfVar2 = this.zzblj.zzblq;
            zzdfVar2.zzb(motionEvent);
            return false;
        }
        return false;
    }
}
