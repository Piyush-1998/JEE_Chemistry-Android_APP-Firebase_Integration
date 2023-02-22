package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzut extends zzus<zzaqb> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzajx zzcde;
    private final /* synthetic */ zzug zzcdf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzut(zzug zzugVar, Context context, zzajx zzajxVar) {
        this.zzcdf = zzugVar;
        this.val$context = context;
        this.zzcde = zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    protected final /* synthetic */ zzaqb zzoe() {
        zzug.zza(this.val$context, "rewarded_video");
        return new zzxy();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzaqb zzof() throws RemoteException {
        zzaqm zzaqmVar;
        zzaqmVar = this.zzcdf.zzccy;
        return zzaqmVar.zza(this.val$context, this.zzcde);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzaqb zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zza(ObjectWrapper.wrap(this.val$context), this.zzcde, 15601000);
    }
}
