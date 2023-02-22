package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzku implements zzks {
    private final int zzazl;
    private MediaCodecInfo[] zzazm;

    public zzku(boolean z) {
        this.zzazl = z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean zzgx() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final int getCodecCount() {
        zzgy();
        return this.zzazm.length;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final MediaCodecInfo getCodecInfoAt(int i) {
        zzgy();
        return this.zzazm[i];
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final void zzgy() {
        if (this.zzazm == null) {
            this.zzazm = new MediaCodecList(this.zzazl).getCodecInfos();
        }
    }
}
