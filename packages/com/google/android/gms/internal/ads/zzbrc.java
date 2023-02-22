package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbrc extends zzbpm<zzafb> implements zzafb {
    public zzbrc(Set<zzbqs<zzafb>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final synchronized void zzra() {
        zza(zzbrf.zzfgz);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zza(final zzaqt zzaqtVar) {
        zza(new zzbpo(zzaqtVar) { // from class: com.google.android.gms.internal.ads.zzbre
            private final zzaqt zzfid;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfid = zzaqtVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzafb) obj).zza(this.zzfid);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zzrb() {
        zza(zzbrh.zzfgz);
    }
}
