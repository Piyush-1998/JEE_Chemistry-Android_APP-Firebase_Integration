package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzum extends zzus<zzvl> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcdd;
    private final /* synthetic */ zzajx zzcde;
    private final /* synthetic */ zzug zzcdf;
    private final /* synthetic */ zzua zzcdg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzum(zzug zzugVar, Context context, zzua zzuaVar, String str, zzajx zzajxVar) {
        this.zzcdf = zzugVar;
        this.val$context = context;
        this.zzcdg = zzuaVar;
        this.zzcdd = str;
        this.zzcde = zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzvl zzoe() {
        zzug.zza(this.val$context, "interstitial");
        return new zzxq();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzvl zzof() throws RemoteException {
        zztv zztvVar;
        zztvVar = this.zzcdf.zzccu;
        return zztvVar.zza(this.val$context, this.zzcdg, this.zzcdd, this.zzcde, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzvl zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzcdg, this.zzcdd, this.zzcde, 15601000);
    }
}
