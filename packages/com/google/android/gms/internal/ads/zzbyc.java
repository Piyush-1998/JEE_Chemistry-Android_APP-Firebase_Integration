package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyc extends zzadj {
    private final String zzffi;
    private final zzbur zzfjl;
    private final zzbuj zzfml;

    public zzbyc(String str, zzbuj zzbujVar, zzbur zzburVar) {
        this.zzffi = str;
        this.zzfml = zzbujVar;
        this.zzfjl = zzburVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final IObjectWrapper zzqm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfml);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final String getHeadline() throws RemoteException {
        return this.zzfjl.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final List<?> getImages() throws RemoteException {
        return this.zzfjl.getImages();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final List<?> getMuteThisAdReasons() throws RemoteException {
        if (isCustomMuteThisAdEnabled()) {
            return this.zzfjl.getMuteThisAdReasons();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final boolean isCustomMuteThisAdEnabled() throws RemoteException {
        return (this.zzfjl.getMuteThisAdReasons().isEmpty() || this.zzfjl.zzahs() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final String getBody() throws RemoteException {
        return this.zzfjl.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final zzabi zzqn() throws RemoteException {
        return this.zzfjl.zzqn();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final String getCallToAction() throws RemoteException {
        return this.zzfjl.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final String getAdvertiser() throws RemoteException {
        return this.zzfjl.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final double getStarRating() throws RemoteException {
        return this.zzfjl.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final String getStore() throws RemoteException {
        return this.zzfjl.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final String getPrice() throws RemoteException {
        return this.zzfjl.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void destroy() throws RemoteException {
        this.zzfml.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final zzwr getVideoController() throws RemoteException {
        return this.zzfjl.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzfml.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzfml.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzfml.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final zzaba zzqo() throws RemoteException {
        return this.zzfjl.zzqo();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final IObjectWrapper zzqp() throws RemoteException {
        return this.zzfjl.zzqp();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzffi;
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final Bundle getExtras() throws RemoteException {
        return this.zzfjl.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zza(zzadf zzadfVar) throws RemoteException {
        this.zzfml.zza(zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zza(zzwi zzwiVar) throws RemoteException {
        this.zzfml.zza(zzwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zza(zzwe zzweVar) throws RemoteException {
        this.zzfml.zza(zzweVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzqw() {
        this.zzfml.zzqw();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void recordCustomClickGesture() {
        this.zzfml.recordCustomClickGesture();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final boolean isCustomClickGestureEnabled() {
        return this.zzfml.isCustomClickGestureEnabled();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void cancelUnconfirmedClick() throws RemoteException {
        this.zzfml.cancelUnconfirmedClick();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final zzabh zzqx() throws RemoteException {
        return this.zzfml.zzahm().zzqx();
    }
}
