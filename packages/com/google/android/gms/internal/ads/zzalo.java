package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzalo extends zzakp {
    private final UnifiedNativeAdMapper zzdep;

    public zzalo(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzdep = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final zzaba zzqo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final String getHeadline() {
        return this.zzdep.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdep.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzaau(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final String getBody() {
        return this.zzdep.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final zzabi zzqn() {
        NativeAd.Image icon = this.zzdep.getIcon();
        if (icon != null) {
            return new zzaau(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final String getCallToAction() {
        return this.zzdep.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final String getAdvertiser() {
        return this.zzdep.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final double getStarRating() {
        if (this.zzdep.getStarRating() != null) {
            return this.zzdep.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final String getStore() {
        return this.zzdep.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final String getPrice() {
        return this.zzdep.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final zzwr getVideoController() {
        if (this.zzdep.getVideoController() != null) {
            return this.zzdep.getVideoController().zzde();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final IObjectWrapper zzry() {
        View adChoicesContent = this.zzdep.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final IObjectWrapper zzrz() {
        View zzaba = this.zzdep.zzaba();
        if (zzaba == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzaba);
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final float getMediaContentAspectRatio() {
        return this.zzdep.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final IObjectWrapper zzqp() {
        Object zzji = this.zzdep.zzji();
        if (zzji == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzji);
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final Bundle getExtras() {
        return this.zzdep.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final boolean getOverrideImpressionRecording() {
        return this.zzdep.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final boolean getOverrideClickHandling() {
        return this.zzdep.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final void recordImpression() {
        this.zzdep.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final void zzy(IObjectWrapper iObjectWrapper) {
        this.zzdep.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdep.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzdep.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
