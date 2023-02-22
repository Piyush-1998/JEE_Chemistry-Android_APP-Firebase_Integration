package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzarr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarr> CREATOR = new zzaru();
    public final String zzdnz;
    public final String zzdoa;

    public zzarr(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public zzarr(String str, String str2) {
        this.zzdnz = str;
        this.zzdoa = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdnz, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzdoa, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
