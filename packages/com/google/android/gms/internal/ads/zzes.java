package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzes implements Callable {
    private final zzbo.zza.zzb zzaaa;
    private final zzdx zzvo;

    public zzes(zzdx zzdxVar, zzbo.zza.zzb zzbVar) {
        this.zzvo = zzdxVar;
        this.zzaaa = zzbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzcw */
    public final Void call() throws Exception {
        if (this.zzvo.zzcn() != null) {
            this.zzvo.zzcn().get();
        }
        zzbo.zza zzcm = this.zzvo.zzcm();
        if (zzcm != null) {
            try {
                synchronized (this.zzaaa) {
                    zzbo.zza.zzb zzbVar = this.zzaaa;
                    byte[] byteArray = zzcm.toByteArray();
                    zzbVar.zza(byteArray, 0, byteArray.length, zzdqj.zzazb());
                }
                return null;
            } catch (zzdrg unused) {
                return null;
            }
        }
        return null;
    }
}
