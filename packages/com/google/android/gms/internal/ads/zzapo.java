package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzapo implements Callable<zzapj> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzapl zzdno;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapo(zzapl zzaplVar, Context context) {
        this.zzdno = zzaplVar;
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzapj call() throws Exception {
        WeakHashMap weakHashMap;
        zzapj zzti;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzdno.zzdnl;
        zzapn zzapnVar = (zzapn) weakHashMap.get(this.val$context);
        if (zzapnVar != null) {
            if (!(zzapnVar.zzdnm + ((Long) zzuv.zzon().zzd(zzza.zzcmb)).longValue() < com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis())) {
                zzti = new zzapm(this.val$context, zzapnVar.zzdnn).zzti();
                weakHashMap2 = this.zzdno.zzdnl;
                weakHashMap2.put(this.val$context, new zzapn(this.zzdno, zzti));
                return zzti;
            }
        }
        zzti = new zzapm(this.val$context).zzti();
        weakHashMap2 = this.zzdno.zzdnl;
        weakHashMap2.put(this.val$context, new zzapn(this.zzdno, zzti));
        return zzti;
    }
}
