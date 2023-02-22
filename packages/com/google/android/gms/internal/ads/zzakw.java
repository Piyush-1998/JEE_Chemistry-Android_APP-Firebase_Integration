package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzakw extends zzakj {
    private final NativeAppInstallAdMapper zzdef;

    public zzakw(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzdef = nativeAppInstallAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final zzaba zzqo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final IObjectWrapper zzqp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String getHeadline() {
        return this.zzdef.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdef.getImages();
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (NativeAd.Image image : images) {
                arrayList.add(new zzaau(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String getBody() {
        return this.zzdef.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final zzabi zzqn() {
        NativeAd.Image icon = this.zzdef.getIcon();
        if (icon != null) {
            return new zzaau(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String getCallToAction() {
        return this.zzdef.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final double getStarRating() {
        return this.zzdef.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String getStore() {
        return this.zzdef.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String getPrice() {
        return this.zzdef.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void recordImpression() {
        this.zzdef.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzy(IObjectWrapper iObjectWrapper) {
        this.zzdef.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzz(IObjectWrapper iObjectWrapper) {
        this.zzdef.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdef.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzdef.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final boolean getOverrideImpressionRecording() {
        return this.zzdef.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final boolean getOverrideClickHandling() {
        return this.zzdef.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final Bundle getExtras() {
        return this.zzdef.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final zzwr getVideoController() {
        if (this.zzdef.getVideoController() != null) {
            return this.zzdef.getVideoController().zzde();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final IObjectWrapper zzry() {
        View adChoicesContent = this.zzdef.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final IObjectWrapper zzrz() {
        View zzaba = this.zzdef.zzaba();
        if (zzaba == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzaba);
    }
}
