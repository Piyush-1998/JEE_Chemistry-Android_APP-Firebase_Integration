package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzajm extends zzbee {
    private final AppMeasurementSdk zzdbr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajm(AppMeasurementSdk appMeasurementSdk) {
        this.zzdbr = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void performAction(Bundle bundle) throws RemoteException {
        this.zzdbr.performAction(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final Bundle performActionWithResponse(Bundle bundle) throws RemoteException {
        return this.zzdbr.performActionWithResponse(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void logEvent(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzdbr.logEvent(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zza(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzdbr.setUserProperty(str, str2, iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final Map getUserProperties(String str, String str2, boolean z) throws RemoteException {
        return this.zzdbr.getUserProperties(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final int getMaxUserProperties(String str) throws RemoteException {
        return this.zzdbr.getMaxUserProperties(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void setConditionalUserProperty(Bundle bundle) throws RemoteException {
        this.zzdbr.setConditionalUserProperty(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzdbr.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final List getConditionalUserProperties(String str, String str2) throws RemoteException {
        return this.zzdbr.getConditionalUserProperties(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final String getAppInstanceId() throws RemoteException {
        return this.zzdbr.getAppInstanceId();
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final String getGmpAppId() throws RemoteException {
        return this.zzdbr.getGmpAppId();
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final long generateEventId() throws RemoteException {
        return this.zzdbr.generateEventId();
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void beginAdUnitExposure(String str) throws RemoteException {
        this.zzdbr.beginAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void endAdUnitExposure(String str) throws RemoteException {
        this.zzdbr.endAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzb(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.zzdbr.setCurrentScreen(iObjectWrapper != null ? (Activity) ObjectWrapper.unwrap(iObjectWrapper) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final String getCurrentScreenName() throws RemoteException {
        return this.zzdbr.getCurrentScreenName();
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final String getCurrentScreenClass() throws RemoteException {
        return this.zzdbr.getCurrentScreenClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final String getAppIdOrigin() throws RemoteException {
        return this.zzdbr.getAppIdOrigin();
    }
}
