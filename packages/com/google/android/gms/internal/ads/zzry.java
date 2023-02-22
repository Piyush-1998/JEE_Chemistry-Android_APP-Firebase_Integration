package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzry extends zzaxv<InputStream> {
    private final /* synthetic */ zzrv zzbrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzry(zzrv zzrvVar) {
        this.zzbrs = zzrvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxv, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zzbrs.disconnect();
        return super.cancel(z);
    }
}
