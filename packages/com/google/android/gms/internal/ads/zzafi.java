package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafi extends zzfn implements zzafj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final void zza(zzafd zzafdVar, zzafh zzafhVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzfp.zza(obtainAndWriteInterfaceToken, zzafdVar);
        zzfp.zza(obtainAndWriteInterfaceToken, zzafhVar);
        zzb(2, obtainAndWriteInterfaceToken);
    }
}
