package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzsb implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzaxv zzbrr;
    private final /* synthetic */ zzrv zzbrs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsb(zzrv zzrvVar, zzaxv zzaxvVar) {
        this.zzbrs = zzrvVar;
        this.zzbrr = zzaxvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzbrs.lock;
        synchronized (obj) {
            this.zzbrr.setException(new RuntimeException("Connection failed."));
        }
    }
}
