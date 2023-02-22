package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbo;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzet extends zzfl {
    public zzet(zzdx zzdxVar, String str, String str2, zzbo.zza.zzb zzbVar, int i, int i2) {
        super(zzdxVar, str, str2, zzbVar, i, 24);
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    public final Void zzcw() throws Exception {
        if (this.zzvo.isInitialized()) {
            return super.call();
        }
        if (this.zzvo.zzci()) {
            zzcx();
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfl
    protected final void zzcu() throws IllegalAccessException, InvocationTargetException {
        if (this.zzvo.zzci()) {
            zzcx();
            return;
        }
        synchronized (this.zzaaa) {
            this.zzaaa.zzah((String) this.zzaal.invoke(null, this.zzvo.getContext()));
        }
    }

    private final void zzcx() {
        AdvertisingIdClient zzcq = this.zzvo.zzcq();
        if (zzcq == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzcq.getInfo();
            String zzas = zzee.zzas(info.getId());
            if (zzas != null) {
                synchronized (this.zzaaa) {
                    this.zzaaa.zzah(zzas);
                    this.zzaaa.zzb(info.isLimitAdTrackingEnabled());
                    this.zzaaa.zzb(zzbo.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfl, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
