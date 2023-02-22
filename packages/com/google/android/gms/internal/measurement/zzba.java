package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzba extends zzz.zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ Bundle zzbj;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(zzz zzzVar, Bundle bundle) {
        super(zzzVar);
        this.zzaa = zzzVar;
        this.zzbj = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zzaa.zzar;
        zzkVar.setConditionalUserProperty(this.zzbj, this.timestamp);
    }
}
