package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbo;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczc implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final String packageName;
    private final HandlerThread zzduw;
    private zzczq zzgni;
    private final String zzgnj;
    private final LinkedBlockingQueue<zzbo.zza> zzgnk;

    public zzczc(Context context, String str, String str2) {
        this.packageName = str;
        this.zzgnj = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zzduw = handlerThread;
        handlerThread.start();
        this.zzgni = new zzczq(context, this.zzduw.getLooper(), this, this);
        this.zzgnk = new LinkedBlockingQueue<>();
        this.zzgni.checkAvailabilityAndConnect();
    }

    public final zzbo.zza zzdk(int i) {
        zzbo.zza zzaVar;
        try {
            zzaVar = this.zzgnk.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaVar = null;
        }
        return zzaVar == null ? zzanv() : zzaVar;
    }

    private final zzczx zzanu() {
        try {
            return this.zzgni.zzaob();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzgnk.put(zzanv());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzczx zzanu = zzanu();
        if (zzanu != null) {
            try {
                try {
                    this.zzgnk.put(zzanu.zza(new zzczt(this.packageName, this.zzgnj)).zzaoc());
                    zzakj();
                    this.zzduw.quit();
                } catch (InterruptedException unused) {
                    zzakj();
                    this.zzduw.quit();
                } catch (Throwable th) {
                    zzakj();
                    this.zzduw.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzgnk.put(zzanv());
                zzakj();
                this.zzduw.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzgnk.put(zzanv());
        } catch (InterruptedException unused) {
        }
    }

    private final void zzakj() {
        zzczq zzczqVar = this.zzgni;
        if (zzczqVar != null) {
            if (zzczqVar.isConnected() || this.zzgni.isConnecting()) {
                this.zzgni.disconnect();
            }
        }
    }

    private static zzbo.zza zzanv() {
        return (zzbo.zza) ((zzdqw) zzbo.zza.zzal().zzau(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID).zzazr());
    }
}
