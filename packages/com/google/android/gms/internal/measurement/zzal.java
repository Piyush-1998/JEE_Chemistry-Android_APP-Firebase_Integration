package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzal extends zzz.zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgk zzbc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzz zzzVar, com.google.android.gms.measurement.internal.zzgk zzgkVar) {
        super(zzzVar);
        this.zzaa = zzzVar;
        this.zzbc = zzgkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zzaa.zzar;
        zzkVar.setEventInterceptor(new zzz.zza(this.zzbc));
    }
}
