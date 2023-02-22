package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class zzjn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjn> CREATOR = new zzjq();
    public final String name;
    public final String origin;
    private final int versionCode;
    public final String zzkr;
    public final long zztr;
    public final Long zzts;
    private final Float zztt;
    public final Double zztu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(zzjp zzjpVar) {
        this(zzjpVar.name, zzjpVar.zztr, zzjpVar.value, zzjpVar.origin);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.versionCode = 2;
        this.name = str;
        this.zztr = j;
        this.origin = str2;
        if (obj == null) {
            this.zzts = null;
            this.zztt = null;
            this.zztu = null;
            this.zzkr = null;
        } else if (obj instanceof Long) {
            this.zzts = (Long) obj;
            this.zztt = null;
            this.zztu = null;
            this.zzkr = null;
        } else if (obj instanceof String) {
            this.zzts = null;
            this.zztt = null;
            this.zztu = null;
            this.zzkr = (String) obj;
        } else if (obj instanceof Double) {
            this.zzts = null;
            this.zztt = null;
            this.zztu = (Double) obj;
            this.zzkr = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(String str, long j, String str2) {
        Preconditions.checkNotEmpty(str);
        this.versionCode = 2;
        this.name = str;
        this.zztr = 0L;
        this.zzts = null;
        this.zztt = null;
        this.zztu = null;
        this.zzkr = null;
        this.origin = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.versionCode = i;
        this.name = str;
        this.zztr = j;
        this.zzts = l;
        this.zztt = null;
        if (i == 1) {
            this.zztu = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.zztu = d;
        }
        this.zzkr = str2;
        this.origin = str3;
    }

    public final Object getValue() {
        Long l = this.zzts;
        if (l != null) {
            return l;
        }
        Double d = this.zztu;
        if (d != null) {
            return d;
        }
        String str = this.zzkr;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zztr);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzts, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzkr, false);
        SafeParcelWriter.writeString(parcel, 7, this.origin, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zztu, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
