package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public interface zzvl extends IInterface {
    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getAdUnitId() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzwr getVideoController() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setManualImpressionsEnabled(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(zzaah zzaahVar) throws RemoteException;

    void zza(zzant zzantVar) throws RemoteException;

    void zza(zzanz zzanzVar, String str) throws RemoteException;

    void zza(zzaqi zzaqiVar) throws RemoteException;

    void zza(zzqx zzqxVar) throws RemoteException;

    void zza(zzua zzuaVar) throws RemoteException;

    void zza(zzuf zzufVar) throws RemoteException;

    void zza(zzux zzuxVar) throws RemoteException;

    void zza(zzuy zzuyVar) throws RemoteException;

    void zza(zzvo zzvoVar) throws RemoteException;

    void zza(zzvt zzvtVar) throws RemoteException;

    void zza(zzvz zzvzVar) throws RemoteException;

    void zza(zzwx zzwxVar) throws RemoteException;

    void zza(zzyj zzyjVar) throws RemoteException;

    boolean zza(zztx zztxVar) throws RemoteException;

    void zzbm(String str) throws RemoteException;

    IObjectWrapper zzjr() throws RemoteException;

    void zzjs() throws RemoteException;

    zzua zzjt() throws RemoteException;

    String zzju() throws RemoteException;

    zzvt zzjv() throws RemoteException;

    zzuy zzjw() throws RemoteException;
}
