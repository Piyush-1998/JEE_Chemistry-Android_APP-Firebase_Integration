package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxy extends zzaqe {
    private zzaqi zzcfk;

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void destroy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void pause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void resume() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void setAppPackageName(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void setCustomData(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void show() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zza(zzapz zzapzVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zza(zzvo zzvoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final boolean zzpl() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zza(zzaqo zzaqoVar) throws RemoteException {
        zzaxi.zzes("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzawy.zzzb.post(new zzyb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zza(zzaqi zzaqiVar) throws RemoteException {
        this.zzcfk = zzaqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }
}
