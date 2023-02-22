package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbay implements Iterable<zzbaw> {
    private final List<zzbaw> zzedg = new ArrayList();

    public static boolean zzc(zzazj zzazjVar) {
        zzbaw zzd = zzd(zzazjVar);
        if (zzd != null) {
            zzd.zzede.abort();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbaw zzd(zzazj zzazjVar) {
        Iterator<zzbaw> it = com.google.android.gms.ads.internal.zzq.zzlf().iterator();
        while (it.hasNext()) {
            zzbaw next = it.next();
            if (next.zzdya == zzazjVar) {
                return next;
            }
        }
        return null;
    }

    public final void zza(zzbaw zzbawVar) {
        this.zzedg.add(zzbawVar);
    }

    public final void zzb(zzbaw zzbawVar) {
        this.zzedg.remove(zzbawVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzbaw> iterator() {
        return this.zzedg.iterator();
    }
}
