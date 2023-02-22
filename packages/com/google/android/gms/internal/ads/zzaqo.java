package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaqo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqo> CREATOR = new zzaqn();
    public final String zzbqy;
    public final zztx zzdiu;

    public zzaqo(zztx zztxVar, String str) {
        this.zzdiu = zztxVar;
        this.zzbqy = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdiu, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbqy, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
