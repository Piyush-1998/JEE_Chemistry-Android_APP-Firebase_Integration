package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzbbw;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzdhr;
    public final Context zzlk;

    public zzi(zzbbw zzbbwVar) throws zzg {
        this.zzdhr = zzbbwVar.getLayoutParams();
        ViewParent parent = zzbbwVar.getParent();
        this.zzlk = zzbbwVar.zzzk();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.parent = viewGroup;
            this.index = viewGroup.indexOfChild(zzbbwVar.getView());
            this.parent.removeView(zzbbwVar.getView());
            zzbbwVar.zzas(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
