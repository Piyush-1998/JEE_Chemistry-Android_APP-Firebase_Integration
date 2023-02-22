package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbne extends zzbpm<zzbnf> implements zzbnf {
    public zzbne(Set<zzbqs<zzbnf>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zzcl(final int i) {
        zza(new zzbpo(i) { // from class: com.google.android.gms.internal.ads.zzbnd
            private final int zzdwc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdwc = i;
            }

            @Override // com.google.android.gms.internal.ads.zzbpo
            public final void zzp(Object obj) {
                ((zzbnf) obj).zzcl(this.zzdwc);
            }
        });
    }
}
