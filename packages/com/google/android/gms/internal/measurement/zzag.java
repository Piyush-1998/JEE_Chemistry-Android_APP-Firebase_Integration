package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzz;

/* loaded from: classes.dex */
final class zzag extends zzz.zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ long zzba;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzz zzzVar, long j) {
        super(zzzVar);
        this.zzaa = zzzVar;
        this.zzba = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zzaa.zzar;
        zzkVar.setSessionTimeoutDuration(this.zzba);
    }
}
