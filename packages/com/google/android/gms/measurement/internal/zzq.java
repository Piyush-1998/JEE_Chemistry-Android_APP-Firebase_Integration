package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzt();
    public boolean active;
    public long creationTimestamp;
    public String origin;
    public String packageName;
    public long timeToLive;
    public String triggerEventName;
    public long triggerTimeout;
    public zzjn zzdw;
    public zzai zzdx;
    public zzai zzdy;
    public zzai zzdz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(zzq zzqVar) {
        Preconditions.checkNotNull(zzqVar);
        this.packageName = zzqVar.packageName;
        this.origin = zzqVar.origin;
        this.zzdw = zzqVar.zzdw;
        this.creationTimestamp = zzqVar.creationTimestamp;
        this.active = zzqVar.active;
        this.triggerEventName = zzqVar.triggerEventName;
        this.zzdx = zzqVar.zzdx;
        this.triggerTimeout = zzqVar.triggerTimeout;
        this.zzdy = zzqVar.zzdy;
        this.timeToLive = zzqVar.timeToLive;
        this.zzdz = zzqVar.zzdz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(String str, String str2, zzjn zzjnVar, long j, boolean z, String str3, zzai zzaiVar, long j2, zzai zzaiVar2, long j3, zzai zzaiVar3) {
        this.packageName = str;
        this.origin = str2;
        this.zzdw = zzjnVar;
        this.creationTimestamp = j;
        this.active = z;
        this.triggerEventName = str3;
        this.zzdx = zzaiVar;
        this.triggerTimeout = j2;
        this.zzdy = zzaiVar2;
        this.timeToLive = j3;
        this.zzdz = zzaiVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.origin, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzdw, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.creationTimestamp);
        SafeParcelWriter.writeBoolean(parcel, 6, this.active);
        SafeParcelWriter.writeString(parcel, 7, this.triggerEventName, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzdx, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.triggerTimeout);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzdy, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.timeToLive);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzdz, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
