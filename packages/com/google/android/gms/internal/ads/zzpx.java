package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzpx implements Runnable {
    private final /* synthetic */ zzpy zzbpc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpx(zzpy zzpyVar) {
        this.zzbpc = zzpyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzqa> list;
        obj = this.zzbpc.lock;
        synchronized (obj) {
            z = this.zzbpc.foreground;
            if (z) {
                z2 = this.zzbpc.zzbpd;
                if (z2) {
                    this.zzbpc.foreground = false;
                    zzaug.zzdv("App went background");
                    list = this.zzbpc.zzbpe;
                    for (zzqa zzqaVar : list) {
                        try {
                            zzqaVar.zzo(false);
                        } catch (Exception e) {
                            zzaxi.zzc("", e);
                        }
                    }
                }
            }
            zzaug.zzdv("App is still foreground");
        }
    }
}
