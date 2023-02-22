package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzape extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzape> CREATOR = new zzapd();
    public final ApplicationInfo applicationInfo;
    public final String packageName;
    public final zzaxl zzdio;
    public final PackageInfo zzdiv;
    public final List<String> zzdjf;
    public final String zzdjp;
    public final Bundle zzdma;
    public final boolean zzdmb;
    public final String zzdmc;

    public zzape(Bundle bundle, zzaxl zzaxlVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.zzdma = bundle;
        this.zzdio = zzaxlVar;
        this.packageName = str;
        this.applicationInfo = applicationInfo;
        this.zzdjf = list;
        this.zzdiv = packageInfo;
        this.zzdjp = str2;
        this.zzdmb = z;
        this.zzdmc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzdma, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdio, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzdjf, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdiv, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdjp, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdmb);
        SafeParcelWriter.writeString(parcel, 9, this.zzdmc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
