package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcee extends zzcec {
    public zzcee(Context context) {
        this.zzfva = new zzaom(context, com.google.android.gms.ads.internal.zzq.zzkx().zzwd(), this, this);
    }

    public final zzddi<InputStream> zzg(zzape zzapeVar) {
        synchronized (this.mLock) {
            if (this.zzfux) {
                return this.zzdbn;
            }
            this.zzfux = true;
            this.zzfuz = zzapeVar;
            this.zzfva.checkAvailabilityAndConnect();
            this.zzdbn.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzceh
                private final zzcee zzfvd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfvd = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfvd.zzakj();
                }
            }, zzaxn.zzdwn);
            return this.zzdbn;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzfuy) {
                this.zzfuy = true;
                try {
                    this.zzfva.zzta().zzb(this.zzfuz, new zzcef(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdbn.setException(new zzcel(0));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzq.zzkn().zza(th, "RemoteSignalsClientTask.onConnected");
                    this.zzdbn.setException(new zzcel(0));
                }
            }
        }
    }
}
