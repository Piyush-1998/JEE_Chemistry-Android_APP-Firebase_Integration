package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzuq extends zzus<zzabt> {
    private final /* synthetic */ zzug zzcdf;
    private final /* synthetic */ View zzcdh;
    private final /* synthetic */ HashMap zzcdi;
    private final /* synthetic */ HashMap zzcdj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuq(zzug zzugVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzcdf = zzugVar;
        this.zzcdh = view;
        this.zzcdi = hashMap;
        this.zzcdj = hashMap2;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    protected final /* synthetic */ zzabt zzoe() {
        zzug.zza(this.zzcdh.getContext(), "native_ad_view_holder_delegate");
        return new zzxx();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzabt zzof() throws RemoteException {
        zzadm zzadmVar;
        zzadmVar = this.zzcdf.zzcdb;
        return zzadmVar.zzb(this.zzcdh, this.zzcdi, this.zzcdj);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzabt zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zza(ObjectWrapper.wrap(this.zzcdh), ObjectWrapper.wrap(this.zzcdi), ObjectWrapper.wrap(this.zzcdj));
    }
}
