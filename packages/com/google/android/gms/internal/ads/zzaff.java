package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaff extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaff> CREATOR = new zzafe();
    public final byte[] data;
    public final int statusCode;
    public final boolean zzac;
    public final long zzad;
    public final String[] zzcyg;
    public final String[] zzcyh;
    public final boolean zzcyi;
    public final String zzcyj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaff(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zzcyi = z;
        this.zzcyj = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzcyg = strArr;
        this.zzcyh = strArr2;
        this.zzac = z2;
        this.zzad = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzcyi);
        SafeParcelWriter.writeString(parcel, 2, this.zzcyj, false);
        SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzcyg, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzcyh, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzac);
        SafeParcelWriter.writeLong(parcel, 8, this.zzad);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
