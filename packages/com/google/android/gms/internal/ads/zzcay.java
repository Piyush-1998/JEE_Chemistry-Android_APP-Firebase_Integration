package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcay implements zzcym {
    private zzsd zzfrg;
    private Map<zzcyd, zzcba> zzfro;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcay(zzsd zzsdVar, Map<zzcyd, zzcba> map) {
        this.zzfro = map;
        this.zzfrg = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzb(zzcyd zzcydVar, String str) {
        if (this.zzfro.containsKey(zzcydVar)) {
            this.zzfrg.zza(this.zzfro.get(zzcydVar).zzfrr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zza(zzcyd zzcydVar, String str, Throwable th) {
        if (this.zzfro.containsKey(zzcydVar)) {
            this.zzfrg.zza(this.zzfro.get(zzcydVar).zzfrt);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcym
    public final void zzc(zzcyd zzcydVar, String str) {
        if (this.zzfro.containsKey(zzcydVar)) {
            this.zzfrg.zza(this.zzfro.get(zzcydVar).zzfrs);
        }
    }
}
