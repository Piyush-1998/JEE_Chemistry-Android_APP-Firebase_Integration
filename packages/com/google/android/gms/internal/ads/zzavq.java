package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzavq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavq> CREATOR = new zzavs();
    public final int errorCode;
    public final String zzdtw;

    public static zzavq zza(Throwable th, int i) {
        return new zzavq(th.getMessage(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavq(String str, int i) {
        this.zzdtw = str == null ? "" : str;
        this.errorCode = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdtw, false);
        SafeParcelWriter.writeInt(parcel, 2, this.errorCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
