package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaay> CREATOR = new zzabb();
    public final int versionCode;
    public final int zzbjv;
    public final int zzbjw;
    public final boolean zzbjx;
    public final int zzbjy;
    public final boolean zzbka;
    public final boolean zzcvz;
    public final zzyj zzcwa;

    public zzaay(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzyj(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzje(), nativeAdOptions.getMediaAspectRatio());
    }

    public zzaay(int i, boolean z, int i2, boolean z2, int i3, zzyj zzyjVar, boolean z3, int i4) {
        this.versionCode = i;
        this.zzcvz = z;
        this.zzbjv = i2;
        this.zzbjx = z2;
        this.zzbjy = i3;
        this.zzcwa = zzyjVar;
        this.zzbka = z3;
        this.zzbjw = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzcvz);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbjv);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbjx);
        SafeParcelWriter.writeInt(parcel, 5, this.zzbjy);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzcwa, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzbka);
        SafeParcelWriter.writeInt(parcel, 8, this.zzbjw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
