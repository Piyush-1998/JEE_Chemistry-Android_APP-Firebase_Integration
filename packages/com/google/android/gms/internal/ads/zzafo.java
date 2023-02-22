package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafo implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzaxv zzbrr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafo(zzafl zzaflVar, zzaxv zzaxvVar) {
        this.zzbrr = zzaxvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbrr.setException(new RuntimeException("Connection failed."));
    }
}
