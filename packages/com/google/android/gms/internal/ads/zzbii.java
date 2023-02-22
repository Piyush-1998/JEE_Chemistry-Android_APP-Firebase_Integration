package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbii extends zzbkk {
    private final View view;
    private final zzbbw zzczi;
    private final zzcvu zzfde;
    private final int zzfdf;
    private zzrc zzfdh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbii(zzbkn zzbknVar, View view, zzbbw zzbbwVar, zzcvu zzcvuVar, int i) {
        super(zzbknVar);
        this.view = view;
        this.zzczi = zzbbwVar;
        this.zzfde = zzcvuVar;
        this.zzfdf = i;
    }

    public final zzcvu zzaet() {
        return zzcwi.zza(this.zzfet.zzgjd, this.zzfde);
    }

    public final View zzaeu() {
        return this.view;
    }

    public final int zzaer() {
        return this.zzfdf;
    }

    public final boolean zzyw() {
        zzbbw zzbbwVar = this.zzczi;
        return zzbbwVar != null && zzbbwVar.zzzp().zzyw();
    }

    public final boolean zzaev() {
        zzbbw zzbbwVar = this.zzczi;
        return zzbbwVar != null && zzbbwVar.zzzr();
    }

    public final void zza(zzqr zzqrVar) {
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null) {
            zzbbwVar.zza(zzqrVar);
        }
    }

    public final void zza(zzrc zzrcVar) {
        this.zzfdh = zzrcVar;
    }

    public final zzrc zzaew() {
        return this.zzfdh;
    }
}
