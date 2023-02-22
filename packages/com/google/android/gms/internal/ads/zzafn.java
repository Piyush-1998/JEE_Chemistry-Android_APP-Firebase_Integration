package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzafn extends zzafg {
    private final /* synthetic */ zzaxv zzbrr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafn(zzafk zzafkVar, zzaxv zzaxvVar) {
        this.zzbrr = zzaxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final void zza(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zzbrr.set(parcelFileDescriptor);
    }
}
