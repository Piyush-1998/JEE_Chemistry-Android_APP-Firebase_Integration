package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
final class zzdpa {
    private final ConcurrentHashMap<zzdoz, List<Throwable>> zzhfk = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzhfl = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzhfl.poll();
        while (poll != null) {
            this.zzhfk.remove(poll);
            poll = this.zzhfl.poll();
        }
        List<Throwable> list = this.zzhfk.get(new zzdoz(th, null));
        if (z && list == null) {
            Vector vector = new Vector(2);
            List<Throwable> putIfAbsent = this.zzhfk.putIfAbsent(new zzdoz(th, this.zzhfl), vector);
            return putIfAbsent == null ? vector : putIfAbsent;
        }
        return list;
    }
}
