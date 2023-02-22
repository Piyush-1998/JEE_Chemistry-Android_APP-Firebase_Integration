package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzyj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyj> CREATOR = new zzyi();
    public final boolean zzabp;
    public final boolean zzabq;
    public final boolean zzabr;

    public zzyj(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public zzyj(boolean z, boolean z2, boolean z3) {
        this.zzabp = z;
        this.zzabq = z2;
        this.zzabr = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzabp);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzabq);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzabr);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
