package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzapl {
    private WeakHashMap<Context, zzapn> zzdnl = new WeakHashMap<>();

    public final Future<zzapj> zzt(Context context) {
        return zzaxn.zzdwi.zzd(new zzapo(this, context));
    }
}
