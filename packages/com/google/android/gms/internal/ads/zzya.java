package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzya extends zzwp {
    private final OnAdMetadataChangedListener zzcfm;

    public zzya(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzcfm = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void onAdMetadataChanged() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.zzcfm;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
