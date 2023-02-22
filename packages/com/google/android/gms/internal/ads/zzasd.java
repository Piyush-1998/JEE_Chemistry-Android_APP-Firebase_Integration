package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzasd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasd> CREATOR = new zzasg();
    public final String zzdow;
    public final String zzdox;
    public final boolean zzdoy;
    public final boolean zzdoz;
    public final List<String> zzdpa;
    public final boolean zzdpb;
    public final boolean zzdpc;
    public final List<String> zzdpd;

    public zzasd(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.zzdow = str;
        this.zzdox = str2;
        this.zzdoy = z;
        this.zzdoz = z2;
        this.zzdpa = list;
        this.zzdpb = z3;
        this.zzdpc = z4;
        this.zzdpd = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzasd zzg(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzasd(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzawg.zza(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzawg.zza(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdow, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdox, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdoy);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdoz);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdpa, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzdpb);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdpc);
        SafeParcelWriter.writeStringList(parcel, 9, this.zzdpd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
