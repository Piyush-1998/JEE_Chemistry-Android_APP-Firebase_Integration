package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zztr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztr> CREATOR = new zztq();
    public final String zzcbt;
    public final String zzcbu;

    public zztr(String str, String str2) {
        this.zzcbt = str;
        this.zzcbu = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzcbt, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzcbu, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
