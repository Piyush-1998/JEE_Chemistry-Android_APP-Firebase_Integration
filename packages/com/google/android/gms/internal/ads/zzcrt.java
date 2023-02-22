package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrt<T> {
    private final Executor executor;
    private final Set<zzcru<? extends zzcrr<T>>> zzggh;

    public zzcrt(Executor executor, Set<zzcru<? extends zzcrr<T>>> set) {
        this.executor = executor;
        this.zzggh = set;
    }

    public final zzddi<T> zzs(final T t) {
        final ArrayList arrayList = new ArrayList(this.zzggh.size());
        for (final zzcru<? extends zzcrr<T>> zzcruVar : this.zzggh) {
            zzddi<? extends zzcrr<T>> zzalv = zzcruVar.zzalv();
            if (((Boolean) zzuv.zzon().zzd(zzza.zzclv)).booleanValue()) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime();
                zzalv.addListener(new Runnable(zzcruVar, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzcrw
                    private final zzcru zzggi;
                    private final long zzggj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzggi = zzcruVar;
                        this.zzggj = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcru zzcruVar2 = this.zzggi;
                        long j = this.zzggj;
                        String canonicalName = zzcruVar2.getClass().getCanonicalName();
                        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - j;
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(elapsedRealtime2);
                        zzaug.zzdy(sb.toString());
                    }
                }, zzaxn.zzdwn);
            }
            arrayList.add(zzalv);
        }
        return zzdcy.zzh(arrayList).zza(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.zzcrv
            private final Object zzdbp;
            private final List zzgfv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfv = arrayList;
                this.zzdbp = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcrt.zza(this.zzgfv, this.zzdbp);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Object zza(List list, Object obj) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                zzcrr zzcrrVar = (zzcrr) ((zzddi) it.next()).get();
                if (zzcrrVar != null) {
                    zzcrrVar.zzr(obj);
                }
            } catch (InterruptedException | ExecutionException e) {
                zzaug.zzc("Derive quality signals error.", e);
                throw new Exception(e);
            }
        }
        return obj;
    }
}
