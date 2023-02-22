package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaop extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaop> CREATOR = new zzaos();
    public final boolean zzdlt;
    public final List<String> zzdlu;

    public zzaop() {
        this(false, Collections.emptyList());
    }

    public zzaop(boolean z, List<String> list) {
        this.zzdlt = z;
        this.zzdlu = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdlt);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzdlu, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
