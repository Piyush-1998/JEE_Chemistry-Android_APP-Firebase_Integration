package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzpg {
    private final zzaxl zzblk;
    private final zzahn zzbnu;
    private final Context zzzc;
    private final Object lock = new Object();
    private final WeakHashMap<Object, Object> zzbns = new WeakHashMap<>();
    private final ArrayList<Object> zzbnt = new ArrayList<>();

    public zzpg(Context context, zzaxl zzaxlVar) {
        this.zzzc = context.getApplicationContext();
        this.zzblk = zzaxlVar;
        this.zzbnu = new zzahn(context.getApplicationContext(), zzaxlVar, (String) zzuv.zzon().zzd(zzza.zzcgg));
    }
}
