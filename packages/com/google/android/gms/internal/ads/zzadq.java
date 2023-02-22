package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadq extends zzacs {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzcwu;

    public zzadq(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.zzcwu = onCustomTemplateAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzact
    public final void zzb(zzace zzaceVar) {
        this.zzcwu.onCustomTemplateAdLoaded(zzacj.zza(zzaceVar));
    }
}
