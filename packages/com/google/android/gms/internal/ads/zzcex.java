package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcex implements zzdcz<ParcelFileDescriptor> {
    private final /* synthetic */ zzaoy zzfvo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcex(zzcen zzcenVar, zzaoy zzaoyVar) {
        this.zzfvo = zzaoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        try {
            this.zzfvo.zza(zzavq.zza(th, zzccu.zzd(th)));
        } catch (RemoteException e) {
            zzaug.zza("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final /* synthetic */ void onSuccess(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.zzfvo.zzb(parcelFileDescriptor);
        } catch (RemoteException e) {
            zzaug.zza("Service can't call client", e);
        }
    }
}
