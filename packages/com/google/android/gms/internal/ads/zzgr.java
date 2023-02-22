package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzgr implements Parcelable.Creator<zzgo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzgo[] newArray(int i) {
        return new zzgo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzgo createFromParcel(Parcel parcel) {
        return new zzgo(parcel);
    }
}
