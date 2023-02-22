package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzafp implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzaxv zzbrr;
    private final /* synthetic */ zzafl zzcym;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafp(zzafl zzaflVar, zzaxv zzaxvVar) {
        this.zzcym = zzaflVar;
        this.zzbrr = zzaxvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzafa zzafaVar;
        try {
            zzaxv zzaxvVar = this.zzbrr;
            zzafaVar = this.zzcym.zzcyl;
            zzaxvVar.set(zzafaVar.zzqz());
        } catch (DeadObjectException e) {
            this.zzbrr.setException(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzaxv zzaxvVar = this.zzbrr;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzaxvVar.setException(new RuntimeException(sb.toString()));
    }
}
