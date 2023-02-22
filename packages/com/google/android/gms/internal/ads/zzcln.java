package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcln implements com.google.android.gms.ads.internal.zze {
    private final /* synthetic */ zzbru zzgbe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcln(zzcli zzcliVar, zzbru zzbruVar) {
        this.zzgbe = zzbruVar;
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzg(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjl() {
        this.zzgbe.zzach().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjm() {
        this.zzgbe.zzaci().onAdImpression();
        this.zzgbe.zzacj().zzagq();
    }
}
