package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxj extends zzafx {
    private final OnInitializationCompleteListener zzcfc;
    private final /* synthetic */ zzxc zzcfd;

    private zzxj(zzxc zzxcVar, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zzcfd = zzxcVar;
        this.zzcfc = onInitializationCompleteListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafu
    public final void zzc(List<zzafr> list) throws RemoteException {
        InitializationStatus zzb;
        OnInitializationCompleteListener onInitializationCompleteListener = this.zzcfc;
        zzxc zzxcVar = this.zzcfd;
        zzb = zzxc.zzb(list);
        onInitializationCompleteListener.onInitializationComplete(zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzxj(zzxc zzxcVar, OnInitializationCompleteListener onInitializationCompleteListener, zzxg zzxgVar) {
        this(zzxcVar, onInitializationCompleteListener);
    }
}
