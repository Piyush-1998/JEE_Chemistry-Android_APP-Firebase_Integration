package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public interface zzajy extends IInterface {
    void destroy() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzwr getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzaft zzaftVar, List<zzagb> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzaqp zzaqpVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, zzakd zzakdVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, zzaqp zzaqpVar, String str2) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, String str2, zzakd zzakdVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, String str2, zzakd zzakdVar, zzaay zzaayVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzua zzuaVar, zztx zztxVar, String str, zzakd zzakdVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzua zzuaVar, zztx zztxVar, String str, String str2, zzakd zzakdVar) throws RemoteException;

    void zza(zztx zztxVar, String str) throws RemoteException;

    void zza(zztx zztxVar, String str, String str2) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, zztx zztxVar, String str, zzakd zzakdVar) throws RemoteException;

    IObjectWrapper zzro() throws RemoteException;

    zzakg zzrp() throws RemoteException;

    zzakl zzrq() throws RemoteException;

    Bundle zzrr() throws RemoteException;

    Bundle zzrs() throws RemoteException;

    boolean zzrt() throws RemoteException;

    zzace zzru() throws RemoteException;

    zzakm zzrv() throws RemoteException;

    void zzw(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzx(IObjectWrapper iObjectWrapper) throws RemoteException;
}
