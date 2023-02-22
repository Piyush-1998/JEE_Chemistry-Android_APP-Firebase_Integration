package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzadk implements UnifiedNativeAd.MediaContent {
    private final zzabh zzcwp;

    public zzadk(zzabh zzabhVar) {
        this.zzcwp = zzabhVar;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zzcwp.getAspectRatio();
        } catch (RemoteException unused) {
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.zzcwp.zzt(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.MediaContent
    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzql = this.zzcwp.zzql();
            if (zzql != null) {
                return (Drawable) ObjectWrapper.unwrap(zzql);
            }
            return null;
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    public final zzabh zzqy() {
        return this.zzcwp;
    }
}
