package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zztx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztx> CREATOR = new zztz();
    public final Bundle extras;
    public final int versionCode;
    public final int zzabj;
    public final int zzabk;
    public final String zzabl;
    public final boolean zzbkg;
    @Deprecated
    public final long zzcbx;
    @Deprecated
    public final int zzcby;
    public final List<String> zzcbz;
    public final boolean zzcca;
    public final String zzccb;
    public final zzyf zzccc;
    public final String zzccd;
    public final Bundle zzcce;
    public final Bundle zzccf;
    public final List<String> zzccg;
    public final String zzcch;
    public final String zzcci;
    @Deprecated
    public final boolean zzccj;
    public final zztr zzcck;
    public final Location zzng;

    public zztx(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzyf zzyfVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zztr zztrVar, int i4, String str5) {
        this.versionCode = i;
        this.zzcbx = j;
        this.extras = bundle == null ? new Bundle() : bundle;
        this.zzcby = i2;
        this.zzcbz = list;
        this.zzcca = z;
        this.zzabj = i3;
        this.zzbkg = z2;
        this.zzccb = str;
        this.zzccc = zzyfVar;
        this.zzng = location;
        this.zzccd = str2;
        this.zzcce = bundle2 == null ? new Bundle() : bundle2;
        this.zzccf = bundle3;
        this.zzccg = list2;
        this.zzcch = str3;
        this.zzcci = str4;
        this.zzccj = z3;
        this.zzcck = zztrVar;
        this.zzabk = i4;
        this.zzabl = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, this.zzcbx);
        SafeParcelWriter.writeBundle(parcel, 3, this.extras, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzcby);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzcbz, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzcca);
        SafeParcelWriter.writeInt(parcel, 7, this.zzabj);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbkg);
        SafeParcelWriter.writeString(parcel, 9, this.zzccb, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzccc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzng, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzccd, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzcce, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzccf, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzccg, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzcch, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzcci, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzccj);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzcck, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzabk);
        SafeParcelWriter.writeString(parcel, 21, this.zzabl, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zztx) {
            zztx zztxVar = (zztx) obj;
            return this.versionCode == zztxVar.versionCode && this.zzcbx == zztxVar.zzcbx && Objects.equal(this.extras, zztxVar.extras) && this.zzcby == zztxVar.zzcby && Objects.equal(this.zzcbz, zztxVar.zzcbz) && this.zzcca == zztxVar.zzcca && this.zzabj == zztxVar.zzabj && this.zzbkg == zztxVar.zzbkg && Objects.equal(this.zzccb, zztxVar.zzccb) && Objects.equal(this.zzccc, zztxVar.zzccc) && Objects.equal(this.zzng, zztxVar.zzng) && Objects.equal(this.zzccd, zztxVar.zzccd) && Objects.equal(this.zzcce, zztxVar.zzcce) && Objects.equal(this.zzccf, zztxVar.zzccf) && Objects.equal(this.zzccg, zztxVar.zzccg) && Objects.equal(this.zzcch, zztxVar.zzcch) && Objects.equal(this.zzcci, zztxVar.zzcci) && this.zzccj == zztxVar.zzccj && this.zzabk == zztxVar.zzabk && Objects.equal(this.zzabl, zztxVar.zzabl);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.versionCode), Long.valueOf(this.zzcbx), this.extras, Integer.valueOf(this.zzcby), this.zzcbz, Boolean.valueOf(this.zzcca), Integer.valueOf(this.zzabj), Boolean.valueOf(this.zzbkg), this.zzccb, this.zzccc, this.zzng, this.zzccd, this.zzcce, this.zzccf, this.zzccg, this.zzcch, this.zzcci, Boolean.valueOf(this.zzccj), Integer.valueOf(this.zzabk), this.zzabl);
    }
}
