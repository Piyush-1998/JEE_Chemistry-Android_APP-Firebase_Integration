package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrh {
    private zzrq zzbrc;
    private zzru zzbrd;
    private Context zzlk;
    private final Runnable zzbrb = new zzrk(this);
    private final Object lock = new Object();

    public final void initialize(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.lock) {
            if (this.zzlk != null) {
                return;
            }
            this.zzlk = context.getApplicationContext();
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcpo)).booleanValue()) {
                connect();
            } else {
                if (((Boolean) zzuv.zzon().zzd(zzza.zzcpn)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzq.zzkm().zza(new zzrj(this));
                }
            }
        }
    }

    public final void zzmh() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcpp)).booleanValue()) {
            synchronized (this.lock) {
                connect();
                com.google.android.gms.ads.internal.zzq.zzkj();
                zzaul.zzdsu.removeCallbacks(this.zzbrb);
                com.google.android.gms.ads.internal.zzq.zzkj();
                zzaul.zzdsu.postDelayed(this.zzbrb, ((Long) zzuv.zzon().zzd(zzza.zzcpq)).longValue());
            }
        }
    }

    public final zzro zza(zzrp zzrpVar) {
        synchronized (this.lock) {
            if (this.zzbrd == null) {
                return new zzro();
            }
            try {
                return this.zzbrd.zza(zzrpVar);
            } catch (RemoteException e) {
                zzaug.zzc("Unable to call into cache service.", e);
                return new zzro();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect() {
        synchronized (this.lock) {
            if (this.zzlk != null && this.zzbrc == null) {
                zzrq zza = zza(new zzrm(this), new zzrl(this));
                this.zzbrc = zza;
                zza.checkAvailabilityAndConnect();
            }
        }
    }

    private final synchronized zzrq zza(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzrq(this.zzlk, com.google.android.gms.ads.internal.zzq.zzkx().zzwd(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbrc == null) {
                return;
            }
            if (this.zzbrc.isConnected() || this.zzbrc.isConnecting()) {
                this.zzbrc.disconnect();
            }
            this.zzbrc = null;
            this.zzbrd = null;
            Binder.flushPendingCommands();
        }
    }
}
