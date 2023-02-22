package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvl extends zzaqe {
    private final zzcwc zzfgu;
    private boolean zzgcq = false;
    private final zzcvb zzgij;
    private final zzcui zzgik;
    private zzbyz zzgil;

    public zzcvl(zzcvb zzcvbVar, zzcui zzcuiVar, zzcwc zzcwcVar) {
        this.zzgij = zzcvbVar;
        this.zzgik = zzcuiVar;
        this.zzfgu = zzcwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void setAppPackageName(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void zza(zzaqo zzaqoVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (zzzc.zzck(zzaqoVar.zzbqy)) {
            return;
        }
        if (zzali()) {
            if (!((Boolean) zzuv.zzon().zzd(zzza.zzcrk)).booleanValue()) {
                return;
            }
        }
        zzcvc zzcvcVar = new zzcvc(null);
        this.zzgil = null;
        this.zzgij.zza(zzaqoVar.zzdiu, zzaqoVar.zzbqy, zzcvcVar, new zzcvo(this));
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void destroy() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzgik.zza((AdMetadataListener) null);
        if (this.zzgil != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzgil.zzafm().zzbw(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void pause() {
        zzn(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgil != null) {
            this.zzgil.zzafm().zzbu(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void resume() {
        zzo(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgil != null) {
            this.zzgil.zzafm().zzbv(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void show() throws RemoteException {
        zzm(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzgil == null) {
            return;
        }
        if (iObjectWrapper != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof Activity) {
                activity = (Activity) unwrap;
                this.zzgil.zzb(this.zzgcq, activity);
            }
        }
        activity = null;
        this.zzgil.zzb(this.zzgcq, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final boolean zzpl() {
        zzbyz zzbyzVar = this.zzgil;
        return zzbyzVar != null && zzbyzVar.zzpl();
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgil != null) {
            return this.zzgil.getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final boolean isLoaded() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzali();
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zza(zzaqi zzaqiVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzgik.zzb(zzaqiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zza(zzapz zzapzVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzgik.zzb(zzapzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zza(zzvo zzvoVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzvoVar == null) {
            this.zzgik.zza((AdMetadataListener) null);
        } else {
            this.zzgik.zza(new zzcvn(this, zzvoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzbyz zzbyzVar = this.zzgil;
        return zzbyzVar != null ? zzbyzVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzfgu.zzdnz = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzckm)).booleanValue()) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzfgu.zzdoa = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgcq = z;
    }

    private final synchronized boolean zzali() {
        boolean z;
        if (this.zzgil != null) {
            z = this.zzgil.isClosed() ? false : true;
        }
        return z;
    }
}
