package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafz implements AdapterStatus {
    private final String description;
    private final int zzcyp;
    private final AdapterStatus.State zzcyr;

    public zzafz(AdapterStatus.State state, String str, int i) {
        this.zzcyr = state;
        this.description = str;
        this.zzcyp = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.zzcyr;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.description;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzcyp;
    }
}
