package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcaa implements zzbnm {
    private final zzbbw zzczi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcaa(zzbbw zzbbwVar) {
        this.zzczi = ((Boolean) zzuv.zzon().zzd(zzza.zzckg)).booleanValue() ? zzbbwVar : null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbu(Context context) {
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null) {
            zzbbwVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbv(Context context) {
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null) {
            zzbbwVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzbw(Context context) {
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null) {
            zzbbwVar.destroy();
        }
    }
}
