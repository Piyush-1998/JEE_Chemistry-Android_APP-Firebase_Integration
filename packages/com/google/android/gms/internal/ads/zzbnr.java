package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbnr extends zzbpm<zzbna> {
    public zzbnr(Set<zzbqs<zzbna>> set) {
        super(set);
    }

    public final void onAdClosed() {
        zza(zzbnu.zzfgz);
    }

    public final void onAdLeftApplication() {
        zza(zzbnt.zzfgz);
    }

    public final void onAdOpened() {
        zza(zzbnw.zzfgz);
    }

    public final void onRewardedVideoStarted() {
        zza(zzbnv.zzfgz);
    }

    public final void zzb(final zzapy zzapyVar, final String str, final String str2) {
        zza(new zzbpo(zzapyVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbny
            private final String zzcyz;
            private final String zzdbt;
            private final zzapy zzfhc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfhc = zzapyVar;
                this.zzcyz = str;
                this.zzdbt = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzbna) obj).zzb(this.zzfhc, this.zzcyz, this.zzdbt);
            }
        });
    }

    public final void onRewardedVideoCompleted() {
        zza(zzbnx.zzfgz);
    }
}
