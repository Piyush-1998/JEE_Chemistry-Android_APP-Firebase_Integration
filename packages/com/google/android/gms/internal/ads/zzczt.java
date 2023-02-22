package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzczt> CREATOR = new zzczs();
    private final String packageName;
    private final int versionCode;
    private final String zzgof;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzczt(int i, String str, String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzgof = str2;
    }

    public zzczt(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzgof, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
