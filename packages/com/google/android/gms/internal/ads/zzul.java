package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzul extends zzus<zzano> {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzug zzcdf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzul(zzug zzugVar, Activity activity) {
        this.zzcdf = zzugVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    protected final /* synthetic */ zzano zzoe() {
        zzug.zza(this.val$activity, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzano zzof() throws RemoteException {
        zzanm zzanmVar;
        zzanmVar = this.zzcdf.zzcda;
        return zzanmVar.zzc(this.val$activity);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzano zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zzf(ObjectWrapper.wrap(this.val$activity));
    }
}
