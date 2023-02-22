package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzln implements zzmd {
    private final int track;
    private final /* synthetic */ zzli zzazs;

    public zzln(zzli zzliVar, int i) {
        this.zzazs = zzliVar;
        this.track = i;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final boolean isReady() {
        return this.zzazs.zzas(this.track);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzhe() throws IOException {
        this.zzazs.zzhe();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final int zzb(zzgq zzgqVar, zzik zzikVar, boolean z) {
        return this.zzazs.zza(this.track, zzgqVar, zzikVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzeb(long j) {
        this.zzazs.zzd(this.track, j);
    }
}
