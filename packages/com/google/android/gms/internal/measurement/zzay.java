package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzay extends zzz.zzb {
    private final /* synthetic */ zzz zzaa;
    private final /* synthetic */ Long zzbm;
    private final /* synthetic */ String zzbn;
    private final /* synthetic */ Bundle zzbo;
    private final /* synthetic */ boolean zzbp;
    private final /* synthetic */ boolean zzbq;
    private final /* synthetic */ String zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzz zzzVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzzVar);
        this.zzaa = zzzVar;
        this.zzbm = l;
        this.zzx = str;
        this.zzbn = str2;
        this.zzbo = bundle;
        this.zzbp = z;
        this.zzbq = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        zzk zzkVar;
        Long l = this.zzbm;
        long longValue = l == null ? this.timestamp : l.longValue();
        zzkVar = this.zzaa.zzar;
        zzkVar.logEvent(this.zzx, this.zzbn, this.zzbo, this.zzbp, this.zzbq, longValue);
    }
}
