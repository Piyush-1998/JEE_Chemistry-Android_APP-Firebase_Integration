package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrp> CREATOR = new zzrs();
    public final String url;
    private final long zzbri;
    private final String zzbrj;
    private final String zzbrk;
    private final String zzbrl;
    private final Bundle zzbrm;
    public final boolean zzbrn;
    public long zzbro;

    public static zzrp zzbt(String str) {
        return zze(Uri.parse(str));
    }

    public static zzrp zze(Uri uri) {
        try {
            if ("gcache".equals(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    int size = pathSegments.size();
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Expected 2 path parts for namespace and id, found :");
                    sb.append(size);
                    zzaug.zzeu(sb.toString());
                    return null;
                }
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                String host = uri.getHost();
                String queryParameter = uri.getQueryParameter(ImagesContract.URL);
                boolean equals = "1".equals(uri.getQueryParameter("read_only"));
                String queryParameter2 = uri.getQueryParameter("expiration");
                long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
                Bundle bundle = new Bundle();
                com.google.android.gms.ads.internal.zzq.zzkl();
                for (String str3 : uri.getQueryParameterNames()) {
                    if (str3.startsWith("tag.")) {
                        bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                    }
                }
                return new zzrp(queryParameter, parseLong, host, str, str2, bundle, equals, 0L);
            }
            return null;
        } catch (NullPointerException | NumberFormatException e) {
            zzaug.zzd("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrp(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.url = str;
        this.zzbri = j;
        this.zzbrj = str2 == null ? "" : str2;
        this.zzbrk = str3 == null ? "" : str3;
        this.zzbrl = str4 == null ? "" : str4;
        this.zzbrm = bundle == null ? new Bundle() : bundle;
        this.zzbrn = z;
        this.zzbro = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.url, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzbri);
        SafeParcelWriter.writeString(parcel, 4, this.zzbrj, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbrk, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzbrl, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzbrm, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbrn);
        SafeParcelWriter.writeLong(parcel, 9, this.zzbro);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
