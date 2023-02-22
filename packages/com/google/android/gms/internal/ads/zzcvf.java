package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvf extends zzaqz {
    private final String zzbqy;
    private final zzcwc zzfgu;
    private final zzcvb zzgij;
    private final zzcui zzgik;
    private zzbyz zzgil;

    public zzcvf(String str, zzcvb zzcvbVar, zzcui zzcuiVar, zzcwc zzcwcVar) {
        this.zzbqy = str;
        this.zzgij = zzcvbVar;
        this.zzgik = zzcuiVar;
        this.zzfgu = zzcwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final synchronized void zza(zztx zztxVar, zzari zzariVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgik.zza(zzariVar);
        if (this.zzgil != null) {
            return;
        }
        this.zzgij.zza(zztxVar, this.zzbqy, new zzcvc(null), new zzcvi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zza(iObjectWrapper, false);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final synchronized void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzgil == null) {
            zzaug.zzeu("Rewarded can not be shown before loaded");
            this.zzgik.zzcl(2);
            return;
        }
        this.zzgil.zzb(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgil != null) {
            return this.zzgil.getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final boolean isLoaded() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbyz zzbyzVar = this.zzgil;
        return (zzbyzVar == null || zzbyzVar.zzajh()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzarb zzarbVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgik.zzb(zzarbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzarj zzarjVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgik.zzb(zzarjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzwm zzwmVar) {
        if (zzwmVar == null) {
            this.zzgik.zza((AdMetadataListener) null);
        } else {
            this.zzgik.zza(new zzcvh(this, zzwmVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbyz zzbyzVar = this.zzgil;
        return zzbyzVar != null ? zzbyzVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final zzaqv zzpk() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbyz zzbyzVar = this.zzgil;
        if (zzbyzVar != null) {
            return zzbyzVar.zzpk();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final synchronized void zza(zzarr zzarrVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcwc zzcwcVar = this.zzfgu;
        zzcwcVar.zzdnz = zzarrVar.zzdnz;
        if (((Boolean) zzuv.zzon().zzd(zzza.zzckm)).booleanValue()) {
            zzcwcVar.zzdoa = zzarrVar.zzdoa;
        }
    }
}
