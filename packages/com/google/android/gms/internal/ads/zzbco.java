package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbco extends zzwq {
    private boolean zzabq;
    private boolean zzabr;
    private int zzacz;
    private zzws zzddr;
    private final zzazj zzdya;
    private final boolean zzehl;
    private final boolean zzehm;
    private boolean zzehn;
    private float zzehp;
    private float zzehq;
    private float zzehr;
    private final Object lock = new Object();
    private boolean zzeho = true;

    public zzbco(zzazj zzazjVar, float f, boolean z, boolean z2) {
        this.zzdya = zzazjVar;
        this.zzehp = f;
        this.zzehl = z;
        this.zzehm = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void play() {
        zzf("play", null);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void pause() {
        zzf("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void stop() {
        zzf("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void mute(boolean z) {
        zzf(z ? "mute" : "unmute", null);
    }

    public final void zzb(zzyj zzyjVar) {
        boolean z = zzyjVar.zzabp;
        boolean z2 = zzyjVar.zzabq;
        boolean z3 = zzyjVar.zzabr;
        synchronized (this.lock) {
            this.zzabq = z2;
            this.zzabr = z3;
        }
        zzf("initialState", CollectionUtils.mapOf("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    private final void zzf(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzaxn.zzdwm.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzbcn
            private final Map zzdwd;
            private final zzbco zzehk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehk = this;
                this.zzdwd = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzehk.zzj(this.zzdwd);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeho;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzacz;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzehr;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final float zzox() {
        float f;
        synchronized (this.lock) {
            f = this.zzehp;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final float zzoy() {
        float f;
        synchronized (this.lock) {
            f = this.zzehq;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzws zzwsVar) {
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
    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzehl && this.zzabq;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    z = (this.zzabr && this.zzehm) ? true : true;
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    public final void zze(float f) {
        synchronized (this.lock) {
            this.zzehq = f;
        }
    }

    public final void zzaap() {
        boolean z;
        int i;
        synchronized (this.lock) {
            z = this.zzeho;
            i = this.zzacz;
            this.zzacz = 3;
        }
        zza(i, 3, z, z);
    }

    public final void zza(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        int i2;
        synchronized (this.lock) {
            this.zzehp = f2;
            this.zzehq = f;
            z2 = this.zzeho;
            this.zzeho = z;
            i2 = this.zzacz;
            this.zzacz = i;
            float f4 = this.zzehr;
            this.zzehr = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zzdya.getView().invalidate();
            }
        }
        zza(i2, i, z2, z);
    }

    private final void zza(final int i, final int i2, final boolean z, final boolean z2) {
        zzaxn.zzdwm.execute(new Runnable(this, i, i2, z, z2) { // from class: com.google.android.gms.internal.ads.zzbcq
            private final int zzdtk;
            private final int zzdtl;
            private final boolean zzefh;
            private final boolean zzefi;
            private final zzbco zzehk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehk = this;
                this.zzdtk = i;
                this.zzdtl = i2;
                this.zzefh = z;
                this.zzefi = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzehk.zzb(this.zzdtk, this.zzdtl, this.zzefh, this.zzefi);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(int i, int i2, boolean z, boolean z2) {
        synchronized (this.lock) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.zzehn && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            this.zzehn = (this.zzehn || z5) ? true : true;
            if (z5) {
                try {
                    if (this.zzddr != null) {
                        this.zzddr.onVideoStart();
                    }
                } catch (RemoteException e) {
                    zzaxi.zze("#007 Could not call remote method.", e);
                }
            }
            if (z6 && this.zzddr != null) {
                this.zzddr.onVideoPlay();
            }
            if (z7 && this.zzddr != null) {
                this.zzddr.onVideoPause();
            }
            if (z8) {
                if (this.zzddr != null) {
                    this.zzddr.onVideoEnd();
                }
                this.zzdya.zzxu();
            }
            if (z9 && this.zzddr != null) {
                this.zzddr.onVideoMute(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(Map map) {
        this.zzdya.zza("pubVideoCmd", map);
    }
}
