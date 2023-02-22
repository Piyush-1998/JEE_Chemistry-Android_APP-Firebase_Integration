package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzatp {
    private long zzdqb = -1;
    private long zzdqc = -1;
    private final /* synthetic */ zzatq zzdqd;

    public zzatp(zzatq zzatqVar) {
        this.zzdqd = zzatqVar;
    }

    public final long zztu() {
        return this.zzdqc;
    }

    public final void zztv() {
        Clock clock;
        clock = this.zzdqd.zzbmp;
        this.zzdqc = clock.elapsedRealtime();
    }

    public final void zztw() {
        Clock clock;
        clock = this.zzdqd.zzbmp;
        this.zzdqb = clock.elapsedRealtime();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzdqb);
        bundle.putLong("tclose", this.zzdqc);
        return bundle;
    }
}
