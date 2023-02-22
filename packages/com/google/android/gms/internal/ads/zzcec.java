package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzcec implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected zzape zzfuz;
    protected zzaom zzfva;
    protected final zzaxv<InputStream> zzdbn = new zzaxv<>();
    protected final Object mLock = new Object();
    protected boolean zzfux = false;
    protected boolean zzfuy = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzakj() {
        synchronized (this.mLock) {
            this.zzfuy = true;
            if (this.zzfva.isConnected() || this.zzfva.isConnecting()) {
                this.zzfva.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        zzaug.zzdv("Cannot connect to remote service, fallback to local instance.");
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzaug.zzdv("Disconnected from remote ad request service.");
        this.zzdbn.setException(new zzcel(0));
    }
}
