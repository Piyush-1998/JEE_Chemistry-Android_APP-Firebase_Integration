package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzz;

/* loaded from: classes.dex */
final class zzad extends zzz.zzb {
    private final /* synthetic */ String val$id;
    private final /* synthetic */ zzz zzaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzz zzzVar, String str) {
        super(zzzVar);
        this.zzaa = zzzVar;
        this.val$id = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zzaa.zzar;
        zzkVar.setUserId(this.val$id, this.timestamp);
    }
}
