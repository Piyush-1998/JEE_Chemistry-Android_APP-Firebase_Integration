package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzj();
    public final boolean zzbkw;
    public final boolean zzbkx;
    private final String zzbky;
    public final boolean zzbkz;
    public final float zzbla;
    public final int zzblb;
    public final boolean zzblc;
    public final boolean zzbld;
    public final boolean zzble;

    public zzg(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(false, z2, null, false, 0.0f, -1, z4, z5, z6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zzbkw = z;
        this.zzbkx = z2;
        this.zzbky = str;
        this.zzbkz = z3;
        this.zzbla = f;
        this.zzblb = i;
        this.zzblc = z4;
        this.zzbld = z5;
        this.zzble = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbkw);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbkx);
        SafeParcelWriter.writeString(parcel, 4, this.zzbky, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzbkz);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzbla);
        SafeParcelWriter.writeInt(parcel, 7, this.zzblb);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzblc);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbld);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzble);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
