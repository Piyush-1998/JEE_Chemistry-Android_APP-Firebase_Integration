package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzakz extends zzakk {
    private final NativeContentAdMapper zzdek;

    public zzakz(NativeContentAdMapper nativeContentAdMapper) {
        this.zzdek = nativeContentAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final zzaba zzqo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final IObjectWrapper zzqp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final String getHeadline() {
        return this.zzdek.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdek.getImages();
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (NativeAd.Image image : images) {
                arrayList.add(new zzaau(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final String getBody() {
        return this.zzdek.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final zzabi zzqq() {
        NativeAd.Image logo = this.zzdek.getLogo();
        if (logo != null) {
            return new zzaau(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final String getCallToAction() {
        return this.zzdek.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final String getAdvertiser() {
        return this.zzdek.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void recordImpression() {
        this.zzdek.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzy(IObjectWrapper iObjectWrapper) {
        this.zzdek.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzz(IObjectWrapper iObjectWrapper) {
        this.zzdek.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdek.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzdek.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final boolean getOverrideImpressionRecording() {
        return this.zzdek.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final boolean getOverrideClickHandling() {
        return this.zzdek.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final Bundle getExtras() {
        return this.zzdek.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final IObjectWrapper zzry() {
        View adChoicesContent = this.zzdek.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final zzwr getVideoController() {
        if (this.zzdek.getVideoController() != null) {
            return this.zzdek.getVideoController().zzde();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final IObjectWrapper zzrz() {
        View zzaba = this.zzdek.zzaba();
        if (zzaba == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzaba);
    }
}
