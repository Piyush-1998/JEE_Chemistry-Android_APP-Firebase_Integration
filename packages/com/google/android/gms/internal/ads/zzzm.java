package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.consent.ConsentSdkUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzm extends zzze {
    private final ConsentSdkUtil.ConsentInformationCallback zzcua;

    public zzzm(ConsentSdkUtil.ConsentInformationCallback consentInformationCallback) {
        this.zzcua = consentInformationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void onSuccess(String str) {
        this.zzcua.onSuccess(str);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void onFailure(int i) {
        this.zzcua.onFailure(i);
    }
}
