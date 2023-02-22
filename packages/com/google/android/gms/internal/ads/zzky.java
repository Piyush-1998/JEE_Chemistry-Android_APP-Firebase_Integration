package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzky extends zzle {
    public static final Parcelable.Creator<zzky> CREATOR = new zzla();
    private final String description;
    private final String mimeType;
    private final int zzazo;
    private final byte[] zzazp;

    public zzky(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = null;
        this.zzazo = 3;
        this.zzazp = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzky(Parcel parcel) {
        super("APIC");
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.zzazo = parcel.readInt();
        this.zzazp = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzky zzkyVar = (zzky) obj;
            if (this.zzazo == zzkyVar.zzazo && zzof.zza(this.mimeType, zzkyVar.mimeType) && zzof.zza(this.description, zzkyVar.description) && Arrays.equals(this.zzazp, zzkyVar.zzazp)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzazo + 527) * 31;
        String str = this.mimeType;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzazp);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.zzazo);
        parcel.writeByteArray(this.zzazp);
    }
}
