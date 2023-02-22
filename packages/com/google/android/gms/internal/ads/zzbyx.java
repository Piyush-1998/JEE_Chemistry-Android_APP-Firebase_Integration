package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbyx implements zzafb {
    private final zzbnr zzffv;
    private final zzaqt zzfqf;
    private final String zzfqg;
    private final String zzfqh;

    public zzbyx(zzbnr zzbnrVar, zzcvr zzcvrVar) {
        this.zzffv = zzbnrVar;
        this.zzfqf = zzcvrVar.zzdle;
        this.zzfqg = zzcvrVar.zzddf;
        this.zzfqh = zzcvrVar.zzddg;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zzra() {
        this.zzffv.onRewardedVideoStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    @ParametersAreNonnullByDefault
    public final void zza(zzaqt zzaqtVar) {
        String str;
        int i;
        zzaqt zzaqtVar2 = this.zzfqf;
        if (zzaqtVar2 != null) {
            zzaqtVar = zzaqtVar2;
        }
        if (zzaqtVar != null) {
            str = zzaqtVar.type;
            i = zzaqtVar.zzdnv;
        } else {
            str = "";
            i = 1;
        }
        this.zzffv.zzb(new zzapw(str, i), this.zzfqg, this.zzfqh);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zzrb() {
        this.zzffv.onRewardedVideoCompleted();
    }
}
