package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzz;

/* loaded from: classes.dex */
final class zzae extends zzz.zzb {
    private final /* synthetic */ zzz zzaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzz zzzVar) {
        super(zzzVar);
        this.zzaa = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zzaa.zzar;
        zzkVar.resetAnalyticsData(this.timestamp);
    }
}
