package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzada;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzuc;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzvt;
import com.google.android.gms.internal.ads.zzyh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
    private final boolean zzbkg;
    private final zzvt zzbkh;
    private AppEventListener zzbki;
    private final IBinder zzbkj;

    private PublisherAdViewOptions(Builder builder) {
        this.zzbkg = builder.zzbkg;
        AppEventListener appEventListener = builder.zzbki;
        this.zzbki = appEventListener;
        this.zzbkh = appEventListener != null ? new zzuc(this.zzbki) : null;
        this.zzbkj = builder.zzbkk != null ? new zzyh(builder.zzbkk) : null;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zzbkg = false;
        private AppEventListener zzbki;
        private ShouldDelayBannerRenderingListener zzbkk;

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbkg = z;
            return this;
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzbki = appEventListener;
            return this;
        }

        public final Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzbkk = shouldDelayBannerRenderingListener;
            return this;
        }

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.zzbkg = z;
        this.zzbkh = iBinder != null ? zzvs.zze(iBinder) : null;
        this.zzbkj = iBinder2;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbki;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbkg;
    }

    public final zzvt zzjg() {
        return this.zzbkh;
    }

    public final zzada zzjh() {
        return zzadd.zzw(this.zzbkj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        zzvt zzvtVar = this.zzbkh;
        SafeParcelWriter.writeIBinder(parcel, 2, zzvtVar == null ? null : zzvtVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzbkj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
