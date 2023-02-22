package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzapg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzapg> CREATOR = new zzapf();
    String zzdmd;

    public zzapg(String str) {
        this.zzdmd = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdmd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
