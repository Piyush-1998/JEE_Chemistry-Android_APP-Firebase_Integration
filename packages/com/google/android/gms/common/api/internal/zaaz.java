package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zaaz implements GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ StatusPendingResult zahj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaaz(zaaw zaawVar, StatusPendingResult statusPendingResult) {
        this.zahj = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zahj.setResult(new Status(8));
    }
}
