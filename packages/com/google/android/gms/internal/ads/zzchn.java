package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzchn extends zzaqs implements zzbnz {
    private zzboc zzfye;
    private zzaqp zzfyh;
    private zzbrj zzfyi;

    public final synchronized void zza(zzaqp zzaqpVar) {
        this.zzfyh = zzaqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final synchronized void zza(zzboc zzbocVar) {
        this.zzfye = zzbocVar;
    }

    public final synchronized void zza(zzbrj zzbrjVar) {
        this.zzfyi = zzbrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzai(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzai(iObjectWrapper);
        }
        if (this.zzfyi != null) {
            this.zzfyi.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzd(iObjectWrapper, i);
        }
        if (this.zzfyi != null) {
            this.zzfyi.zzde(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzal(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzal(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zza(IObjectWrapper iObjectWrapper, zzaqt zzaqtVar) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zza(iObjectWrapper, zzaqtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzan(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzan(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzam(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zze(iObjectWrapper, i);
        }
        if (this.zzfye != null) {
            this.zzfye.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzao(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzao(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzap(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzak(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzak(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzaj(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzaj(iObjectWrapper);
        }
        if (this.zzfye != null) {
            this.zzfye.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzfyh != null) {
            this.zzfyh.zzb(bundle);
        }
    }
}
