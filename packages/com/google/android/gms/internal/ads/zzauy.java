package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzauy extends zzauv {
    @Override // com.google.android.gms.internal.ads.zzauv, com.google.android.gms.internal.ads.zzaur
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public final ViewGroup.LayoutParams zzvr() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
