package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzii {
    private final MediaCodec.CryptoInfo zzalx;
    private final MediaCodec.CryptoInfo.Pattern zzalz;

    private zzii(MediaCodec.CryptoInfo cryptoInfo) {
        this.zzalx = cryptoInfo;
        this.zzalz = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set(int i, int i2) {
        this.zzalz.set(i, i2);
        this.zzalx.setPattern(this.zzalz);
    }
}
