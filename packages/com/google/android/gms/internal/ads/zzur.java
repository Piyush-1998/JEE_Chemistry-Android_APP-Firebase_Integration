package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzur extends zzus<zzabm> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzug zzcdf;
    private final /* synthetic */ FrameLayout zzcdk;
    private final /* synthetic */ FrameLayout zzcdl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzur(zzug zzugVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzcdf = zzugVar;
        this.zzcdk = frameLayout;
        this.zzcdl = frameLayout2;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    protected final /* synthetic */ zzabm zzoe() {
        zzug.zza(this.val$context, "native_ad_view_delegate");
        return new zzxu();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzabm zzof() throws RemoteException {
        zzadn zzadnVar;
        zzadnVar = this.zzcdf.zzccx;
        return zzadnVar.zzb(this.val$context, this.zzcdk, this.zzcdl);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* synthetic */ zzabm zza(zzvu zzvuVar) throws RemoteException {
        return zzvuVar.zzc(ObjectWrapper.wrap(this.zzcdk), ObjectWrapper.wrap(this.zzcdl));
    }
}
