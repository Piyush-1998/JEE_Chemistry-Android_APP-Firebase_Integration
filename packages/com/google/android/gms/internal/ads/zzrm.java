package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrm implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzrh zzbrg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrm(zzrh zzrhVar) {
        this.zzbrg = zzrhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzrq zzrqVar;
        zzrq zzrqVar2;
        obj = this.zzbrg.lock;
        synchronized (obj) {
            try {
                zzrqVar = this.zzbrg.zzbrc;
                if (zzrqVar != null) {
                    zzrh zzrhVar = this.zzbrg;
                    zzrqVar2 = this.zzbrg.zzbrc;
                    zzrhVar.zzbrd = zzrqVar2.zzml();
                }
            } catch (DeadObjectException e) {
                zzaug.zzc("Unable to obtain a cache service instance.", e);
                this.zzbrg.disconnect();
            }
            obj2 = this.zzbrg.lock;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zzbrg.lock;
        synchronized (obj) {
            this.zzbrg.zzbrd = null;
            obj2 = this.zzbrg.lock;
            obj2.notifyAll();
        }
    }
}
