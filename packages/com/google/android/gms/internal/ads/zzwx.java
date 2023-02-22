package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzwx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwx> CREATOR = new zzww();
    private final int zzcea;

    public zzwx(int i) {
        this.zzcea = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzcea);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
