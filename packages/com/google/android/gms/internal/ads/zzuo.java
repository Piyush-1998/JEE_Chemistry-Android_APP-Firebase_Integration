package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzuo extends zzus<zzwb> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzug zzcdf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuo(zzug zzugVar, Context context) {
        this.zzcdf = zzugVar;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    protected final /* synthetic */ zzwb zzoe() {
        zzug.zza(this.val$context, "mobile_ads_settings");
        return new zzxs();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzwb zzof() throws RemoteException {
        zzxn zzxnVar;
        zzxnVar = this.zzcdf.zzccw;
        return zzxnVar.zzi(this.val$context);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzwb zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zza(ObjectWrapper.wrap(this.val$context), 15601000);
    }
}
