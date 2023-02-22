package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcno implements zzcrr<Bundle> {
    private final zzua zzbll;
    private final List<Parcelable> zzgdw;
    private final Context zzlk;

    public zzcno(Context context, zzua zzuaVar, List<Parcelable> list) {
        this.zzlk = context;
        this.zzbll = zzuaVar;
        this.zzgdw = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcrr
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        com.google.android.gms.ads.internal.zzq.zzkj();
        bundle2.putString("activity", zzaul.zzat(this.zzlk));
        Bundle bundle3 = new Bundle();
        bundle3.putInt("width", this.zzbll.width);
        bundle3.putInt("height", this.zzbll.height);
        bundle2.putBundle("size", bundle3);
        if (this.zzgdw.size() > 0) {
            List<Parcelable> list = this.zzgdw;
            bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
    }
}
