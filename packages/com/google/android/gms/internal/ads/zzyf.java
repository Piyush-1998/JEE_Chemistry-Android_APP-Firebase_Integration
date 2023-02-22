package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzyf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyf> CREATOR = new zzye();
    public final String zzblu;

    public zzyf(SearchAdRequest searchAdRequest) {
        this.zzblu = searchAdRequest.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyf(String str) {
        this.zzblu = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zzblu, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
