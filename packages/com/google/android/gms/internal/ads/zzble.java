package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzble implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzbnr zzffv;
    private AtomicBoolean zzffw = new AtomicBoolean(false);

    public zzble(zzbnr zzbnrVar) {
        this.zzffv = zzbnrVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsi() {
        this.zzffw.set(true);
        this.zzffv.onAdClosed();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsj() {
        this.zzffv.onAdOpened();
    }

    public final boolean isClosed() {
        return this.zzffw.get();
    }
}
