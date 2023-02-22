package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrv {
    private final Object lock = new Object();
    private zzrq zzbrc;
    private boolean zzbrp;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrv(Context context) {
        this.zzlk = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<InputStream> zzb(zzrp zzrpVar) {
        zzry zzryVar = new zzry(this);
        zzrx zzrxVar = new zzrx(this, zzrpVar, zzryVar);
        zzsb zzsbVar = new zzsb(this, zzryVar);
        synchronized (this.lock) {
            zzrq zzrqVar = new zzrq(this.zzlk, com.google.android.gms.ads.internal.zzq.zzkx().zzwd(), zzrxVar, zzsbVar);
            this.zzbrc = zzrqVar;
            zzrqVar.checkAvailabilityAndConnect();
        }
        return zzryVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbrc == null) {
                return;
            }
            this.zzbrc.disconnect();
            this.zzbrc = null;
            Binder.flushPendingCommands();
        }
    }
}
