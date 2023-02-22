package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfr implements zzcym {
    private final zzcfp zzfwn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfr(zzcfp zzcfpVar) {
        this.zzfwn = zzcfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzb(zzcyd zzcydVar, String str) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzctc)).booleanValue() && zzcyd.RENDERER == zzcydVar) {
            this.zzfwn.zzey(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str, Throwable th) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzctc)).booleanValue() && zzcyd.RENDERER == zzcydVar && this.zzfwn.zzakp() != 0) {
            this.zzfwn.zzel(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - this.zzfwn.zzakp());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzc(zzcyd zzcydVar, String str) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzctc)).booleanValue() && zzcyd.RENDERER == zzcydVar && this.zzfwn.zzakp() != 0) {
            this.zzfwn.zzel(com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - this.zzfwn.zzakp());
        }
    }
}
