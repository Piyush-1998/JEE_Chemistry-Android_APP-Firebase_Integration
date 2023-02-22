package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbya implements zzaaw {
    private final /* synthetic */ zzbyb zzfpl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbya(zzbyb zzbybVar) {
        this.zzfpl = zzbybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzqk() {
        zzbuj zzbujVar;
        zzbujVar = this.zzfpl.zzfml;
        zzbujVar.zzfp(NativeCustomTemplateAd.ASSET_NAME_VIDEO);
    }
}
