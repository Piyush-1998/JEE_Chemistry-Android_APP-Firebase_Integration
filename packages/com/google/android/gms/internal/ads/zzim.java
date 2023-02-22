package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzim implements Parcelable.Creator<zzin> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzin[] newArray(int i) {
        return new zzin[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzin createFromParcel(Parcel parcel) {
        return new zzin(parcel);
    }
}
