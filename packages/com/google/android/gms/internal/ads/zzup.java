package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzup extends zzus<zzve> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcdd;
    private final /* synthetic */ zzajx zzcde;
    private final /* synthetic */ zzug zzcdf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzup(zzug zzugVar, Context context, String str, zzajx zzajxVar) {
        this.zzcdf = zzugVar;
        this.val$context = context;
        this.zzcdd = str;
        this.zzcde = zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    protected final /* synthetic */ zzve zzoe() {
        zzug.zza(this.val$context, "native_ad");
        return new zzxm();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzve zzof() throws RemoteException {
        zzts zztsVar;
        zztsVar = this.zzcdf.zzccv;
        return zztsVar.zza(this.val$context, this.zzcdd, this.zzcde);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzve zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zza(ObjectWrapper.wrap(this.val$context), this.zzcdd, this.zzcde, 15601000);
    }
}
