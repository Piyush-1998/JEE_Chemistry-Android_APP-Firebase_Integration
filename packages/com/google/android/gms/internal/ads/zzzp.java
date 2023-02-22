package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzzp extends zzzj {
    private zzzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzr(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zza(Bundle bundle, zzzf zzzfVar) throws RemoteException {
        zzzfVar.onFailure(1);
    }
}
