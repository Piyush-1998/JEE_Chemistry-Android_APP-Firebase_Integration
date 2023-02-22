package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzazc {
    private final Context zzcfz;
    private final zzazj zzdya;
    private final ViewGroup zzdyv;
    private zzayw zzdyw;

    public zzazc(Context context, ViewGroup viewGroup, zzbbw zzbbwVar) {
        this(context, viewGroup, zzbbwVar, null);
    }

    private zzazc(Context context, ViewGroup viewGroup, zzazj zzazjVar, zzayw zzaywVar) {
        this.zzcfz = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdyv = viewGroup;
        this.zzdya = zzazjVar;
        this.zzdyw = null;
    }

    public final void zze(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzayw zzaywVar = this.zzdyw;
        if (zzaywVar != null) {
            zzaywVar.zzd(i, i2, i3, i4);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzazk zzazkVar) {
        if (this.zzdyw != null) {
            return;
        }
        zzzs.zza(this.zzdya.zzxq().zzpy(), this.zzdya.zzxm(), "vpr2");
        Context context = this.zzcfz;
        zzazj zzazjVar = this.zzdya;
        zzayw zzaywVar = new zzayw(context, zzazjVar, i5, z, zzazjVar.zzxq().zzpy(), zzazkVar);
        this.zzdyw = zzaywVar;
        this.zzdyv.addView(zzaywVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzdyw.zzd(i, i2, i3, i4);
        this.zzdya.zzao(false);
    }

    public final zzayw zzxg() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzdyw;
    }

    public final void onPause() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzayw zzaywVar = this.zzdyw;
        if (zzaywVar != null) {
            zzaywVar.pause();
        }
    }

    public final void onDestroy() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzayw zzaywVar = this.zzdyw;
        if (zzaywVar != null) {
            zzaywVar.destroy();
            this.zzdyv.removeView(this.zzdyw);
            this.zzdyw = null;
        }
    }
}
