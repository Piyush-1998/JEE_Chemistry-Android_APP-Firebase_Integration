package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzkx implements Parcelable {
    public static final Parcelable.Creator<zzkx> CREATOR = new zzkw();
    private final zza[] zzazn;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public interface zza extends Parcelable {
    }

    public zzkx(List<? extends zza> list) {
        zza[] zzaVarArr = new zza[list.size()];
        this.zzazn = zzaVarArr;
        list.toArray(zzaVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkx(Parcel parcel) {
        this.zzazn = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaVarArr = this.zzazn;
            if (i >= zzaVarArr.length) {
                return;
            }
            zzaVarArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
            i++;
        }
    }

    public final int length() {
        return this.zzazn.length;
    }

    public final zza zzar(int i) {
        return this.zzazn[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzazn, ((zzkx) obj).zzazn);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzazn);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzazn.length);
        for (zza zzaVar : this.zzazn) {
            parcel.writeParcelable(zzaVar, 0);
        }
    }
}
