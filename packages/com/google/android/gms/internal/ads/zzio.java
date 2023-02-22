package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzin;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzio implements Parcelable.Creator<zzin.zza> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzin.zza[] newArray(int i) {
        return new zzin.zza[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzin.zza createFromParcel(Parcel parcel) {
        return new zzin.zza(parcel);
    }
}
