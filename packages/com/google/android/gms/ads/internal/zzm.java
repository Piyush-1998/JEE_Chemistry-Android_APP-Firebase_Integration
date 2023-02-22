package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzdf;
import com.google.android.gms.internal.ads.zzdg;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzm implements Callable<zzdf> {
    private final /* synthetic */ zzl zzblj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzl zzlVar) {
        this.zzblj = zzlVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzdf call() throws Exception {
        zzaxl zzaxlVar;
        Context context;
        zzaxlVar = this.zzblj.zzblk;
        String str = zzaxlVar.zzblz;
        context = this.zzblj.zzlk;
        return new zzdf(zzdg.zza(str, context, false));
    }
}
