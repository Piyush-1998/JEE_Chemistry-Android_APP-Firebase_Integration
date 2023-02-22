package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzui extends zzus<zzara> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcdd;
    private final /* synthetic */ zzajx zzcde;
    private final /* synthetic */ zzug zzcdf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzui(zzug zzugVar, Context context, String str, zzajx zzajxVar) {
        this.zzcdf = zzugVar;
        this.val$context = context;
        this.zzcdd = str;
        this.zzcde = zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    protected final /* synthetic */ zzara zzoe() {
        zzug.zza(this.val$context, "rewarded");
        return new zzxw();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzara zzof() throws RemoteException {
        return zzarq.zzd(this.val$context, this.zzcdd, this.zzcde);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzara zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzcdd, this.zzcde, 15601000);
    }
}
