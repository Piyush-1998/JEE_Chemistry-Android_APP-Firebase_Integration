package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzz;

/* loaded from: classes.dex */
final class zzbi extends zzz.zzb {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzz.zzc zzbw;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzz.zzc zzcVar, Activity activity) {
        super(zzz.this);
        this.zzbw = zzcVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzz.zzb
    final void zzf() throws RemoteException {
        zzk zzkVar;
        zzkVar = zzz.this.zzar;
        zzkVar.onActivityDestroyed(ObjectWrapper.wrap(this.val$activity), this.zzbt);
    }
}
