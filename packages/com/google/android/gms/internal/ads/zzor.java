package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzor implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzoq zzbin;

    private zzor(zzoq zzoqVar, MediaCodec mediaCodec) {
        this.zzbin = zzoqVar;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this != this.zzbin.zzbik) {
            return;
        }
        this.zzbin.zziv();
    }
}
