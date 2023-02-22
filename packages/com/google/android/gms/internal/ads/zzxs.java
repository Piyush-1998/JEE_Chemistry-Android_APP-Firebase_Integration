package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzxs extends zzwa {
    private zzafu zzcfh;

    @Override // com.google.android.gms.internal.ads.zzwb
    public final String getVersionString() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void setAppMuted(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void setAppVolume(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zza(zzajx zzajxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zza(zzyd zzydVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zzby(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zzbz(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zzc(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final float zzos() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zzot() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void initialize() throws RemoteException {
        zzaxi.zzes("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzawy.zzzb.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzxv
            private final zzxs zzcfj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcfj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzcfj.zzpj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zza(zzafu zzafuVar) throws RemoteException {
        this.zzcfh = zzafuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final List<zzafr> zzou() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzpj() {
        zzafu zzafuVar = this.zzcfh;
        if (zzafuVar != null) {
            try {
                zzafuVar.zzc(Collections.EMPTY_LIST);
            } catch (RemoteException e) {
                zzaxi.zzd("Could not notify onComplete event.", e);
            }
        }
    }
}
