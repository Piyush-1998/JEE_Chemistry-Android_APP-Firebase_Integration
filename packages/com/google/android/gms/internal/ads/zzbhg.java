package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhg implements zzaer<Object> {
    final /* synthetic */ zzbhf zzfbl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhg(zzbhf zzbhfVar) {
        this.zzfbl = zzbhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zza(Object obj, Map<String, String> map) {
        boolean zzl;
        Executor executor;
        zzl = this.zzfbl.zzl(map);
        if (zzl) {
            executor = this.zzfbl.executor;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbhj
                private final zzbhg zzfbs;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfbs = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbhk zzbhkVar;
                    zzbhkVar = this.zzfbs.zzfbl.zzfbn;
                    zzbhkVar.zzaek();
                }
            });
        }
    }
}
