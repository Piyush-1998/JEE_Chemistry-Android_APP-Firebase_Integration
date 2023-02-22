package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public interface zzakd extends IInterface {
    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoEnd() throws RemoteException;

    void onVideoPause() throws RemoteException;

    void onVideoPlay() throws RemoteException;

    void zza(zzace zzaceVar, String str) throws RemoteException;

    void zza(zzake zzakeVar) throws RemoteException;

    void zza(zzaqv zzaqvVar) throws RemoteException;

    void zzb(Bundle bundle) throws RemoteException;

    void zzb(zzaqt zzaqtVar) throws RemoteException;

    void zzcl(int i) throws RemoteException;

    void zzde(String str) throws RemoteException;

    void zzrw() throws RemoteException;

    void zzrx() throws RemoteException;
}
