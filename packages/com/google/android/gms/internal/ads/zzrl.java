package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrl implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzrh zzbrg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrl(zzrh zzrhVar) {
        this.zzbrg = zzrhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzrq zzrqVar;
        Object obj2;
        obj = this.zzbrg.lock;
        synchronized (obj) {
            this.zzbrg.zzbrd = null;
            zzrqVar = this.zzbrg.zzbrc;
            if (zzrqVar != null) {
                this.zzbrg.zzbrc = null;
            }
            obj2 = this.zzbrg.lock;
            obj2.notifyAll();
        }
    }
}
