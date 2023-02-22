package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public interface zzamd extends IInterface {
    zzwr getVideoController() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzua zzuaVar, zzame zzameVar) throws RemoteException;

    void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzalr zzalrVar, zzakd zzakdVar, zzua zzuaVar) throws RemoteException;

    void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzals zzalsVar, zzakd zzakdVar) throws RemoteException;

    void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzalx zzalxVar, zzakd zzakdVar) throws RemoteException;

    void zza(String str, String str2, zztx zztxVar, IObjectWrapper iObjectWrapper, zzaly zzalyVar, zzakd zzakdVar) throws RemoteException;

    void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException;

    boolean zzac(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzad(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdh(String str) throws RemoteException;

    void zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzamr zzsg() throws RemoteException;

    zzamr zzsh() throws RemoteException;
}
