package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyn implements zzdcz<zzbbw> {
    private final /* synthetic */ String zzfpv;
    private final /* synthetic */ Map zzfpw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyn(zzbyh zzbyhVar, String str, Map map) {
        this.zzfpv = str;
        this.zzfpw = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(zzbbw zzbbwVar) {
        zzbbwVar.zza(this.zzfpv, this.zzfpw);
    }
}
