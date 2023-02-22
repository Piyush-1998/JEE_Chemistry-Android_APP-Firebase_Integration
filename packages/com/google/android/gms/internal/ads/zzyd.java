package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzyc();
    private final int zzabj;
    private final int zzabk;

    public zzyd(int i, int i2) {
        this.zzabj = i;
        this.zzabk = i2;
    }

    public zzyd(RequestConfiguration requestConfiguration) {
        this.zzabj = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzabk = requestConfiguration.getTagForUnderAgeOfConsent();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzabj);
        SafeParcelWriter.writeInt(parcel, 2, this.zzabk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
