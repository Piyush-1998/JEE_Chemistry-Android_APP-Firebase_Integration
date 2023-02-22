package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnx implements zzcrr<Bundle> {
    private final String zzabd;
    private final zzua zzbll;
    private final float zzbog;
    private final boolean zzcco;
    private final int zzdgn;
    private final int zzdgo;
    private final String zzgea;
    private final String zzgeb;

    public zzcnx(zzua zzuaVar, String str, boolean z, String str2, float f, int i, int i2, String str3) {
        Preconditions.checkNotNull(zzuaVar, "the adSize must not be null");
        this.zzbll = zzuaVar;
        this.zzabd = str;
        this.zzcco = z;
        this.zzgea = str2;
        this.zzbog = f;
        this.zzdgn = i;
        this.zzdgo = i2;
        this.zzgeb = str3;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        String str;
        zzua[] zzuaVarArr;
        Bundle bundle2 = bundle;
        zzcwk.zza(bundle2, "smart_w", "full", this.zzbll.width == -1);
        zzcwk.zza(bundle2, "smart_h", "auto", this.zzbll.height == -2);
        zzcwk.zza(bundle2, "ene", (Boolean) true, this.zzbll.zzccp);
        zzcwk.zza(bundle2, "rafmt", "102", this.zzbll.zzccs);
        zzcwk.zza(bundle2, "format", this.zzabd);
        zzcwk.zza(bundle2, "fluid", "height", this.zzcco);
        zzcwk.zza(bundle2, "sz", this.zzgea, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.zzbog);
        bundle2.putInt("sw", this.zzdgn);
        bundle2.putInt("sh", this.zzdgo);
        String str2 = this.zzgeb;
        zzcwk.zza(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (this.zzbll.zzccn == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.zzbll.height);
            bundle3.putInt("width", this.zzbll.width);
            bundle3.putBoolean("is_fluid_height", this.zzbll.zzcco);
            arrayList.add(bundle3);
        } else {
            for (zzua zzuaVar : this.zzbll.zzccn) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", zzuaVar.zzcco);
                bundle4.putInt("height", zzuaVar.height);
                bundle4.putInt("width", zzuaVar.width);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
