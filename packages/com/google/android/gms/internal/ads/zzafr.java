package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafr> CREATOR = new zzafq();
    public final String description;
    public final String zzcyn;
    public final boolean zzcyo;
    public final int zzcyp;

    public zzafr(String str, boolean z, int i, String str2) {
        this.zzcyn = str;
        this.zzcyo = z;
        this.zzcyp = i;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzcyn, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzcyo);
        SafeParcelWriter.writeInt(parcel, 3, this.zzcyp);
        SafeParcelWriter.writeString(parcel, 4, this.description, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
