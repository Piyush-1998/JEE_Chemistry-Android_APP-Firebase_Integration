package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmz extends zzbpm<zzbnb> implements zzbnb {
    public zzbmz(Set<zzbqs<zzbnb>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void onAdFailedToLoad(final int i) {
        zza(new zzbpo(i) { // from class: com.google.android.gms.internal.ads.zzbnc
            private final int zzdwc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdwc = i;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzbnb) obj).onAdFailedToLoad(this.zzdwc);
            }
        });
    }
}
