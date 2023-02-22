package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaix {
    private static final zzavr<zzaha> zzdbb = new zzaiw();
    private static final zzavr<zzaha> zzdbc = new zzaiz();
    private final zzahn zzdbd;

    public zzaix(Context context, zzaxl zzaxlVar, String str) {
        this.zzdbd = new zzahn(context, zzaxlVar, str, zzdbb, zzdbc);
    }

    public final <I, O> zzaip<I, O> zza(String str, zzaiq<I> zzaiqVar, zzair<O> zzairVar) {
        return new zzaiy(this.zzdbd, str, zzaiqVar, zzairVar);
    }

    public final zzajc zzrl() {
        return new zzajc(this.zzdbd);
    }
}
