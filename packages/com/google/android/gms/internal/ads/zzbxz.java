package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbxz extends zzacd {
    private final String zzffi;
    private final zzbur zzfjl;
    private final zzbuj zzfml;

    public zzbxz(String str, zzbuj zzbujVar, zzbur zzburVar) {
        this.zzffi = str;
        this.zzfml = zzbujVar;
        this.zzfjl = zzburVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final IObjectWrapper zzqm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfml);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final String getHeadline() throws RemoteException {
        return this.zzfjl.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final List<?> getImages() throws RemoteException {
        return this.zzfjl.getImages();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final String getBody() throws RemoteException {
        return this.zzfjl.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzabi zzqq() throws RemoteException {
        return this.zzfjl.zzqq();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final String getCallToAction() throws RemoteException {
        return this.zzfjl.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final String getAdvertiser() throws RemoteException {
        return this.zzfjl.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final Bundle getExtras() throws RemoteException {
        return this.zzfjl.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final void destroy() throws RemoteException {
        this.zzfml.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzwr getVideoController() throws RemoteException {
        return this.zzfjl.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzfml.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzfml.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzfml.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaba zzqo() throws RemoteException {
        return this.zzfjl.zzqo();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final IObjectWrapper zzqp() throws RemoteException {
        return this.zzfjl.zzqp();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzffi;
    }
}
