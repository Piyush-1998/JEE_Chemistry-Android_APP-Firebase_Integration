package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbvk implements zzaaw {
    private final /* synthetic */ zzbvz zzfmz;
    private final /* synthetic */ ViewGroup zzfna;
    private final /* synthetic */ zzbvj zzfnb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvk(zzbvj zzbvjVar, zzbvz zzbvzVar, ViewGroup viewGroup) {
        this.zzfnb = zzbvjVar;
        this.zzfmz = zzbvzVar;
        this.zzfna = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzqk() {
        boolean zza;
        zzbvj zzbvjVar = this.zzfnb;
        zza = zzbvj.zza(this.zzfmz, zzbvh.zzfmp);
        if (zza) {
            this.zzfmz.onClick(this.zzfna);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(MotionEvent motionEvent) {
        this.zzfmz.onTouch(null, motionEvent);
    }
}
