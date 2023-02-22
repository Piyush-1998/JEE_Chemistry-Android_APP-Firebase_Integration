package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzczo> CREATOR = new zzczr();
    private final int versionCode;
    private final byte[] zzgoe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzczo(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzgoe = bArr;
    }

    public zzczo(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzgoe, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
