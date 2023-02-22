package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzakr extends zzwq {
    private final Object lock = new Object();
    private volatile zzws zzddr;

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void mute(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final boolean isMuted() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final float zzox() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final float zzoy() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzws zzwsVar) throws RemoteException {
        synchronized (this.lock) {
            this.zzddr = zzwsVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final zzws zzoz() throws RemoteException {
        zzws zzwsVar;
        synchronized (this.lock) {
            zzwsVar = this.zzddr;
        }
        return zzwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final boolean isCustomControlsEnabled() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final boolean isClickToExpandEnabled() throws RemoteException {
        throw new RemoteException();
    }
}
