package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzauv extends zzauw {
    @Override // com.google.android.gms.internal.ads.zzaur
    public final int zzvq() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public final long zzvu() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcnt)).booleanValue()) {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return -1L;
    }
}
