package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.internal.ads.zzaax;
import com.google.android.gms.internal.ads.zzaaz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private UnifiedNativeAd.MediaContent zzbjo;
    private boolean zzbjp;
    private zzaax zzbjq;
    private ImageView.ScaleType zzbjr;
    private boolean zzbjs;
    private zzaaz zzbjt;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMediaContent(UnifiedNativeAd.MediaContent mediaContent) {
        this.zzbjp = true;
        this.zzbjo = mediaContent;
        zzaax zzaaxVar = this.zzbjq;
        if (zzaaxVar != null) {
            zzaaxVar.setMediaContent(mediaContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzaax zzaaxVar) {
        this.zzbjq = zzaaxVar;
        if (this.zzbjp) {
            zzaaxVar.setMediaContent(this.zzbjo);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbjs = true;
        this.zzbjr = scaleType;
        zzaaz zzaazVar = this.zzbjt;
        if (zzaazVar != null) {
            zzaazVar.setImageScaleType(scaleType);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzaaz zzaazVar) {
        this.zzbjt = zzaazVar;
        if (this.zzbjs) {
            zzaazVar.setImageScaleType(this.zzbjr);
        }
    }
}
