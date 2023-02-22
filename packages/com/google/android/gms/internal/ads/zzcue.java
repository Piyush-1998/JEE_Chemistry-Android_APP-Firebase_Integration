package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmi;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcue<RequestComponentT extends zzbmi<AdT>, AdT> implements zzcud<RequestComponentT, AdT> {
    private RequestComponentT zzght;

    @Override // com.google.android.gms.internal.ads.zzcud
    public final zzddi<AdT> zza(zzbml<RequestComponentT> zzbmlVar, Executor executor) {
        RequestComponentT zzace = zzbmlVar.zzace();
        this.zzght = zzace;
        return zzace.zzaca().zzafs();
    }

    @Override // com.google.android.gms.internal.ads.zzcud
    public final /* synthetic */ Object zzamt() {
        return this.zzght;
    }
}
