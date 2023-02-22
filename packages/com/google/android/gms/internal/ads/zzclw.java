package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclw extends zzvk {
    private final ViewGroup zzfdl;
    private final zzcwe zzfga;
    private final zzuy zzfjf;
    private final zzbio zzgbk;
    private final Context zzlk;

    public zzclw(Context context, zzuy zzuyVar, zzcwe zzcweVar, zzbio zzbioVar) {
        this.zzlk = context;
        this.zzfjf = zzuyVar;
        this.zzfga = zzcweVar;
        this.zzgbk = zzbioVar;
        FrameLayout frameLayout = new FrameLayout(this.zzlk);
        frameLayout.removeAllViews();
        frameLayout.addView(this.zzgbk.zzaeu(), com.google.android.gms.ads.internal.zzq.zzkl().zzvr());
        frameLayout.setMinimumHeight(zzjt().heightPixels);
        frameLayout.setMinimumWidth(zzjt().widthPixels);
        this.zzfdl = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void showInterstitial() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzant zzantVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzanz zzanzVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzaqi zzaqiVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzqx zzqxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuf zzufVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzwx zzwxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzbm(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final IObjectWrapper zzjr() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfdl);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgbk.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean zza(zztx zztxVar) throws RemoteException {
        zzaug.zzet("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgbk.zzafm().zzbu(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgbk.zzafm().zzbv(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzjs() throws RemoteException {
        this.zzgbk.zzjs();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzua zzjt() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzcwi.zza(this.zzlk, Collections.singletonList(this.zzgbk.zzaet()));
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzgbk.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzwr getVideoController() throws RemoteException {
        return this.zzgbk.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final String getAdUnitId() throws RemoteException {
        return this.zzfga.zzgkh;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzvt zzjv() throws RemoteException {
        return this.zzfga.zzgkm;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzuy zzjw() throws RemoteException {
        return this.zzfjf;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final String zzju() throws RemoteException {
        return this.zzgbk.zzju();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzyj zzyjVar) throws RemoteException {
        zzaug.zzet("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzua zzuaVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzbio zzbioVar = this.zzgbk;
        if (zzbioVar != null) {
            zzbioVar.zza(this.zzfdl, zzuaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzaah zzaahVar) throws RemoteException {
        zzaug.zzet("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzux zzuxVar) throws RemoteException {
        zzaug.zzet("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvz zzvzVar) throws RemoteException {
        zzaug.zzet("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        zzaug.zzet("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzuy zzuyVar) throws RemoteException {
        zzaug.zzet("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvt zzvtVar) throws RemoteException {
        zzaug.zzet("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zza(zzvo zzvoVar) throws RemoteException {
        zzaug.zzet("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final Bundle getAdMetadata() throws RemoteException {
        zzaug.zzet("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }
}
