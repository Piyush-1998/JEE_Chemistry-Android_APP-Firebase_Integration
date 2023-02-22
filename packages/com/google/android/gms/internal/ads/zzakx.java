package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzakx extends zzakc {
    private final zzaqp zzddx;
    private final Adapter zzdeg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakx(Adapter adapter, zzaqp zzaqpVar) {
        this.zzdeg = adapter;
        this.zzddx = zzaqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdImpression() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdLeftApplication() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onVideoEnd() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onVideoPause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onVideoPlay() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(zzace zzaceVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(zzake zzakeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzb(Bundle bundle) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzb(zzaqt zzaqtVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzcl(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzde(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdLoaded() throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zzaj(ObjectWrapper.wrap(this.zzdeg));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdOpened() throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zzak(ObjectWrapper.wrap(this.zzdeg));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdClosed() throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zzam(ObjectWrapper.wrap(this.zzdeg));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(zzaqv zzaqvVar) throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zza(ObjectWrapper.wrap(this.zzdeg), new zzaqt(zzaqvVar.getType(), zzaqvVar.getAmount()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzrw() throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zzal(ObjectWrapper.wrap(this.zzdeg));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzrx() throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zzap(ObjectWrapper.wrap(this.zzdeg));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdClicked() throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zzan(ObjectWrapper.wrap(this.zzdeg));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzaqp zzaqpVar = this.zzddx;
        if (zzaqpVar != null) {
            zzaqpVar.zze(ObjectWrapper.wrap(this.zzdeg), i);
        }
    }
}
