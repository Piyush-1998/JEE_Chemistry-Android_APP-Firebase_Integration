package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafd> CREATOR = new zzafc();
    private final String url;
    private final String[] zzcyg;
    private final String[] zzcyh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafd(String str, String[] strArr, String[] strArr2) {
        this.url = str;
        this.zzcyg = strArr;
        this.zzcyh = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzcyg, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzcyh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzafd zzh(zzq<?> zzqVar) throws zzb {
        Map<String, String> headers = zzqVar.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new zzafd(zzqVar.getUrl(), strArr, strArr2);
    }
}
